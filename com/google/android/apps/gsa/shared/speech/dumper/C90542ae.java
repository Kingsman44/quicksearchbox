package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.ae */
/* compiled from: PG */
public final /* synthetic */ class C90542ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ double f253126a;

    public /* synthetic */ C90542ae(double d) {
        this.f253126a = d;
    }

    public final Object apply(Object obj) {
        double d = this.f253126a;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        yrVar.f164597a |= 524288;
        yrVar.f164617u = d;
        return (C60675yr) ypVar.build();
    }
}
