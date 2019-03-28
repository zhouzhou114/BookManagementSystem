package com.book.dao;

import com.book.pojo.Reader;
import com.book.pojo.ReaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    long countByExample(ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int deleteByExample(ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int deleteByPrimaryKey(Integer readerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int insert(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int insertSelective(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    List<Reader> selectByExample(ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    Reader selectByPrimaryKey(Integer readerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") Reader record, @Param("example") ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int updateByExample(@Param("record") Reader record, @Param("example") ReaderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int updateByPrimaryKeySelective(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_info
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    int updateByPrimaryKey(Reader record);
}