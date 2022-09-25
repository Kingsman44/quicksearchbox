package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.p2236d.C29116fd;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4566l.C60140be;
import com.google.common.p4552o.p4566l.C60141bf;

/* renamed from: com.google.android.libraries.mdi.download.d.e.f */
/* compiled from: PG */
public final /* synthetic */ class C29039f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C60140be f78830a;

    public /* synthetic */ C29039f(C60140be beVar) {
        this.f78830a = beVar;
    }

    public final Object apply(Object obj) {
        C60140be beVar = this.f78830a;
        C29116fd fdVar = (C29116fd) obj;
        if (fdVar == C29116fd.DOWNLOADED || fdVar == C29116fd.PENDING) {
            beVar.copyOnWrite();
            C60141bf bfVar = (C60141bf) beVar.instance;
            C60141bf bfVar2 = C60141bf.f162684f;
            bfVar.f162687b = 2;
            bfVar.f162686a |= 1;
        } else {
            beVar.copyOnWrite();
            C60141bf bfVar3 = (C60141bf) beVar.instance;
            C60141bf bfVar4 = C60141bf.f162684f;
            bfVar3.f162687b = 3;
            bfVar3.f162686a |= 1;
        }
        return (C60141bf) beVar.build();
    }
}
