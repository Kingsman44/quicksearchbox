package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.t */
/* compiled from: PG */
public final /* synthetic */ class C130301t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130158ah f357171a;

    public /* synthetic */ C130301t(C130158ah ahVar) {
        this.f357171a = ahVar;
    }

    public final Object apply(Object obj) {
        C130158ah ahVar = this.f357171a;
        C128258a aVar = C128258a.UNKNOWN;
        int ordinal = ((C128258a) obj).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ahVar.mo109540e();
                ahVar.mo109541f(false);
                C58976aa aaVar = C58975e.f156826a;
                return null;
            } else if (ordinal == 2) {
                C58976aa aaVar2 = C58975e.f156826a;
                ahVar.f356879p.mo109082c();
                return null;
            } else if (ordinal != 3) {
                return null;
            }
        }
        C59104x d = C130158ah.f356856a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ResponseLayerFragment");
        ((C59052c) ((C59052c) d).mo56372aa(38746)).mo56386p("ERROR");
        return null;
    }
}
