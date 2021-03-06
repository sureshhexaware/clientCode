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
 * SourceEvent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T12:25:14.024746100Z[Etc/UTC]")
public class SourceEvent {
  @SerializedName("BusinessEventSourceCode")
  private String businessEventSourceCode = null;

  @SerializedName("BusinessEventCode")
  private String businessEventCode = null;

  @SerializedName("ReceivedDate")
  private String receivedDate = null;

  @SerializedName("ReceivedTime")
  private String receivedTime = null;

  @SerializedName("LogonUserId")
  private String logonUserId = null;

  public SourceEvent businessEventSourceCode(String businessEventSourceCode) {
    this.businessEventSourceCode = businessEventSourceCode;
    return this;
  }

   /**
   * Get businessEventSourceCode
   * @return businessEventSourceCode
  **/
  @Schema(description = "")
  public String getBusinessEventSourceCode() {
    return businessEventSourceCode;
  }

  public void setBusinessEventSourceCode(String businessEventSourceCode) {
    this.businessEventSourceCode = businessEventSourceCode;
  }

  public SourceEvent businessEventCode(String businessEventCode) {
    this.businessEventCode = businessEventCode;
    return this;
  }

   /**
   * Get businessEventCode
   * @return businessEventCode
  **/
  @Schema(description = "")
  public String getBusinessEventCode() {
    return businessEventCode;
  }

  public void setBusinessEventCode(String businessEventCode) {
    this.businessEventCode = businessEventCode;
  }

  public SourceEvent receivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
    return this;
  }

   /**
   * Get receivedDate
   * @return receivedDate
  **/
  @Schema(description = "")
  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }

  public SourceEvent receivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
    return this;
  }

   /**
   * Get receivedTime
   * @return receivedTime
  **/
  @Schema(description = "")
  public String getReceivedTime() {
    return receivedTime;
  }

  public void setReceivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
  }

  public SourceEvent logonUserId(String logonUserId) {
    this.logonUserId = logonUserId;
    return this;
  }

   /**
   * Get logonUserId
   * @return logonUserId
  **/
  @Schema(description = "")
  public String getLogonUserId() {
    return logonUserId;
  }

  public void setLogonUserId(String logonUserId) {
    this.logonUserId = logonUserId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceEvent sourceEvent = (SourceEvent) o;
    return Objects.equals(this.businessEventSourceCode, sourceEvent.businessEventSourceCode) &&
        Objects.equals(this.businessEventCode, sourceEvent.businessEventCode) &&
        Objects.equals(this.receivedDate, sourceEvent.receivedDate) &&
        Objects.equals(this.receivedTime, sourceEvent.receivedTime) &&
        Objects.equals(this.logonUserId, sourceEvent.logonUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessEventSourceCode, businessEventCode, receivedDate, receivedTime, logonUserId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceEvent {\n");
    
    sb.append("    businessEventSourceCode: ").append(toIndentedString(businessEventSourceCode)).append("\n");
    sb.append("    businessEventCode: ").append(toIndentedString(businessEventCode)).append("\n");
    sb.append("    receivedDate: ").append(toIndentedString(receivedDate)).append("\n");
    sb.append("    receivedTime: ").append(toIndentedString(receivedTime)).append("\n");
    sb.append("    logonUserId: ").append(toIndentedString(logonUserId)).append("\n");
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
