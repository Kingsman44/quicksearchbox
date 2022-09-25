package com.google.common.p4520a;

import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.a.aj */
/* compiled from: PG */
final class C58203aj implements C58219az {

    /* renamed from: a */
    volatile C58219az f155643a;

    /* renamed from: b */
    final SettableFuture f155644b;

    /* renamed from: c */
    final C58872ci f155645c;

    public C58203aj() {
        int i = C58234bn.f155734y;
        throw null;
    }

    /* renamed from: a */
    public final int mo54700a() {
        return this.f155643a.mo54700a();
    }

    /* renamed from: b */
    public final C58219az mo54701b(ReferenceQueue referenceQueue, Object obj, C58241bu buVar) {
        return this;
    }

    /* renamed from: c */
    public final C58241bu mo54702c() {
        return null;
    }

    /* renamed from: d */
    public final Object mo54703d() {
        return C60917ed.m93034a(this.f155644b);
    }

    /* renamed from: e */
    public final void mo54704e(Object obj) {
        if (obj != null) {
            this.f155644b.mo57356n(obj);
        } else {
            this.f155643a = C58234bn.f155732b;
        }
    }

    /* renamed from: f */
    public final boolean mo54705f() {
        return this.f155643a.mo54705f();
    }

    /* renamed from: g */
    public final boolean mo54706g() {
        return true;
    }

    public final Object get() {
        return this.f155643a.get();
    }

    /* renamed from: h */
    public final long mo54708h() {
        return this.f155645c.mo56158a(TimeUnit.NANOSECONDS);
    }

    /* renamed from: i */
    public final C60870cx mo54709i(Object obj, C58257l lVar) {
        C60870cx cxVar;
        try {
            this.f155645c.mo56161f();
            if (this.f155643a.get() != null) {
                return C60922j.m93044g(C60856cj.m92900i(lVar.mo54711a(obj)), new C58202ai(this), C60826bg.f164896a);
            }
            Object a = lVar.mo54711a(obj);
            if (this.f155644b.mo57356n(a)) {
                return this.f155644b;
            }
            return C60856cj.m92900i(a);
        } catch (Throwable th) {
            if (this.f155644b.mo57357o(th)) {
                cxVar = this.f155644b;
            } else {
                cxVar = C60856cj.m92899h(th);
            }
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return cxVar;
        }
    }

    public C58203aj(C58219az azVar) {
        this.f155644b = new SettableFuture();
        this.f155645c = new C58872ci();
        this.f155643a = azVar;
    }
}
