package com.google.protos.p5127o.p5128a;

import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import com.google.android.libraries.assistant.gallium.framework.C18209am;
import com.google.android.libraries.assistant.gallium.framework.C18211ao;
import com.google.android.libraries.assistant.gallium.framework.C18214ar;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18237e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;
import com.google.protos.p5127o.C65693s;

/* renamed from: com.google.protos.o.a.o */
/* compiled from: PG */
final class C65634o implements C18204ah {

    /* renamed from: a */
    private static final C65686l f178354a;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "gallium.api.ContactInterface";
        f178354a = (C65686l) kVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo23683a(C18211ao aoVar, C18231d dVar, String str, C65693s sVar) {
        C65632m mVar = (C65632m) aoVar;
        if (((str.hashCode() == -1602058970 && str.equals("LookupContact")) ? (char) 0 : 65535) == 0) {
            return C18209am.m35463a(mVar.mo39645b(new C18237e(), (C65625f) C18214ar.m35469b(sVar, C65625f.f178332e.getParserForType())), C65633n.f178353a, str);
        }
        throw C18218av.m35478a(5, String.valueOf(str).concat(" not found"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ MessageLite mo23684b(C65682h hVar) {
        C65622c cVar = (C65622c) C65623d.f178328c.createBuilder();
        cVar.copyOnWrite();
        C65623d dVar = (C65623d) cVar.instance;
        hVar.getClass();
        dVar.f178331b = hVar;
        dVar.f178330a |= 1;
        return (C65623d) cVar.build();
    }

    /* renamed from: c */
    public final C65686l mo23685c() {
        return f178354a;
    }

    /* renamed from: d */
    public final String mo23686d(String str) {
        if (((str.hashCode() == -1602058970 && str.equals("LookupContact")) ? (char) 0 : 65535) == 0) {
            return "gallium.api.ContactLookupRequest";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    public final String mo23687e(String str) {
        if (((str.hashCode() == -1602058970 && str.equals("LookupContact")) ? (char) 0 : 65535) == 0) {
            return "gallium.api.ContactLookupResponse";
        }
        throw new IllegalArgumentException("Unknown method".concat(String.valueOf(str)));
    }
}
