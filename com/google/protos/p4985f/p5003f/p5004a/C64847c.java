package com.google.protos.p4985f.p5003f.p5004a;

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

/* renamed from: com.google.protos.f.f.a.c */
/* compiled from: PG */
final class C64847c implements C18204ah {

    /* renamed from: a */
    private static final C65686l f175736a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.debugging.gallium.DebugLogSinkService";
        f175736a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C64845a aVar = (C64845a) aoVar;
        if (((str.hashCode() == 807659482 && str.equals("SendDebugLogs")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(aVar.mo59316a((C64851g) C18214ar.m35469b(sVar, C64851g.f175741c.getParserForType())), C64846b.f175735a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C64848d dVar = (C64848d) C64849e.f175737c.createBuilder();
        dVar.copyOnWrite();
        C64849e eVar = (C64849e) dVar.instance;
        hVar.getClass();
        eVar.f175740b = hVar;
        eVar.f175739a |= 1;
        return (C64849e) dVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f175736a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 807659482 && str.equals("SendDebugLogs")) ? (char) 0 : 65535) == 0) {
            return "assistant.debugging.gallium.DebugLogs";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 807659482 && str.equals("SendDebugLogs")) ? (char) 0 : 65535) == 0) {
            return "google.protobuf.Empty";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
