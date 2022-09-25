package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cj */
/* compiled from: PG */
public final class C112519cj extends C112474as {

    /* renamed from: a */
    public static final C121537f f312068a = C121537f.m200840b("Tapas/SignalManagerV1", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f312069b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cj");

    /* renamed from: c */
    public static final long f312070c = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: d */
    public final Map f312071d = new HashMap();

    /* renamed from: e */
    C60870cx f312072e;

    /* renamed from: f */
    public final Object f312073f = new Object();

    /* renamed from: g */
    public final Object f312074g = new Object();

    /* renamed from: h */
    public final Object f312075h = new Object();

    /* renamed from: i */
    public final C21370a f312076i;

    /* renamed from: j */
    public final C22871g f312077j;

    /* renamed from: k */
    public final Executor f312078k;

    /* renamed from: l */
    public final Executor f312079l;

    /* renamed from: m */
    public final Map f312080m;

    /* renamed from: n */
    public final C86054o f312081n;

    /* renamed from: o */
    public final C68214a f312082o;

    /* renamed from: p */
    public final C68214a f312083p;

    /* renamed from: q */
    public final Set f312084q = new HashSet();

    /* renamed from: r */
    public Optional f312085r;

    public C112519cj(Map map, C21370a aVar, C22871g gVar, Executor executor, Executor executor2, C86054o oVar, C68214a aVar2, C68214a aVar3) {
        this.f312076i = aVar;
        this.f312080m = map;
        this.f312077j = gVar;
        this.f312078k = executor;
        this.f312079l = executor2;
        this.f312081n = oVar;
        this.f312082o = aVar2;
        this.f312083p = aVar3;
        this.f312072e = C60856cj.m92900i(false);
        this.f312085r = Optional.empty();
    }

    /* renamed from: a */
    public final C60870cx mo99547a(C48634bw bwVar) {
        C121537f fVar = f312068a;
        String name = bwVar.name();
        return fVar.mo105234c("getBlockingSignal_".concat(String.valueOf(name)), new C112502bt(this, bwVar));
    }

    /* renamed from: b */
    public final C60870cx mo99548b(C58485gu guVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        return (atomicBoolean.get() || !mo99566i(guVar)) ? (C60870cx) f312068a.mo105238g("refreshSignals", this.f312074g, new C112504bv(this, guVar, atomicBoolean)) : mo99563f(guVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Optional mo99549c(C48634bw bwVar) {
        C121537f fVar = f312068a;
        String name = bwVar.name();
        return (Optional) fVar.mo105235d("getSignal_".concat(String.valueOf(name)), new C112484bb(this, bwVar));
    }

    /* renamed from: d */
    public final void mo99550d() {
        C58485gu j;
        synchronized (this.f312075h) {
            j = C58485gu.m89842j(this.f312084q);
        }
        f312068a.mo105241j("clearSignals", new C112501bs(this, j));
    }

    /* renamed from: e */
    public final void mo99551e(C48634bw bwVar) {
        C112518ci ciVar = (C112518ci) f312068a.mo105237f("signalFetchDataMap_get", this.f312073f, new C112488bf(this, bwVar));
        if (ciVar != null) {
            ciVar.f312066f = true;
        }
    }

    /* renamed from: f */
    public final C60870cx mo99563f(C58485gu guVar) {
        return (C60870cx) f312068a.mo105238g("refreshSignalsInternal", this.f312073f, new C112483ba(this, guVar));
    }

    /* renamed from: g */
    public final void mo99564g() {
        f312068a.mo105242k("clearSignalsOnSuccess", this.f312073f, new C112486bd(this, new C58490gz(4)));
        synchronized (this.f312075h) {
            this.f312084q.clear();
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: h */
    public final boolean mo99565h() {
        return this.f312085r.isEmpty() || ((String) this.f312085r.get()).equals(this.f312081n.mo79659F());
    }

    /* renamed from: i */
    public final boolean mo99566i(C58485gu guVar) {
        C58528ij F;
        synchronized (this.f312073f) {
            F = C58528ij.m90006F(this.f312071d.keySet());
        }
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!F.contains((C48634bw) guVar.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo99567j(C58485gu guVar) {
        C58528ij F;
        synchronized (this.f312075h) {
            F = C58528ij.m90006F(this.f312084q);
        }
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!F.contains((C48634bw) guVar.get(i))) {
                return false;
            }
            i = i2;
        }
        return true;
    }
}
