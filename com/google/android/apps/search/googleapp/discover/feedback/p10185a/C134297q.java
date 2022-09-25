package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.q */
/* compiled from: PG */
public final class C134297q {
    /* renamed from: a */
    public static final void m217877a(String str, int i, C134296p pVar, List list) {
        list.add(new C134290j(str, pVar, i));
    }

    /* renamed from: b */
    public static final void m217878b(String str, Instant instant, C134296p pVar, List list) {
        C69664n.m101061g(instant, "value");
        list.add(new C134299s(str, pVar, instant));
    }

    /* renamed from: c */
    public static final void m217879c(String str, Enum enumR, C134296p pVar, List list) {
        C69664n.m101061g(enumR, "value");
        list.add(new C134287g(str, pVar, enumR));
    }

    /* renamed from: d */
    public static final void m217880d(String str, String str2, C134296p pVar, List list) {
        C69664n.m101061g(str2, "value");
        list.add(new C134298r(str, pVar, str2));
    }

    /* renamed from: e */
    public static final void m217881e(String str, boolean z, C134296p pVar, List list) {
        list.add(new C134285e(str, pVar, z));
    }
}
