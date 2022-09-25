package com.google.android.apps.gsa.staticplugins.opa.continuation;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.continuation.i */
/* compiled from: PG */
public final /* synthetic */ class C108507i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ Context f301907a;

    /* renamed from: b */
    public final /* synthetic */ Intent f301908b;

    public /* synthetic */ C108507i(Context context, Intent intent) {
        this.f301907a = context;
        this.f301908b = intent;
    }

    public final void run() {
        this.f301907a.startActivity(this.f301908b);
    }
}
