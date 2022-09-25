package com.google.protos.p4985f.p5020k;

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

/* renamed from: com.google.protos.f.k.ac */
/* compiled from: PG */
final class C64901ac implements C18204ah {

    /* renamed from: a */
    private static final C65686l f175810a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.media.LocalMediaStateService";
        f175810a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C64899aa aaVar = (C64899aa) aoVar;
        if (((str.hashCode() == 186643138 && str.equals("GetLocalMediaState")) ? (char) 0 : 65535) == 0) {
            C64947x xVar = (C64947x) C18214ar.m35469b(sVar, C64947x.f175892a.getParserForType());
            return C18209am.m35463a(aaVar.mo59318b(), C64900ab.f175809a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C64902ad adVar = (C64902ad) C64903ae.f175811c.createBuilder();
        adVar.copyOnWrite();
        C64903ae aeVar = (C64903ae) adVar.instance;
        hVar.getClass();
        aeVar.f175814b = hVar;
        aeVar.f175813a |= 1;
        return (C64903ae) adVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f175810a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == 186643138 && str.equals("GetLocalMediaState")) ? (char) 0 : 65535) == 0) {
            return "assistant.media.GetLocalMediaStateRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == 186643138 && str.equals("GetLocalMediaState")) ? (char) 0 : 65535) == 0) {
            return "assistant.media.LocalMediaState";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
