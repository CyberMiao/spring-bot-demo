package com.miaow.listener;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.event.FriendMessageEvent;
import org.springframework.stereotype.Component;

/**
 * 接收好友消息
 *
 * @author TenStreets
 * @version 1.0
 */
@Component
public class FriendMessageListener {

    @Listener
    @Filter(value = "你好.*")
    public void hello(FriendMessageEvent event) {
        event.replyAsync("你好啊！");
    }
}
