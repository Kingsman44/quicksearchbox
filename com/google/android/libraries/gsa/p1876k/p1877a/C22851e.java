package com.google.android.libraries.gsa.p1876k.p1877a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.k.a.e */
/* compiled from: PG */
public abstract class C22851e implements C22871g {

    /* renamed from: a */
    private final Class f62913a;

    public C22851e(Class cls) {
        this.f62913a = cls;
    }

    /* renamed from: a */
    public final C60870cx mo28201a(String str, C22862b bVar) {
        return mo28215o(new C22856j(this.f62913a, bVar));
    }

    /* renamed from: b */
    public final C60870cx mo28202b(String str, C22862b bVar) {
        return C60856cj.m92905n(new C22852f(this.f62913a, bVar), new C22847a(this));
    }

    /* renamed from: c */
    public final C60870cx mo28203c(String str, long j, C22862b bVar) {
        return C60856cj.m92905n(new C22852f(this.f62913a, bVar), new C22850d(this, j));
    }

    /* renamed from: d */
    public final C60870cx mo28204d(String str, long j, C22862b bVar) {
        return mo28214n(j, new C22856j(this.f62913a, bVar));
    }

    /* renamed from: e */
    public final C60870cx mo28205e(C60870cx cxVar, String str, Class cls, C22864c cVar) {
        return C60846c.m92879h(cxVar, cls, new C22853g(this.f62913a, cVar), new C22847a(this));
    }

    /* renamed from: f */
    public final C60870cx mo28206f(C60870cx cxVar, String str, Class cls, C22864c cVar) {
        return C60846c.m92879h(cxVar, cls, new C22855i(this.f62913a, cVar), new C22847a(this));
    }

    /* renamed from: g */
    public final C60870cx mo28207g(String str, C22870f fVar) {
        return mo28215o(new C22856j(this.f62913a, new C22848b(fVar)));
    }

    /* renamed from: h */
    public final C60870cx mo28208h(String str, long j, C22870f fVar) {
        return mo28214n(j, new C22856j(this.f62913a, new C22849c(fVar)));
    }

    /* renamed from: i */
    public final C60870cx mo28209i(C60870cx cxVar, String str, C22864c cVar) {
        return C60922j.m93045h(cxVar, new C22853g(this.f62913a, cVar), new C22847a(this));
    }

    /* renamed from: j */
    public final C60870cx mo28210j(C60870cx cxVar, String str, C22864c cVar) {
        return C60922j.m93045h(cxVar, new C22855i(this.f62913a, cVar), new C22847a(this));
    }

    /* renamed from: k */
    public final void mo28211k(C60870cx cxVar, String str, C22868d dVar) {
        C60856cj.m92911t(cxVar, new C22860n(this.f62913a, dVar), new C22847a(this));
    }

    /* renamed from: l */
    public final void mo28212l(String str, C22869e eVar) {
        mo28217q(new C22854h(this.f62913a, eVar));
    }

    /* renamed from: m */
    public final void mo28213m(String str, long j, C22869e eVar) {
        mo28216p(j, new C22854h(this.f62913a, eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C60870cx mo28214n(long j, Callable callable);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C60870cx mo28215o(Callable callable);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo28216p(long j, Runnable runnable);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo28217q(Runnable runnable);
}
