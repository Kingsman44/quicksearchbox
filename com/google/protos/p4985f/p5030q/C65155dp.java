package com.google.protos.p4985f.p5030q;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.android.libraries.assistant.gallium.framework.C18209am;
import com.google.android.libraries.assistant.gallium.framework.C18211ao;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;

/* renamed from: com.google.protos.f.q.dp */
/* compiled from: PG */
final class C65155dp implements C18204ah {

    /* renamed from: a */
    private static final C65686l f176334a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.portable.InteractionTypeService";
        f176334a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C65153dn dnVar = (C65153dn) aoVar;
        if (((str.hashCode() == 320800342 && str.equals("GetInteractionType")) ? (char) 0 : 65535) == 0) {
            C62912at atVar = (C62912at) C18214ar.m35469b(sVar, C62912at.f169862a.getParserForType());
            return C18209am.m35463a(dnVar.mo59346a(), C65154do.f176333a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65151dl dlVar = (C65151dl) C65152dm.f176328c.createBuilder();
        dlVar.copyOnWrite();
        C65152dm dmVar = (C65152dm) dlVar.instance;
        hVar.getClass();
        dmVar.f176331b = hVar;
        dmVar.f176330a |= 1;
        return (C65152dm) dlVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f176334a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 320800342 && str.equals("GetInteractionType")) ? (char) 0 : 65535) == 0) {
            return "google.protobuf.Empty";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 320800342 && str.equals("GetInteractionType")) ? (char) 0 : 65535) == 0) {
            return "assistant.portable.GetInteractionTypeResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
