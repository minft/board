package com.minft.board.repository;

import com.minft.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    // update board_table set board_hits=board_hits+1 where id=? // mysql 기준 쿼리
    // 기존의 조회수 에서 +1 해주는 쿼리, 아래는 DB가 아니라 Entity를 기준으로함
    @Modifying
    @Query(value = "update BoardEntity b set b.boardHits=b.boardHits+1 where b.id=:id")
    void updateHits(@Param("id") Long id);
    // update, delete 등의 쿼리를 실행해야할 때는 @Modifying을 필수로 붙여야한다고 함
}
