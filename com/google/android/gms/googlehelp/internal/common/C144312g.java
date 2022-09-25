package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.googlehelp.internal.common.g */
/* compiled from: PG */
public final /* synthetic */ class C144312g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f390845a;

    /* renamed from: b */
    public final /* synthetic */ Intent f390846b;

    public /* synthetic */ C144312g(Activity activity, Intent intent) {
        this.f390845a = activity;
        this.f390846b = intent;
    }

    public final void run() {
        this.f390845a.startActivityForResult(this.f390846b, 123);
    }
}
