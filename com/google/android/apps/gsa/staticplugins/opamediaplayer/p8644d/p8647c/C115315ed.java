package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import androidx.core.p097i.C1967b;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84265e;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.p6486s.C84278r;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.SettableFuture;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ed */
/* compiled from: PG */
public final class C115315ed {

    /* renamed from: a */
    public static final C59071e f319953a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ed");

    /* renamed from: b */
    public final C84274n f319954b;

    /* renamed from: c */
    public C52176ia f319955c = C52176ia.f136911k;

    /* renamed from: d */
    public C58833ax f319956d = C58836b.f156633a;

    /* renamed from: e */
    public final C115312ea f319957e = new C115312ea(this);

    /* renamed from: f */
    public C60870cx f319958f = C60866ct.f164955a;

    /* renamed from: g */
    public boolean f319959g = false;

    /* renamed from: h */
    public boolean f319960h = false;

    /* renamed from: i */
    public boolean f319961i = false;

    /* renamed from: j */
    public final C21370a f319962j;

    /* renamed from: k */
    public final C115313eb f319963k = new C115313eb(this);

    /* renamed from: l */
    private final Map f319964l = new HashMap();

    /* renamed from: m */
    private boolean f319965m = false;

    public C115315ed(C84274n nVar, C21370a aVar) {
        this.f319954b = nVar;
        this.f319962j = aVar;
    }

    /* renamed from: b */
    public static C58485gu m191166b(C84275o oVar) {
        return C58485gu.m89853v(Integer.valueOf(oVar.mo77796b()), oVar.mo77803i(), Integer.valueOf(oVar.mo77797c()), Long.valueOf(oVar.mo77798d()), Long.valueOf(oVar.mo77801g()), oVar.mo77807m(), oVar.mo77808n(), Boolean.valueOf(oVar.mo77811q()));
    }

    /* renamed from: w */
    private static C60870cx m191167w(C60870cx cxVar) {
        return C60922j.m93045h(cxVar, C115302dr.f319930a, C60826bg.f164896a);
    }

    /* renamed from: x */
    private final C60870cx m191168x(C60870cx cxVar, String str) {
        return C60846c.m92878g(C60922j.m93044g(cxVar, new C115285da(), C60826bg.f164896a), Exception.class, new C115287dc(str), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C115314ec mo101954a() {
        C58833ax axVar = this.f319956d;
        return axVar.mo56113h() ? new C115314ec(this.f319955c, (C84275o) axVar.mo56107c()) : new C115314ec(this.f319955c);
    }

    /* renamed from: c */
    public final C60870cx mo101955c(C84269i iVar, C84271k kVar) {
        iVar.toString();
        C58976aa aaVar = C58975e.f156826a;
        return m191168x(m191167w(this.f319954b.mo77788d(iVar, kVar)), iVar.name());
    }

    /* renamed from: d */
    public final C60870cx mo101956d(int i) {
        this.f319963k.mo101946a();
        C84269i iVar = C84269i.PLAY;
        C84263c cVar = new C84263c();
        cVar.mo77755b(i);
        return mo101955c(iVar, cVar.mo77754a());
    }

    /* renamed from: e */
    public final C60870cx mo101957e() {
        return C60846c.m92878g(this.f319958f, Exception.class, C115283cz.f319893a, C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo101958f(C115308dx dxVar, boolean z) {
        mo101960h(dxVar.getClass().toString(), dxVar, z);
    }

    /* renamed from: g */
    public final synchronized void mo101959g(String str, C115308dx dxVar) {
        mo101960h(str, dxVar, false);
    }

    /* renamed from: h */
    public final synchronized void mo101960h(String str, C115308dx dxVar, boolean z) {
        if (z) {
            if (this.f319964l.containsKey(str)) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
        }
        this.f319964l.put(str, dxVar);
    }

    /* renamed from: i */
    public final synchronized void mo101961i(C1967b bVar) {
        for (C115308dx a : this.f319964l.values()) {
            try {
                bVar.mo3353a(a);
            } catch (Exception e) {
                C59104x d = f319953a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SpeakrOMPAdapter");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29847)).mo56386p("An error had occurred in StateChangeListener.");
            }
        }
    }

    /* renamed from: j */
    public final void mo101962j(C84269i iVar, C69464a aVar) {
        mo101965m(new C115300dp(this, iVar, aVar));
    }

    /* renamed from: k */
    public final void mo101963k() {
        mo101965m(new C115303ds(this));
    }

    /* renamed from: l */
    public final synchronized void mo101964l(String str) {
        this.f319964l.remove(str);
    }

    /* renamed from: m */
    public final synchronized void mo101965m(C60930r rVar) {
        SettableFuture settableFuture = new SettableFuture();
        this.f319958f.mo4106b(new C115278cu(settableFuture, rVar), C60826bg.f164896a);
        this.f319958f = settableFuture;
    }

    /* renamed from: n */
    public final void mo101966n(C22871g gVar, String str, Runnable runnable) {
        if (this.f319959g) {
            gVar.mo28212l(str, new C115294dj(runnable));
            return;
        }
        C90875ai.m148465b(new C115295dk(runnable), mo101957e(), gVar, str).mo85223a(C115296dl.f319919a);
    }

    /* renamed from: o */
    public final void mo101967o(int i, int i2) {
        mo101962j(C84269i.SEEK_TO_WINDOW, new C115282cy(i, i2));
    }

    /* renamed from: p */
    public final void mo101968p() {
        mo101957e().mo4106b(new C115299do(this), C60826bg.f164896a);
    }

    /* renamed from: q */
    public final synchronized void mo101969q() {
        if (!this.f319965m) {
            C58976aa aaVar = C58975e.f156826a;
            this.f319954b.mo77791g(this.f319957e);
            this.f319965m = true;
        }
    }

    /* renamed from: r */
    public final synchronized void mo101970r() {
        if (this.f319965m) {
            C58976aa aaVar = C58975e.f156826a;
            this.f319954b.mo77792h(this.f319957e);
            this.f319965m = false;
        }
    }

    /* renamed from: s */
    public final void mo101971s() {
        mo101965m(new C115279cv(this));
    }

    /* renamed from: t */
    public final C60870cx mo101972t(C52176ia iaVar, int i, String str) {
        C58833ax axVar;
        boolean z = true;
        boolean z2 = i == 2;
        if (i != 3) {
            z = false;
        }
        C58976aa aaVar = C58975e.f156826a;
        C84274n nVar = this.f319954b;
        C84265e eVar = new C84265e();
        eVar.mo77768d(iaVar);
        eVar.f229325c = C58833ax.m90834k("speakr");
        eVar.mo77766b(z);
        eVar.mo77767c(false);
        C84278r a = eVar.mo77765a();
        if (i == 4) {
            axVar = C58833ax.m90834k(Integer.valueOf(iaVar.f136916d));
        } else {
            axVar = C58836b.f156633a;
        }
        C60870cx w = m191167w(nVar.mo77790f(a, z2, axVar));
        C60856cj.m92911t(w, new C115307dw(this, iaVar, z2, z), C60826bg.f164896a);
        return m191168x(w, str);
    }

    /* renamed from: u */
    public final void mo101973u(C58817ah ahVar, int i, String str) {
        mo101965m(new C115305du(this, ahVar, i, str));
    }

    /* renamed from: v */
    public final void mo101974v(int i, int i2, String str) {
        mo101965m(new C115301dq(this, i, i2, str));
    }
}
