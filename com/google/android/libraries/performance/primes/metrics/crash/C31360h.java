package com.google.android.libraries.performance.primes.metrics.crash;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31295a;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31301d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31302e;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2397b.C31178h;
import com.google.android.libraries.performance.primes.p2397b.C31180j;
import com.google.android.libraries.performance.primes.p2397b.C31181k;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.android.libraries.performance.primes.p2399d.C31231b;
import com.google.android.libraries.performance.primes.p2402g.C31242e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71264ct;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71265cu;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71266cv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71276de;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71295dx;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71300eb;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.h */
/* compiled from: PG */
final class C31360h extends C31357e implements C31313p, C31209a.C31210a, C31209a.C31217h, C31209a.C31215f {

    /* renamed from: a */
    public static final C59071e f84428a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.crash.h");

    /* renamed from: b */
    volatile C31164au f84429b;

    /* renamed from: c */
    public final C68214a f84430c;

    /* renamed from: d */
    public final C68214a f84431d;

    /* renamed from: e */
    private final AtomicBoolean f84432e = new AtomicBoolean();

    /* renamed from: f */
    private final boolean f84433f;

    /* renamed from: g */
    private final Context f84434g;

    /* renamed from: h */
    private final Executor f84435h;

    /* renamed from: i */
    private final C31310m f84436i;

    /* renamed from: j */
    private final C58833ax f84437j;

    /* renamed from: k */
    private final C31220b f84438k;

    /* renamed from: l */
    private final C31242e f84439l;

    /* renamed from: m */
    private final AtomicInteger f84440m = new AtomicInteger();

    /* renamed from: n */
    private final AtomicInteger f84441n = new AtomicInteger();

    /* renamed from: o */
    private final AtomicInteger f84442o = new AtomicInteger();

    /* renamed from: p */
    private final AtomicBoolean f84443p = new AtomicBoolean(false);

    /* renamed from: q */
    private final C69464a f84444q;

    public C31360h(C31311n nVar, Context context, Executor executor, C68214a aVar, C58833ax axVar, C31220b bVar, C31242e eVar, C68214a aVar2, C58833ax axVar2, C69464a aVar3) {
        this.f84430c = aVar;
        this.f84437j = axVar;
        this.f84438k = bVar;
        this.f84439l = eVar;
        this.f84431d = aVar2;
        this.f84436i = nVar.mo37026a(C60826bg.f164896a, aVar, (C69464a) null);
        this.f84434g = context;
        this.f84435h = executor;
        this.f84433f = ((Boolean) axVar2.mo56109e(Boolean.FALSE)).booleanValue();
        this.f84444q = aVar3;
    }

    /* renamed from: i */
    private final void m58466i(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        C60856cj.m92905n(new C31358f(this, atomicInteger, i), this.f84435h);
    }

    /* renamed from: b */
    public final void mo36938b(Activity activity, Bundle bundle) {
        if (!this.f84443p.getAndSet(true)) {
            m58466i(4, this.f84441n);
        }
    }

    /* renamed from: c */
    public final void mo36942c(Activity activity) {
        C31164au auVar;
        Class<?> cls = activity.getClass();
        if (!C58837ba.m90859h((String) null)) {
            auVar = new C31164au("null".concat(String.valueOf(cls.getSimpleName())));
        } else {
            auVar = new C31164au(cls.getSimpleName());
        }
        this.f84429b = auVar;
    }

    /* renamed from: d */
    public final void mo36944d(Activity activity) {
        this.f84429b = null;
    }

    /* renamed from: e */
    public final void mo37068e() {
        if (this.f84432e.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new C31359g(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* renamed from: f */
    public final C71276de mo37070f() {
        C71276de deVar = (C71276de) C71278dg.f190307j.createBuilder();
        deVar.copyOnWrite();
        C71278dg dgVar = (C71278dg) deVar.instance;
        dgVar.f190309a |= 1;
        dgVar.f190310b = true;
        String d = C31164au.m58094d(this.f84429b);
        if (d != null) {
            deVar.copyOnWrite();
            C71278dg dgVar2 = (C71278dg) deVar.instance;
            dgVar2.f190309a |= 4;
            dgVar2.f190312d = d;
        }
        try {
            C71265cu cuVar = (C71265cu) C71266cv.f190284c.createBuilder();
            C71264ct a = C31231b.m58233a((String) null, this.f84434g);
            cuVar.copyOnWrite();
            C71266cv cvVar = (C71266cv) cuVar.instance;
            a.getClass();
            cvVar.f190287b = a;
            cvVar.f190286a |= 1;
            deVar.copyOnWrite();
            C71278dg dgVar3 = (C71278dg) deVar.instance;
            C71266cv cvVar2 = (C71266cv) cuVar.build();
            cvVar2.getClass();
            dgVar3.f190311c = cvVar2;
            dgVar3.f190309a |= 2;
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f84428a.mo56226d()).mo56382g(e)).mo56372aa(50374)).mo56386p("Failed to get process stats.");
        }
        return deVar;
    }

