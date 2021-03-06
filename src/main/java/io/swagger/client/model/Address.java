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
import io.swagger.client.model.AddressDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Address
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T12:25:14.024746100Z[Etc/UTC]")
public class Address {
  @SerializedName("AddressCategory")
  private String addressCategory = null;

  @SerializedName("AddressOverride")
  private String addressOverride = null;

  @SerializedName("AddressStatus")
  private String addressStatus = null;

  @SerializedName("AddressDetails")
  private AddressDetails addressDetails = null;

  public Address addressCategory(String addressCategory) {
    this.addressCategory = addressCategory;
    return this;
  }

   /**
   * Get addressCategory
   * @return addressCategory
  **/
  @Schema(description = "")
  public String getAddressCategory() {
    return addressCategory;
  }

  public void setAddressCategory(String addressCategory) {
    this.addressCategory = addressCategory;
  }

  public Address addressOverride(String addressOverride) {
    this.addressOverride = addressOverride;
    return this;
  }

   /**
   * Get addressOverride
   * @return addressOverride
  **/
  @Schema(description = "")
  public String getAddressOverride() {
    return addressOverride;
  }

  public void setAddressOverride(String addressOverride) {
    this.addressOverride = addressOverride;
  }

  public Address addressStatus(String addressStatus) {
    this.addressStatus = addressStatus;
    return this;
  }

   /**
   * Get addressStatus
   * @return addressStatus
  **/
  @Schema(description = "")
  public String getAddressStatus() {
    return addressStatus;
  }

  public void setAddressStatus(String addressStatus) {
    this.addressStatus = addressStatus;
  }

  public Address addressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
    return this;
  }

   /**
   * Get addressDetails
   * @return addressDetails
  **/
  @Schema(description = "")
  public AddressDetails getAddressDetails() {
    return addressDetails;
  }

  public void setAddressDetails(AddressDetails addressDetails) {
    this.addressDetails = addressDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressCategory, address.addressCategory) &&
        Objects.equals(this.addressOverride, address.addressOverride) &&
        Objects.equals(this.addressStatus, address.addressStatus) &&
        Objects.equals(this.addressDetails, address.addressDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressCategory, addressOverride, addressStatus, addressDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressCategory: ").append(toIndentedString(addressCategory)).append("\n");
    sb.append("    addressOverride: ").append(toIndentedString(addressOverride)).append("\n");
    sb.append("    addressStatus: ").append(toIndentedString(addressStatus)).append("\n");
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
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
