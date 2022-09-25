package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60672yo;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.x */
/* compiled from: PG */
public final /* synthetic */ class C90571x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f253170a;

    /* renamed from: b */
    public final /* synthetic */ C60672yo f253171b;

    public /* synthetic */ C90571x(int i, C60672yo yoVar) {
        this.f253170a = i;
        this.f253171b = yoVar;
    }

    public final Object apply(Object obj) {
        int i = this.f253170a;
        C60672yo yoVar = this.f253171b;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        yoVar.getClass();
        yrVar.mo57120a();
        yrVar.f164608l.set(i, yoVar);
        return (C60675yr) ypVar.build();
    }
}
