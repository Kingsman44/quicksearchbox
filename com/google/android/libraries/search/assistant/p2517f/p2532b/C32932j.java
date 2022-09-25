package com.google.android.libraries.search.assistant.p2517f.p2532b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo;
import com.google.common.base.C58810aa;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70920e;

/* renamed from: com.google.android.libraries.search.assistant.f.b.j */
/* compiled from: PG */
abstract class C32932j extends C58810aa {
    /* renamed from: a */
    public abstract C70920e mo38363a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo17535b(Object obj) {
        C70920e eVar = (C70920e) obj;
        C32820bo boVar = C32820bo.UNKNOWN;
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return C32820bo.UNKNOWN;
        }
        if (ordinal == 1) {
            return C32820bo.STATIC_CACHE;
        }
        if (ordinal == 2) {
            return C32820bo.SYNCHRONIZED_CACHE;
        }
        if (ordinal == 3) {
            return C32820bo.CONTEXT_PROVIDER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(eVar.f189119e)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo17536c(Object obj) {
        C32820bo boVar = (C32820bo) obj;
        C70920e eVar = C70920e.UNKNOWN;
        int ordinal = boVar.ordinal();
        if (ordinal == 0) {
            return C70920e.UNKNOWN;
        }
        if (ordinal == 1) {
            return C70920e.STATIC_CACHE;
        }
        if (ordinal == 2) {
            return C70920e.SYNCHRONIZED_CACHE;
        }
        if (ordinal == 3) {
            return C70920e.CONTEXT_PROVIDER;
        }
        if (ordinal == 4) {
            return mo38363a();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(boVar.getNumber())));
    }
}
