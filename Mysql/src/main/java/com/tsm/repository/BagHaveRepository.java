package com.tsm.repository;

import com.tsm.entity.BagHave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BagHaveRepository extends JpaRepository<BagHave, Long> {


/*
    @Query(nativeQuery = true, value = " SELECT count(*) FROM foceItem where ver=?1 and checktt=?2")
    int hasCheckRetId(String ver, String hasCode);
*/

/*    @Transactional
    @Modifying
    @Query("update HasCEntity h set h.checktt = ?1 where h.ver = ?2")
    int updateIdByIdAllIgnoreCase(String checktt, String ver);*/


}
