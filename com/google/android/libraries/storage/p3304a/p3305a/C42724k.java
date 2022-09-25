package com.google.android.libraries.storage.p3304a.p3305a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.storage.a.a.k */
/* compiled from: PG */
public final class C42724k {
    /* renamed from: a */
    public static final Uri m75484a(String str, String str2, long j) {
        Uri.Builder path = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        if (C42725l.m75489e(str) && !C42725l.m75488d(str)) {
            path.appendQueryParameter("expiryDateSecs", String.valueOf(j));
        }
        Uri build = path.build();
        C42725l.m75486b(build);
        C42725l.m75487c(build);
        return build;
    }
}
