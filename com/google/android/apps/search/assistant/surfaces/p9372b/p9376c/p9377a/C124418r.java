package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.r */
/* compiled from: PG */
public final /* synthetic */ class C124418r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ boolean f343381a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343382b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f343383c;

    public /* synthetic */ C124418r(boolean z, C60870cx cxVar, C60870cx cxVar2) {
        this.f343381a = z;
        this.f343382b = cxVar;
        this.f343383c = cxVar2;
    }

    public final Object call() {
        boolean z = this.f343381a;
        C60870cx cxVar = this.f343382b;
        C60870cx cxVar2 = this.f343383c;
        if (z && ((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            return C51333dv.SIGNED_IN_AND_OPTED_IN;
        }
        if (((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            return C51333dv.SIGNED_OUT;
        }
        return C51333dv.UNKNOWN_USER_CREDENTIAL_STATUS;
    }
}
