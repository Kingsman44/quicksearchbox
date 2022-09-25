package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.android.libraries.assistant.gallium.framework.C18209am;
import com.google.android.libraries.assistant.gallium.framework.C18211ao;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.o */
/* compiled from: PG */
final class C123526o implements C18204ah {

    /* renamed from: a */
    private static final C65686l f341340a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.TeleportIntentGeneratorService";
        f341340a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C123524m mVar = (C123524m) aoVar;
        if (((str.hashCode() == 1875016085 && str.equals("Generate")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(mVar.mo106030a((C123528q) C18214ar.m35469b(sVar, C123528q.f341341e.getParserForType())), C123525n.f341339a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C123531t tVar = (C123531t) C123532u.f341352c.createBuilder();
        tVar.copyOnWrite();
        C123532u uVar = (C123532u) tVar.instance;
        hVar.getClass();
        uVar.f341355b = hVar;
        uVar.f341354a |= 1;
        return (C123532u) tVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f341340a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 1875016085 && str.equals("Generate")) ? (char) 0 : 65535) == 0) {
            return "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.GenerateRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 1875016085 && str.equals("Generate")) ? (char) 0 : 65535) == 0) {
            return "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.GenerateResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
