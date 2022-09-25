package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import com.google.android.libraries.phenotype.client.p2420a.C31640h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ad */
/* compiled from: PG */
public final /* synthetic */ class C31685ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C31690ai f85204a;

    public /* synthetic */ C31685ad(C31690ai aiVar) {
        this.f85204a = aiVar;
    }

    public final C60870cx apply(Object obj) {
        C31690ai aiVar = this.f85204a;
        C31640h hVar = (C31640h) obj;
        if (hVar.f85133a == 29501) {
            String str = aiVar.f85195c;
            Log.w("MobStoreFlagStore", "Failed to commit due to stale snapshot for " + str + ", triggering flag update.", hVar);
            aiVar.mo37322c();
        }
        return C60856cj.m92899h(hVar);
    }
}
