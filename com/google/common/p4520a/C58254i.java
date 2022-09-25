package com.google.common.p4520a;

import com.google.common.base.C58815af;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import com.google.common.base.C58889cz;
import com.google.common.base.C58890d;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.a.i */
/* compiled from: PG */
public final class C58254i {

    /* renamed from: a */
    static final C58881cr f155783a = new C58885cv(new C58250e());

    /* renamed from: b */
    public static final C58881cr f155784b = C58249d.f155778a;

    /* renamed from: c */
    static final C58889cz f155785c = new C58251f();

    /* renamed from: s */
    private static final Logger f155786s = Logger.getLogger(C58254i.class.getName());

    /* renamed from: d */
    boolean f155787d = true;

    /* renamed from: e */
    public int f155788e = -1;

    /* renamed from: f */
    int f155789f = -1;

    /* renamed from: g */
    long f155790g = -1;

    /* renamed from: h */
    long f155791h = -1;

    /* renamed from: i */
    C58248ca f155792i;

    /* renamed from: j */
    C58212as f155793j;

    /* renamed from: k */
    C58212as f155794k;

    /* renamed from: l */
    long f155795l = -1;

    /* renamed from: m */
    long f155796m = -1;

    /* renamed from: n */
    C58815af f155797n;

    /* renamed from: o */
    C58815af f155798o;

    /* renamed from: p */
    C58242bv f155799p;

    /* renamed from: q */
    C58889cz f155800q;

    /* renamed from: r */
    public C58881cr f155801r = f155783a;

    /* renamed from: i */
    private final void m89194i() {
        boolean z = true;
        if (this.f155792i == null) {
            if (this.f155791h != -1) {
                z = false;
            }
            C58838bb.m90884s(z, "maximumWeight requires weigher");
        } else if (this.f155787d) {
            if (this.f155791h == -1) {
                z = false;
            }
            C58838bb.m90884s(z, "weigher requires maximumWeight");
        } else if (this.f155791h == -1) {
            f155786s.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    /* renamed from: a */
    public final C58247c mo54817a() {
        m89194i();
        return new C58206am(this);
    }

    /* renamed from: b */
    public final C58259n mo54818b(C58257l lVar) {
        m89194i();
        return new C58204ak(this, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58212as mo54819c() {
        return (C58212as) C58831av.m90830c(this.f155793j, C58212as.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C58212as mo54820d() {
        return (C58212as) C58831av.m90830c(this.f155794k, C58212as.STRONG);
    }

    /* renamed from: e */
    public final void mo54821e(long j, TimeUnit timeUnit) {
        long j2 = this.f155796m;
        C58838bb.m90886u(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        C58838bb.m90876k(true, "duration cannot be negative: %s %s", j, timeUnit);
        this.f155796m = timeUnit.toNanos(j);
    }

    /* renamed from: f */
    public final void mo54822f(long j, TimeUnit timeUnit) {
        long j2 = this.f155795l;
        boolean z = true;
        C58838bb.m90886u(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        if (j < 0) {
            z = false;
        }
        C58838bb.m90876k(z, "duration cannot be negative: %s %s", j, timeUnit);
        this.f155795l = timeUnit.toNanos(j);
    }

    /* renamed from: g */
    public final void mo54823g(long j) {
        long j2 = this.f155790g;
        boolean z = true;
        C58838bb.m90886u(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f155791h;
        C58838bb.m90886u(j3 == -1, "maximum weight was already set to %s", j3);
        if (this.f155792i != null) {
            z = false;
        }
        C58838bb.m90884s(z, "maximum size can not be combined with weigher");
        this.f155790g = j;
    }

    /* renamed from: h */
    public final void mo54824h(C58889cz czVar) {
        C58838bb.m90883r(this.f155800q == null);
        czVar.getClass();
        this.f155800q = czVar;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        int i = this.f155788e;
        if (i != -1) {
            b.mo56103c("initialCapacity", String.valueOf(i));
        }
        int i2 = this.f155789f;
        if (i2 != -1) {
            b.mo56103c("concurrencyLevel", String.valueOf(i2));
        }
        long j = this.f155790g;
        if (j != -1) {
            b.mo56103c("maximumSize", String.valueOf(j));
        }
        long j2 = this.f155791h;
        if (j2 != -1) {
            b.mo56103c("maximumWeight", String.valueOf(j2));
        }
        if (this.f155795l != -1) {
            b.mo56102b("expireAfterWrite", this.f155795l + "ns");
        }
        if (this.f155796m != -1) {
            b.mo56102b("expireAfterAccess", this.f155796m + "ns");
        }
        C58212as asVar = this.f155793j;
        if (asVar != null) {
            b.mo56102b("keyStrength", C58890d.m90988c(asVar.toString()));
        }
        C58212as asVar2 = this.f155794k;
        if (asVar2 != null) {
            b.mo56102b("valueStrength", C58890d.m90988c(asVar2.toString()));
        }
        if (this.f155797n != null) {
            b.mo56101a().f156625b = "keyEquivalence";
        }
        if (this.f155798o != null) {
            b.mo56101a().f156625b = "valueEquivalence";
        }
        if (this.f155799p != null) {
            b.mo56101a().f156625b = "removalListener";
        }
        return b.toString();
    }
}
