package com.google.android.apps.gsa.shared.logger.p7051b;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C59697cl;
import com.google.common.p4552o.C59698cm;

/* renamed from: com.google.android.apps.gsa.shared.logger.b.v */
/* compiled from: PG */
abstract class C89872v implements C58817ah {
    /* renamed from: a */
    public abstract void mo83696a(C89854d dVar, C59697cl clVar);

    /* renamed from: b */
    public abstract void mo83697b(C89854d dVar, C59697cl clVar);

    /* renamed from: c */
    public abstract void mo83698c(C89854d dVar, C59697cl clVar);

    /* renamed from: d */
    public final C59698cm apply(C89854d dVar) {
        C59697cl clVar = (C59697cl) C59698cm.f160165g.createBuilder();
        int e = dVar.mo83695e();
        clVar.copyOnWrite();
        C59698cm cmVar = (C59698cm) clVar.instance;
        int i = e - 1;
        if (e != 0) {
            cmVar.f160168b = i;
            cmVar.f160167a |= 1;
            mo83697b(dVar, clVar);
            C89851ag a = dVar.mo83691a();
            clVar.copyOnWrite();
            C59698cm cmVar2 = (C59698cm) clVar.instance;
            cmVar2.f160170d = a.f246200fb;
            cmVar2.f160167a |= 2;
            if (dVar.mo83693c() != null) {
                mo83698c(dVar, clVar);
            }
            mo83696a(dVar, clVar);
            return (C59698cm) clVar.build();
        }
        throw null;
    }
}
