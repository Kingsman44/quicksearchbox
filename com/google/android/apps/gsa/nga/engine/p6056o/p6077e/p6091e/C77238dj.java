package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

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
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dj */
/* compiled from: PG */
public final /* synthetic */ class C77238dj implements C77186bl {

    /* renamed from: a */
    public final /* synthetic */ C77244dp f213078a;

    public /* synthetic */ C77238dj(C77244dp dpVar) {
        this.f213078a = dpVar;
    }

    /* renamed from: a */
    public final C60870cx mo72466a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        C77244dp dpVar = this.f213078a;
        if (guVar.size() != 1) {
            dpVar.f213088e.mo76648a(nVar.mo71336k(), C82835ce.MULTIPLE_ALARMS_RINGING, C83044e.f226656a);
            ((C58970a) ((C58970a) C77244dp.f213084a.mo56226d()).mo56372aa(3843)).mo56386p("Cannot snooze multiple alarms at the same time, should never happen.");
            return C81442m.f222851a;
        }
        C51473j jVar = (C51473j) guVar.get(0);
        C80399l c = C77244dp.m123967c();
        Optional e = dpVar.mo72487e(bgVar);
        C51500k kVar = (C51500k) C51527l.f134273f.createBuilder();
        kVar.mo53629a(jVar);
        e.ifPresent(new C77234df(kVar));
        C81442m.m129557s(c, t.i("alarm.SNOOZE_ALARM", (C51527l) kVar.build()));
        if (nVar.mo71348w()) {
            C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
            dxVar.copyOnWrite();
            C51809dy dyVar = (C51809dy) dxVar.instance;
            dyVar.f135935a |= 1;
            dyVar.f135936b = "core.DISMISS_ASSISTANT";
            C81442m.m129557s(c, (C51809dy) dxVar.build());
        } else {
            C51446i iVar = (C51446i) jVar.toBuilder();
            C51419h hVar = C51419h.SNOOZED;
            iVar.copyOnWrite();
            C51473j jVar2 = (C51473j) iVar.instance;
            jVar2.f134097f = hVar.f133932g;
            jVar2.f134092a |= 16;
            iVar.copyOnWrite();
            C51473j jVar3 = (C51473j) iVar.instance;
            jVar3.f134092a &= -33;
            jVar3.f134098g = 0;
            e.map(new C77235dg(dpVar)).ifPresent(new C77236dh(iVar));
            Locale q = nVar.mo71342q();
            C81442m.m129557s(c, t.r(dpVar.f213085b.mo75121a(q).getString(R.string.nga_productivity_snoozed_alarm_response, new Object[0])));
            C81442m.m129557s(c, dpVar.f213086c.a(q, C58485gu.m89846n((C51473j) iVar.build())));
        }
        return C60856cj.m92900i((C80401n) c.build());
    }
}
