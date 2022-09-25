package com.google.android.apps.gsa.shared.p6968aa;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.gsa.shared.aa.bo */
/* compiled from: PG */
public final class C89044bo extends C60873d {

    /* renamed from: a */
    private final C60870cx f241321a;

    public C89044bo(C60870cx cxVar) {
        this.f241321a = cxVar;
        C60856cj.m92911t(cxVar, new C89043bn(this), C60826bg.f164896a);
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f241321a.cancel(z);
        }
        return cancel;
    }
}
