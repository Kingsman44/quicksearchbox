package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.aw */
/* compiled from: PG */
public final /* synthetic */ class C13739aw implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13739aw f41884a = new C13739aw();

    private /* synthetic */ C13739aw() {
    }

    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C59104x b = C13742az.f41895a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PolicyPicker");
            ((C59052c) ((C59052c) b).mo56372aa(44999)).mo56386p("Device is connected, using hybrid policy.");
            return C13750bc.HYBRID;
        }
        C59104x b2 = C13742az.f41895a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "PolicyPicker");
        ((C59052c) ((C59052c) b2).mo56372aa(44998)).mo56386p("Device is not connected, using offline only policy");
        return C13750bc.OFFLINE_ONLY;
    }
}
