package com.google.common.p4543n.p4546c;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.base.C58844bh;
import com.google.common.base.C58872ci;
import com.google.common.base.C58881cr;
import com.google.common.base.C58889cz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: com.google.common.n.c.y */
/* compiled from: PG */
public final class C59417y extends C60873d {

    /* renamed from: a */
    public static final Logger f157631a = Logger.getLogger(C59417y.class.getCanonicalName());

    /* renamed from: b */
    public static final Object f157632b = new Object();

    /* renamed from: i */
    public static final C59411s f157633i = new C59411s();

    /* renamed from: c */
    public final C58881cr f157634c;

    /* renamed from: d */
    public final C59407o f157635d;

    /* renamed from: e */
    public final C58839bc f157636e;

    /* renamed from: f */
    public final C58872ci f157637f;

    /* renamed from: g */
    public final C60888db f157638g;

    /* renamed from: h */
    public volatile int f157639h = 0;

    /* renamed from: l */
    private final Executor f157640l;

    /* renamed from: m */
    private final AtomicReference f157641m = new AtomicReference(C60856cj.m92900i(new Object()));

    public C59417y(C58881cr crVar, C59407o oVar, C58839bc bcVar, Executor executor, ScheduledExecutorService scheduledExecutorService, C58889cz czVar) {
        crVar.getClass();
        this.f157634c = crVar;
        oVar.getClass();
        this.f157635d = oVar;
        bcVar.getClass();
        this.f157636e = bcVar;
        executor.getClass();
        C59413u uVar = new C59413u(this, executor);
        this.f157640l = uVar;
        this.f157638g = C60895di.m92996b(scheduledExecutorService);
        this.f157637f = C58872ci.m90947d(czVar);
        mo56928g(0, TimeUnit.MILLISECONDS);
        mo4106b(new C59412t(), uVar);
    }

    /* renamed from: e */
    public static C59417y m92319e(C58881cr crVar, C59407o oVar, C58839bc bcVar, ScheduledExecutorService scheduledExecutorService) {
        return C59415w.m92318a(crVar, oVar, bcVar, C58836b.f156633a, C58833ax.m90834k(scheduledExecutorService), C58889cz.f156731b, f157633i);
    }

    /* renamed from: f */
    public static C59417y m92320f(C58881cr crVar, int i, Executor executor) {
        C58836b bVar = C58836b.f156633a;
        C58889cz czVar = C58889cz.f156731b;
        C59411s sVar = f157633i;
        return C59415w.m92318a(crVar, new C59400h(i), C58844bh.ALWAYS_TRUE, C58833ax.m90834k(executor), bVar, czVar, sVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        C60870cx cxVar = (C60870cx) this.f157641m.getAndSet(C60856cj.m92898g());
        if (cxVar != null) {
            boolean z = true;
            if ((this.value instanceof C60873d.C60875b) && !mo57359q()) {
                z = false;
            }
            cxVar.cancel(z);
        }
    }

    /* renamed from: g */
    public final void mo56928g(long j, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        C60870cx cxVar = (C60870cx) this.f157641m.getAndSet(settableFuture);
        if (j != 0) {
            cxVar = C60922j.m93045h(cxVar, new C59408p(this, j, timeUnit), C60826bg.f164896a);
        }
        C60870cx h = C60922j.m93045h(cxVar, new C59409q(this), this.f157640l);
        settableFuture.mo57358p(C60846c.m92879h(h, Exception.class, new C59410r(this, h), this.f157640l));
        settableFuture.mo4106b(new C59414v(this, settableFuture), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        String str;
        C60870cx cxVar = (C60870cx) this.f157641m.get();
        String obj = cxVar.toString();
        String obj2 = this.f157634c.toString();
        String obj3 = this.f157636e.toString();
        String obj4 = this.f157635d.toString();
        int i = this.f157639h;
        if (cxVar.isDone()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = ", activeTry=[" + obj + "]";
        }
        return "futureSupplier=[" + obj2 + "], shouldContinue=[" + obj3 + "], strategy=[" + obj4 + "], tries=[" + i + "]" + str;
    }
}
