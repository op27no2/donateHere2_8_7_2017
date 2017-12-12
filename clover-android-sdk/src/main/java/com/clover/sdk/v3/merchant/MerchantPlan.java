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

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class MerchantPlan implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

 /**
  * Unique identifier
  */
  public String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * The name of the merchant plan
  */
  public String getName() {
    return genClient.cacheGet(CacheKey.name);
  }
 /**
  * Description of the plan
  */
  public String getDescription() {
    return genClient.cacheGet(CacheKey.description);
  }
  public Long getPrice() {
    return genClient.cacheGet(CacheKey.price);
  }
  public java.util.List<com.clover.sdk.v3.merchant.Module> getModules() {
    return genClient.cacheGet(CacheKey.modules);
  }
  public com.clover.sdk.v3.apps.AppBundle getAppBundle() {
    return genClient.cacheGet(CacheKey.appBundle);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<MerchantPlan> {
    id {
      @Override
      public Object extractValue(MerchantPlan instance) {
        return instance.genClient.extractOther("id", String.class);
      }
    },
    name {
      @Override
      public Object extractValue(MerchantPlan instance) {
        return instance.genClient.extractOther("name", String.class);
      }
    },
    description {
      @Override
      public Object extractValue(MerchantPlan instance) {
        return instance.genClient.extractOther("description", String.class);
      }
    },
    price {
      @Override
      public Object extractValue(MerchantPlan instance) {
        return instance.genClient.extractOther("price", Long.class);
      }
    },
    modules {
      @Override
      public Object extractValue(MerchantPlan instance) {
        return instance.genClient.extractListRecord("modules", com.clover.sdk.v3.merchant.Module.JSON_CREATOR);
      }
    },
    appBundle {
      @Override
      public Object extractValue(MerchantPlan instance) {
        return instance.genClient.extractRecord("appBundle", com.clover.sdk.v3.apps.AppBundle.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<MerchantPlan> genClient = new GenericClient<MerchantPlan>(this);

  /**
   * Constructs a new empty instance.
   */
  public MerchantPlan() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantPlan(String json) throws IllegalArgumentException {
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
  public MerchantPlan(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantPlan(MerchantPlan src) {
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

    genClient.validateLength(getName(), 31);

    genClient.validateLength(getDescription(), 2047);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'description' field is set and is not null */
  public boolean isNotNullDescription() {
    return genClient.cacheValueIsNotNull(CacheKey.description);
  }

  /** Checks whether the 'price' field is set and is not null */
  public boolean isNotNullPrice() {
    return genClient.cacheValueIsNotNull(CacheKey.price);
  }

  /** Checks whether the 'modules' field is set and is not null */
  public boolean isNotNullModules() {
    return genClient.cacheValueIsNotNull(CacheKey.modules);
  }

  /** Checks whether the 'modules' field is set and is not null and is not empty */
  public boolean isNotEmptyModules() { return isNotNullModules() && !getModules().isEmpty(); }

  /** Checks whether the 'appBundle' field is set and is not null */
  public boolean isNotNullAppBundle() {
    return genClient.cacheValueIsNotNull(CacheKey.appBundle);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'description' field has been set, however the value could be null */
  public boolean hasDescription() {
    return genClient.cacheHasKey(CacheKey.description);
  }

  /** Checks whether the 'price' field has been set, however the value could be null */
  public boolean hasPrice() {
    return genClient.cacheHasKey(CacheKey.price);
  }

  /** Checks whether the 'modules' field has been set, however the value could be null */
  public boolean hasModules() {
    return genClient.cacheHasKey(CacheKey.modules);
  }

  /** Checks whether the 'appBundle' field has been set, however the value could be null */
  public boolean hasAppBundle() {
    return genClient.cacheHasKey(CacheKey.appBundle);
  }


  /**
   * Sets the field 'id'.
   */
  public MerchantPlan setId(String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public MerchantPlan setName(String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'description'.
   */
  public MerchantPlan setDescription(String description) {
    return genClient.setOther(description, CacheKey.description);
  }

  /**
   * Sets the field 'price'.
   */
  public MerchantPlan setPrice(Long price) {
    return genClient.setOther(price, CacheKey.price);
  }

  /**
   * Sets the field 'modules'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public MerchantPlan setModules(java.util.List<com.clover.sdk.v3.merchant.Module> modules) {
    return genClient.setArrayRecord(modules, CacheKey.modules);
  }

  /**
   * Sets the field 'appBundle'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantPlan setAppBundle(com.clover.sdk.v3.apps.AppBundle appBundle) {
    return genClient.setRecord(appBundle, CacheKey.appBundle);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'description' field, the 'has' method for this field will now return false */
  public void clearDescription() {
    genClient.clear(CacheKey.description);
  }
  /** Clears the 'price' field, the 'has' method for this field will now return false */
  public void clearPrice() {
    genClient.clear(CacheKey.price);
  }
  /** Clears the 'modules' field, the 'has' method for this field will now return false */
  public void clearModules() {
    genClient.clear(CacheKey.modules);
  }
  /** Clears the 'appBundle' field, the 'has' method for this field will now return false */
  public void clearAppBundle() {
    genClient.clear(CacheKey.appBundle);
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
  public MerchantPlan copyChanges() {
    MerchantPlan copy = new MerchantPlan();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantPlan src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantPlan(src).getJSONObject(), src.genClient);
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

  public static final android.os.Parcelable.Creator<MerchantPlan> CREATOR = new android.os.Parcelable.Creator<MerchantPlan>() {
    @Override
    public MerchantPlan createFromParcel(android.os.Parcel in) {
      MerchantPlan instance = new MerchantPlan(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantPlan[] newArray(int size) {
      return new MerchantPlan[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantPlan> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantPlan>() {
    @Override
    public MerchantPlan create(org.json.JSONObject jsonObject) {
      return new MerchantPlan(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 31;

    public static final boolean DESCRIPTION_IS_REQUIRED = false;
    public static final long DESCRIPTION_MAX_LEN = 2047;

    public static final boolean PRICE_IS_REQUIRED = false;

    public static final boolean MODULES_IS_REQUIRED = false;

    public static final boolean APPBUNDLE_IS_REQUIRED = false;

  }

}
