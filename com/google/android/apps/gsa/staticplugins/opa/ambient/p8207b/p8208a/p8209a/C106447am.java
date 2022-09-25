package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.android.apps.gsa.n.g.a;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.p6437d.p6439b.C83606a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131073c;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131074d;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131075e;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.C131077g;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131091a;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d.C131097g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3886c.p3887a.C50678n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.am */
/* compiled from: PG */
public final class C106447am implements C106434a {

    /* renamed from: a */
    public final C131075e f296909a;

    /* renamed from: b */
    public final C58974d f296910b;

    /* renamed from: c */
    public final u f296911c;

    /* renamed from: d */
    public final a f296912d;

    /* renamed from: e */
    public final C86054o f296913e;

    /* renamed from: f */
    public final C86124t f296914f;

    /* renamed from: g */
    public final C60950i f296915g;

    /* renamed from: h */
    public final C106450ap f296916h;

    /* renamed from: i */
    public final C130895ag f296917i;

    /* renamed from: j */
    public final C131097g f296918j;

    /* renamed from: k */
    public final C60888db f296919k;

    /* renamed from: l */
    public final C60887da f296920l;

    /* renamed from: m */
    private final i f296921m;

    /* renamed from: n */
    private final C131077g f296922n;

    /* renamed from: o */
    private final C131091a f296923o;

    /* renamed from: p */
    private final C83606a f296924p;

    public C106447am(C131091a aVar, C60888db dbVar, C60887da daVar, C83606a aVar2, C131075e eVar, C83564a aVar3, u uVar, i iVar, a aVar4, C86054o oVar, C86124t tVar, C60950i iVar2, C106450ap apVar, C130895ag agVar, C131077g gVar, C131097g gVar2) {
        this.f296923o = aVar;
        this.f296919k = dbVar;
        this.f296920l = daVar;
        this.f296924p = aVar2;
        this.f296909a = eVar;
        C83564a aVar5 = aVar3;
        this.f296910b = aVar3.mo76900a("AppUsageProvider");
        this.f296911c = uVar;
        this.f296921m = iVar;
        this.f296912d = aVar4;
        this.f296913e = oVar;
        this.f296914f = tVar;
        this.f296915g = iVar2;
        this.f296916h = apVar;
        this.f296917i = agVar;
        this.f296922n = gVar;
        this.f296918j = gVar2;
    }

    /* renamed from: d */
    public static double m177235d(C58485gu guVar, int i) {
        if (guVar.size() < i + 1) {
            return C59203do.f157270a;
        }
        return ((C130701b) guVar.get(i)).mo109791a();
    }

    /* renamed from: a */
    public final C60870cx mo95531a() {
        C60870cx h = mo95539h();
        C47633f i = C47633f.m84733g(h).mo51516i(new C106442ah(this), this.f296919k);
        C47633f i2 = C47633f.m84733g(h).mo51516i(new C106443ai(this), this.f296919k);
        C60870cx a = this.f296922n.mo95545a();
        return C47633f.m84733g(C47638k.m84753d(i, i2, a, h).mo51521b(new C106444aj(this, i, i2, a, h), this.f296919k)).mo51516i(new C106445ak(this), this.f296919k);
    }

    /* renamed from: b */
    public final C60870cx mo95532b(C50672h hVar) {
        return C47633f.m84733g(mo95538g()).mo51516i(new C106438ad(this, hVar), this.f296919k);
    }

    /* renamed from: c */
    public final void mo95533c() {
        String F = this.f296913e.mo79659F();
        if (F == null) {
            C60856cj.m92899h(new Exception("User not signed in."));
        } else {
            this.f296911c.c(F, C65753ak.SMARTSPACE_HEADPHONE_APP_USAGE_MODEL, false);
        }
    }

    /* renamed from: e */
    public final C131074d mo95536e() {
        return new C131073c(Boolean.valueOf(this.f296914f.mo79746e(C90017bw.f247900aO)), Boolean.valueOf(this.f296914f.mo79746e(C90017bw.f247936ay)), Long.valueOf(this.f296914f.mo79743a(C90017bw.f247950bL)));
    }

    /* renamed from: f */
    public final C60870cx mo95537f(C58485gu guVar) {
        return C47633f.m84733g(this.f296923o.mo95547a()).mo51515h(new C106435aa(this, guVar), this.f296920l);
    }

    /* renamed from: g */
    public final C60870cx mo95538g() {
        String F = this.f296913e.mo79659F();
        if (F != null) {
            return this.f296921m.a(F, C65753ak.SMARTSPACE_HEADPHONE_APP_USAGE_MODEL, (String) null, C63662ac.f172144a, C50678n.f131835l);
        }
        ((C58970a) ((C58970a) this.f296910b.mo56226d()).mo56372aa(23077)).mo56386p("User not signed in.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }

    /* renamed from: h */
    public final C60870cx mo95539h() {
        return C47633f.m84733g(this.f296924p.mo76965a()).mo51515h(new C106436ab(this), this.f296919k);
    }
}
