package com.google.protos.p5127o.p5128a;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.common.util.concurrent.C60870cx;
import com.google.nlp.p4730a.C62799s;
import com.google.nlp.p4730a.C62801u;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.o.a.z */
/* compiled from: PG */
public final class C65645z {

    /* renamed from: a */
    private final C18231d f178374a;

    /* renamed from: b */
    private final C65682h f178375b;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "gallium.api.GenXInterface";
        C65686l lVar2 = (C65686l) kVar.build();
    }

    private C65645z(C18231d dVar, C65682h hVar) {
        this.f178374a = dVar;
        this.f178375b = hVar;
    }

    /* renamed from: b */
    public static C65645z m96775b(C18231d dVar, C65639t tVar) {
        C65682h hVar = tVar.f178363b;
        if (hVar == null) {
            hVar = C65682h.f178459f;
        }
        return new C65645z(dVar, hVar);
    }

    /* renamed from: a */
    public final C60870cx mo59416a(C18238f fVar, C62799s sVar) {
        return this.f178374a.mo23657a(C18231d.f51786a, this.f178375b, "Realize", sVar, "type.googleapis.com/nlp_generation.RealizationRequest", C62801u.f169598d.getParserForType(), fVar);
    }
}
