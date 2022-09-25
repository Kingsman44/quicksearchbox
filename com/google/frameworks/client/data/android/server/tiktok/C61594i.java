package com.google.frameworks.client.data.android.server.tiktok;

import androidx.lifecycle.C2395z;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.i */
/* compiled from: PG */
class C61594i extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f166454b;

    /* renamed from: c */
    private final Object f166455c = new Object();

    /* renamed from: d */
    private boolean f166456d = false;

    /* renamed from: a */
    public final C68326i mo58141a() {
        if (this.f166454b == null) {
            synchronized (this.f166455c) {
                if (this.f166454b == null) {
                    this.f166454b = new C68326i(this);
                }
            }
        }
        return this.f166454b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo58141a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f166456d) {
            this.f166456d = true;
            SearchProcessEndpointService searchProcessEndpointService = (SearchProcessEndpointService) this;
            amb amb = (amb) mo58141a().mo17653jN();
            searchProcessEndpointService.f166411b = amb.mo65957u();
            searchProcessEndpointService.f166412c = (C70237q) amb.f197783ac.mo17428b();
            searchProcessEndpointService.f166413d = (C70229i) amb.f197807b.bw.mo17428b();
        }
        super.onCreate();
    }
}
