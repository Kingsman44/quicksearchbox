package com.google.android.apps.gsa.shared.p7195y;

import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.shared.y.bf */
/* compiled from: PG */
public final class C91201bf {

    /* renamed from: a */
    private final Uri f254585a;

    public C91201bf(Uri uri) {
        this.f254585a = uri;
    }

    /* renamed from: a */
    public final Uri mo85473a(String str, int i, boolean z) {
        return this.f254585a.buildUpon().appendPath(true != z ? "icon" : "stream_image").appendQueryParameter("url", str).appendQueryParameter("tag", Integer.toString(i)).build();
    }

    /* renamed from: b */
    public final Uri mo85474b(String str) {
        return mo85473a(str, 7, false);
    }
}
