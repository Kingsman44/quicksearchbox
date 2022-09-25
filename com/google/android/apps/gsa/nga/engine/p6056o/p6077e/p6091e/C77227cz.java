package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.c.a.q;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3917i.p3918a.C51446i;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.cz */
/* compiled from: PG */
public final /* synthetic */ class C77227cz implements C77186bl {

    /* renamed from: a */
    public final /* synthetic */ C77230db f213061a;

    public /* synthetic */ C77227cz(C77230db dbVar) {
        this.f213061a = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo72466a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        C77230db dbVar = this.f213061a;
        if (guVar.size() != 1) {
            ((C58970a) ((C58970a) C77230db.f213066a.mo56226d()).mo56372aa(3842)).mo56386p("Cannot silence multiple alarms at the same time, should never happen.");
            dbVar.f213070e.mo76648a(nVar.mo71336k(), C82835ce.MULTIPLE_ALARMS_RINGING, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C51473j jVar = (C51473j) guVar.get(0);
        C80399l c = C77230db.m123959c();
        C81442m.m129557s(c, t.u(q.d(jVar), 1, nVar.mo71336k(), false, false));
        C51446i iVar = (C51446i) jVar.toBuilder();
        C51419h hVar = jVar.f134093b == 4 ? C51419h.SCHEDULED : C51419h.DISABLED;
        iVar.copyOnWrite();
        C51473j jVar2 = (C51473j) iVar.instance;
        jVar2.f134097f = hVar.f133932g;
        jVar2.f134092a |= 16;
        if (jVar.f134093b != 4) {
            iVar.copyOnWrite();
            C51473j jVar3 = (C51473j) iVar.instance;
            jVar3.f134092a &= -2;
            jVar3.f134095d = C51473j.f134090i.f134095d;
        }
        C51473j jVar4 = (C51473j) iVar.build();
        if (nVar.mo71348w()) {
            C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
            dxVar.copyOnWrite();
            C51809dy dyVar = (C51809dy) dxVar.instance;
            dyVar.f135935a |= 1;
            dyVar.f135936b = "core.DISMISS_ASSISTANT";
            C81442m.m129557s(c, (C51809dy) dxVar.build());
        } else {
            Locale q = nVar.mo71342q();
            C81442m.m129557s(c, t.r(dbVar.f213067b.mo75121a(q).getString(R.string.nga_productivity_silence_alarm_response, new Object[0])));
            C81442m.m129557s(c, dbVar.f213068c.a(q, C58485gu.m89846n(jVar4)));
        }
        return C60856cj.m92900i((C80401n) c.build());
    }
}
