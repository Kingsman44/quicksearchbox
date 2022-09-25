package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82917ff;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82920fi;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.dh */
/* compiled from: PG */
public final class C79812dh extends C79850ah {

    /* renamed from: c */
    private static final C58974d f218820c = C58974d.m91134h("PerformanceStopwatch");

    /* renamed from: a */
    public final String f218821a;

    /* renamed from: b */
    public boolean f218822b = false;

    /* renamed from: d */
    private final C31167ax f218823d;

    /* renamed from: e */
    private final C31164au f218824e;

    /* renamed from: f */
    private final C58889cz f218825f;

    /* renamed from: g */
    private final C83334w f218826g;

    /* renamed from: h */
    private final C22871g f218827h;

    /* renamed from: i */
    private final C83320io f218828i;

    /* renamed from: j */
    private final long f218829j;

    /* renamed from: k */
    private final C31520m f218830k;

    /* renamed from: l */
    private final C90479a f218831l;

    /* renamed from: m */
    private volatile boolean f218832m = false;

    /* renamed from: n */
    private final int f218833n;

    public C79812dh(C31167ax axVar, C58889cz czVar, C83334w wVar, C22871g gVar, C31164au auVar, C83320io ioVar, int i, C90479a aVar) {
        if (ioVar != null) {
            this.f218823d = axVar;
            this.f218825f = czVar;
            this.f218826g = wVar;
            this.f218827h = gVar;
            this.f218824e = auVar;
            this.f218828i = ioVar;
            this.f218833n = i;
            this.f218829j = czVar.mo26884a();
            int i2 = i - 1;
            if (i != 0) {
                String str = ioVar.f227136c;
                String str2 = ioVar.f227135b;
                this.f218821a = str + " " + str2 + " " + ("EVENT_TYPE_" + i2);
                this.f218830k = axVar.mo36912c();
                this.f218831l = aVar;
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("utteranceId cannot be null.");
    }

    /* renamed from: f */
    private final void m127949f() {
        if (!this.f218832m) {
            return;
        }
        if (!this.f218831l.mo84227b()) {
            C58970a aVar = (C58970a) f218820c.mo56225c();
            aVar.mo56380ai(C58979ad.SMALL);
            ((C58970a) aVar.mo56372aa(4016)).mo56389s("Stopwatch %s is already attached to a future.", this.f218821a);
            return;
        }
        throw new IllegalStateException(String.format("Stopwatch %s is already attached to a future.", new Object[]{this.f218821a}));
    }

    /* renamed from: a */
    public final void mo74254a() {
        synchronized (this) {
            m127949f();
            if (!this.f218822b) {
                mo74258e(4);
            }
        }
    }

    /* renamed from: b */
    public final void mo74255b() {
        synchronized (this) {
            if (!this.f218832m && !this.f218822b) {
                mo74258e(2);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo74256c(C60870cx cxVar) {
        m127949f();
        this.f218832m = true;
        this.f218827h.mo28211k(cxVar, "[NGA] PerformanceStopwatchImpl.onEndFuture", new C79811dg(this));
    }

    /* renamed from: d */
    public final synchronized void mo74257d() {
        m127949f();
        mo74258e(2);
    }

    /* renamed from: e */
    public final long mo74258e(int i) {
        if (this.f218822b) {
            if (!this.f218831l.mo84227b()) {
                C58970a aVar = (C58970a) f218820c.mo56225c();
                aVar.mo56380ai(C58979ad.SMALL);
                ((C58970a) aVar.mo56372aa(4017)).mo56389s("Stopwatch %s has already been stopped", this.f218821a);
            } else {
                throw new IllegalStateException(String.format("Stopwatch %s has already been stopped.", new Object[]{this.f218821a}));
            }
        }
        long convert = TimeUnit.MILLISECONDS.convert(this.f218825f.mo26884a() - this.f218829j, TimeUnit.NANOSECONDS);
        if (i == 2) {
            C83334w wVar = this.f218826g;
            C82887ec ecVar = C82887ec.PERFORMANCE_TIMING;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82917ff ffVar = (C82917ff) C82920fi.f226214c.createBuilder();
            int i2 = this.f218833n;
            ffVar.copyOnWrite();
            C82920fi fiVar = (C82920fi) ffVar.instance;
            int i3 = i2 - 1;
            if (i2 != 0) {
                fiVar.f226217b = i3;
                fiVar.f226216a |= 1;
                C82920fi fiVar2 = (C82920fi) ffVar.build();
                dzVar.copyOnWrite();
                C82885ea eaVar = (C82885ea) dzVar.instance;
                fiVar2.getClass();
                eaVar.f225980b = fiVar2;
                eaVar.f225979a = 3;
                wVar.mo75548f(ecVar, (C82885ea) dzVar.build(), this.f218828i, convert, 2);
                i = 2;
            } else {
                throw null;
            }
        }
        this.f218823d.mo36918j(this.f218830k, this.f218824e, i);
        this.f218822b = true;
        return convert;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this) {
            if (!this.f218822b) {
                mo74258e(3);
                ((C58970a) ((C58970a) f218820c.mo56225c()).mo56372aa(4018)).mo56389s("Stopwatch %s was NOT STOPPED!", this.f218821a);
            }
        }
        super.finalize();
    }
}
