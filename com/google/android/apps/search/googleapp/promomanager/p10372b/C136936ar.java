package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.ar */
/* compiled from: PG */
public final /* synthetic */ class C136936ar implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139779t f372688a;

    public /* synthetic */ C136936ar(C139779t tVar) {
        this.f372688a = tVar;
    }

    public final Object apply(Object obj) {
        C139779t tVar = this.f372688a;
        C137007dh dhVar = (C137007dh) obj;
        C58495hd hdVar = C136958bm.f372739g;
        C63926bm a = C63926bm.m96318a(dhVar.f372874d);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        if (a != C63926bm.UNSPECIFIED) {
            C63926bm a2 = C63926bm.m96318a(dhVar.f372874d);
            if (a2 == null) {
                a2 = C63926bm.UNSPECIFIED;
            }
            if (a2 == C136958bm.f372739g.getOrDefault(tVar, C63926bm.UNSPECIFIED)) {
                return dhVar;
            }
        }
        return C137007dh.f372869h;
    }
}
