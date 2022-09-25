package com.google.android.apps.gsa.staticplugins.bubble.p7590h;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88463m;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88465o;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97010o;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99493q;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99495s;
import com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a.C99496t;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.h.b */
/* compiled from: PG */
public final class C97024b {

    /* renamed from: a */
    private static final C59071e f271149a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.h.b");

    /* renamed from: a */
    public static C58833ax m160592a(C38348c cVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C99496t.f278417f);
        cVar.mo58887l(r0);
        int i = 1;
        if (!cVar.f169962ag.mo58857o(r0.f169971d)) {
            ((C59052c) ((C59052c) f271149a.mo56225c()).mo56372aa(18466)).mo56386p("Got untrusted deeplink without untrusted bubble extension");
            C97042e.m160628d(3, 1, 0);
            return C58836b.f156633a;
        }
        C62940bt r02 = C62942bv.checkIsLite(C99496t.f278417f);
        cVar.mo58887l(r02);
        Object l = cVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C99496t tVar = (C99496t) obj;
        int a = C99495s.m165018a(tVar.f278419a);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 0) {
            ((C59052c) ((C59052c) f271149a.mo56225c()).mo56372aa(18465)).mo56386p("Got untrusted deeplink with unknown bubble type");
            C97042e.m160628d(3, 1, tVar.f278421c);
            return C58836b.f156633a;
        } else if (i2 == 2) {
            C88463m mVar = (C88463m) C88474x.f239172h.createBuilder();
            C88473w wVar = C88473w.PIET;
            mVar.copyOnWrite();
            C88474x xVar = (C88474x) mVar.instance;
            xVar.f239175b = wVar.f239171d;
            xVar.f239174a |= 1;
            int i3 = tVar.f278421c;
            mVar.copyOnWrite();
            C88474x xVar2 = (C88474x) mVar.instance;
            xVar2.f239174a |= 16;
            xVar2.f239179f = i3;
            mVar.copyOnWrite();
            C88474x xVar3 = (C88474x) mVar.instance;
            xVar3.f239176c = 1;
            xVar3.f239174a |= 2;
            C62940bt btVar = C97015t.f271115m;
            C97010o oVar = (C97010o) C97015t.f271114l.createBuilder();
            C63088z zVar = tVar.f278420b;
            oVar.copyOnWrite();
            C97015t tVar2 = (C97015t) oVar.instance;
            zVar.getClass();
            tVar2.f271117a |= 4;
            tVar2.f271120d = zVar;
            mVar.mo58885m(btVar, (C97015t) oVar.build());
            int a2 = C99493q.m165017a(tVar.f278422d);
            if (a2 != 0) {
                i = a2;
            }
            int i4 = i - 1;
            if (i4 == 0) {
                C88465o oVar2 = C88465o.UNKNOWN_CLIENT;
                mVar.copyOnWrite();
                C88474x xVar4 = (C88474x) mVar.instance;
                xVar4.f239180g = oVar2.f239158d;
                xVar4.f239174a |= 32;
            } else if (i4 != 2) {
                C88465o oVar3 = C88465o.SPORTS_CLIENT;
                mVar.copyOnWrite();
                C88474x xVar5 = (C88474x) mVar.instance;
                xVar5.f239180g = oVar3.f239158d;
                xVar5.f239174a |= 32;
            } else {
                C88465o oVar4 = C88465o.FINANCE_CLIENT;
                mVar.copyOnWrite();
                C88474x xVar6 = (C88474x) mVar.instance;
                xVar6.f239180g = oVar4.f239158d;
                xVar6.f239174a |= 32;
            }
            return C58833ax.m90834k((C88474x) mVar.build());
        } else {
            throw new AssertionError();
        }
    }
}
