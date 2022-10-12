package cn.edu.xmu.javaee.goodsdemo.mapper.po;

import java.time.LocalDateTime;

public class ProductPo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.goods_id
     *
     * @mbg.generated
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.sku_sn
     *
     * @mbg.generated
     */
    private String skuSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.original_price
     *
     * @mbg.generated
     */
    private Long originalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.weight
     *
     * @mbg.generated
     */
    private Long weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.image_url
     *
     * @mbg.generated
     */
    private String imageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.barcode
     *
     * @mbg.generated
     */
    private String barcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.unit
     *
     * @mbg.generated
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.origin_place
     *
     * @mbg.generated
     */
    private String originPlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.creator_id
     *
     * @mbg.generated
     */
    private Long creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.modifier_id
     *
     * @mbg.generated
     */
    private Long modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.modifier_name
     *
     * @mbg.generated
     */
    private String modifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.gmt_create
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oomall_product.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.id
     *
     * @return the value of oomall_product.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.id
     *
     * @param id the value for oomall_product.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.goods_id
     *
     * @return the value of oomall_product.goods_id
     *
     * @mbg.generated
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.goods_id
     *
     * @param goodsId the value for oomall_product.goods_id
     *
     * @mbg.generated
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.sku_sn
     *
     * @return the value of oomall_product.sku_sn
     *
     * @mbg.generated
     */
    public String getSkuSn() {
        return skuSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.sku_sn
     *
     * @param skuSn the value for oomall_product.sku_sn
     *
     * @mbg.generated
     */
    public void setSkuSn(String skuSn) {
        this.skuSn = skuSn == null ? null : skuSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.name
     *
     * @return the value of oomall_product.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.name
     *
     * @param name the value for oomall_product.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.original_price
     *
     * @return the value of oomall_product.original_price
     *
     * @mbg.generated
     */
    public Long getOriginalPrice() {
        return originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.original_price
     *
     * @param originalPrice the value for oomall_product.original_price
     *
     * @mbg.generated
     */
    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.weight
     *
     * @return the value of oomall_product.weight
     *
     * @mbg.generated
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.weight
     *
     * @param weight the value for oomall_product.weight
     *
     * @mbg.generated
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.image_url
     *
     * @return the value of oomall_product.image_url
     *
     * @mbg.generated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.image_url
     *
     * @param imageUrl the value for oomall_product.image_url
     *
     * @mbg.generated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.barcode
     *
     * @return the value of oomall_product.barcode
     *
     * @mbg.generated
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.barcode
     *
     * @param barcode the value for oomall_product.barcode
     *
     * @mbg.generated
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.unit
     *
     * @return the value of oomall_product.unit
     *
     * @mbg.generated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.unit
     *
     * @param unit the value for oomall_product.unit
     *
     * @mbg.generated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.origin_place
     *
     * @return the value of oomall_product.origin_place
     *
     * @mbg.generated
     */
    public String getOriginPlace() {
        return originPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.origin_place
     *
     * @param originPlace the value for oomall_product.origin_place
     *
     * @mbg.generated
     */
    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace == null ? null : originPlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.creator_id
     *
     * @return the value of oomall_product.creator_id
     *
     * @mbg.generated
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.creator_id
     *
     * @param creatorId the value for oomall_product.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.creator_name
     *
     * @return the value of oomall_product.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.creator_name
     *
     * @param creatorName the value for oomall_product.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.modifier_id
     *
     * @return the value of oomall_product.modifier_id
     *
     * @mbg.generated
     */
    public Long getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.modifier_id
     *
     * @param modifierId the value for oomall_product.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.modifier_name
     *
     * @return the value of oomall_product.modifier_name
     *
     * @mbg.generated
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.modifier_name
     *
     * @param modifierName the value for oomall_product.modifier_name
     *
     * @mbg.generated
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.gmt_create
     *
     * @return the value of oomall_product.gmt_create
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.gmt_create
     *
     * @param gmtCreate the value for oomall_product.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oomall_product.gmt_modified
     *
     * @return the value of oomall_product.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oomall_product.gmt_modified
     *
     * @param gmtModified the value for oomall_product.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}