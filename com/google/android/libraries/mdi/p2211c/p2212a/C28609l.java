package com.google.android.libraries.mdi.p2211c.p2212a;

import android.content.Context;
import android.content.Intent;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.mdi.c.a.l */
/* compiled from: PG */
public final class C28609l {

    /* renamed from: a */
    private final Context f77834a;

    public C28609l(Context context) {
        this.f77834a = context;
    }

    /* renamed from: a */
    public final void mo34284a(String str) {
        this.f77834a.sendBroadcast(new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(this.f77834a.getPackageName()).putStringArrayListExtra("com.google.android.gms.icing.extra.cache_names", C58597ky.m90212c(str)));
    }
}