    /* renamed from: g */
    public final void mo37071g(C71278dg dgVar) {
        C31178h hVar;
        int i;
        C71207aq aqVar;
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        C31356d dVar = (C31356d) this.f84430c.mo27525b();
        if (dVar.mo36980b()) {
            C58833ax axVar = this.f84436i.f84307e;
            if (axVar.mo56113h()) {
                C31180j jVar = (C31180j) axVar.mo56107c();
                synchronized (jVar.f84051b) {
                    if (jVar.f84051b.isEmpty()) {
                        hVar = C31178h.f84046a;
                    } else {
                        C31181k[] kVarArr = (C31181k[]) jVar.f84051b.values().toArray(new C31181k[0]);
                        hVar = new C31178h(kVarArr);
                    }
                }
            } else {
                hVar = C31178h.f84046a;
            }
            C69464a e = dVar.mo37062e();
            C71207aq aqVar2 = null;
            if (e != null) {
                try {
                    aqVar = (C71207aq) e.mo17428b();
                } catch (RuntimeException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f84428a.mo56226d()).mo56382g(e2)).mo56372aa(50376)).mo56386p("Exception while getting crash metric extension!");
                    aqVar = null;
                }
                if (!C71207aq.f190077a.equals(aqVar)) {
                    aqVar2 = aqVar;
                }
            }
            try {
                if (C19559g.m37305d(Thread.currentThread())) {
                    i = ((C31363k) this.f84444q.mo17428b()).f84457a;
                } else {
                    i = ((C31363k) this.f84444q.mo17428b()).f84458b;
                }
                long j = (long) i;
                C31310m mVar = this.f84436i;
                C31301d j2 = C31302e.m58363j();
                C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
                eiVar.copyOnWrite();
                C71308ej ejVar = (C71308ej) eiVar.instance;
                dgVar.getClass();
                ejVar.f190423h = dgVar;
                ejVar.f190416a |= 64;
                j2.mo37004e((C71308ej) eiVar.build());
                ((C31295a) j2).f84270c = aqVar2;
                ((C31295a) j2).f84273f = hVar;
                j2.mo37001b(dVar.mo37061d());
                mVar.mo37023b(j2.mo37000a()).get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            while (this.f84440m.getAndDecrement() > 0) {
                mo37072h(3, dVar);
            }
            while (this.f84441n.getAndDecrement() > 0) {
                mo37072h(4, dVar);
            }
            while (this.f84442o.getAndDecrement() > 0) {
                mo37072h(5, dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C60870cx mo37072h(int i, C31356d dVar) {
        if (!dVar.mo36980b()) {
            return C60866ct.f164955a;
        }
        float c = dVar.mo37060c();
        if (!this.f84439l.mo36966a(c / 100.0f).mo36965a()) {
            return C60866ct.f164955a;
        }
        C31310m mVar = this.f84436i;
        C31301d j = C31302e.m58363j();
        C71307ei eiVar = (C71307ei) C71308ej.f190415x.createBuilder();
        C71295dx dxVar = (C71295dx) C71300eb.f190397d.createBuilder();
        dxVar.copyOnWrite();
        C71300eb ebVar = (C71300eb) dxVar.instance;
        ebVar.f190399a |= 2;
        ebVar.f190401c = (int) (100.0f / c);
        dxVar.copyOnWrite();
        C71300eb ebVar2 = (C71300eb) dxVar.instance;
        ebVar2.f190400b = i - 1;
        ebVar2.f190399a |= 1;
        eiVar.copyOnWrite();
        C71308ej ejVar = (C71308ej) eiVar.instance;
        C71300eb ebVar3 = (C71300eb) dxVar.build();
        ebVar3.getClass();
        ejVar.f190435t = ebVar3;
        ejVar.f190416a |= 33554432;
        j.mo37004e((C71308ej) eiVar.build());
        return mVar.mo37023b(j.mo37000a());
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        if (this.f84437j.mo56113h()) {
            ((C31367o) ((C69464a) this.f84437j.mo56107c()).mo17428b()).mo37043a(this);
        }
        this.f84438k.f84117a.mo36957a(this);
        m58466i(3, this.f84440m);
        if (this.f84433f) {
            mo37068e();
        }
    }
}
