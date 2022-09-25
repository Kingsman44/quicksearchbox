package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.IntentFilter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ak */
/* compiled from: PG */
public final /* synthetic */ class C14796ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14800ao f44579a;

    /* renamed from: b */
    public final /* synthetic */ IntentFilter f44580b;

    public /* synthetic */ C14796ak(C14800ao aoVar, IntentFilter intentFilter) {
        this.f44579a = aoVar;
        this.f44580b = intentFilter;
    }

    public final void run() {
        C14800ao aoVar = this.f44579a;
        aoVar.f44587a.registerReceiver(aoVar.f44590d, this.f44580b);
        C58976aa aaVar = C58975e.f156826a;
    }
}
