package com.roomeeting.roomeeting.repository;

import com.roomeeting.roomeeting.model.entity.Room;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomRepository extends PagingAndSortingRepository<Room, Integer> {
}
