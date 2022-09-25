package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58495hd;
import com.google.protos.p4880aq.C63732au;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4880aq.C63744bf;
import com.google.protos.p4880aq.C63745bg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bg */
/* compiled from: PG */
public final /* synthetic */ class C136952bg implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C63744bf f372719a;

    /* renamed from: b */
    public final /* synthetic */ C63926bm f372720b;

    public /* synthetic */ C136952bg(C63744bf bfVar, C63926bm bmVar) {
        this.f372719a = bfVar;
        this.f372720b = bmVar;
    }

    public final Object apply(Object obj) {
        C63733av avVar;
        C63745bg bgVar;
        C63744bf bfVar;
        C63744bf bfVar2 = this.f372719a;
        C63926bm bmVar = this.f372720b;
        C137007dh dhVar = (C137007dh) obj;
        C58495hd hdVar = C136958bm.f372739g;
        C63926bm a = C63926bm.m96318a(dhVar.f372874d);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        if (dhVar.f372872b == 1) {
            avVar = (C63733av) dhVar.f372873c;
        } else {
            avVar = C63733av.f172308c;
        }
        if (avVar.f172310a == 4) {
            bgVar = (C63745bg) avVar.f172311b;
        } else {
            bgVar = C63745bg.f172450e;
        }
        if (bgVar.f172452a == 1) {
            bfVar = C63744bf.m96298a(((Integer) bgVar.f172453b).intValue());
            if (bfVar == null) {
                bfVar = C63744bf.TARGET_UNKNOWN;
            }
        } else {
            bfVar = C63744bf.TARGET_UNKNOWN;
        }
        if (C63732au.m96291a(avVar.f172310a) == C63732au.TOOLTIP && bfVar != C63744bf.TARGET_UNKNOWN && bfVar == bfVar2 && a != C63926bm.UNSPECIFIED && a == bmVar) {
            if ((dhVar.f372872b == 1 ? (C63733av) dhVar.f372873c : C63733av.f172308c).f172310a != 6) {
                return dhVar;
            }
        }
        return C137007dh.f372869h;
    }
}
