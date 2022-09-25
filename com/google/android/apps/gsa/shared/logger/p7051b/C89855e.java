package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4552o.C59697cl;
import com.google.common.p4552o.C59698cm;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.e */
/* compiled from: PG */
final class C89855e extends C89872v {
    /* renamed from: a */
    public final void mo83696a(C89854d dVar, C59697cl clVar) {
        C89849ae aeVar = dVar.mo83692b().f62786a;
        clVar.copyOnWrite();
        C59698cm cmVar = (C59698cm) clVar.instance;
        C59698cm cmVar2 = C59698cm.f160165g;
        cmVar.f160172f = aeVar.f245884YW;
        cmVar.f160167a |= 8;
    }

    /* renamed from: b */
    public final void mo83697b(C89854d dVar, C59697cl clVar) {
        C58800sl lA = dVar.mo83694d().descendingSet().iterator();
        while (lA.hasNext()) {
            clVar.mo57045a(((C22804a) lA.next()).mo28151c());
        }
    }

    /* renamed from: c */
    public final void mo83698c(C89854d dVar, C59697cl clVar) {
        C22804a c = dVar.mo83693c();
        if (c != null) {
            C89849ae aeVar = c.f62786a;
            clVar.copyOnWrite();
            C59698cm cmVar = (C59698cm) clVar.instance;
            C59698cm cmVar2 = C59698cm.f160165g;
            cmVar.f160171e = aeVar.f245884YW;
            cmVar.f160167a |= 4;
        }
    }
}
