package com.bumptech.glide.load.data.p306a;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.data.a.a */
/* compiled from: PG */
public final class C5921a {
    /* renamed from: a */
    public static boolean m15287a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m15288b(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: c */
    public static boolean m15289c(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
