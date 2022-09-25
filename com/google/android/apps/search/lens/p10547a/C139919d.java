package com.google.android.apps.search.lens.p10547a;

import android.app.KeyguardManager;
import android.content.Intent;

/* renamed from: com.google.android.apps.search.lens.a.d */
/* compiled from: PG */
final class C139919d extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Intent f380360a;

    /* renamed from: b */
    final /* synthetic */ C139920e f380361b;

    public C139919d(C139920e eVar, Intent intent) {
        this.f380361b = eVar;
        this.f380360a = intent;
    }

    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        this.f380361b.f380362a.startActivity(this.f380360a);
    }
}
