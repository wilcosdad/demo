package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by brian on 6/7/16.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> fineByAccountUsername(String username);
}
