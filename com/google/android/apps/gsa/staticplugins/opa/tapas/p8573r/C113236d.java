package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r;

import androidx.lifecycle.C2391v;
import androidx.work.C4410f;
import androidx.work.C4632m;
import androidx.work.C4634o;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112002j;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8575b.C113230c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r.p8575b.C113231d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8578b.C113275a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3781ad.p3789d.p3791b.C48738t;
import com.google.assistant.p3781ad.p3789d.p3791b.C48740v;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.d */
/* compiled from: PG */
public final class C113236d implements C46575i {

    /* renamed from: a */
    public static final C121537f f313570a = C121537f.m200840b("Tapas/TapasChargingWorker", C121511c.f337208a);

    /* renamed from: c */
    private static final C59071e f313571c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.r.d");

    /* renamed from: b */
    public final C113240h f313572b;

    /* renamed from: d */
    private final C113231d f313573d;

    /* renamed from: e */
    private final C86124t f313574e;

    /* renamed from: f */
    private final C113190cu f313575f;

    /* renamed from: g */
    private final C113275a f313576g;

    /* renamed from: h */
    private final Executor f313577h;

    /* renamed from: i */
    private final h f313578i;

    public C113236d(C113231d dVar, C86124t tVar, C113190cu cuVar, C113275a aVar, C90851k kVar, C2391v vVar, C113240h hVar) {
        this.f313573d = dVar;
        this.f313574e = tVar;
        this.f313575f = cuVar;
        this.f313576g = aVar;
        this.f313577h = kVar.mo85208a("tapasChargingBackground");
        this.f313578i = new C112078c(new C113230c(), vVar, tVar, C48674ai.ASSISTANT);
        this.f313572b = hVar;
    }

    /* renamed from: a */
    public static C46586t m187276a(C86124t tVar) {
        C46582p j = C46586t.m83063j(C113236d.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("tapas_charging_worker", C4634o.REPLACE));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(24, TimeUnit.HOURS)));
        if (tVar.mo79746e(C90063do.f249459dt)) {
            dVar.f121754c = new C46573g(10, TimeUnit.SECONDS);
            C4410f fVar = new C4410f();
            fVar.f14071a = true;
            dVar.f121753b = fVar.mo9349a();
            return j.mo50561a();
        }
        C4410f fVar2 = new C4410f();
        fVar2.f14071a = true;
        fVar2.f14072b = true;
        dVar.f121753b = fVar2.mo9349a();
        return j.mo50561a();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f313574e.mo79746e(C90063do.f249448di)) {
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        f313570a.mo105240i("tcw_started_work");
        Optional map = this.f313573d.mo99916a(this.f313578i).map(C113221a.f313558a);
        if (map.isEmpty()) {
            C59104x d = f313571c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasChargingWorker");
            ((C59052c) ((C59052c) d).mo56372aa(27983)).mo56386p("TapasEngine unavailable, please turn on Tapas feature flag.");
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        C113404eo e = this.f313575f.mo99904b(BuildConfig.FLAVOR, this.f313576g.mo100052a(), C51331dt.FULLY_TRUSTED, C48674ai.ASSISTANT).mo100001a().mo100020e();
        C48738t tVar = (C48738t) C48740v.f126119c.createBuilder();
        tVar.copyOnWrite();
        C48740v vVar = (C48740v) tVar.instance;
        vVar.f126122b = 1;
        vVar.f126121a = 1 | vVar.f126121a;
        e.mo100007g((C48740v) tVar.build());
        return C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(((C112002j) map.get()).mo99257a(e.mo100001a())), new C113227b(this), this.f313577h), C113233c.f313564a, this.f313577h);
    }
}
