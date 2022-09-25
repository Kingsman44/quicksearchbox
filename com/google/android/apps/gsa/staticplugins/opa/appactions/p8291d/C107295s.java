package com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d;

import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49863bu;
import com.google.assistant.p3861at.C49867by;
import com.google.assistant.p3861at.C50382v;
import com.google.assistant.p3861at.C50409w;
import com.google.assistant.p3861at.C50463y;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.d.s */
/* compiled from: PG */
public final class C107295s implements C107290n {

    /* renamed from: a */
    public final f f298605a;

    /* renamed from: b */
    private final C86054o f298606b;

    /* renamed from: c */
    private final l f298607c;

    /* renamed from: d */
    private final C22871g f298608d;

    /* renamed from: e */
    private final Executor f298609e;

    public C107295s(C86054o oVar, l lVar, f fVar, C22871g gVar, Executor executor) {
        this.f298606b = oVar;
        this.f298607c = lVar;
        this.f298605a = fVar;
        this.f298608d = gVar;
        this.f298609e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo95893a(C49863bu buVar) {
        p pVar = new p();
        pVar.b = C58833ax.m90833j(this.f298606b.mo79668a());
        acu acu = (acu) acv.f128920X.createBuilder();
        C50382v vVar = (C50382v) C50409w.f131206c.createBuilder();
        vVar.copyOnWrite();
        C50409w wVar = (C50409w) vVar.instance;
        buVar.getClass();
        wVar.f131209b = buVar;
        wVar.f131208a = 3;
        C50409w wVar2 = (C50409w) vVar.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        wVar2.getClass();
        acv.f128937P = wVar2;
        acv.f128947c |= 1;
        pVar.e((acv) acu.build());
        pVar.e = C58833ax.m90833j(getClass().getSimpleName());
        return this.f298608d.mo28209i(this.f298607c.a(pVar, 5, TimeUnit.SECONDS), "Transform SettingsUi to ShortcutPageResponse", C107291o.f298600a);
    }

    /* renamed from: b */
    public final C60870cx mo95894b(C50463y yVar) {
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        yVar.getClass();
        acx.f129009z = yVar;
        acx.f128985b |= 512;
        return C60922j.m93044g(C60922j.m93044g(C60838bs.m92859i(this.f298607c.d(this.f298606b.mo79668a(), (acx) acw.build(), 5, TimeUnit.SECONDS, getClass().getSimpleName())), C107293q.f298602a, this.f298609e), new C107294r(this, yVar), this.f298609e);
    }

    /* renamed from: c */
    public final C60870cx mo95895c(C49867by byVar) {
        p pVar = new p();
        pVar.b = C58833ax.m90833j(this.f298606b.mo79668a());
        acu acu = (acu) acv.f128920X.createBuilder();
        C50382v vVar = (C50382v) C50409w.f131206c.createBuilder();
        vVar.copyOnWrite();
        C50409w wVar = (C50409w) vVar.instance;
        byVar.getClass();
        wVar.f131209b = byVar;
        wVar.f131208a = 5;
        C50409w wVar2 = (C50409w) vVar.build();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        wVar2.getClass();
        acv.f128937P = wVar2;
        acv.f128947c |= 1;
        pVar.e((acv) acu.build());
        pVar.e = C58833ax.m90833j(getClass().getSimpleName());
        return this.f298608d.mo28209i(this.f298607c.a(pVar, 5, TimeUnit.SECONDS), "Transform SettingsUi to ShortcutValidationResponse", C107292p.f298601a);
    }
}
