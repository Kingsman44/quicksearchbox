package com.bumptech.glide.p291h;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.h.q */
/* compiled from: PG */
public final class C5630q {
    /* renamed from: a */
    public static void m14604a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m14605b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    /* renamed from: c */
    public static void m14606c(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    /* renamed from: d */
    public static void m14607d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
