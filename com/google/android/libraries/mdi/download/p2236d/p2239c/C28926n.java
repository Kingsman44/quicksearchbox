package com.google.android.libraries.mdi.download.p2236d.p2239c;

import android.net.Uri;

/* renamed from: com.google.android.libraries.mdi.download.d.c.n */
/* compiled from: PG */
public final class C28926n {
    /* renamed from: a */
    public static Uri m53844a(Uri uri) {
        String uri2 = uri.toString();
        return Uri.parse(uri2.substring(0, uri2.lastIndexOf("_")));
    }

    /* renamed from: b */
    public static String m53845b(String str, String str2) {
        return str + "_" + str2;
    }
}
