package com.unifacef.tcc.util;

import com.unifacef.tcc.StartApplication;

public final class ApplicationUtil {
  private ApplicationUtil() {
  }

  public static String getVersion() {
    try {
      return StartApplication.class.getPackage().getImplementationVersion();
    } catch (Throwable t) {
      System.err.println("Unable to get application version: " + t.toString());
    }

    return null;
  }
}
