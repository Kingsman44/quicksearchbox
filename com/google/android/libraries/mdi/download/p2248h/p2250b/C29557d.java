package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.h.b.d */
/* compiled from: PG */
public final /* synthetic */ class C29557d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f80094a;

    public /* synthetic */ C29557d(C60870cx cxVar) {
        this.f80094a = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar = this.f80094a;
        C28803cr crVar = (C28803cr) obj;
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C28798cm cmVar = (C28798cm) ((C28803cr) guVar.get(i)).toBuilder();
            cmVar.mergeFrom(crVar);
            e.mo55395g((C28803cr) cmVar.build());
        }
        return C60856cj.m92900i(e.mo55394f());
    }
}
