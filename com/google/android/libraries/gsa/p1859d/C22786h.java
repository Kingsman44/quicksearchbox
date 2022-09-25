package com.google.android.libraries.gsa.p1859d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.libraries.gsa.d.h */
/* compiled from: PG */
final class C22786h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C22791m f62728a;

    public C22786h(C22791m mVar) {
        this.f62728a = mVar;
    }

    public final void onReceive(Context context, Intent intent) {
        intent.getData();
        this.f62728a.f62745f.mo28148d();
        this.f62728a.f62746g.mo28148d();
        this.f62728a.mo28136e(context);
        C22791m mVar = this.f62728a;
        if ((mVar.f62749j & 2) != 0) {
            mVar.mo28134c();
        }
    }
}
