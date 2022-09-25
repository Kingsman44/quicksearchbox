package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ao */
/* compiled from: PG */
public final /* synthetic */ class C35886ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f94010a;

    public /* synthetic */ C35886ao(String str) {
        this.f94010a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f94010a;
        C59104x c = C35887ap.f94011a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WellbeingPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(51824)).mo56386p("Failed to extract results from Sunshine API.");
        return C35887ap.m64281b(str);
    }
}
