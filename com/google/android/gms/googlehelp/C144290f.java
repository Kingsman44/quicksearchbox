package com.google.android.gms.googlehelp;

import android.content.Intent;

/* renamed from: com.google.android.gms.googlehelp.f */
/* compiled from: PG */
public final /* synthetic */ class C144290f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C144291g f390813a;

    /* renamed from: b */
    public final /* synthetic */ Intent f390814b;

    public /* synthetic */ C144290f(C144291g gVar, Intent intent) {
        this.f390813a = gVar;
        this.f390814b = intent;
    }

    public final void run() {
        C144291g gVar = this.f390813a;
        gVar.f390815a.startActivity(this.f390814b);
    }
}
