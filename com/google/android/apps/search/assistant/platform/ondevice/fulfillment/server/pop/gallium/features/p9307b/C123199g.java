package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

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

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.g */
/* compiled from: PG */
final class C123199g implements C18204ah {

    /* renamed from: a */
    private static final C65686l f340899a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.annotators.AnnotatorService";
        f340899a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C123197e eVar = (C123197e) aoVar;
        if (((str.hashCode() == -585018004 && str.equals("Annotate")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(eVar.mo105906a((C123201i) C18214ar.m35469b(sVar, C123201i.f340900d.getParserForType())), C123198f.f340898a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C123204l lVar = (C123204l) C123205m.f340910c.createBuilder();
        lVar.copyOnWrite();
        C123205m mVar = (C123205m) lVar.instance;
        hVar.getClass();
        mVar.f340913b = hVar;
        mVar.f340912a |= 1;
        return (C123205m) lVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f340899a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == -585018004 && str.equals("Annotate")) ? (char) 0 : 65535) == 0) {
            return "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.annotators.AnnotationRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == -585018004 && str.equals("Annotate")) ? (char) 0 : 65535) == 0) {
            return "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.annotators.AnnotationResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
