package com.google.android.libraries.storage.protostore;

import android.net.Uri;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.storage.protostore.di */
/* compiled from: PG */
public final /* synthetic */ class C42973di implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42981dq f112403a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112404b;

    public /* synthetic */ C42973di(C42981dq dqVar, C60870cx cxVar) {
        this.f112403a = dqVar;
        this.f112404b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C42981dq dqVar = this.f112403a;
        C60870cx cxVar = this.f112404b;
        dqVar.mo46031c((Uri) C60856cj.m92909r(dqVar.f112415a), obj);
        synchronized (dqVar.f112419e) {
            dqVar.f112420f = cxVar;
        }
        return C60866ct.f164955a;
    }
}
