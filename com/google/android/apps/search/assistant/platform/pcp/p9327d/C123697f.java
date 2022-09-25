package com.google.android.apps.search.assistant.platform.pcp.p9327d;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.d.f */
/* compiled from: PG */
public final /* synthetic */ class C123697f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C123700i f341666a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f341667b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f341668c;

    public /* synthetic */ C123697f(C123700i iVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f341666a = iVar;
        this.f341667b = cxVar;
        this.f341668c = cxVar2;
    }

    public final Object call() {
        C123700i iVar = this.f341666a;
        C60870cx cxVar = this.f341667b;
        C60870cx cxVar2 = this.f341668c;
        int intValue = ((Integer) C60856cj.m92909r(cxVar)).intValue();
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        boolean z = false;
        if ((iVar.f341674d.mo106108a("android.permission.ACCESS_COARSE_LOCATION") || iVar.f341674d.mo106108a("android.permission.ACCESS_FINE_LOCATION")) && intValue == 1 && booleanValue) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
