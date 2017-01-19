package com.niit.flink.dao;

import java.util.ArrayList;

import com.niit.flink.model.Friend;

public interface FriendDao {
   public boolean sendRequest(Friend f);
   public ArrayList<String> fetchFriendList(String userid);
}