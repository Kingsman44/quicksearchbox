package com.google.assistant.p4003x.p4004a.p4005a;

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

/* renamed from: com.google.assistant.x.a.a.c */
/* compiled from: PG */
final class C53513c implements C18204ah {

    /* renamed from: a */
    private static final C65686l f140453a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.frontend.v1.YoutubeAssistantFrontendProxyService";
        f140453a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C53509a aVar = (C53509a) aoVar;
        if (((str.hashCode() == 425859047 && str.equals("GetYoutubeAssistantAction")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(aVar.mo53988a((C53520j) C18214ar.m35469b(sVar, C53520j.f140460a.getParserForType())), C53512b.f140452a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C53517g gVar = (C53517g) C53518h.f140456c.createBuilder();
        gVar.copyOnWrite();
        C53518h hVar2 = (C53518h) gVar.instance;
        hVar.getClass();
        hVar2.f140459b = hVar;
        hVar2.f140458a |= 1;
        return (C53518h) gVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f140453a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 425859047 && str.equals("GetYoutubeAssistantAction")) ? (char) 0 : 65535) == 0) {
            return "assistant.frontend.v1.YoutubeAssistantOnDeviceRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 425859047 && str.equals("GetYoutubeAssistantAction")) ? (char) 0 : 65535) == 0) {
            return "assistant.frontend.v1.YoutubeAssistantOnDeviceResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
