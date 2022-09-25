package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9290f.C122878e;
import com.google.android.libraries.assistant.gallium.framework.C18204ah;
import java.util.HashMap;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5533i.C70861ai;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.l */
/* compiled from: PG */
public final class C18266l {
    /* renamed from: a */
    public static C70716eu m35581a(C70716eu euVar, C18204ah ahVar) {
        C70715et etVar = new C70715et(euVar.f188456a);
        for (C70338di diVar : euVar.f188457b) {
            C18251ai aiVar = new C18251ai(ahVar.mo23686d(C70338di.m102601b(diVar.f187497b)));
            C18252aj ajVar = new C18252aj(ahVar.mo23687e(C70338di.m102601b(diVar.f187497b)));
            C70335df d = C70338di.m102603d();
            d.f187485a = aiVar;
            d.f187486b = ajVar;
            d.f187487c = diVar.f187496a;
            d.f187488d = diVar.f187497b;
            boolean z = diVar.f187501f;
            d.f187489e = diVar.f187502g;
            etVar.mo62433a(d.mo62040a());
        }
        return new C70716eu(etVar);
    }

    /* renamed from: b */
    public static C70711ep m35582b(C70716eu euVar, C122878e eVar) {
        C70705ej ejVar;
        String str = euVar.f188456a;
        HashMap hashMap = new HashMap();
        for (C70338di diVar : euVar.f188457b) {
            C70337dh dhVar = C70337dh.UNARY;
            int ordinal = diVar.f187496a.ordinal();
            if (ordinal != 0) {
                ejVar = ordinal != 3 ? null : C70861ai.m103722a(new C18280z(eVar, euVar.f188456a, C70338di.m102601b(diVar.f187497b), (String) null));
            } else {
                ejVar = C70861ai.m103725d(new C18246ad(euVar, (String) null, diVar, eVar));
            }
            if (ejVar != null) {
                C70710eo.m103394b(diVar, ejVar, str, (C70716eu) null, hashMap);
            }
        }
        return C70710eo.m103393a(str, (C70716eu) null, hashMap);
    }
}
