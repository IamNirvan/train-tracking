package com.tracker.tracker.repositories;

import com.tracker.tracker.models.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BookingRepository extends JpaRepository<Booking, UUID> {
    List<Booking> findByDeletedOrderByCreatedTimeDesc(Boolean deleted);

    List<Booking> findByCreatedBy_Id(UUID id);


}
