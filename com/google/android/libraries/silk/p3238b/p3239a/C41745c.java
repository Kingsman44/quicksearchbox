package com.google.android.libraries.silk.p3238b.p3239a;

import com.google.android.libraries.web.shared.C44076a;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.silk.b.a.c */
/* compiled from: PG */
public final class C41745c {

    /* renamed from: a */
    public static final C58485gu f109096a = C58485gu.m89849q("https://google.com", "https://*.google.com", "https://google.com.hk", "https://*.google.com.hk");

    /* renamed from: a */
    public static boolean m73218a(String str) {
        return Collection.EL.stream(f109096a).anyMatch(new C41744b(C44076a.m77818a(str).toString()));
    }
}
