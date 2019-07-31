
package com.criticalblue.reactnative;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = CertPinnerModule.MODULE_NAME)
public class CertPinnerModule extends ReactContextBaseJavaModule {
  final static String MODULE_NAME = "CertPinner";

  private final ReactApplicationContext reactContext;

  public CertPinnerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
 }

  @Override
  public String getName() {
    return this.MODULE_NAME;
  }
}