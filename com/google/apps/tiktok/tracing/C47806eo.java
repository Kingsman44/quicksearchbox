package com.google.apps.tiktok.tracing;

import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.tracing.eo */
/* compiled from: PG */
final class C47806eo implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123815a;

    /* renamed from: b */
    final /* synthetic */ C58817ah f123816b;

    public C47806eo(C47572bw bwVar, C58817ah ahVar) {
        this.f123815a = bwVar;
        this.f123816b = ahVar;
    }

    public final Object apply(Object obj) {
        C47572bw h = C47831fm.m85013h(this.f123815a);
        try {
            return this.f123816b.apply(obj);
        } finally {
            C47831fm.m85013h(h);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f123816b);
        return "propagating=[" + valueOf + "]";
    }
}
