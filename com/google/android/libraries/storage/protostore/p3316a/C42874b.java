package com.google.android.libraries.storage.protostore.p3316a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.storage.protostore.a.b */
/* compiled from: PG */
public final class C42874b {
    /* renamed from: a */
    public static Uri m75731a(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }
}
