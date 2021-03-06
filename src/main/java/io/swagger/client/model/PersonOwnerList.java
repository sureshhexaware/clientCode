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
import io.swagger.client.model.PersonOwner;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PersonOwnerList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T12:25:14.024746100Z[Etc/UTC]")
public class PersonOwnerList {
  @SerializedName("PersonOwner")
  private PersonOwner personOwner = null;

  public PersonOwnerList personOwner(PersonOwner personOwner) {
    this.personOwner = personOwner;
    return this;
  }

   /**
   * Get personOwner
   * @return personOwner
  **/
  @Schema(description = "")
  public PersonOwner getPersonOwner() {
    return personOwner;
  }

  public void setPersonOwner(PersonOwner personOwner) {
    this.personOwner = personOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonOwnerList personOwnerList = (PersonOwnerList) o;
    return Objects.equals(this.personOwner, personOwnerList.personOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personOwner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonOwnerList {\n");
    
    sb.append("    personOwner: ").append(toIndentedString(personOwner)).append("\n");
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
