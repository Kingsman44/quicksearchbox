package com.google.android.apps.gsa.shared.util;

import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.shared.util.u */
/* compiled from: PG */
public final class C91100u {
    /* renamed from: a */
    public static boolean m148848a(String str, Uri uri) {
        return "android.intent.action.VIEW".equals(str) && uri != null && "googlequicksearchbox".equals(uri.getScheme());
    }
}
