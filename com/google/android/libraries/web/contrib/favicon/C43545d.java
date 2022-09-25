package com.google.android.libraries.web.contrib.favicon;

import android.graphics.Bitmap;

/* renamed from: com.google.android.libraries.web.contrib.favicon.d */
/* compiled from: PG */
abstract class C43545d extends C43550i {
    /* renamed from: b */
    public Bitmap mo46603b() {
        int a = mo46599a();
        String str = a != 1 ? a != 2 ? a != 3 ? "null" : "FAVICON_RECEIVED" : "FAVICON_TIMED_OUT" : "FAVICON_LOADING";
        if (a != 0) {
            throw new UnsupportedOperationException(str);
        }
        throw null;
    }
}
