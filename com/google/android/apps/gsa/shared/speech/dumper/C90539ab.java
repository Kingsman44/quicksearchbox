package com.google.android.apps.gsa.shared.speech.dumper;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60673yp;
import com.google.common.p4552o.C60675yr;

/* renamed from: com.google.android.apps.gsa.shared.speech.dumper.ab */
/* compiled from: PG */
public final /* synthetic */ class C90539ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f253123a;

    public /* synthetic */ C90539ab(String str) {
        this.f253123a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f253123a;
        C60673yp ypVar = (C60673yp) ((C60675yr) obj).toBuilder();
        ypVar.copyOnWrite();
        C60675yr yrVar = (C60675yr) ypVar.instance;
        yrVar.f164597a |= 32768;
        yrVar.f164613q = str;
        return (C60675yr) ypVar.build();
    }
}
