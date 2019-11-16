package ssm.dao;

import org.apache.ibatis.annotations.Select;
import ssm.entity.Product;

import java.util.List;

public interface IProductDao {
    //查询所有商品信息
    @Select("select * from product")
    public List<Product> findall();
}
