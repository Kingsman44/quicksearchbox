package com.google.android.libraries.lens.view.imageviewer;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.s */
/* compiled from: PG */
public final class C26956s {

    /* renamed from: a */
    public static final Uri f73472a = Uri.parse("https://www.google.com/url");

    /* renamed from: b */
    private static final Uri f73473b = Uri.parse("https://www.google.com/imgres");

    /* renamed from: a */
    public static boolean m49938a(Uri uri) {
        Uri uri2 = f73473b;
        return TextUtils.equals(uri2.getAuthority(), uri.getAuthority()) && TextUtils.equals(uri2.getPath(), uri.getPath());
    }
}
