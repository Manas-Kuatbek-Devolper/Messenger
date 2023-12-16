package com.chat.messegerrr.Repository;

import com.chat.messegerrr.Entities.Adam;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface AdamRepository extends JpaRepository<Adam, Long> {
    Optional<Adam> findById(Long id);
}
