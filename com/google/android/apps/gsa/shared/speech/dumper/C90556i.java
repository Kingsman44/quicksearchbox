package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.i */
/* compiled from: PG */
public final /* synthetic */ class C90556i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C90556i f253155a = new C90556i();

    private /* synthetic */ C90556i() {
    }

    public final Object apply(Object obj) {
        C60675yr yrVar = (C60675yr) obj;
        long j = yrVar.f164604h;
        C60673yp ypVar = (C60673yp) yrVar.toBuilder();
        long j2 = yrVar.f164604h;
        ypVar.copyOnWrite();
        C60675yr yrVar2 = (C60675yr) ypVar.instance;
        yrVar2.f164597a |= 64;
        yrVar2.f164604h = j2 + 1;
        return (C60675yr) ypVar.build();
    }
}
