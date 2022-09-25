package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoe */
/* compiled from: PG */
final class aoe {

    /* renamed from: a */
    private final aod f21096a;

    /* renamed from: b */
    private final Handler f21097b = new Handler();

    /* renamed from: c */
    private boolean f21098c = false;

    public aoe(aod aod) {
        this.f21096a = aod;
    }

    /* renamed from: c */
    static final /* synthetic */ void m19121c(aod aod, Handler handler) {
        aod.mo15072a();
        m19122d(aod, handler);
    }

    /* renamed from: d */
    private static void m19122d(aod aod, Handler handler) {
        handler.postDelayed(new aoc(aod, handler), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15073a() {
        if (!this.f21098c) {
            this.f21098c = true;
            this.f21096a.mo15072a();
            m19122d(this.f21096a, this.f21097b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15074b() {
        if (this.f21098c) {
            this.f21098c = false;
            this.f21097b.removeCallbacksAndMessages((Object) null);
        }
    }
}
