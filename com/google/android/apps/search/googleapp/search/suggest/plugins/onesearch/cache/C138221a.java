package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import android.os.Build;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.a */
/* compiled from: PG */
public final class C138221a {
    /* renamed from: a */
    public static final boolean m224578a() {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        String str = Build.MODEL;
        C69664n.m101060f(str, "MODEL");
        return C69764m.m101234m(str, "Pixel");
    }
}
