package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ah */
/* compiled from: PG */
public final /* synthetic */ class C31689ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31690ai f85208a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f85209b;

    public /* synthetic */ C31689ah(C31690ai aiVar, C60870cx cxVar) {
        this.f85208a = aiVar;
        this.f85209b = cxVar;
    }

    public final void run() {
        C31690ai aiVar = this.f85208a;
        try {
            C60856cj.m92909r(this.f85209b);
        } catch (Exception e) {
            String str = aiVar.f85195c;
            Log.w("MobStoreFlagStore", "Failed to store account on flag read for: " + str + " which may lead to stale flags.", e);
        }
    }
}
