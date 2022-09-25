package com.google.protos.p5127o.p5128a;

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

/* renamed from: com.google.protos.o.a.ah */
/* compiled from: PG */
final class C65615ah implements C18204ah {

    /* renamed from: a */
    private static final C65686l f178319a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "gallium.api.SurveyTriggerService";
        f178319a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C65613af afVar = (C65613af) aoVar;
        if (((str.hashCode() == 82539 && str.equals("Run")) ? (char) 0 : 65535) == 0) {
            C65618ak akVar = (C65618ak) C18214ar.m35469b(sVar, C65618ak.f178322a.getParserForType());
            return C18209am.m35463a(afVar.mo59410a(), C65614ag.f178318a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65619al alVar = (C65619al) C65620am.f178324c.createBuilder();
        alVar.copyOnWrite();
        C65620am amVar = (C65620am) alVar.instance;
        hVar.getClass();
        amVar.f178327b = hVar;
        amVar.f178326a |= 1;
        return (C65620am) alVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f178319a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 82539 && str.equals("Run")) ? (char) 0 : 65535) == 0) {
            return "gallium.api.SurveyTriggerRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 82539 && str.equals("Run")) ? (char) 0 : 65535) == 0) {
            return "assistant.verticals.survey.portable.SurveyTriggerResult";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
