package com.meedom.springbookonetomany.Entities.Repository;

import com.meedom.springbookonetomany.Entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
