package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.libraries.performance.primes.C31164au;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.s */
/* compiled from: PG */
final class C31398s extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C31164au f84553a;

    /* renamed from: b */
    final /* synthetic */ C31399t f84554b;

    /* renamed from: c */
    private boolean f84555c;

    public C31398s(C31399t tVar, C31164au auVar) {
        this.f84554b = tVar;
        this.f84553a = auVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (!this.f84555c) {
            if (i == 1) {
                this.f84554b.mo37077g(this.f84553a);
                this.f84555c = true;
            }
        } else if (i == 0) {
            this.f84554b.mo37076c(this.f84553a, (C71207aq) null);
            this.f84555c = false;
        }
    }
}
