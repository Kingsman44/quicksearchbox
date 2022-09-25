package com.google.common.util.concurrent;

import com.google.common.p4573p.C60718h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.dt */
/* compiled from: PG */
abstract class C60906dt extends C60899dm {

    /* renamed from: a */
    double f165011a;

    /* renamed from: b */
    double f165012b;

    /* renamed from: c */
    double f165013c;

    /* renamed from: d */
    private long f165014d = 0;

    public C60906dt(C60898dl dlVar) {
        super(dlVar);
    }

    /* renamed from: a */
    public final double mo57394a() {
        double micros = (double) TimeUnit.SECONDS.toMicros(1);
        double d = this.f165013c;
        Double.isNaN(micros);
        return micros / d;
    }

    /* renamed from: d */
    public final long mo57396d() {
        return this.f165014d;
    }

    /* renamed from: e */
    public final long mo57397e(long j) {
        mo57408h(j);
        long j2 = this.f165014d;
        double min = Math.min(1.0d, this.f165011a);
        this.f165014d = C60718h.m92652f(this.f165014d, mo57407g() + ((long) ((1.0d - min) * this.f165013c)));
        this.f165011a -= min;
        return j2;
    }

    /* renamed from: f */
    public abstract double mo57406f();

    /* renamed from: g */
    public abstract long mo57407g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo57408h(long j) {
        long j2 = this.f165014d;
        if (j > j2) {
            double f = mo57406f();
            double d = this.f165012b;
            double d2 = this.f165011a;
            double d3 = (double) (j - j2);
            Double.isNaN(d3);
            this.f165011a = Math.min(d, d2 + (d3 / f));
            this.f165014d = j;
        }
    }
}
