package com.google.android.apps.gsa.languagepack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C68323g;

/* renamed from: com.google.android.apps.gsa.languagepack.n */
/* compiled from: PG */
class C74625n extends BroadcastReceiver {

    /* renamed from: a */
    private volatile boolean f208796a = false;

    /* renamed from: b */
    private final Object f208797b = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70979a(Context context) {
        if (!this.f208796a) {
            synchronized (this.f208797b) {
                if (!this.f208796a) {
                    ((C74614bt) C68323g.m98667a(context)).mo70973rG((ZipDownloadReceiver) this);
                    this.f208796a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo70979a(context);
    }
}
