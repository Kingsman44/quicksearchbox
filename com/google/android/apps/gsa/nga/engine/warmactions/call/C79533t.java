package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.t */
/* compiled from: PG */
final class C79533t extends Call.Callback {

    /* renamed from: a */
    final /* synthetic */ C79534u f218248a;

    public C79533t(C79534u uVar) {
        this.f218248a = uVar;
    }

    public final void onStateChanged(Call call, int i) {
        C79534u.m127611a(this.f218248a.f218249a, call, i);
    }
}
