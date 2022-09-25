package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4013d.C53653e;
import com.google.assistant.p4008y.p4013d.C53654f;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.ais;
import com.google.common.p4552o.ait;
import com.google.common.p4552o.ajw;
import com.google.common.p4552o.ajy;
import com.google.common.p4552o.ajz;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5036r.C65316b;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.m */
/* compiled from: PG */
public final /* synthetic */ class C109936m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109941r f306320a;

    public /* synthetic */ C109936m(C109941r rVar) {
        this.f306320a = rVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C58833ax axVar;
        C109941r rVar = this.f306320a;
        C58833ax axVar2 = (C58833ax) obj;
        if (axVar2.mo56113h()) {
            C53660l lVar = ((C53618b) axVar2.mo56107c()).f140735b;
            if (lVar == null) {
                lVar = C53660l.f140838d;
            }
            C53654f fVar = lVar.f140842c;
            if (fVar == null) {
                fVar = C53654f.f140821e;
            }
            if (!fVar.f140826d) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
        }
        if (rVar.f306330e.mo40120g()) {
            C36337r rVar2 = rVar.f306330e;
            if (rVar2.mo40121h(rVar2.mo40115b(C109941r.f306327b))) {
                C58976aa aaVar2 = C58975e.f156826a;
                String string = rVar.f306328c.getResources().getString(R.string.opa_nga_swipe_demo_notification_title);
                String string2 = rVar.f306328c.getResources().getString(R.string.opa_nga_swipe_demo_notification_content);
                C28292j jVar = new C28292j(46142);
                jVar.mo33795i(5);
                jVar.mo33795i(22);
                jVar.mo33794h(true != rVar.f306331f.mo79746e(C90037cp.f248456ak) ? 1 : 3);
                ArrayList arrayList = new ArrayList();
                arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
                C60321oe b = C28285c.m52875b(C28293k.m52907d(new C28292j(47411), arrayList), 47411);
                if (b == null || b.f163228c.isEmpty()) {
                    axVar = C58836b.f156633a;
                } else {
                    ais ais = (ais) ait.f158838e.createBuilder();
                    ais.copyOnWrite();
                    ait ait = (ait) ais.instance;
                    ait.f158841a |= 1;
                    ait.f158842b = 1010242;
                    ajw ajw = (ajw) ajz.f158928q.createBuilder();
                    String name = C89094c.OPA_FEATURE_PROMO.name();
                    ajw.copyOnWrite();
                    ajz ajz = (ajz) ajw.instance;
                    name.getClass();
                    ajz.f158932a |= 1;
                    ajz.f158933b = name;
                    ajw.copyOnWrite();
                    ajz ajz2 = (ajz) ajw.instance;
                    ajz2.f158932a |= 8;
                    ajz2.f158936e = 25;
                    ajy ajy = ajy.CLIENT_GENERATED;
                    ajw.copyOnWrite();
                    ajz ajz3 = (ajz) ajw.instance;
                    ajz3.f158939h = ajy.f158927f;
                    ajz3.f158932a |= 64;
                    ajw.copyOnWrite();
                    ajz ajz4 = (ajz) ajw.instance;
                    string.getClass();
                    ajz4.f158932a |= 128;
                    ajz4.f158940i = string;
                    ajw.copyOnWrite();
                    ajz ajz5 = (ajz) ajw.instance;
                    string2.getClass();
                    ajz5.f158932a |= 256;
                    ajz5.f158941j = string2;
                    int b2 = C65316b.m96665b(55);
                    ajw.copyOnWrite();
                    ajz ajz6 = (ajz) ajw.instance;
                    ajz6.f158932a |= 16;
                    ajz6.f158937f = b2;
                    aqp aqp = (aqp) ((aqs) b.f163228c.get(0)).toBuilder();
                    aqp.mo58885m(ait.f158839f, (ait) ais.build());
                    aqp.mo58885m(ajz.f158929r, (ajz) ajw.build());
                    int i = true != rVar.f306331f.mo79746e(C90037cp.f248456ak) ? 1 : 3;
                    aqp.copyOnWrite();
                    aqs aqs = (aqs) aqp.instance;
                    aqs.f159789h = i - 1;
                    aqs.f159782a |= 32;
                    C60320od odVar = (C60320od) b.toBuilder();
                    odVar.mo57084d(0, (aqs) aqp.build());
                    axVar = C58833ax.m90834k((C60321oe) odVar.build());
                }
                if (axVar.mo56113h()) {
                    C89949q.m146521e((C60321oe) axVar.mo56107c(), false);
                }
                C48980c cVar = C109941r.f306327b;
                Intent action = new Intent().setClassName(rVar.f306328c, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_TAPPED");
                C83879am o = C83880an.m133553o();
                C83940g gVar = (C83940g) o;
                gVar.f228605a = "opa_android:swipe_demo";
                gVar.f228607c = new C83938e(0, (String) null, (String) null);
                C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
                e eVar = e.bi;
                vVar.copyOnWrite();
                C59567w wVar = (C59567w) vVar.instance;
                wVar.f158064e = eVar.ca;
                wVar.f158060a |= 16;
                o.mo77222b((C59567w) vVar.build());
                action.putExtra("opa-nga-target-intent", o.mo77221a().mo77240n());
                action.putExtra("notification_content_id", 1010242);
                action.putExtra("notification_channel", cVar.getNumber());
                action.putExtra("com.google.android.search.core.extra.NOTIFICATION_FLAG", 64);
                C60214n g = C28285c.m52880g(jVar);
                if (g != null) {
                    action.putExtra("ved", C28294l.m52913c(g));
                }
                PendingIntent service = PendingIntent.getService(rVar.f306328c, 1, action, 201326592);
                C36334o b3 = rVar.f306330e.mo40115b(cVar);
                C1839z a = C89095d.m144923a(rVar.f306328c, (String) null);
                a.f5679J.icon = R.drawable.ic_assistant_light;
                a.f5670A = rVar.f306328c.getResources().getColor(R.color.google_blue);
                a.f5671B = 1;
                a.f5685e = C1839z.m5037c(string);
                a.f5686f = C1839z.m5037c(string2);
                a.f5687g = service;
                a.f5675F = b3.f94887a;
                a.f5690j = b3.f94889c;
                a.mo5015d(16, true);
                Notification a2 = a.mo5013a();
                C53653e eVar2 = (C53653e) C53654f.f140821e.createBuilder();
                eVar2.copyOnWrite();
                C53654f fVar2 = (C53654f) eVar2.instance;
                fVar2.f140823a |= 4;
                fVar2.f140826d = false;
                C60870cx h = C60922j.m93045h(((C108013bm) rVar.f306332g.mo27525b()).mo96369z(), new C109938o(rVar, eVar2), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                new C90873ag(h, rVar.f306333h, "recordOptOut", C109939p.f306324a).mo85223a(C109940q.f306325a);
                if (!rVar.f306331f.mo79746e(C90037cp.f248456ak)) {
                    rVar.f306329d.mo5003b("op", C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE, a2);
                    return;
                }
                return;
            }
            C58976aa aaVar3 = C58975e.f156826a;
            return;
        }
        C58976aa aaVar4 = C58975e.f156826a;
    }
}
