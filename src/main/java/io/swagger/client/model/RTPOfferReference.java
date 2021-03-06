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
import java.io.File;
import java.io.IOException;
/**
 * RTPOfferReference
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T12:25:14.024746100Z[Etc/UTC]")
public class RTPOfferReference {
  @SerializedName("OfferReference")
  private String offerReference = null;

  @SerializedName("OfferKey")
  private String offerKey = null;

  @SerializedName("CallSource")
  private File callSource = null;

  public RTPOfferReference offerReference(String offerReference) {
    this.offerReference = offerReference;
    return this;
  }

   /**
   * Get offerReference
   * @return offerReference
  **/
  @Schema(description = "")
  public String getOfferReference() {
    return offerReference;
  }

  public void setOfferReference(String offerReference) {
    this.offerReference = offerReference;
  }

  public RTPOfferReference offerKey(String offerKey) {
    this.offerKey = offerKey;
    return this;
  }

   /**
   * Get offerKey
   * @return offerKey
  **/
  @Schema(description = "")
  public String getOfferKey() {
    return offerKey;
  }

  public void setOfferKey(String offerKey) {
    this.offerKey = offerKey;
  }

  public RTPOfferReference callSource(File callSource) {
    this.callSource = callSource;
    return this;
  }

   /**
   * Source
   * @return callSource
  **/
  @Schema(description = "Source")
  public File getCallSource() {
    return callSource;
  }

  public void setCallSource(File callSource) {
    this.callSource = callSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RTPOfferReference rtPOfferReference = (RTPOfferReference) o;
    return Objects.equals(this.offerReference, rtPOfferReference.offerReference) &&
        Objects.equals(this.offerKey, rtPOfferReference.offerKey) &&
        Objects.equals(this.callSource, rtPOfferReference.callSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerReference, offerKey, Objects.hashCode(callSource));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RTPOfferReference {\n");
    
    sb.append("    offerReference: ").append(toIndentedString(offerReference)).append("\n");
    sb.append("    offerKey: ").append(toIndentedString(offerKey)).append("\n");
    sb.append("    callSource: ").append(toIndentedString(callSource)).append("\n");
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
