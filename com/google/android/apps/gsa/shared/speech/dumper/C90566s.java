package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.s */
/* compiled from: PG */
public final /* synthetic */ class C90566s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f253165a;

    public /* synthetic */ C90566s(long j) {
        this.f253165a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f253165a;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        yrVar.f164597a |= 1;
        yrVar.f164598b = j;
        return (C60675yr) ypVar.build();
    }
}
