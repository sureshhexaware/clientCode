/*
 * Items API V1
 * Items API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Purchase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T12:25:14.024746100Z[Etc/UTC]")
public class Purchase {
  @SerializedName("PurchasePrice")
  private String purchasePrice = null;

  @SerializedName("PriceCurrencyCode")
  private String priceCurrencyCode = null;

  @SerializedName("PurchaseDate")
  private String purchaseDate = null;

  @SerializedName("PurchaseTime")
  private String purchaseTime = null;

  @SerializedName("RecommendedPrice")
  private String recommendedPrice = null;

  @SerializedName("RecommendedPriceCurrencyCode")
  private String recommendedPriceCurrencyCode = null;

  @SerializedName("PurchaseRetailer")
  private String purchaseRetailer = null;

  public Purchase purchasePrice(String purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * Get purchasePrice
   * @return purchasePrice
  **/
  @Schema(description = "")
  public String getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(String purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public Purchase priceCurrencyCode(String priceCurrencyCode) {
    this.priceCurrencyCode = priceCurrencyCode;
    return this;
  }

   /**
   * Get priceCurrencyCode
   * @return priceCurrencyCode
  **/
  @Schema(description = "")
  public String getPriceCurrencyCode() {
    return priceCurrencyCode;
  }

  public void setPriceCurrencyCode(String priceCurrencyCode) {
    this.priceCurrencyCode = priceCurrencyCode;
  }

  public Purchase purchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
    return this;
  }

   /**
   * Get purchaseDate
   * @return purchaseDate
  **/
  @Schema(description = "")
  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public Purchase purchaseTime(String purchaseTime) {
    this.purchaseTime = purchaseTime;
    return this;
  }

   /**
   * Get purchaseTime
   * @return purchaseTime
  **/
  @Schema(description = "")
  public String getPurchaseTime() {
    return purchaseTime;
  }

  public void setPurchaseTime(String purchaseTime) {
    this.purchaseTime = purchaseTime;
  }

  public Purchase recommendedPrice(String recommendedPrice) {
    this.recommendedPrice = recommendedPrice;
    return this;
  }

   /**
   * Get recommendedPrice
   * @return recommendedPrice
  **/
  @Schema(description = "")
  public String getRecommendedPrice() {
    return recommendedPrice;
  }

  public void setRecommendedPrice(String recommendedPrice) {
    this.recommendedPrice = recommendedPrice;
  }

  public Purchase recommendedPriceCurrencyCode(String recommendedPriceCurrencyCode) {
    this.recommendedPriceCurrencyCode = recommendedPriceCurrencyCode;
    return this;
  }

   /**
   * Get recommendedPriceCurrencyCode
   * @return recommendedPriceCurrencyCode
  **/
  @Schema(description = "")
  public String getRecommendedPriceCurrencyCode() {
    return recommendedPriceCurrencyCode;
  }

  public void setRecommendedPriceCurrencyCode(String recommendedPriceCurrencyCode) {
    this.recommendedPriceCurrencyCode = recommendedPriceCurrencyCode;
  }

  public Purchase purchaseRetailer(String purchaseRetailer) {
    this.purchaseRetailer = purchaseRetailer;
    return this;
  }

   /**
   * Get purchaseRetailer
   * @return purchaseRetailer
  **/
  @Schema(description = "")
  public String getPurchaseRetailer() {
    return purchaseRetailer;
  }

  public void setPurchaseRetailer(String purchaseRetailer) {
    this.purchaseRetailer = purchaseRetailer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Purchase purchase = (Purchase) o;
    return Objects.equals(this.purchasePrice, purchase.purchasePrice) &&
        Objects.equals(this.priceCurrencyCode, purchase.priceCurrencyCode) &&
        Objects.equals(this.purchaseDate, purchase.purchaseDate) &&
        Objects.equals(this.purchaseTime, purchase.purchaseTime) &&
        Objects.equals(this.recommendedPrice, purchase.recommendedPrice) &&
        Objects.equals(this.recommendedPriceCurrencyCode, purchase.recommendedPriceCurrencyCode) &&
        Objects.equals(this.purchaseRetailer, purchase.purchaseRetailer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchasePrice, priceCurrencyCode, purchaseDate, purchaseTime, recommendedPrice, recommendedPriceCurrencyCode, purchaseRetailer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Purchase {\n");
    
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    priceCurrencyCode: ").append(toIndentedString(priceCurrencyCode)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    purchaseTime: ").append(toIndentedString(purchaseTime)).append("\n");
    sb.append("    recommendedPrice: ").append(toIndentedString(recommendedPrice)).append("\n");
    sb.append("    recommendedPriceCurrencyCode: ").append(toIndentedString(recommendedPriceCurrencyCode)).append("\n");
    sb.append("    purchaseRetailer: ").append(toIndentedString(purchaseRetailer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
