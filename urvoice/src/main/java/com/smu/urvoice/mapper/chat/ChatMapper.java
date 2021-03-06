package com.smu.urvoice.mapper.chat;

import com.smu.urvoice.dto.chat.ChatBotDetailDto;
import com.smu.urvoice.dto.chat.ChatDetailDto;
import com.smu.urvoice.vo.chat.ChatBotVO;
import com.smu.urvoice.vo.chat.ChatModeVO;
import com.smu.urvoice.vo.chat.ChatVO;
import com.smu.urvoice.vo.chat.VoiceVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMapper {
    List<ChatModeVO> getChatModes();

    List<ChatDetailDto> getChatByBotId(String owner, int chatBotId);
    int insertChat(ChatVO chatVO);

    List<ChatBotDetailDto> getChatBotByUser(String owner);
    ChatBotDetailDto getChatBotById(String owner, int chatBotId);
    String getLastChatByBotId(String owner, int chatBotId);

    int insertChatBot(ChatBotVO chatBotVO);
    int deleteChatBotById(String owner, int chatBotId);

    List<VoiceVO> getVoiceByUser(String owner);
    int insertVoice(VoiceVO voiceVO);
    int deleteVoiceById(String owner, int voiceId);
}
