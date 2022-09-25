package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1800aq;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.assistant.p3803ag.p3809c.C48926a;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3803ag.p3809c.C49007d;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4013d.C53654f;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.assistant.p4008y.p4013d.C53661m;
import com.google.assistant.p4008y.p4013d.C53663o;
import com.google.assistant.p4008y.p4013d.C53664p;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.v */
/* compiled from: PG */
public final class C109945v implements C118549h {

    /* renamed from: a */
    public static final C59071e f306345a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.v");

    /* renamed from: b */
    public static final C58528ij f306346b = C58528ij.m90011K(C109926c.NGA_PIE_SUGGEST, C109926c.NGA_PIE_SWIPE_DEMO);

    /* renamed from: c */
    public final C86124t f306347c;

    /* renamed from: d */
    public final bo f306348d;

    /* renamed from: e */
    public final C1800aq f306349e;

    /* renamed from: f */
    public final Context f306350f;

    /* renamed from: g */
    public final bm f306351g;

    /* renamed from: h */
    public final C58833ax f306352h;

    /* renamed from: i */
    public final C58833ax f306353i;

    /* renamed from: j */
    public final C118561t f306354j;

    /* renamed from: k */
    public final C36337r f306355k;

    /* renamed from: l */
    private final C108013bm f306356l;

    public C109945v(Context context, C86124t tVar, C108013bm bmVar, C36337r rVar, bo boVar, C1800aq aqVar, bm bmVar2, C58833ax axVar, C58833ax axVar2, C118561t tVar2) {
        this.f306347c = tVar;
        this.f306351g = bmVar2;
        this.f306352h = axVar;
        this.f306353i = axVar2;
        this.f306350f = context;
        this.f306348d = boVar;
        this.f306356l = bmVar;
        this.f306354j = tVar2;
        this.f306355k = rVar;
        this.f306349e = aqVar;
    }

    /* renamed from: c */
    public static void m183115c(Intent intent, C28292j jVar) {
        C60214n g = C28285c.m52880g(jVar);
        if (g != null) {
            intent.putExtra("ved", C28294l.m52913c(g));
        }
    }

    /* renamed from: f */
    static boolean m183116f(C58833ax axVar, C86124t tVar) {
        if (!axVar.mo56113h()) {
            return true;
        }
        C53660l lVar = ((C53618b) axVar.mo56107c()).f140735b;
        if (lVar == null) {
            lVar = C53660l.f140838d;
        }
        C53654f fVar = lVar.f140842c;
        if (fVar == null) {
            fVar = C53654f.f140821e;
        }
        boolean z = fVar.f140824b;
        boolean e = tVar.mo79746e(C90037cp.f248454ai);
        C53660l lVar2 = ((C53618b) axVar.mo56107c()).f140735b;
        if (lVar2 == null) {
            lVar2 = C53660l.f140838d;
        }
        C53654f fVar2 = lVar2.f140842c;
        if (fVar2 == null) {
            fVar2 = C53654f.f140821e;
        }
        boolean z2 = fVar2.f140825c;
        if ((z || e) && !z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx u = this.f306356l.mo96364u();
        C60870cx z = this.f306356l.mo96369z();
        return C118826c.m197213c(C60856cj.m92893b(u, z).mo57334a(new C109944u(this, u, z), C60826bg.f164896a));
    }

    /* renamed from: b */
    public final PendingIntent mo98267b(Intent intent, C109920ap apVar, C48980c cVar, int i) {
        intent.putExtra("notification_content_id", apVar.f306274e);
        intent.putExtra("notification_channel", cVar.getNumber());
        intent.putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 64);
        return PendingIntent.getService(this.f306350f, i, intent, 201326592);
    }

    /* renamed from: d */
    public final void mo98268d(C53658j jVar) {
        this.f306348d.i(jVar, (String) null);
    }

    /* renamed from: e */
    public final void mo98269e(C109920ap apVar, C48980c cVar, C53663o oVar) {
        C53655g gVar = (C53655g) C53658j.f140828i.createBuilder();
        long j = apVar.f306274e;
        gVar.copyOnWrite();
        C53658j jVar = (C53658j) gVar.instance;
        jVar.f140831b = 1;
        jVar.f140832c = Long.valueOf(j);
        gVar.copyOnWrite();
        C53658j jVar2 = (C53658j) gVar.instance;
        jVar2.f140835f = 5;
        jVar2.f140830a |= 2;
        C48926a aVar = (C48926a) C49007d.f126766b.createBuilder();
        aVar.copyOnWrite();
        ((C49007d) aVar.instance).f126768a = cVar.getNumber();
        gVar.copyOnWrite();
        C53658j jVar3 = (C53658j) gVar.instance;
        C49007d dVar = (C49007d) aVar.build();
        dVar.getClass();
        jVar3.f140837h = dVar;
        jVar3.f140830a |= 8;
        C53661m mVar = (C53661m) C53664p.f140857c.createBuilder();
        mVar.copyOnWrite();
        C53664p pVar = (C53664p) mVar.instance;
        pVar.f140860b = oVar.f140856l;
        pVar.f140859a |= 1;
        gVar.copyOnWrite();
        C53658j jVar4 = (C53658j) gVar.instance;
        C53664p pVar2 = (C53664p) mVar.build();
        pVar2.getClass();
        jVar4.f140834e = pVar2;
        jVar4.f140833d = 5;
        mo98268d((C53658j) gVar.build());
    }
}
