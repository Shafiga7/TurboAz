package dataAccess;

import entity.Brand;

import java.util.List;

public interface BrandRepository {
    Brand getById(Integer id);

    void addBrand(Brand brand);

    List<Brand> getAll();
}
