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
 * Plan
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T12:25:14.024746100Z[Etc/UTC]")
public class Plan {
  @SerializedName("CompanyCode")
  private String companyCode = null;

  @SerializedName("SchemeCode")
  private String schemeCode = null;

  @SerializedName("Reference")
  private String reference = null;

  public Plan companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

   /**
   * Get companyCode
   * @return companyCode
  **/
  @Schema(description = "")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public Plan schemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
    return this;
  }

   /**
   * Get schemeCode
   * @return schemeCode
  **/
  @Schema(description = "")
  public String getSchemeCode() {
    return schemeCode;
  }

  public void setSchemeCode(String schemeCode) {
    this.schemeCode = schemeCode;
  }

  public Plan reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Schema(description = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.companyCode, plan.companyCode) &&
        Objects.equals(this.schemeCode, plan.schemeCode) &&
        Objects.equals(this.reference, plan.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyCode, schemeCode, reference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    schemeCode: ").append(toIndentedString(schemeCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
