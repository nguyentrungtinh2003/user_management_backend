package com.TrungTinhBackend.user_management_backend.Repository;

import com.TrungTinhBackend.user_management_backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
