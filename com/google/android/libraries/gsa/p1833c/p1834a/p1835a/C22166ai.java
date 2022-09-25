package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import android.content.IntentFilter;

/* renamed from: com.google.android.libraries.gsa.c.a.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C22166ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22170am f61176a;

    public /* synthetic */ C22166ai(C22170am amVar) {
        this.f61176a = amVar;
    }

    public final void run() {
        C22170am amVar = this.f61176a;
        amVar.f61184e.registerReceiver(amVar.f61182c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        amVar.mo27392a();
    }
}
