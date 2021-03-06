/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.employees;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class Role implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Full name of the role
  */
  public String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
 /**
  * Base System Role
  */
  public com.clover.sdk.v3.employees.AccountRole getSystemRole() {
    return genClient.cacheGet(CacheKey.systemRole);
  }
 /**
  * employees with this role
  */
  public java.util.List<com.clover.sdk.v3.base.Reference> getEmployeesRef() {
    return genClient.cacheGet(CacheKey.employeesRef);
  }

  public static final String AUTHORITY = "com.clover.roles";

  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Role> {
    id {
      @Override
      public Object extractValue(Role instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Role instance) {
        return instance.genClient.extractOther("name", String.class);
      }
    },
    systemRole {
      @Override
      public Object extractValue(Role instance) {
        return instance.genClient.extractEnum("systemRole", com.clover.sdk.v3.employees.AccountRole.class);
      }
    },
    employeesRef {
      @Override
      public Object extractValue(Role instance) {
        return instance.genClient.extractListRecord("employeesRef", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<Role> genClient = new GenericClient<Role>(this);

  /**
   * Constructs a new empty instance.
   */
  public Role() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Role(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Role(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Role(Role src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 127);

    genClient.validateNull(getSystemRole(), "systemRole");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'systemRole' field is set and is not null */
  public boolean isNotNullSystemRole() {
    return genClient.cacheValueIsNotNull(CacheKey.systemRole);
  }

  /** Checks whether the 'employeesRef' field is set and is not null */
  public boolean isNotNullEmployeesRef() {
    return genClient.cacheValueIsNotNull(CacheKey.employeesRef);
  }

  /** Checks whether the 'employeesRef' field is set and is not null and is not empty */
  public boolean isNotEmptyEmployeesRef() { return isNotNullEmployeesRef() && !getEmployeesRef().isEmpty(); }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'systemRole' field has been set, however the value could be null */
  public boolean hasSystemRole() {
    return genClient.cacheHasKey(CacheKey.systemRole);
  }

  /** Checks whether the 'employeesRef' field has been set, however the value could be null */
  public boolean hasEmployeesRef() {
    return genClient.cacheHasKey(CacheKey.employeesRef);
  }


  /**
   * Sets the field 'id'.
   */
  public Role setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Role setName(String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'systemRole'.
   */
  public Role setSystemRole(com.clover.sdk.v3.employees.AccountRole systemRole) {
    return genClient.setOther(systemRole, CacheKey.systemRole);
  }

  /**
   * Sets the field 'employeesRef'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Role setEmployeesRef(java.util.List<com.clover.sdk.v3.base.Reference> employeesRef) {
    return genClient.setArrayRecord(employeesRef, CacheKey.employeesRef);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'systemRole' field, the 'has' method for this field will now return false */
  public void clearSystemRole() {
    genClient.clear(CacheKey.systemRole);
  }
  /** Clears the 'employeesRef' field, the 'has' method for this field will now return false */
  public void clearEmployeesRef() {
    genClient.clear(CacheKey.employeesRef);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Role copyChanges() {
    Role copy = new Role();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Role src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Role(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<Role> CREATOR = new android.os.Parcelable.Creator<Role>() {
    @Override
    public Role createFromParcel(android.os.Parcel in) {
      Role instance = new Role(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Role[] newArray(int size) {
      return new Role[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Role> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Role>() {
    @Override
    public Role create(org.json.JSONObject jsonObject) {
      return new Role(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 127;

    public static final boolean SYSTEMROLE_IS_REQUIRED = true;

    public static final boolean EMPLOYEESREF_IS_REQUIRED = false;

  }

}
