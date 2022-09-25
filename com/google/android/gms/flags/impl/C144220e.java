package com.google.android.gms.flags.impl;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.e */
/* compiled from: PG */
final class C144220e implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f390649a;

    public C144220e(Context context) {
        this.f390649a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.f390649a.getSharedPreferences("google_sdk_flags", 0);
    }
}
