package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29329dm;
import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29333dq;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.dt */
/* compiled from: PG */
public final /* synthetic */ class C29003dt implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78751a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f78752b;

    public /* synthetic */ C29003dt(C29117fe feVar, C29334dr drVar) {
        this.f78751a = feVar;
        this.f78752b = drVar;
    }

    public final C60870cx apply(Object obj) {
        long j;
        C29117fe feVar = this.f78751a;
        C29334dr drVar = this.f78752b;
        C29334dr drVar2 = (C29334dr) obj;
        if (drVar2 == null || !C29117fe.m54051r(drVar, drVar2)) {
            j = feVar.f78977f.mo34498a();
        } else {
            C29330dn dnVar = drVar2.f79500b;
            if (dnVar == null) {
                dnVar = C29330dn.f79488g;
            }
            j = dnVar.f79492c;
        }
        C29330dn dnVar2 = drVar.f79500b;
        if (dnVar2 == null) {
            dnVar2 = C29330dn.f79488g;
        }
        C29329dm dmVar = (C29329dm) dnVar2.toBuilder();
        dmVar.copyOnWrite();
        C29330dn dnVar3 = (C29330dn) dmVar.instance;
        dnVar3.f79490a |= 2;
        dnVar3.f79492c = j;
        C29330dn dnVar4 = (C29330dn) dmVar.build();
        C29333dq dqVar = (C29333dq) drVar.toBuilder();
        dqVar.copyOnWrite();
        C29334dr drVar3 = (C29334dr) dqVar.instance;
        dnVar4.getClass();
        drVar3.f79500b = dnVar4;
        drVar3.f79499a |= 1;
        return C60856cj.m92900i((C29334dr) dqVar.build());
    }
}
