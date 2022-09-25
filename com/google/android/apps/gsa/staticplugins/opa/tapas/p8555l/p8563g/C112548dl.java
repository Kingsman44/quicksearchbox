package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113157bo;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48632bu;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dl */
/* compiled from: PG */
public final class C112548dl extends C112474as {

    /* renamed from: a */
    public static final C121537f f312129a = C121537f.m200840b("Tapas/SignalManagerV2", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f312130b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.dl");

    /* renamed from: c */
    public static final long f312131c = Duration.ofMinutes(10).toMillis();

    /* renamed from: d */
    public C58495hd f312132d = C58729pv.f156485a;

    /* renamed from: e */
    final C60870cx f312133e;

    /* renamed from: f */
    public final C21370a f312134f;

    /* renamed from: g */
    public final C22871g f312135g;

    /* renamed from: h */
    public final C68214a f312136h;

    /* renamed from: i */
    public Optional f312137i = Optional.empty();

    /* renamed from: j */
    private final C86054o f312138j;

    /* renamed from: k */
    private final C68214a f312139k;

    public C112548dl(Map map, C21370a aVar, C22871g gVar, Executor executor, C86124t tVar, C86054o oVar, C68214a aVar2, C68214a aVar3) {
        this.f312134f = aVar;
        this.f312135g = gVar;
        this.f312138j = oVar;
        this.f312136h = aVar2;
        this.f312139k = aVar3;
        this.f312133e = gVar.mo28207g("initialize", new C112531cv(this, tVar, map, oVar, executor));
    }

    /* renamed from: a */
    public final C60870cx mo99547a(C48634bw bwVar) {
        C121537f fVar = f312129a;
        String name = bwVar.name();
        return fVar.mo105234c("getBlockingSignal_".concat(String.valueOf(name)), new C112526cq(this, bwVar));
    }

    /* renamed from: b */
    public final C60870cx mo99548b(C58485gu guVar) {
        if (!mo99585g()) {
            return C60856cj.m92900i(new HashMap());
        }
        return (C60870cx) f312129a.mo105235d("refreshSignals", new C112527cr(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Optional mo99549c(C48634bw bwVar) {
        C121537f fVar = f312129a;
        String name = bwVar.name();
        return (Optional) fVar.mo105235d("getSignal_".concat(String.valueOf(name)), new C112530cu(this, bwVar));
    }

    /* renamed from: d */
    public final void mo99550d() {
        f312129a.mo105241j("clearSignals", new C112521cl(this));
    }

    /* renamed from: e */
    public final void mo99551e(C48634bw bwVar) {
        C112547dk dkVar = (C112547dk) this.f312132d.get(bwVar);
        if (dkVar != null) {
            dkVar.mo99576f();
        }
    }

    /* renamed from: f */
    public final C60870cx mo99584f() {
        long b = this.f312134f.mo26870b();
        C58976aa aaVar = C58975e.f156826a;
        EnumMap enumMap = new EnumMap(C48634bw.class);
        C58800sl lA = this.f312132d.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C112547dk dkVar = (C112547dk) entry.getValue();
            synchronized (dkVar) {
                if (dkVar.mo99583m(b)) {
                    dkVar.mo99573c();
                }
                if (dkVar.mo99581k(b)) {
                    dkVar.mo99577g(C48635bx.f125704d);
                }
                C121537f fVar = f312129a;
                String name = ((C48634bw) entry.getKey()).name();
                if (((Boolean) fVar.mo105235d("shouldFetch_".concat(String.valueOf(name)), new C112537da(dkVar, b))).booleanValue()) {
                    dkVar.mo99578h(C48632bu.f125675a, b);
                }
                C60870cx b2 = dkVar.mo99572b();
                if (b2 != null && !b2.isCancelled()) {
                    enumMap.put((C48634bw) entry.getKey(), b2);
                }
            }
        }
        return ((C113157bo) this.f312139k.mo27525b()).mo99891a(enumMap);
    }

    /* renamed from: g */
    public final boolean mo99585g() {
        String F = this.f312138j.mo79659F();
        boolean z = true;
        if (!this.f312137i.isEmpty() && !((String) this.f312137i.get()).equals(F)) {
            z = false;
        }
        this.f312137i = Optional.ofNullable(F);
        if (!z) {
            C90875ai.m148465b(C112524co.f312089a, this.f312135g.mo28207g("Clear Signals Account Swap", new C112523cn(this)), this.f312135g, "checkClearSignalsResult").mo85223a(C112525cp.f312090a);
        }
        return z;
    }
}
