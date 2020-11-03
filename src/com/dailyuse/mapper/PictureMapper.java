
package com.dailyuse.mapper;

import java.util.List;

import com.dailyuse.mapper.PictureMapper;

public interface PictureMapper {
	/**
	 * 读取所有图片
	 */
	public List<PictureMapper> getPicture();

	/**
	 * 读取指定图片
	 */
	public PictureMapper getPicture(int pno);

	/**
	 * 添加图片
	 */
	public int addPicture(PictureMapper picture);

	/**
	 * 添加删除指定图片
	 */
	public int delPicture(int pno);

	/**
	 * 修改图片
	 */
	public int modifyPicture(PictureMapper Picture);

}
