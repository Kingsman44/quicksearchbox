package com.google.android.apps.search.googleapp.discover.loggingsignals;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.loggingsignals.e */
/* compiled from: PG */
public final class C134467e extends C0658ft {

    /* renamed from: a */
    private final C134468f f366218a;

    /* renamed from: b */
    private int f366219b;

    /* renamed from: c */
    private int f366220c;

    /* renamed from: d */
    private int f366221d;

    /* renamed from: e */
    private int f366222e;

    /* renamed from: f */
    private int f366223f;

    public C134467e(C134468f fVar) {
        C69664n.m101061g(fVar, "loggingSignalsDistributor");
        this.f366218a = fVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2 = this.f366223f;
        if (i != i2) {
            if (i == 0) {
                this.f366218a.mo111500k(this.f366219b, this.f366220c, this.f366221d, this.f366222e);
                this.f366219b = 0;
                this.f366220c = 0;
                this.f366221d = 0;
                this.f366222e = 0;
            } else if (i == 1 && i2 != 2) {
                this.f366218a.mo111501l();
            }
        }
        this.f366223f = i;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.f366219b += i;
        this.f366220c += i2;
        this.f366221d += Math.abs(i);
        this.f366222e += Math.abs(i2);
    }
}
