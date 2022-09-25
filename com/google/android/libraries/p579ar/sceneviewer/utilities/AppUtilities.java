package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.Window;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.AppUtilities */
/* compiled from: PG */
public final class AppUtilities {
    private static final String AR_CORE_PACKAGE = "com.google.ar.core";

    private AppUtilities() {
    }

    public static void applySystemBarChanges(Window window, int i) {
        window.getDecorView().setSystemUiVisibility(i);
        window.addFlags(67108864);
        window.addFlags(256);
    }

    public static int getArCoreApkVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(AR_CORE_PACKAGE, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static boolean hasInternetConnectivity(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isDarkMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void updateSystemBars(Window window, Types.ViewerMode viewerMode, boolean z) {
        if (Types.ViewerMode.AR.equals(viewerMode)) {
            if (z) {
                applySystemBarChanges(window, 4372);
            } else {
                applySystemBarChanges(window, 4356);
            }
        } else if (Types.ViewerMode.THREE_D.equals(viewerMode)) {
            applySystemBarChanges(window, 4372);
        }
    }
}
