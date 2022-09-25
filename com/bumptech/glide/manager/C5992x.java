package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.net.Network;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.manager.x */
/* compiled from: PG */
final class C5992x extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C5993y f17665a;

    public C5992x(C5993y yVar) {
        this.f17665a = yVar;
    }

    /* renamed from: a */
    private final void m15430a(boolean z) {
        C5632s.m14613f().post(new C5991w(this, z));
    }

    public final void onAvailable(Network network) {
        m15430a(true);
    }

    public final void onLost(Network network) {
        m15430a(false);
    }
}
