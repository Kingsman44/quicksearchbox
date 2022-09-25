package com.google.android.apps.gsa.nga.shared.android;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.d */
/* compiled from: PG */
public final /* synthetic */ class C80948d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C80953i f221943a;

    /* renamed from: b */
    public final /* synthetic */ Intent f221944b;

    public /* synthetic */ C80948d(C80953i iVar, Intent intent) {
        this.f221943a = iVar;
        this.f221944b = intent;
    }

    public final void run() {
        this.f221943a.accept(this.f221944b);
    }
}
