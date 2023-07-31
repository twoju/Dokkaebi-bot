package com.dokkaebi.service.studyroom;

import java.util.List;

import com.dokkaebi.domain.Member;
import com.dokkaebi.domain.studyroom.StudyRoom;
import com.dokkaebi.domain.studyroom.StudyRoomDto;

public interface StudyRoomService {
	public Long createStudyRoom(StudyRoom studyRoom, Member member); // 스터디룸 생성
	public List<StudyRoomDto> getRecent10StudyRooms(); 					// 가장 최근에 생성된 스터디룸 10개 반환
	public boolean setStudyRoomImage(String imageUrl, Long roomId);
}
