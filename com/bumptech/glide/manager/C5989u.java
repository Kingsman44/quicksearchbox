package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bumptech.glide.p291h.C5624k;

/* renamed from: com.bumptech.glide.manager.u */
/* compiled from: PG */
final class C5989u implements C5624k {

    /* renamed from: a */
    final /* synthetic */ Context f17661a;

    public C5989u(Context context) {
        this.f17661a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12074a() {
        return (ConnectivityManager) this.f17661a.getSystemService("connectivity");
    }
}
