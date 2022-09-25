package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1800aq;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83937x;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.assistant.p3803ag.p3809c.C48926a;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3803ag.p3809c.C49007d;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.assistant.p4008y.p4013d.C53661m;
import com.google.assistant.p4008y.p4013d.C53663o;
import com.google.assistant.p4008y.p4013d.C53664p;
import com.google.assistant.p4008y.p4013d.p4014a.C53637f;
import com.google.assistant.p4008y.p4013d.p4014a.C53639h;
import com.google.assistant.p4008y.p4013d.p4014a.C53641j;
import com.google.assistant.p4008y.p4013d.p4014a.C53643l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.ais;
import com.google.common.p4552o.ait;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.ab */
/* compiled from: PG */
public final class C109877ab implements C118549h {

    /* renamed from: a */
    public static final C59071e f306165a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.promo.a.ab");

    /* renamed from: b */
    public final C68214a f306166b;

    /* renamed from: c */
    public final C1800aq f306167c;

    /* renamed from: d */
    public final Context f306168d;

    /* renamed from: e */
    public final C109889k f306169e;

    /* renamed from: f */
    public final C36337r f306170f;

    /* renamed from: g */
    public final C118827a f306171g;

    /* renamed from: h */
    public final C86124t f306172h;

    /* renamed from: i */
    public final C68214a f306173i;

    /* renamed from: j */
    private final C68214a f306174j;

    /* renamed from: k */
    private final C22871g f306175k;

    public C109877ab(Context context, C68214a aVar, C1800aq aqVar, C109889k kVar, C36337r rVar, C68214a aVar2, C22871g gVar, C118827a aVar3, C86124t tVar, C68214a aVar4) {
        this.f306168d = context;
        this.f306166b = aVar;
        this.f306167c = aqVar;
        this.f306169e = kVar;
        this.f306170f = rVar;
        this.f306174j = aVar2;
        this.f306175k = gVar;
        this.f306171g = aVar3;
        this.f306172h = tVar;
        this.f306173i = aVar4;
    }

    /* renamed from: e */
    public static C58833ax m183011e(C28293k kVar, C53641j jVar, long j, C58833ax axVar, int i) {
        C60321oe b = C28285c.m52875b(kVar, 47411);
        if (b == null || b.f163228c.isEmpty()) {
            C59104x c = f306165a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaAcqNotifRespTask");
            ((C59052c) ((C59052c) c).mo56372aa(25486)).mo56386p("Unable to create client VE.");
            return C58836b.f156633a;
        }
        ais ais = (ais) ait.f158838e.createBuilder();
        long j2 = jVar.f140784b;
        ais.copyOnWrite();
        ait ait = (ait) ais.instance;
        ait.f158841a |= 1;
        ait.f158842b = j2;
        ais.copyOnWrite();
        ait ait2 = (ait) ais.instance;
        ait2.f158841a |= 2;
        ait2.f158843c = j;
        if (axVar.mo56113h()) {
            ais.copyOnWrite();
            ait ait3 = (ait) ais.instance;
            ait3.f158844d = ((C53663o) axVar.mo56107c()).f140856l;
            ait3.f158841a |= 4;
        }
        aqp aqp = (aqp) ((aqs) b.f163228c.get(0)).toBuilder();
        aqp.mo58885m(ait.f158839f, (ait) ais.build());
        aqp.copyOnWrite();
        aqs aqs = (aqs) aqp.instance;
        aqs.f159789h = i - 1;
        aqs.f159782a |= 32;
        C60320od odVar = (C60320od) b.toBuilder();
        odVar.mo57084d(0, (aqs) aqp.build());
        return C58833ax.m90834k((C60321oe) odVar.build());
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r0 = C62942bv.checkIsLite(C109879ad.f306176a);
        akVar.mo58887l(r0);
        if (!akVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x c = f306165a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaAcqNotifRespTask");
            ((C59052c) ((C59052c) c).mo56372aa(25488)).mo56386p("Task parameters should not be empty.");
            return C118826c.f331423b;
        }
        C62940bt r02 = C62942bv.checkIsLite(C109879ad.f306176a);
        akVar.mo58887l(r02);
        Object l = akVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        new C90873ag(((C108013bm) this.f306174j.mo27525b()).mo96369z(), this.f306175k, "handleNotificationPayload", new C109904z(this, (C53641j) obj)).mo85223a(C109876aa.f306164a);
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final PendingIntent mo98218b(Intent intent, C53641j jVar, C48980c cVar, int i) {
        intent.putExtra("notification_content_id", jVar.f140784b);
        intent.putExtra("notification_channel", cVar.getNumber());
        intent.putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 16);
        return PendingIntent.getService(this.f306168d, i, intent, 201326592);
    }

