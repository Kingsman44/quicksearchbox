package com.google.android.apps.gsa.sidekick.shared.cards;

import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91727k;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.android.apps.gsa.sidekick.shared.p7240i.C91743a;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.gsa.sidekick.shared.p7255p.C91901c;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.b */
/* compiled from: PG */
final class C91687b extends C91692g {

    /* renamed from: a */
    private final C91748d f255685a;

    /* renamed from: b */
    private final C91647a f255686b;

    /* renamed from: c */
    private final C91727k f255687c;

    /* renamed from: d */
    private final C91713a f255688d;

    /* renamed from: e */
    private final C91743a f255689e;

    /* renamed from: f */
    private final C91738a f255690f;

    /* renamed from: g */
    private final C58833ax f255691g;

    /* renamed from: h */
    private final C91643a f255692h;

    /* renamed from: i */
    private final C58833ax f255693i;

    /* renamed from: j */
    private final C58833ax f255694j;

    /* renamed from: k */
    private final C68214a f255695k;

    /* renamed from: l */
    private final boolean f255696l;

    /* renamed from: m */
    private final boolean f255697m;

    /* renamed from: n */
    private final C8142xb f255698n;

    /* renamed from: o */
    private final boolean f255699o;

    /* renamed from: p */
    private final C89859i f255700p;

    /* renamed from: q */
    private final C58833ax f255701q;

    /* renamed from: r */
    private final CardRenderingContext f255702r;

    /* renamed from: s */
    private final C58833ax f255703s;

    /* renamed from: t */
    private final C58833ax f255704t;

    /* renamed from: u */
    private final int f255705u;

    /* renamed from: v */
    private final C58833ax f255706v;

    /* renamed from: w */
    private final C58833ax f255707w;

    /* renamed from: x */
    private final C91901c f255708x;

    public C91687b(C91748d dVar, C91647a aVar, C91727k kVar, C91713a aVar2, C91743a aVar3, C91901c cVar, C91738a aVar4, C58833ax axVar, C91643a aVar5, C58833ax axVar2, C58833ax axVar3, C68214a aVar6, boolean z, boolean z2, C8142xb xbVar, boolean z3, C89859i iVar, C58833ax axVar4, CardRenderingContext cardRenderingContext, C58833ax axVar5, C58833ax axVar6, int i, C58833ax axVar7, C58833ax axVar8) {
        this.f255685a = dVar;
        this.f255686b = aVar;
        this.f255687c = kVar;
        this.f255688d = aVar2;
        this.f255689e = aVar3;
        this.f255708x = cVar;
        this.f255690f = aVar4;
        this.f255691g = axVar;
        this.f255692h = aVar5;
        this.f255693i = axVar2;
        this.f255694j = axVar3;
        this.f255695k = aVar6;
        this.f255696l = z;
        this.f255697m = z2;
        this.f255698n = xbVar;
        this.f255699o = z3;
        this.f255700p = iVar;
        this.f255701q = axVar4;
        this.f255702r = cardRenderingContext;
        this.f255703s = axVar5;
        this.f255704t = axVar6;
        this.f255705u = i;
        this.f255706v = axVar7;
        this.f255707w = axVar8;
    }

    /* renamed from: a */
    public final int mo86161a() {
        return this.f255705u;
    }

    /* renamed from: b */
    public final C89859i mo86162b() {
        return this.f255700p;
    }

    /* renamed from: c */
    public final C91643a mo86163c() {
        return this.f255692h;
    }

    /* renamed from: d */
    public final C91647a mo86164d() {
        return this.f255686b;
    }

