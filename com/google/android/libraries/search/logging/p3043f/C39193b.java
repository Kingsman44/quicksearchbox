package com.google.android.libraries.search.logging.p3043f;

import android.text.TextUtils;

/* renamed from: com.google.android.libraries.search.logging.f.b */
/* compiled from: PG */
public final class C39193b {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r3 = r3.getBundleExtra("app_data");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m68624a(android.content.Intent r3) {
        /*
            java.lang.String r0 = "source"
            java.lang.String r1 = r3.getStringExtra(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.String r2 = "app_data"
            android.os.Bundle r3 = r3.getBundleExtra(r2)
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = r3.getString(r0)
            return r3
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(android.content.Intent):java.lang.String");
    }

    /* renamed from: b */
    public static String m68625b(String str) {
        TextUtils.isEmpty("and.gsa.deeplink");
        if (!TextUtils.isEmpty(str)) {
            str.startsWith(".");
        }
        return "and.gsa.deeplink.".concat(String.valueOf(str));
    }
}
