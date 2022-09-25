package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p834a;

import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C52411qt;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12719b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C12719b f39813a = new C12719b();

    private /* synthetic */ C12719b() {
    }

    public final Object apply(Object obj) {
        C52411qt qtVar = (C52411qt) obj;
        C59071e eVar = C12720c.f39814a;
        if ((qtVar.f137534a & 1) != 0) {
            C59104x b = C12720c.f39814a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SdkActionsPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(44412)).mo56389s("Execution result in DeviceResult json: %s", qtVar.f137535b);
        }
        return C22402a.m41821a("device_result", "assistant.api.client_op.DeviceResult", qtVar);
    }
}
