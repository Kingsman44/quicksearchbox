package com.google.android.libraries.assistant.pcp.p1546d;

import com.google.assistant.p3803ag.p3809c.C49051eq;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.d.g */
/* compiled from: PG */
public abstract class C18579g {
    /* renamed from: b */
    public static C18579g m36038b(C49051eq eqVar) {
        return new C18575c(eqVar.f126885t);
    }

    /* renamed from: a */
    public abstract int mo24070a();

    /* renamed from: c */
    public final Optional mo24073c() {
        return Optional.ofNullable(C49051eq.m85352a(mo24070a()));
    }

    /* renamed from: d */
    public final String mo24074d() {
        Optional map = mo24073c().map(C18578f.f52602a);
        int a = mo24070a();
        return (String) map.orElse("FEATURE_TYPE_" + a);
    }

    public final String toString() {
        return mo24074d();
    }
}
