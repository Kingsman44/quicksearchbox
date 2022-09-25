package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bd */
/* compiled from: PG */
public final /* synthetic */ class C77178bd implements C77186bl {

    /* renamed from: a */
    public final /* synthetic */ C77179be f212980a;

    public /* synthetic */ C77178bd(C77179be beVar) {
        this.f212980a = beVar;
    }

    /* renamed from: a */
    public final C60870cx mo72466a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        C77179be beVar = this.f212980a;
        if (beVar.f212985e.mo85405j(C90126fx.f251163dd)) {
            ((C58970a) ((C58970a) C77179be.f212981a.mo56226d()).mo56372aa(3835)).mo56386p("DeleteAlarm fulfillment is enabled for disabled alarm, DisableAlarmFulfiller should be disabled in this case.");
            beVar.f212987g.mo76648a(nVar.mo71336k(), C82835ce.FAILURE_DELETE_AND_DISABLE_ALARM_BOTH_ENABLED, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(23123);
        if (guVar.size() <= 1 || nVar.mo71328c().mo71266e()) {
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C77176bb.f212978a).collect(C58370cn.f155946a);
            C51500k kVar = (C51500k) C51527l.f134273f.createBuilder();
            kVar.mo53630b(guVar2);
            C81442m.m129557s(lVar, t.i("alarm.UPDATE_ALARM", (C51527l) kVar.build()));
            Locale q = nVar.mo71342q();
            C81442m.m129557s(lVar, t.r(beVar.f212982b.mo75121a(q).getResources().getQuantityString(R.plurals.nga_productivity_disable_alarm_response, guVar2.size())));
            C81442m.m129557s(lVar, beVar.f212986f.a(q, guVar2));
            return C60856cj.m92900i((C80401n) lVar.build());
        }
        beVar.f212987g.mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
        return C81442m.f222851a;
    }
}
