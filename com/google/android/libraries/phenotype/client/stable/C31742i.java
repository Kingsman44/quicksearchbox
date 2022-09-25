package com.google.android.libraries.phenotype.client.stable;

import android.util.Log;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.phenotype.client.stable.i */
/* compiled from: PG */
public final /* synthetic */ class C31742i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31760t f85328a;

    /* renamed from: b */
    public final /* synthetic */ String f85329b;

    public /* synthetic */ C31742i(C31760t tVar, String str) {
        this.f85328a = tVar;
        this.f85329b = str;
    }

    public final void run() {
        C31760t tVar = this.f85328a;
        String str = this.f85329b;
        C58833ax axVar = C31743j.f85330a;
        if (!C31691aj.m59034a(tVar.f85364a).containsKey(str)) {
            Log.e("PhenotypeCombinedFlags", "Config package " + str + " cannot use PROCESS_STABLE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
        }
    }
}
