package com.chat.messegerrr.Repository;

import com.chat.messegerrr.Entities.Chat;
import com.chat.messegerrr.Entities.Message;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ChatRepository extends JpaRepository<Chat, Long> {

}
