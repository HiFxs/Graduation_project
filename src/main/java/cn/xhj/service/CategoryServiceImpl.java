package cn.xhj.service;

import cn.xhj.mapper.CategoryMapper;
import cn.xhj.pojo.Category;
import cn.xhj.pojo.CategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list() {
		CategoryExample example = new CategoryExample();
		List<Category> categories = categoryMapper.selectByExample(example);
		return categories;
	}

	public Category get(Integer id) {
		return categoryMapper.selectByPrimaryKey(id);
	}

	public void update(Category category) {
		categoryMapper.updateByPrimaryKey(category);
	}


}
