package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.common.p4522b.C58468gd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ag */
/* compiled from: PG */
public final /* synthetic */ class C22049ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f60776a;

    public /* synthetic */ C22049ag(C60870cx cxVar) {
        this.f60776a = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar = this.f60776a;
        C58468gd gdVar = C22063au.f60791a;
        if (!((Boolean) obj).booleanValue()) {
            return cxVar;
        }
        cxVar.cancel(true);
        return C60856cj.m92900i(C22104g.f60920i);
    }
}
