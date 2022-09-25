package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.p */
/* compiled from: PG */
public final /* synthetic */ class C90563p implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90563p f253162a = new C90563p();

    private /* synthetic */ C90563p() {
    }

    public final Object apply(Object obj) {
        C60675yr yrVar = (C60675yr) obj;
        long j = yrVar.f164606j;
        C60673yp ypVar = (C60673yp) yrVar.toBuilder();
        long j2 = yrVar.f164606j;
        ypVar.copyOnWrite();
        C60675yr yrVar2 = (C60675yr) ypVar.instance;
        yrVar2.f164597a |= 256;
        yrVar2.f164606j = j2 + 1;
        return (C60675yr) ypVar.build();
    }
}