    /* renamed from: e */
    public final C91713a mo86165e() {
        return this.f255688d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91692g) {
            C91692g gVar = (C91692g) obj;
            return this.f255685a.equals(gVar.mo86171i()) && this.f255686b.equals(gVar.mo86164d()) && this.f255687c.equals(gVar.mo86167f()) && this.f255688d.equals(gVar.mo86165e()) && this.f255689e.equals(gVar.mo86169h()) && this.f255708x.equals(gVar.mo86187x()) && this.f255690f.equals(gVar.mo86168g()) && this.f255691g.equals(gVar.mo86178p()) && this.f255692h.equals(gVar.mo86163c()) && this.f255693i.equals(gVar.mo86173k()) && this.f255694j.equals(gVar.mo86176n()) && this.f255695k.equals(gVar.mo86182t()) && this.f255696l == gVar.mo86185v() && this.f255697m == gVar.mo86186w() && this.f255698n.equals(gVar.mo86181s()) && this.f255699o == gVar.mo86184u() && this.f255700p.equals(gVar.mo86162b()) && this.f255701q.equals(gVar.mo86179q()) && this.f255702r.equals(gVar.mo86172j()) && this.f255703s.equals(gVar.mo86180r()) && this.f255704t.equals(gVar.mo86175m()) && this.f255705u == gVar.mo86161a() && this.f255706v.equals(gVar.mo86174l()) && this.f255707w.equals(gVar.mo86177o());
        }
    }

    /* renamed from: f */
    public final C91727k mo86167f() {
        return this.f255687c;
    }

    /* renamed from: g */
    public final C91738a mo86168g() {
        return this.f255690f;
    }

    /* renamed from: h */
    public final C91743a mo86169h() {
        return this.f255689e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((((this.f255685a.hashCode() ^ 1000003) * 1000003) ^ this.f255686b.hashCode()) * 1000003) ^ this.f255687c.hashCode()) * 1000003) ^ this.f255688d.hashCode()) * 1000003) ^ this.f255689e.hashCode()) * 1000003) ^ this.f255708x.hashCode()) * 1000003) ^ this.f255690f.hashCode()) * 1000003) ^ this.f255691g.hashCode()) * 1000003) ^ this.f255692h.hashCode()) * 1000003) ^ this.f255693i.hashCode()) * 1000003) ^ this.f255694j.hashCode()) * 1000003) ^ this.f255695k.hashCode()) * 1000003) ^ (true != this.f255696l ? 1237 : 1231)) * 1000003) ^ (true != this.f255697m ? 1237 : 1231)) * 1000003) ^ this.f255698n.hashCode()) * 1000003;
        if (true == this.f255699o) {
            i = 1231;
        }
        return ((((((((((((((((hashCode ^ i) * 1000003) ^ this.f255700p.hashCode()) * 1000003) ^ this.f255701q.hashCode()) * 1000003) ^ this.f255702r.hashCode()) * 1000003) ^ this.f255703s.hashCode()) * 1000003) ^ this.f255704t.hashCode()) * 1000003) ^ this.f255705u) * 1000003) ^ this.f255706v.hashCode()) * 1000003) ^ this.f255707w.hashCode();
    }

    /* renamed from: i */
    public final C91748d mo86171i() {
        return this.f255685a;
    }

    /* renamed from: j */
    public final CardRenderingContext mo86172j() {
        return this.f255702r;
    }

    /* renamed from: k */
    public final C58833ax mo86173k() {
        return this.f255693i;
    }

    /* renamed from: l */
    public final C58833ax mo86174l() {
        return this.f255706v;
    }

    /* renamed from: m */
    public final C58833ax mo86175m() {
        return this.f255704t;
    }

    /* renamed from: n */
    public final C58833ax mo86176n() {
        return this.f255694j;
    }

    /* renamed from: o */
    public final C58833ax mo86177o() {
        return this.f255707w;
    }

    /* renamed from: p */
    public final C58833ax mo86178p() {
        return this.f255691g;
    }

    /* renamed from: q */
    public final C58833ax mo86179q() {
        return this.f255701q;
    }

    /* renamed from: r */
    public final C58833ax mo86180r() {
        return this.f255703s;
    }

    /* renamed from: s */
    public final C8142xb mo86181s() {
        return this.f255698n;
    }

    /* renamed from: t */
    public final C68214a mo86182t() {
        return this.f255695k;
    }

    public final String toString() {
        String obj = this.f255685a.toString();
        String obj2 = this.f255686b.toString();
        String obj3 = this.f255687c.toString();
        String obj4 = this.f255688d.toString();
        String obj5 = this.f255689e.toString();
        String obj6 = this.f255708x.toString();
        String obj7 = this.f255690f.toString();
        String obj8 = this.f255691g.toString();
        String obj9 = this.f255692h.toString();
        String obj10 = this.f255693i.toString();
        String obj11 = this.f255694j.toString();
        String obj12 = this.f255695k.toString();
        boolean z = this.f255696l;
        boolean z2 = this.f255697m;
        String num = Integer.toString(this.f255698n.f28649u);
        boolean z3 = this.f255699o;
        String obj13 = this.f255700p.toString();
        String obj14 = this.f255701q.toString();
        String obj15 = this.f255702r.toString();
        String obj16 = this.f255703s.toString();
        String obj17 = this.f255704t.toString();
        int i = this.f255705u;
        String obj18 = this.f255706v.toString();
        return "BaseClientActionHandlerParameters{activityHelper=" + obj + ", actionLogger=" + obj2 + ", nowRemoteActionHandlerClient=" + obj3 + ", cardRefresher=" + obj4 + ", feedbackSender=" + obj5 + ", viewRecorderContainer=" + obj6 + ", entryDismisser=" + obj7 + ", permissionsRequester=" + obj8 + ", actionIntentUtil=" + obj9 + ", clientActionListener=" + obj10 + ", nowAmpLauncher=" + obj11 + ", errorReporterLazy=" + obj12 + ", isOnSecondScreen=" + z + ", monetEnabled=" + z2 + ", surfaceType=" + num + ", isBackgroundDark=" + z3 + ", appFlowLogger=" + obj13 + ", searchServiceMessenger=" + obj14 + ", cardRenderingContext=" + obj15 + ", videoAutoplayConductor=" + obj16 + ", googleAppIntentParams=" + obj17 + ", notificationId=" + i + ", discoverSurveyRendering=" + obj18 + ", nowClearcutAppData=" + this.f255707w.toString() + "}";
    }

    /* renamed from: u */
    public final boolean mo86184u() {
        return this.f255699o;
    }

    /* renamed from: v */
    public final boolean mo86185v() {
        return this.f255696l;
    }

    /* renamed from: w */
    public final boolean mo86186w() {
        return this.f255697m;
    }

    /* renamed from: x */
    public final C91901c mo86187x() {
        return this.f255708x;
    }
}
