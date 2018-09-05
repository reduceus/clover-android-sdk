/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getTaxableAmount taxableAmount}</li>
 * <li>{@link #getRate rate}</li>
 * <li>{@link #getIsVat isVat}</li>
 * <li>{@link #getTaxAmount taxAmount}</li>
 * <li>{@link #getTransactionRef transactionRef}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TaxableAmountRate extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Tax rate id.
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Tax rate name. This field is optional.
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * The sub-total of line items that the tax was based on. For VAT, this amount includes tax. For all others, this amount does not include tax.
   */
  public java.lang.Long getTaxableAmount() {
    return genClient.cacheGet(CacheKey.taxableAmount);
  }

  /**
   * The tax rate. 100% = 1e7.
   */
  public java.lang.Long getRate() {
    return genClient.cacheGet(CacheKey.rate);
  }

  /**
   * Whether the taxable amount includes tax.
   */
  public java.lang.Boolean getIsVat() {
    return genClient.cacheGet(CacheKey.isVat);
  }

  /**
   * The amount of tax collected. In cases where there are multiple payments for an order then it may be necessary to add an extra cent of tax to the last payment.
   */
  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }

  /**
   * The refund with which the tax rate is associated
   */
  public com.clover.sdk.v3.base.Reference getTransactionRef() {
    return genClient.cacheGet(CacheKey.transactionRef);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TaxableAmountRate> {
    id {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    taxableAmount {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractOther("taxableAmount", java.lang.Long.class);
      }
    },
    rate {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractOther("rate", java.lang.Long.class);
      }
    },
    isVat {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractOther("isVat", java.lang.Boolean.class);
      }
    },
    taxAmount {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractOther("taxAmount", java.lang.Long.class);
      }
    },
    transactionRef {
      @Override
      public Object extractValue(TaxableAmountRate instance) {
        return instance.genClient.extractRecord("transactionRef", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<TaxableAmountRate> genClient;

  /**
  * Constructs a new empty instance.
  */
  public TaxableAmountRate() {
    genClient = new GenericClient<TaxableAmountRate>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected TaxableAmountRate(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TaxableAmountRate(String json) throws IllegalArgumentException {
    this();
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
  public TaxableAmountRate(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TaxableAmountRate(TaxableAmountRate src) {
    this();
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

    genClient.validateLength(getName(), 127);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'taxableAmount' field is set and is not null */
  public boolean isNotNullTaxableAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxableAmount);
  }

  /** Checks whether the 'rate' field is set and is not null */
  public boolean isNotNullRate() {
    return genClient.cacheValueIsNotNull(CacheKey.rate);
  }

  /** Checks whether the 'isVat' field is set and is not null */
  public boolean isNotNullIsVat() {
    return genClient.cacheValueIsNotNull(CacheKey.isVat);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'transactionRef' field is set and is not null */
  public boolean isNotNullTransactionRef() {
    return genClient.cacheValueIsNotNull(CacheKey.transactionRef);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'taxableAmount' field has been set, however the value could be null */
  public boolean hasTaxableAmount() {
    return genClient.cacheHasKey(CacheKey.taxableAmount);
  }

  /** Checks whether the 'rate' field has been set, however the value could be null */
  public boolean hasRate() {
    return genClient.cacheHasKey(CacheKey.rate);
  }

  /** Checks whether the 'isVat' field has been set, however the value could be null */
  public boolean hasIsVat() {
    return genClient.cacheHasKey(CacheKey.isVat);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'transactionRef' field has been set, however the value could be null */
  public boolean hasTransactionRef() {
    return genClient.cacheHasKey(CacheKey.transactionRef);
  }


  /**
   * Sets the field 'id'.
   */
  public TaxableAmountRate setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public TaxableAmountRate setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'taxableAmount'.
   */
  public TaxableAmountRate setTaxableAmount(java.lang.Long taxableAmount) {
    return genClient.setOther(taxableAmount, CacheKey.taxableAmount);
  }

  /**
   * Sets the field 'rate'.
   */
  public TaxableAmountRate setRate(java.lang.Long rate) {
    return genClient.setOther(rate, CacheKey.rate);
  }

  /**
   * Sets the field 'isVat'.
   */
  public TaxableAmountRate setIsVat(java.lang.Boolean isVat) {
    return genClient.setOther(isVat, CacheKey.isVat);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public TaxableAmountRate setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'transactionRef'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public TaxableAmountRate setTransactionRef(com.clover.sdk.v3.base.Reference transactionRef) {
    return genClient.setRecord(transactionRef, CacheKey.transactionRef);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'taxableAmount' field, the 'has' method for this field will now return false */
  public void clearTaxableAmount() {
    genClient.clear(CacheKey.taxableAmount);
  }
  /** Clears the 'rate' field, the 'has' method for this field will now return false */
  public void clearRate() {
    genClient.clear(CacheKey.rate);
  }
  /** Clears the 'isVat' field, the 'has' method for this field will now return false */
  public void clearIsVat() {
    genClient.clear(CacheKey.isVat);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'transactionRef' field, the 'has' method for this field will now return false */
  public void clearTransactionRef() {
    genClient.clear(CacheKey.transactionRef);
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
  public TaxableAmountRate copyChanges() {
    TaxableAmountRate copy = new TaxableAmountRate();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TaxableAmountRate src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TaxableAmountRate(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TaxableAmountRate> CREATOR = new android.os.Parcelable.Creator<TaxableAmountRate>() {
    @Override
    public TaxableAmountRate createFromParcel(android.os.Parcel in) {
      TaxableAmountRate instance = new TaxableAmountRate(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TaxableAmountRate[] newArray(int size) {
      return new TaxableAmountRate[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TaxableAmountRate> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TaxableAmountRate>() {
    @Override
    public TaxableAmountRate create(org.json.JSONObject jsonObject) {
      return new TaxableAmountRate(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 127;
    public static final boolean TAXABLEAMOUNT_IS_REQUIRED = false;
    public static final boolean RATE_IS_REQUIRED = false;
    public static final boolean ISVAT_IS_REQUIRED = false;
    public static final boolean TAXAMOUNT_IS_REQUIRED = false;
    public static final boolean TRANSACTIONREF_IS_REQUIRED = false;

  }

}
