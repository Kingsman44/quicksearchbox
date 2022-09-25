package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.db */
/* compiled from: PG */
public final /* synthetic */ class C137001db implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C137001db f372835a = new C137001db();

    private /* synthetic */ C137001db() {
    }

    public final Object apply(Object obj) {
        C137007dh dhVar = (C137007dh) obj;
        C58974d dVar = C137003dd.f372837a;
        C63926bm bmVar = C63926bm.MINUS_ONE;
        C63926bm a = C63926bm.m96318a(dhVar.f372874d);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        if (!bmVar.equals(a)) {
            C63926bm bmVar2 = C63926bm.GOOGLE_APP_BROWSER;
            C63926bm a2 = C63926bm.m96318a(dhVar.f372874d);
            if (a2 == null) {
                a2 = C63926bm.UNSPECIFIED;
            }
            if (!bmVar2.equals(a2) && !C137003dd.m222668v(dhVar) && !C137003dd.m222669w(dhVar)) {
                return dhVar;
            }
        }
        return C137007dh.f372869h;
    }
}
