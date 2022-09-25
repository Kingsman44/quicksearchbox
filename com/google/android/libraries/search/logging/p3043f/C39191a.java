package com.google.android.libraries.search.logging.p3043f;

import android.util.Base64;
import com.google.common.p4575r.C60761r;

/* renamed from: com.google.android.libraries.search.logging.f.a */
/* compiled from: PG */
public final class C39191a {
    /* renamed from: a */
    public static long m68622a(String str) {
        return C60761r.m92757c(Base64.decode(str, 11));
    }

    /* renamed from: b */
    public static String m68623b(long j) {
        return Base64.encodeToString(C60761r.m92760f(j), 11);
    }
}
