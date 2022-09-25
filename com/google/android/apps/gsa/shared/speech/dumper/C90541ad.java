package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.ad */
/* compiled from: PG */
public final /* synthetic */ class C90541ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f253125a;

    public /* synthetic */ C90541ad(boolean z) {
        this.f253125a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f253125a;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        int i = true != z ? 3 : 2;
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        yrVar.f164614r = i - 1;
        yrVar.f164597a |= 65536;
        return (C60675yr) ypVar.build();
    }
}
