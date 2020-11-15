package ltd.newbee.mall.service;

import ltd.newbee.mall.entity.Carousel;
import com.wangmeng.mall.util.PageQueryUtil;
import com.wangmeng.mall.util.PageResult;

public interface NewBeeMallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);
}