    /* renamed from: c */
    public final Intent mo98219c(C53639h hVar, C28292j jVar) {
        Intent intent;
        C60214n g;
        C53643l lVar;
        int a = C53637f.m86880a(hVar.f140779c);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            Intent action = new Intent().setClassName(this.f306168d, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED");
            if (hVar.f140777a == 2) {
                lVar = (C53643l) hVar.f140778b;
            } else {
                lVar = C53643l.f140794c;
            }
            if (lVar.f140796a == 1) {
                int a2 = C83937x.m133683a(((Integer) lVar.f140797b).intValue());
                if (a2 != 0) {
                    i = a2;
                }
                action.putExtra("value_prop_id", i - 1);
            }
            intent = action;
        } else if (i2 == 2) {
            intent = C87566i.m142325x(hVar.f140777a == 3 ? (String) hVar.f140778b : BuildConfig.FLAVOR);
        } else if (i2 != 3) {
            C59104x c = f306165a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OpaAcqNotifRespTask");
            ((C59052c) ((C59052c) c).mo56372aa(25485)).mo56389s("Invalid notification action type: %s", hVar);
            return null;
        } else {
            intent = new Intent().setClassName(this.f306168d, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_ACTION_PRESSED").putExtra("com.google.android.search.core.extra.NOTIFICATION_ACTION_FLAG", 1).putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 16);
        }
        if (!(intent == null || (g = C28285c.m52880g(jVar)) == null)) {
            intent.putExtra("ved", C28294l.m52913c(g));
        }
        return intent;
    }

    /* renamed from: d */
    public final void mo98220d(C53641j jVar, C48980c cVar, C53663o oVar, long j) {
        C28292j jVar2 = new C28292j(47411);
        jVar2.mo33794h(2);
        C58833ax e = m183011e(C28293k.m52908e(jVar2, new C28293k[0]), jVar, j, C58833ax.m90834k(oVar), 2);
        if (e.mo56113h()) {
            C89949q.m146521e((C60321oe) e.mo56107c(), false);
        }
        C109889k kVar = this.f306169e;
        C53655g gVar = (C53655g) C53658j.f140828i.createBuilder();
        long j2 = jVar.f140784b;
        gVar.copyOnWrite();
        C53658j jVar3 = (C53658j) gVar.instance;
        jVar3.f140831b = 1;
        jVar3.f140832c = Long.valueOf(j2);
        gVar.copyOnWrite();
        C53658j jVar4 = (C53658j) gVar.instance;
        jVar4.f140835f = 5;
        jVar4.f140830a = 2 | jVar4.f140830a;
        C48926a aVar = (C48926a) C49007d.f126766b.createBuilder();
        aVar.copyOnWrite();
        ((C49007d) aVar.instance).f126768a = cVar.getNumber();
        gVar.copyOnWrite();
        C53658j jVar5 = (C53658j) gVar.instance;
        C49007d dVar = (C49007d) aVar.build();
        dVar.getClass();
        jVar5.f140837h = dVar;
        jVar5.f140830a |= 8;
        C53661m mVar = (C53661m) C53664p.f140857c.createBuilder();
        mVar.copyOnWrite();
        C53664p pVar = (C53664p) mVar.instance;
        pVar.f140860b = oVar.f140856l;
        pVar.f140859a |= 1;
        gVar.copyOnWrite();
        C53658j jVar6 = (C53658j) gVar.instance;
        C53664p pVar2 = (C53664p) mVar.build();
        pVar2.getClass();
        jVar6.f140834e = pVar2;
        jVar6.f140833d = 5;
        C53658j jVar7 = (C53658j) gVar.build();
        kVar.mo98223c(jVar7);
        kVar.mo98222b(jVar7, (String) null);
    }
}
