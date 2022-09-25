package com.google.apps.tiktok.tracing;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.apps.tiktok.tracing.en */
/* compiled from: PG */
final class C47805en implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123813a;

    /* renamed from: b */
    final /* synthetic */ C60930r f123814b;

    public C47805en(C47572bw bwVar, C60930r rVar) {
        this.f123813a = bwVar;
        this.f123814b = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C47572bw h = C47831fm.m85013h(this.f123813a);
        try {
            return this.f123814b.mo18058a();
        } finally {
            C47831fm.m85013h(h);
        }
    }

    public final String toString() {
        String obj = this.f123814b.toString();
        return "propagating=[" + obj + "]";
    }
}
