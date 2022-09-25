package com.google.android.libraries.gsa.conversation.clientop.communication;

import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.e */
/* compiled from: PG */
public final class C22421e extends C22538o {
    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ("multi_device.CIRCULATE_MDE_STATE".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            return C60856cj.m92900i(C22402a.m41821a("multi_device_execution_notification_payload_args", "google.protobuf.Any", (C63070h) m41992m(dwVar, "multi_device_execution_notification_payload_args", C63070h.f170215c.getParserForType())));
        }
        throw new C22428d(dyVar);
    }
}
