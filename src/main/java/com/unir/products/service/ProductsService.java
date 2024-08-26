package com.unir.products.service;

import java.util.List;

import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.mergepatch.JsonMergePatch;
import com.unir.products.model.pojo.Product;
import com.unir.products.model.pojo.ProductDto;
import com.unir.products.model.request.CreateProductRequest;

public interface ProductsService {

	List<Product> getProducts(String title, String category, String description);

	Product getProduct(String productId);

	Boolean removeProduct(String productId);

	Product createProduct(CreateProductRequest request);

	Product updateProduct(String productId, String updateRequest);

	Product updateProduct(String productId, ProductDto updateRequest);

}
