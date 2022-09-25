package com.google.android.apps.gsa.shared.util;

import android.text.TextUtils;

/* renamed from: com.google.android.apps.gsa.shared.util.i */
/* compiled from: PG */
public final class C91041i {
    /* renamed from: a */
    public static boolean m148716a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ("com.android.chrome".equals(str) || "com.chrome.beta".equals(str) || "com.chrome.canary".equals(str) || "com.chrome.dev".equals(str) || "com.google.android.apps.chrome_dev".equals(str) || "com.google.android.apps.chrome".equals(str)) {
            return true;
        }
        return false;
    }
}
