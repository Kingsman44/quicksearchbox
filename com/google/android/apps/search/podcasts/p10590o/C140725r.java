package com.google.android.apps.search.podcasts.p10590o;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10601r.p10603b.C140962c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.podcasts.o.r */
/* compiled from: PG */
final class C140725r implements C140709b {

    /* renamed from: a */
    public static final C59071e f382149a = C59071e.m91332i("com.google.android.apps.search.podcasts.o.r");

    /* renamed from: b */
    public final C42876ab f382150b;

    /* renamed from: c */
    public final C140385d f382151c;

    /* renamed from: d */
    public final Executor f382152d;

    /* renamed from: e */
    public final C21370a f382153e;

    /* renamed from: f */
    public final C46423aj f382154f;

    /* renamed from: g */
    private final C47632e f382155g = new C47632e();

    public C140725r(Executor executor, C42876ab abVar, C140385d dVar, C21370a aVar, C140962c cVar) {
        this.f382152d = executor;
        this.f382150b = abVar;
        this.f382151c = dVar;
        this.f382153e = aVar;
        Objects.requireNonNull(cVar);
        this.f382154f = new C46423aj(new C140714g(cVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    private final void m228510f(C58817ah ahVar, Runnable runnable) {
        C47633f g = C47633f.m84733g(this.f382150b.mo46039a(ahVar, C60826bg.f164896a));
        C140724q qVar = new C140724q(this, runnable);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(qVar), this.f382152d);
    }

    /* renamed from: a */
    public final C60870cx mo115839a() {
        return C47633f.m84733g(this.f382150b.mo46042d()).mo51515h(C140722o.f382145a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo115840b(Runnable runnable) {
        mo115843e(C140721n.f382144a, runnable);
    }

    /* renamed from: c */
    public final void mo115841c(C140728u uVar, Runnable runnable) {
        m228510f(new C140716i(this, uVar), runnable);
    }

    /* renamed from: d */
    public final void mo115842d(C140706ag agVar, Runnable runnable) {
        m228510f(new C140715h(this, agVar), runnable);
    }

    /* renamed from: e */
    public final void mo115843e(C58839bc bcVar, Runnable runnable) {
        C46459k.m82829b(this.f382155g.mo51512b(new C140713f(this, bcVar, runnable), C60826bg.f164896a), "Failed to sync reactions.", new Object[0]);
    }
}
