package com.google.ads.interactivemedia.p367v3.internal;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p367v3.impl.data.ResizeAndPositionVideoMsgData;
import com.google.ads.interactivemedia.p367v3.impl.data.TestingConfiguration;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yy */
/* compiled from: PG */
public final /* synthetic */ class C7458yy {
    /* renamed from: a */
    public static Map m22578a(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int indexOf = encodedQuery.indexOf(35);
        int i = 0;
        if (indexOf == -1) {
            indexOf = encodedQuery.length();
        }
        do {
            int indexOf2 = encodedQuery.indexOf(38, i);
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            int indexOf3 = encodedQuery.indexOf(61, i);
            if (indexOf3 > indexOf2 || indexOf3 == -1) {
                indexOf3 = indexOf2;
            }
            linkedHashMap.put(encodedQuery.substring(i, indexOf3), indexOf3 < indexOf2 ? encodedQuery.substring(indexOf3 + 1, indexOf2) : BuildConfig.FLAVOR);
            i = indexOf2 + 1;
        } while (i < indexOf);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: b */
    public static boolean m22579b(BaseDisplayContainer baseDisplayContainer, ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        return resizeAndPositionVideoMsgData.mo13984x().intValue() >= 0 && resizeAndPositionVideoMsgData.width().intValue() >= 0 && resizeAndPositionVideoMsgData.mo13984x().intValue() + resizeAndPositionVideoMsgData.width().intValue() <= baseDisplayContainer.getAdContainer().getWidth() && resizeAndPositionVideoMsgData.mo13985y().intValue() >= 0 && resizeAndPositionVideoMsgData.height().intValue() >= 0 && resizeAndPositionVideoMsgData.mo13985y().intValue() + resizeAndPositionVideoMsgData.height().intValue() <= baseDisplayContainer.getAdContainer().getHeight();
    }

    /* renamed from: c */
    public static void m22580c(String str) {
        if (m22586i(1)) {
            Log.i("IMASDK", str);
        }
    }

    /* renamed from: d */
    public static void m22581d(String str) {
        if (m22586i(2)) {
            Log.w("IMASDK", str);
        }
    }

    /* renamed from: e */
    public static void m22582e(String str, Throwable th) {
        if (m22586i(2)) {
            Log.e("IMASDK", str, th);
        }
    }

    /* renamed from: f */
    public static void m22583f(String str) {
        if (m22586i(2)) {
            Log.e("IMASDK", str);
        }
    }

    /* renamed from: g */
    public static boolean m22584g(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration != null && testingConfiguration.forceTvMode()) {
            return true;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: h */
    public static Application m22585h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    /* renamed from: i */
    private static boolean m22586i(int i) {
        return i + -1 > 0;
    }
}
