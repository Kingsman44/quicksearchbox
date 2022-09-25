package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.android.apps.gsa.p6482q.p6483a.C84230c;
import com.google.android.apps.gsa.p6482q.p6483a.C84231d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49878ci;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C50163mx;
import com.google.assistant.p3861at.act;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.d */
/* compiled from: PG */
public final /* synthetic */ class C100865d implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C100865d f281847a = new C100865d();

    private /* synthetic */ C100865d() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        act act = (act) obj;
        HashSet c = C100872k.m167105c(act);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            C49879cj cjVar = (C49879cj) it.next();
            C59052c cVar = (C59052c) ((C59052c) C100872k.f281855a.mo56224b()).mo56372aa(19651);
            C49875cf a = C49875cf.m85755a(cjVar.f129638i);
            if (a == null) {
                a = C49875cf.UNKNOWN;
            }
            C49878ci a2 = C49878ci.m85757a(cjVar.f129632c);
            if (a2 == null) {
                a2 = C49878ci.USER_TYPE_UNKNOWN;
            }
            cVar.mo56354G("device type: %s; firstUserType: %s", a, a2);
        }
        C84230c d = C84231d.m134279d();
        C50163mx mxVar = act.f128888O;
        if (mxVar == null) {
            mxVar = C50163mx.f130405e;
        }
        d.mo77685c(mxVar);
        d.mo77684b(C58485gu.m89842j(c));
        return d.mo77683a();
    }
}
