package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import androidx.work.C4410f;
import androidx.work.C4632m;
import androidx.work.C4634o;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.as */
/* compiled from: PG */
public final class C106453as implements C46575i {

    /* renamed from: b */
    private static final C4634o f296933b = C4634o.KEEP;

    /* renamed from: a */
    public final C58974d f296934a;

    /* renamed from: c */
    private final C83794j f296935c;

    /* renamed from: d */
    private final C106434a f296936d;

    /* renamed from: e */
    private final C84469a f296937e;

    public C106453as(C83564a aVar, C83794j jVar, C106434a aVar2, C84469a aVar3) {
        this.f296934a = aVar.mo76900a("AppUsageWorker");
        this.f296935c = jVar;
        this.f296936d = aVar2;
        this.f296937e = aVar3;
    }

    /* renamed from: a */
    static C46586t m177244a() {
        C46582p j = C46586t.m83063j(C106453as.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("SmartspaceHeadphoneAppUsageWorker", f296933b));
        C4410f fVar = new C4410f();
        fVar.f14071a = true;
        dVar.f121753b = fVar.mo9349a();
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(1, TimeUnit.DAYS)));
        return j.mo50561a();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        if (this.f296937e.mo78042p()) {
            ((C58970a) ((C58970a) this.f296934a.mo56224b()).mo56372aa(23088)).mo56386p("A similar task is enabled in TNG. Exiting this worker.");
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        ((C58970a) ((C58970a) this.f296934a.mo56224b()).mo56372aa(23087)).mo56389s("Start App usage model generation task. PeriodicTaskPolicy: %s", f296933b);
        if (!this.f296935c.mo77179q()) {
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        return C47633f.m84733g(this.f296936d.mo95531a()).mo51515h(new C106451aq(this), C5622i.f16960b).mo51513e(Throwable.class, new C106452ar(this), C5622i.f16960b);
    }
}
