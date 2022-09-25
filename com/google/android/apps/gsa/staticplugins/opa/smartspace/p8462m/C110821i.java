package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123774cn;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.i */
/* compiled from: PG */
public final /* synthetic */ class C110821i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110835w f308765a;

    /* renamed from: b */
    public final /* synthetic */ List f308766b;

    public /* synthetic */ C110821i(C110835w wVar, List list) {
        this.f308765a = wVar;
        this.f308766b = list;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C50794cr crVar;
        C110835w wVar = this.f308765a;
        List list = this.f308766b;
        C118826c cVar = (C118826c) obj;
        if (wVar.f308788d.mo77183v()) {
            cxVar = wVar.f308793i.mo98831b(C83800p.m133473k().mo77042a());
        } else {
            cxVar = wVar.f308787c.mo98916a(C83800p.m133473k().mo77042a());
        }
        C110834v vVar = new C110834v(wVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(vVar), C60826bg.f164896a);
        if (list.size() == 1) {
            int i = ((C123744bk) list.get(0)).f341810e;
            if (i == 7) {
                crVar = C50794cr.WEATHER;
            } else if (i == 11) {
                crVar = C50794cr.FLIGHT;
            } else if (i == 25 || i == 41) {
                crVar = C50794cr.REMINDER;
            } else if (i == 16) {
                crVar = C50794cr.TIPS;
            } else if (i == 17) {
                crVar = C50794cr.CALENDAR;
            } else if (i == 31) {
                crVar = C50794cr.TIME_TO_LEAVE;
            } else if (i != 32) {
                crVar = C50794cr.UNDEFINED;
            } else {
                crVar = C50794cr.COMMUTE_TIME;
            }
            String a = C92111g.m151146a(crVar);
            int a2 = C123774cn.m203111a(((C123744bk) list.get(0)).f341815j);
            if (a2 != 0 && a2 == 4) {
                ((C58970a) ((C58970a) wVar.f308785a.mo56224b()).mo56372aa(26795)).mo56389s("card deleted type: %s", a);
                return wVar.f308791g.mo28210j(cxVar, BuildConfig.FLAVOR, new C110820h(wVar));
            } else if (((C123744bk) list.get(0)).f341810e == 7) {
                ((C58970a) ((C58970a) wVar.f308785a.mo56224b()).mo56372aa(26794)).mo56386p("weather card updated");
                return wVar.f308791g.mo28210j(cxVar, BuildConfig.FLAVOR, new C110825m(wVar));
            } else {
                ((C58970a) ((C58970a) wVar.f308785a.mo56224b()).mo56372aa(26793)).mo56389s("primary card updated, type:%s", a);
                return wVar.f308791g.mo28210j(cxVar, BuildConfig.FLAVOR, new C110826n(wVar, (C123744bk) list.get(0)));
            }
        } else {
            ((C58970a) ((C58970a) wVar.f308785a.mo56224b()).mo56372aa(26792)).mo56386p("No change/Multiple data changed case");
            return wVar.f308791g.mo28210j(cxVar, BuildConfig.FLAVOR, new C110827o(wVar));
        }
    }
}
