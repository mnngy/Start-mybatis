package com.example.demo.mapper;

import com.example.demo.model.UserProfile;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserProfileMapper {

    @Select("SELECT * FROM user id = #{id}")
    UserProfile getUserProfile(@Param("id") String id);

    @Select("SELECT * FROM user")
    List<UserProfile> getUserProfileList();

    @Insert("INSERT INTO user VALUES(#{id}, #{name}, #{phone}, #{address})")
    int insertUserProfile(@Param("id") String id,
                        @Param("name") String name,
                        @Param("phone") String phone,
                        @Param("address") String address);

    @Update("UPDATE user SET name=#{name}, phone=#{phone}, address=#{address} WHERE id = #{id}")
    int updateUserProfile(@Param("id") String id,
                       @Param("name") String name,
                       @Param("phone") String phone,
                       @Param("address") String address);

    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUserProfile(@Param("id") String id);
}
