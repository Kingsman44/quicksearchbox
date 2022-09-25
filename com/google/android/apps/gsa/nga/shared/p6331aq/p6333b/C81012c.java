package com.google.android.apps.gsa.nga.shared.p6331aq.p6333b;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.nga.shared.aq.b.c */
/* compiled from: PG */
public final class C81012c {

    /* renamed from: a */
    private double f222053a;

    /* renamed from: b */
    private long f222054b;

    public C81012c() {
        mo74784c();
    }

    /* renamed from: a */
    public final synchronized double mo74782a() {
        long j = this.f222054b;
        if (j == 0) {
            return C59203do.f157270a;
        }
        double d = this.f222053a;
        double d2 = (double) j;
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: b */
    public final synchronized void mo74783b(double d) {
        this.f222053a += d;
        this.f222054b++;
    }

    /* renamed from: c */
    public final synchronized void mo74784c() {
        this.f222053a = C59203do.f157270a;
        this.f222054b = 0;
    }
}
