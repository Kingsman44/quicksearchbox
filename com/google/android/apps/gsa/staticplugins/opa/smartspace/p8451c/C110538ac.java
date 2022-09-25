package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83725a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.C110619bw;
import com.google.android.apps.gsa.tasks.C118468ac;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.ac */
/* compiled from: PG */
public final class C110538ac implements C86091a {

    /* renamed from: a */
    static final C58881cr f308153a = C58886cw.m90973a(C110562v.f308239a);

    /* renamed from: l */
    public static final /* synthetic */ int f308154l = 0;

    /* renamed from: b */
    public final C22871g f308155b;

    /* renamed from: c */
    public final C83725a f308156c;

    /* renamed from: d */
    public final C118561t f308157d;

    /* renamed from: e */
    public final C83794j f308158e;

    /* renamed from: f */
    public final C86124t f308159f;

    /* renamed from: g */
    public final C68214a f308160g;

    /* renamed from: h */
    public final C21370a f308161h;

    /* renamed from: i */
    public final C58974d f308162i;

    /* renamed from: j */
    public long f308163j = 0;

    /* renamed from: k */
    public int f308164k = 0;

    /* renamed from: m */
    private final u f308165m;

    /* renamed from: n */
    private final C110619bw f308166n;

    public C110538ac(C22871g gVar, C118561t tVar, C110560t tVar2, C83794j jVar, C86124t tVar3, C68214a aVar, C21370a aVar2, C110619bw bwVar, C83564a aVar3, u uVar) {
        this.f308155b = gVar;
        this.f308157d = tVar;
        this.f308156c = tVar2.mo98766a(C39226b.TAG_CLASSIC_ASSISTANT_AMBIENT_CLASSIC);
        this.f308158e = jVar;
        this.f308159f = tVar3;
        this.f308160g = aVar;
        this.f308161h = aVar2;
        this.f308166n = bwVar;
        this.f308162i = aVar3.mo76900a("CalRefreshTaskCtrl");
        this.f308165m = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo98758a() {
        C60870cx cxVar;
        if (this.f308158e.mo77185x()) {
            ((C58970a) ((C58970a) this.f308162i.mo56224b()).mo56372aa(26565)).mo56386p("PCP migration is enabled for calendar, skip the refresh.");
            return C118826c.f331423b;
        }
        ((C58970a) ((C58970a) this.f308162i.mo56224b()).mo56372aa(26564)).mo56386p("#refreshCalendarData()");
        C31520m c = C31167ax.m58112a().mo36912c();
        C60870cx[] cxVarArr = new C60870cx[2];
        cxVarArr[0] = this.f308166n.mo98817a();
        if (!this.f308158e.mo77174l()) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = C60922j.m93044g(this.f308165m.c(), C110536aa.f308150a, C60826bg.f164896a);
        }
        cxVarArr[1] = cxVar;
        C60870cx h = C60922j.m93045h(C60856cj.m92907p(cxVarArr), new C110566z(this), C60826bg.f164896a);
        C110537ab abVar = new C110537ab(this, c);
        C60856cj.m92911t(h, C47810es.m84974n(abVar), C60826bg.f164896a);
        return h;
    }

    /* renamed from: b */
    public final void mo98759b() {
        C118522by byVar;
        C118522by byVar2;
        if (this.f308158e.mo77159C()) {
            ((C58970a) ((C58970a) this.f308162i.mo56224b()).mo56372aa(26569)).mo56386p("Scheduling non-exclusive calendar refresh task.");
            C118561t tVar = this.f308157d;
            if (this.f308158e.mo77164I()) {
                byVar2 = C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH;
            } else {
                byVar2 = C118522by.SMARTSPACE_CALENDAR_REFRESH;
            }
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            C118468ac acVar = (C118468ac) f308153a.mo6453a();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            acVar.getClass();
            agVar.f328828h = acVar;
            agVar.f328821a |= 64;
            Integer b = tVar.mo103751b(byVar2, (C118472ag) afVar.build());
            if (b != null) {
                ((SharedPreferences) this.f308160g.mo27525b()).edit().putInt("smartspace_calendar_task_id", b.intValue()).apply();
                return;
            }
            return;
        }
        if (!this.f308158e.mo77160D()) {
            this.f308157d.mo103752c(C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH);
        }
        ((C58970a) ((C58970a) this.f308162i.mo56224b()).mo56372aa(26568)).mo56386p("Scheduling exclusive calendar refresh task.");
        C118561t tVar2 = this.f308157d;
        if (this.f308158e.mo77164I()) {
            byVar = C118522by.OPA_SMARTSPACE_CALENDAR_REFRESH;
        } else {
            byVar = C118522by.SMARTSPACE_CALENDAR_REFRESH;
        }
        C118471af afVar2 = (C118471af) C118472ag.f328819i.createBuilder();
        C118468ac acVar2 = (C118468ac) f308153a.mo6453a();
        afVar2.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar2.instance;
        acVar2.getClass();
        agVar2.f328828h = acVar2;
        agVar2.f328821a |= 64;
        tVar2.mo103754e(byVar, (C118472ag) afVar2.build());
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        ((C58970a) ((C58970a) this.f308162i.mo56224b()).mo56372aa(26567)).mo56386p("#onDeviceInstallOrBoot(): Starting calendar refresh task.");
        mo98758a();
    }
}
