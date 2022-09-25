package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.appdatasearch.C142805b;
import com.google.android.gms.appdatasearch.C142819p;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.d */
/* compiled from: PG */
public final class C93272d extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C93276h f260101a;

    public C93272d(C93276h hVar) {
        this.f260101a = hVar;
    }

    public final void onReceive(Context context, Intent intent) {
        GetRecentContextCall$Request a = C142819p.m231754a(true);
        this.f260101a.f260107c.mo119131f();
        C142805b.f387603c.mo117684a(this.f260101a.f260107c, a).mo117321f(new C93275g(this.f260101a));
    }
}
