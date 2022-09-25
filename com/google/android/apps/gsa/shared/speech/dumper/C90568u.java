package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.u */
/* compiled from: PG */
public final /* synthetic */ class C90568u implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90568u f253167a = new C90568u();

    private /* synthetic */ C90568u() {
    }

    public final Object apply(Object obj) {
        C60675yr yrVar = (C60675yr) obj;
        long j = yrVar.f164607k;
        C60673yp ypVar = (C60673yp) yrVar.toBuilder();
        long j2 = yrVar.f164607k;
        ypVar.copyOnWrite();
        C60675yr yrVar2 = (C60675yr) ypVar.instance;
        yrVar2.f164597a |= 512;
        yrVar2.f164607k = j2 + 1;
        return (C60675yr) ypVar.build();
    }
}
