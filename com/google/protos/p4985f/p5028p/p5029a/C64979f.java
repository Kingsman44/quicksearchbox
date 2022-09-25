package com.google.protos.p4985f.p5028p.p5029a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5127o.C65682h;
import com.google.protos.p5127o.C65685k;
import com.google.protos.p5127o.C65686l;

/* renamed from: com.google.protos.f.p.a.f */
/* compiled from: PG */
public final class C64979f {

    /* renamed from: a */
    private final C18231d f175967a;

    /* renamed from: b */
    private final C65682h f175968b;

    static {
        C65685k kVar = (C65685k) C65686l.f178470d.createBuilder();
        kVar.copyOnWrite();
        C65686l lVar = (C65686l) kVar.instance;
        lVar.f178472a |= 1;
        lVar.f178473b = "assistant.nucleus.gallium.NucleusService";
        C65686l lVar2 = (C65686l) kVar.build();
    }

    public C64979f(C18231d dVar, C65682h hVar) {
        this.f175967a = dVar;
        this.f175968b = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo59322a(C18238f fVar, C79885g gVar) {
        return this.f175967a.mo23657a(C18231d.f51786a, this.f175968b, "Predict", gVar, "type.googleapis.com/nga.model.common.ModelRequest", C79891m.f218975e.getParserForType(), fVar);
    }
}
