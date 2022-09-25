package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.C1839z;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6974ae.C89095d;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.assistant.p3803ag.p3809c.C48926a;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3803ag.p3809c.C49007d;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4013d.C53650b;
import com.google.assistant.p4008y.p4013d.C53655g;
import com.google.assistant.p4008y.p4013d.C53658j;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.assistant.p4008y.p4013d.C53663o;
import com.google.assistant.p4008y.p4013d.p4014a.C53633b;
import com.google.assistant.p4008y.p4013d.p4014a.C53639h;
import com.google.assistant.p4008y.p4013d.p4014a.C53641j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.z */
/* compiled from: PG */
public final /* synthetic */ class C109904z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109877ab f306233a;

    /* renamed from: b */
    public final /* synthetic */ C53641j f306234b;

    public /* synthetic */ C109904z(C109877ab abVar, C53641j jVar) {
        this.f306233a = abVar;
        this.f306234b = jVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        long j;
        C48980c cVar;
        C109877ab abVar = this.f306233a;
        C53641j jVar = this.f306234b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C53660l lVar = ((C53618b) axVar.mo56107c()).f140735b;
            if (lVar == null) {
                lVar = C53660l.f140838d;
            }
            C53650b bVar = lVar.f140841b;
            if (bVar == null) {
                bVar = C53650b.f140812d;
            }
            j = bVar.f140816c;
        } else {
            j = C53650b.f140812d.f140816c;
        }
        long j2 = j;
        if ((jVar.f140783a & 256) != 0) {
            C49007d dVar = jVar.f140792j;
            if (dVar == null) {
                dVar = C49007d.f126766b;
            }
            cVar = C48980c.m85331a(dVar.f126768a);
            if (cVar == null) {
                cVar = C48980c.UNRECOGNIZED;
            }
        } else {
            cVar = C48980c.TYPE_OPA_PRODUCT_UPDATES;
        }
        C36334o b = abVar.f306170f.mo40115b(cVar);
        if (!abVar.f306172h.mo79746e(C90037cp.f248424aE)) {
            C58976aa aaVar = C58975e.f156826a;
            abVar.mo98220d(jVar, cVar, C53663o.FEATURE_FLAG_DISABLED, j2);
        } else if (!((bm) abVar.f306166b.mo27525b()).n()) {
            C58976aa aaVar2 = C58975e.f156826a;
            abVar.mo98220d(jVar, cVar, C53663o.NOT_AWAITING_UPGRADE, j2);
        } else if (!((bm) abVar.f306166b.mo27525b()).w()) {
            C58976aa aaVar3 = C58975e.f156826a;
            abVar.mo98220d(jVar, cVar, C53663o.OPA_TURNED_OFF, j2);
        } else if (!((C85651bb) abVar.f306173i.mo27525b()).mo79139L()) {
            if (!jVar.f140785c.isEmpty() && !jVar.f140786d.isEmpty()) {
                int i = jVar.f140783a;
                if (!((i & 8) == 0 || (i & 1) == 0)) {
                    if (axVar.mo56113h()) {
                        C53660l lVar2 = ((C53618b) axVar.mo56107c()).f140735b;
                        if (lVar2 == null) {
                            lVar2 = C53660l.f140838d;
                        }
                        C53650b bVar2 = lVar2.f140841b;
                        if (bVar2 == null) {
                            bVar2 = C53650b.f140812d;
                        }
                        if (bVar2.f140815b) {
                            C58976aa aaVar4 = C58975e.f156826a;
                            abVar.mo98220d(jVar, cVar, C53663o.CAMPAIGN_OPT_OUT, j2);
                            return;
                        }
                    }
                    if (!abVar.f306170f.mo40120g()) {
                        C58976aa aaVar5 = C58975e.f156826a;
                        abVar.mo98220d(jVar, cVar, C53663o.SYSTEM_OPT_OUT, j2);
                        return;
                    } else if (abVar.f306170f.mo40121h(b)) {
                        C109889k kVar = abVar.f306169e;
                        C53655g gVar = (C53655g) C53658j.f140828i.createBuilder();
                        long j3 = jVar.f140784b;
                        gVar.copyOnWrite();
                        C53658j jVar2 = (C53658j) gVar.instance;
                        jVar2.f140831b = 1;
                        jVar2.f140832c = Long.valueOf(j3);
                        gVar.copyOnWrite();
                        C53658j jVar3 = (C53658j) gVar.instance;
                        jVar3.f140835f = 2;
                        jVar3.f140830a |= 2;
                        C48926a aVar = (C48926a) C49007d.f126766b.createBuilder();
                        aVar.copyOnWrite();
                        ((C49007d) aVar.instance).f126768a = cVar.getNumber();
                        gVar.copyOnWrite();
                        C53658j jVar4 = (C53658j) gVar.instance;
                        C49007d dVar2 = (C49007d) aVar.build();
                        dVar2.getClass();
                        jVar4.f140837h = dVar2;
                        jVar4.f140830a |= 8;
                        C53658j jVar5 = (C53658j) gVar.build();
                        kVar.mo98223c(jVar5);
                        kVar.mo98222b(jVar5, (String) null);
                        ArrayList arrayList = new ArrayList();
                        C28292j jVar6 = new C28292j(46142);
                        jVar6.mo33795i(5);
                        jVar6.mo33795i(22);
                        int i2 = 3;
                        jVar6.mo33794h(true != jVar.f140791i ? 1 : 3);
                        arrayList.add(C28293k.m52908e(jVar6, new C28293k[0]));
                        C53639h hVar = jVar.f140787e;
                        if (hVar == null) {
                            hVar = C53639h.f140775d;
                        }
                        Intent c = abVar.mo98219c(hVar, jVar6);
                        if (c == null) {
                            abVar.f306171g.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_VALID_PAYLOAD_COUNT, C118575h.OPA_ACQUISITION_NOTIFICATION).mo104025g(0);
                            C59104x c2 = C109877ab.f306165a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "OpaAcqNotifRespTask");
                            ((C59052c) ((C59052c) c2).mo56372aa(25492)).mo56386p("Click intent is not defined for the notification");
                            return;
                        }
                        Intent action = new Intent().setClassName(abVar.f306168d, "com.google.android.apps.gsa.search.core.service.SearchService").setAction("com.google.android.search.core.action.OPA_NOTIFICATION_DISMISSED");
                        PendingIntent b2 = abVar.mo98218b(c, jVar, cVar, 0);
                        PendingIntent b3 = abVar.mo98218b(action, jVar, cVar, 1);
                        C1839z a = C89095d.m144923a(abVar.f306168d, (String) null);
                        a.f5679J.icon = R.drawable.ic_assistant_light;
                        a.f5670A = abVar.f306168d.getResources().getColor(R.color.google_blue);
                        a.f5671B = 1;
                        a.f5685e = C1839z.m5037c(jVar.f140785c);
                        a.f5686f = C1839z.m5037c(jVar.f140786d);
                        a.f5687g = b2;
                        a.f5679J.deleteIntent = b3;
                        a.f5675F = b.f94887a;
                        a.f5690j = b.f94889c;
                        int i3 = 0;
                        int i4 = 2;
                        while (i3 < jVar.f140793k.size()) {
                            C53633b bVar3 = (C53633b) jVar.f140793k.get(i3);
                            C28292j jVar7 = new C28292j(46143);
                            jVar7.mo33795i(5);
                            i3++;
                            aqp aqp = jVar7.f76974b;
                            aqp.copyOnWrite();
                            aqs aqs = (aqs) aqp.instance;
                            aqs aqs2 = aqs.f159780k;
                            aqs.f159782a |= 2;
                            aqs.f159784c = i3;
                            jVar7.mo33794h(true != jVar.f140791i ? 1 : 3);
                            arrayList.add(C28293k.m52908e(jVar7, new C28293k[0]));
                            C53639h hVar2 = bVar3.f140768b;
                            if (hVar2 == null) {
                                hVar2 = C53639h.f140775d;
                            }
                            Intent c3 = abVar.mo98219c(hVar2, jVar7);
                            if (c3 == null) {
                                C59104x c4 = C109877ab.f306165a.mo56225c();
                                c4.mo56378ag(C58975e.f156826a, "OpaAcqNotifRespTask");
                                ((C59052c) ((C59052c) c4).mo56372aa(25491)).mo56386p("Skipping button with empty intent");
                            } else {
                                a.mo5016e(0, bVar3.f140767a, abVar.mo98218b(c3, jVar, cVar, i4));
                                i4++;
                            }
                        }
                        abVar.f306171g.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_VALID_PAYLOAD_COUNT, C118575h.OPA_ACQUISITION_NOTIFICATION).mo104025g(1);
                        C28293k d = C28293k.m52907d(new C28292j(47411), arrayList);
                        C58836b bVar4 = C58836b.f156633a;
                        if (true != jVar.f140791i) {
                            i2 = 1;
                        }
                        C58833ax e = C109877ab.m183011e(d, jVar, j2, bVar4, i2);
                        if (e.mo56113h()) {
                            C89949q.m146521e((C60321oe) e.mo56107c(), false);
                        }
                        if (jVar.f140791i) {
                            C58976aa aaVar6 = C58975e.f156826a;
                            return;
                        } else {
                            abVar.f306167c.mo5003b("op", C89885b.OKHTTP_VERSION_NOT_3_VALUE, a.mo5013a());
                            return;
                        }
                    } else {
                        C58976aa aaVar7 = C58975e.f156826a;
                        abVar.mo98220d(jVar, cVar, C53663o.CHANNEL_OPT_OUT, j2);
                        return;
                    }
                }
            }
            abVar.f306171g.mo77944g(C118569b.OPA_ACQUISITION_NOTIFICATION_VALID_PAYLOAD_COUNT, C118575h.OPA_ACQUISITION_NOTIFICATION).mo104025g(0);
            C59104x c5 = C109877ab.f306165a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "OpaAcqNotifRespTask");
            ((C59052c) ((C59052c) c5).mo56372aa(25497)).mo56389s("Notification metadata invalid: %s", jVar);
            C48980c a2 = C48980c.m85331a(C49007d.f126766b.f126768a);
            if (a2 == null) {
                a2 = C48980c.UNRECOGNIZED;
            }
            abVar.mo98220d(jVar, a2, C53663o.INVALID_PAYLOAD, j2);
        } else {
            C58976aa aaVar8 = C58975e.f156826a;
            abVar.mo98220d(jVar, cVar, C53663o.GOOGLE_NOW_FIRST_RUN_OPT_IN, j2);
        }
    }
}
