package com.google.android.apps.gsa.smartspace.p7260d;

import androidx.work.C4632m;
import androidx.work.C4634o;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.smartspace.d.e */
/* compiled from: PG */
public final class C92102e implements C46575i, C92106i {

    /* renamed from: a */
    private final C46578l f256797a;

    /* renamed from: b */
    private final C92125t f256798b;

    /* renamed from: c */
    private final C83794j f256799c;

    /* renamed from: d */
    private final C130895ag f256800d;

    /* renamed from: e */
    private final Executor f256801e;

    /* renamed from: f */
    private final C84469a f256802f;

    public C92102e(C46578l lVar, C92125t tVar, C130895ag agVar, C83794j jVar, Executor executor, C84469a aVar) {
        this.f256797a = lVar;
        this.f256798b = tVar;
        this.f256800d = agVar;
        this.f256799c = jVar;
        this.f256801e = executor;
        this.f256802f = aVar;
    }

    /* renamed from: a */
    public final void mo86739a() {
        C46578l lVar = this.f256797a;
        C46582p j = C46586t.m83063j(C92102e.class);
        C46570d dVar = (C46570d) j;
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(1, TimeUnit.DAYS)));
        dVar.f121757f = C58833ax.m90834k(new C46574h("SmartspaceLoggerTask", C4634o.KEEP));
        C46459k.m82829b(lVar.mo50546b(j.mo50561a()), "Failed to schedule SmartspaceLoggerTask.", new Object[0]);
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        if (this.f256802f.mo78034h() || (!this.f256799c.mo77158B() && !this.f256799c.mo77175m())) {
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        C60870cx a = C47638k.m84751b(this.f256798b.mo86696a(), this.f256800d.mo109891a()).mo51520a(C92100c.f256795a, this.f256801e);
        C92101d dVar = C92101d.f256796a;
        return C60922j.m93044g(a, C47810es.m84963c(dVar), C60826bg.f164896a);
    }
}
