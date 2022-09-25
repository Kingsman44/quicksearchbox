package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121493a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121496d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121502j;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121510r;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.f */
/* compiled from: PG */
public final class C121537f {

    /* renamed from: a */
    public final C121511c f337270a;

    private C121537f(C121511c cVar) {
        this.f337270a = cVar;
    }

    /* renamed from: b */
    public static C121537f m200840b(String str, C121511c cVar) {
        return new C121537f(C121511c.m200805a(str, cVar));
    }

    /* renamed from: a */
    public final C121492b mo105233a(String str) {
        return C121510r.m200801a(new C121493a(this.f337270a.f337210b, str));
    }

    /* renamed from: c */
    public final C60870cx mo105234c(String str, Supplier supplier) {
        C60870cx cxVar = (C60870cx) mo105235d(str.concat("_creation"), supplier);
        mo105244m(str.concat("_execution"), cxVar);
        return cxVar;
    }

    /* renamed from: d */
    public final Object mo105235d(String str, Supplier supplier) {
        C121509q l = mo105243l(str);
        try {
            Object obj = supplier.get();
            l.close();
            return obj;
        } catch (Throwable th) {
            C121526d.m200827a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final Object mo105236e(String str, Supplier supplier) {
        C121509q l = mo105243l(str);
        try {
            Object obj = supplier.get();
            l.close();
            return obj;
        } catch (Throwable th) {
            C121526d.m200827a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final Object mo105237f(String str, Object obj, Supplier supplier) {
        Object d;
        C121509q l = mo105243l(str.concat("_waitLock"));
        synchronized (obj) {
            l.close();
            d = mo105235d(str + "_holdingLock", supplier);
        }
        return d;
    }

    /* renamed from: g */
    public final Object mo105238g(String str, Object obj, Supplier supplier) {
        Object d;
        C121509q l = mo105243l(str.concat("_waitLock"));
        synchronized (obj) {
            l.close();
            d = mo105235d(str + "_holdingLock", supplier);
        }
        return d;
    }

    /* renamed from: h */
    public final void mo105239h(String str, long j) {
        C121493a aVar = new C121493a(this.f337270a.f337210b, str);
        List b = C121510r.m200802b();
        if (!C121499g.f337177a.isEmpty()) {
            C121502j a = C121499g.m200775a(aVar, b);
            for (C121496d dVar : C121499g.f337177a) {
                if (dVar.mo105186g(C121500h.QUANTITY, aVar)) {
                    dVar.mo105184e(a, j);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo105240i(String str) {
        C121493a aVar = new C121493a(this.f337270a.f337210b, str);
        List b = C121510r.m200802b();
        List list = C121499g.f337177a;
        C60948g gVar = C60948g.f165068a;
        Instant now = Instant.now();
        if (!C121499g.f337177a.isEmpty()) {
            C121502j a = C121499g.m200775a(aVar, b);
            for (C121496d dVar : C121499g.f337177a) {
                if (dVar.mo105186g(C121500h.EVENT, aVar)) {
                    dVar.mo105183d(a, now);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo105241j(String str, Runnable runnable) {
        C121509q l = mo105243l(str);
        try {
            runnable.run();
            l.close();
            return;
        } catch (Throwable th) {
            C121526d.m200827a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final void mo105242k(String str, Object obj, Runnable runnable) {
        C121509q l = mo105243l(str.concat("_waitLock"));
        synchronized (obj) {
            l.close();
            mo105241j(str + "_holdingLock", runnable);
        }
    }

    /* renamed from: l */
    public final C121509q mo105243l(String str) {
        return C121510r.m200803c(new C121493a(this.f337270a.f337210b, str));
    }

    /* renamed from: m */
    public final void mo105244m(String str, C60870cx cxVar) {
        C121492b a = mo105233a(str);
        Objects.requireNonNull(a);
        cxVar.mo4106b(new C121536e(a), C60826bg.f164896a);
    }
}
