package com.hsy.xspider.processor.snh;

import com.alibaba.fastjson.JSONObject;
import com.hsy.xspider.dao.snh.SnhMemberRepository;
import com.hsy.xspider.entity.SpiderSnhMember;
import com.hsy.xspider.processor.IStandardProcessor;
import org.apache.http.cookie.Cookie;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * SNH48成员资料爬虫
 */
@Component
public class SnhMemberProcessor implements PageProcessor, IStandardProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    public static final String API_URL = "http://h5.snh48.com/resource/jsonp/members.php?gid=";//snh 10,bej 20,gnz 30, shy 40 ckg 50

    private static final Logger logger = LoggerFactory.getLogger(SnhMemberProcessor.class);




    @Autowired
    SessionFactory sessionFactory;

    @Resource
    SnhMemberRepository snhMemberRepository;

    @Override
    public void process(Page page) {
        List<String> members = page.getJson().jsonPath("$.rows").all();
        List<SpiderSnhMember> menList = new ArrayList<SpiderSnhMember>(members.size());
        logger.info("爬取数量"+menList.size());
        for (int i = 0; i < members.size(); i++) {
            JSONObject member = JSONObject.parseObject(members.get(i));
            SpiderSnhMember men = new SpiderSnhMember();
            men.setSid(member.getString("sid"));
            men.setGid(member.getString("gid"));
            men.setGname(member.getString("gname"));
            men.setSname(member.getString("sname"));
            men.setFname(member.getString("fname"));
            men.setPinyin(member.getString("pinyin"));
            men.setAbbr(member.getString("abbr"));
            men.setTid(member.getString("tid"));
            men.setTname(member.getString("tname"));
            men.setPid(member.getString("pid"));
            men.setPname(member.getString("pname"));
            men.setNickname(member.getString("nickname"));
            men.setCompany(member.getString("company"));
            men.setJoinDay(member.getString("join_day"));
            men.setHeight(member.getString("height"));
            men.setBirthDay(member.getString("birth_day"));
            men.setStarSign12(member.getString("star_sign_12"));
            men.setStarSign48(member.getString("star_sign_48"));
            men.setBirthPlace(member.getString("birth_place"));
            men.setSpeciality(member.getString("speciality"));
            men.setHobby(member.getString("hobby"));
            men.setExperience(member.getString("experience"));
            men.setCatchPhrase(member.getString("catch_phrase"));
            men.setWeiboUid(member.getString("weibo_uid"));
            men.setWeiboVerifier(member.getString("weibo_verifier"));
            men.setBloodType(member.getString("blood_type"));
            men.setTiebaKw(member.getString("tieba_kw"));
            men.setStatus(member.getString("status"));
            men.setTcolor(member.getString("tcolor"));
            men.setGcolor(member.getString("gcolor"));
            men.setInsertDate(new Date());
            menList.add(men);
        }
        snhMemberRepository.save(menList);
    }

    @Override
    public Site getSite() {
        return this.site;
    }

    @Override
    public Integer start(Map<String, Object> param) throws Exception {
        Spider snhSpider = Spider.create(this);
        snhSpider.addUrl(API_URL + "10");//SNH
        snhSpider.addUrl(API_URL + "20");//BGJ
        snhSpider.addUrl(API_URL + "30");//GNZ
        snhSpider.addUrl(API_URL + "40");//SHY
        snhSpider.addUrl(API_URL + "50");//CKG
        snhSpider.thread(10).run();
        return 0;
    }

    @Override
    public List<Cookie> LoginAndGetCookies() {
        return null;
    }

    @Override
    public boolean LoginOut() {
        return false;
    }


}
