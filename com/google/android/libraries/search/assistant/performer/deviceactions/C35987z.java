package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.assistant.p3897e.p3899b.p3901b.C50879f;
import com.google.assistant.p3897e.p3899b.p3901b.C50880g;
import com.google.assistant.p3897e.p3899b.p3901b.C50881h;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.z */
/* compiled from: PG */
public final class C35987z implements C35472h {
    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (dyVar.f135936b.equals("client.RECONNECT")) {
            C50880g gVar = (C50880g) C50881h.f132480c.createBuilder();
            C63088z zVar = ((C50879f) C36183e.m64584b(dyVar, "client_reconnect_args", C50879f.f132476b.getParserForType())).f132478a;
            gVar.copyOnWrite();
            C50881h hVar = (C50881h) gVar.instance;
            zVar.getClass();
            hVar.f132482a = 1 | hVar.f132482a;
            hVar.f132483b = zVar;
            return C60856cj.m92900i(C36180b.m64577a("client_reconnect_result", "assistant.api.client_op.ClientReconnectResult", (C50881h) gVar.build()));
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"client.RECONNECT", dyVar.f135936b}));
    }
}
