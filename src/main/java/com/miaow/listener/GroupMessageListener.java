package com.miaow.listener;

import love.forte.simboot.annotation.ContentTrim;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.definition.Member;
import love.forte.simbot.event.GroupMessageEvent;
import org.springframework.stereotype.Component;

/**
 * 接收群消息
 *
 * @author TenStreets
 * @version 1.0
 */
@Component
public class GroupMessageListener {

    @Listener
    @Filter(value = "你好", targets = @Filter.Targets(atBot = true))
    @ContentTrim // 当匹配被at时，将'at'这个特殊消息移除后，剩余的文本消息大概率存在前后空格，通过此注解在匹配的时候忽略前后空格
    public void onChannelMessage(GroupMessageEvent event) { // 将要监听的事件类型放在参数里，即代表监听此类型的消息
        // ...
        // Java中的阻塞式API
        Member author = event.getAuthor();
        event.replyAsync("你也好 " + author.getUsername());
    }
}
