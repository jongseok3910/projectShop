package com.itwill.shop.product;

import java.util.List;

public class ProductService {
	private ProductDao productDao;
	public ProductService() {
		productDao=new ProductDao();
	}
	//제품리스트
	public List<Product> productList() throws Exception{
		return productDao.selectManyMain();
	}
	//제품상세보기
	public Product productDetail(int p_no)throws Exception{
		return productDao.selectOneMain(p_no);
	}
}
