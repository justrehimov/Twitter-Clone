package com.twitter.twitterclone.dao;

public interface FollowingDao {
    void add(Integer senderId, Integer receiverId);
}
