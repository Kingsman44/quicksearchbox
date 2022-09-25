package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1413b;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58759qy;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61354o;
import com.google.frameworks.client.data.android.p4632a.C61355p;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.speech.p5208h.C66652ds;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.b.c */
/* compiled from: PG */
public final class C17403c {
    /* renamed from: a */
    public static C66652ds m34679a(C66652ds dsVar, C61358s sVar, Optional optional) {
        return (C66652ds) optional.orElseGet(new C17402b(dsVar, sVar));
    }

    /* renamed from: b */
    public static C61358s m34680b(String str) {
        C61349j jVar = new C61349j();
        jVar.f165909a = C58833ax.m90834k(new C58759qy("https://www.googleapis.com/auth/assistant"));
        C61354o a = C61355p.m93860a(new C58759qy("pseudonymous"));
        a.f165916a = C58833ax.m90834k(str);
        a.f165917b = true;
        jVar.f165910b = C58833ax.m90834k(a.mo57929a());
        return new C61358s(jVar.mo57930b());
    }
}
