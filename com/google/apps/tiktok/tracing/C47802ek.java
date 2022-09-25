package com.google.apps.tiktok.tracing;

import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.apps.tiktok.tracing.ek */
/* compiled from: PG */
final class C47802ek implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123807a;

    /* renamed from: b */
    final /* synthetic */ C60845bz f123808b;

    public C47802ek(C47572bw bwVar, C60845bz bzVar) {
        this.f123807a = bwVar;
        this.f123808b = bzVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C47572bw h = C47831fm.m85013h(this.f123807a);
        try {
            this.f123808b.mo17910gl(th);
        } finally {
            C47831fm.m85013h(h);
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C47572bw h = C47831fm.m85013h(this.f123807a);
        try {
            this.f123808b.mo17911gm(obj);
        } finally {
            C47831fm.m85013h(h);
        }
    }
}
