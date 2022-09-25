package com.google.android.libraries.onegoogle.owners;

import com.google.android.libraries.onegoogle.accountmanagement.C30255b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.owners.ad */
/* compiled from: PG */
final class C30960ad implements C31012n {

    /* renamed from: a */
    public final C58881cr f83414a;

    /* renamed from: b */
    public final AtomicReference f83415b = new AtomicReference();

    /* renamed from: c */
    private final C60887da f83416c;

    public C30960ad(ExecutorService executorService, C58881cr crVar) {
        this.f83416c = C60895di.m92995a(executorService);
        this.f83414a = C58886cw.m90973a(crVar);
    }

    /* renamed from: h */
    private final C60870cx m57771h(C58817ah ahVar) {
        if (this.f83415b.get() != null) {
            return (C60870cx) ahVar.apply((C31012n) this.f83415b.get());
        }
        C58881cr crVar = this.f83414a;
        Objects.requireNonNull(crVar);
        C31023y yVar = new C31023y(crVar);
        return C47633f.m84733g(C60856cj.m92904m(C47810es.m84978r(yVar), this.f83416c)).mo51516i(new C31024z(this, ahVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    private final void m57772i(Runnable runnable) {
        if (this.f83415b.get() != null) {
            runnable.run();
        } else {
            this.f83416c.execute(C47810es.m84977q(new C30957aa(this, runnable)));
        }
    }

    /* renamed from: a */
    public final C60870cx mo36637a() {
        return m57771h(C31020v.f83530a);
    }

    /* renamed from: b */
    public final C60870cx mo36638b(String str) {
        return m57771h(new C31018t(str));
    }

    /* renamed from: c */
    public final C60870cx mo36639c() {
        return m57771h(C31021w.f83531a);
    }

    /* renamed from: d */
    public final C60870cx mo36640d(String str, int i) {
        return m57771h(new C31022x(str, i));
    }

    /* renamed from: e */
    public final C60870cx mo36641e(String str, int i) {
        return m57771h(new C31019u(str, i));
    }

    /* renamed from: f */
    public final void mo36642f(C30255b bVar) {
        m57772i(new C30959ac(this, bVar));
    }

    /* renamed from: g */
    public final void mo36643g(C30255b bVar) {
        m57772i(new C30958ab(this, bVar));
    }
}
