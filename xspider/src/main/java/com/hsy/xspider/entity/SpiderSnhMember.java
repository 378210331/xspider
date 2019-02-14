package com.hsy.xspider.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "spider_snh_member", schema = "spider")
public class SpiderSnhMember {
    private String sid;
    private String gid;
    private String gname;
    private String sname;
    private String fname;
    private String pinyin;
    private String abbr;
    private String tid;
    private String tname;
    private String pid;
    private String pname;
    private String nickname;
    private String company;
    private String joinDay;
    private String height;
    private String birthDay;
    private String starSign12;
    private String starSign48;
    private String birthPlace;
    private String speciality;
    private String hobby;
    private String experience;
    private String catchPhrase;
    private String weiboUid;
    private String weiboVerifier;
    private String bloodType;
    private String tiebaKw;
    private String status;
    private String tcolor;
    private String gcolor;
    private Date insertDate;

    @Id
    @Column(name = "sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "gid")
    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "gname")
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "fname")
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "pinyin")
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Basic
    @Column(name = "abbr")
    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Basic
    @Column(name = "tid")
    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "tname")
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Basic
    @Column(name = "pid")
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "join_day")
    public String getJoinDay() {
        return joinDay;
    }

    public void setJoinDay(String joinDay) {
        this.joinDay = joinDay;
    }

    @Basic
    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "birth_day")
    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Basic
    @Column(name = "star_sign_12")
    public String getStarSign12() {
        return starSign12;
    }

    public void setStarSign12(String starSign12) {
        this.starSign12 = starSign12;
    }

    @Basic
    @Column(name = "star_sign_48")
    public String getStarSign48() {
        return starSign48;
    }

    public void setStarSign48(String starSign48) {
        this.starSign48 = starSign48;
    }

    @Basic
    @Column(name = "birth_place")
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Basic
    @Column(name = "speciality")
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Basic
    @Column(name = "hobby")
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Basic
    @Column(name = "experience")
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Basic
    @Column(name = "catch_phrase")
    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    @Basic
    @Column(name = "weibo_uid")
    public String getWeiboUid() {
        return weiboUid;
    }

    public void setWeiboUid(String weiboUid) {
        this.weiboUid = weiboUid;
    }

    @Basic
    @Column(name = "weibo_verifier")
    public String getWeiboVerifier() {
        return weiboVerifier;
    }

    public void setWeiboVerifier(String weiboVerifier) {
        this.weiboVerifier = weiboVerifier;
    }

    @Basic
    @Column(name = "blood_type")
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Basic
    @Column(name = "tieba_kw")
    public String getTiebaKw() {
        return tiebaKw;
    }

    public void setTiebaKw(String tiebaKw) {
        this.tiebaKw = tiebaKw;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "tcolor")
    public String getTcolor() {
        return tcolor;
    }

    public void setTcolor(String tcolor) {
        this.tcolor = tcolor;
    }

    @Basic
    @Column(name = "gcolor")
    public String getGcolor() {
        return gcolor;
    }

    public void setGcolor(String gcolor) {
        this.gcolor = gcolor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpiderSnhMember that = (SpiderSnhMember) o;
        return Objects.equals(sid, that.sid) &&
                Objects.equals(gid, that.gid) &&
                Objects.equals(gname, that.gname) &&
                Objects.equals(sname, that.sname) &&
                Objects.equals(fname, that.fname) &&
                Objects.equals(pinyin, that.pinyin) &&
                Objects.equals(abbr, that.abbr) &&
                Objects.equals(tid, that.tid) &&
                Objects.equals(tname, that.tname) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(pname, that.pname) &&
                Objects.equals(nickname, that.nickname) &&
                Objects.equals(company, that.company) &&
                Objects.equals(joinDay, that.joinDay) &&
                Objects.equals(height, that.height) &&
                Objects.equals(birthDay, that.birthDay) &&
                Objects.equals(starSign12, that.starSign12) &&
                Objects.equals(starSign48, that.starSign48) &&
                Objects.equals(birthPlace, that.birthPlace) &&
                Objects.equals(speciality, that.speciality) &&
                Objects.equals(hobby, that.hobby) &&
                Objects.equals(experience, that.experience) &&
                Objects.equals(catchPhrase, that.catchPhrase) &&
                Objects.equals(weiboUid, that.weiboUid) &&
                Objects.equals(weiboVerifier, that.weiboVerifier) &&
                Objects.equals(bloodType, that.bloodType) &&
                Objects.equals(tiebaKw, that.tiebaKw) &&
                Objects.equals(status, that.status) &&
                Objects.equals(tcolor, that.tcolor) &&
                Objects.equals(gcolor, that.gcolor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sid, gid, gname, sname, fname, pinyin, abbr, tid, tname, pid, pname, nickname, company, joinDay, height, birthDay, starSign12, starSign48, birthPlace, speciality, hobby, experience, catchPhrase, weiboUid, weiboVerifier, bloodType, tiebaKw, status, tcolor, gcolor);
    }

    @Basic
    @Column(name = "insert_date")
    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
