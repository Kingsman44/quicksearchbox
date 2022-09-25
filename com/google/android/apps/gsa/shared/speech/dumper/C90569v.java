package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.v */
/* compiled from: PG */
public final /* synthetic */ class C90569v implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90569v f253168a = new C90569v();

    private /* synthetic */ C90569v() {
    }

    public final Object apply(Object obj) {
        C60675yr yrVar = (C60675yr) obj;
        long j = yrVar.f164605i;
        C60673yp ypVar = (C60673yp) yrVar.toBuilder();
        long j2 = yrVar.f164605i;
        ypVar.copyOnWrite();
        C60675yr yrVar2 = (C60675yr) ypVar.instance;
        yrVar2.f164597a |= 128;
        yrVar2.f164605i = j2 + 1;
        return (C60675yr) ypVar.build();
    }
}
