package com.google.frameworks.client.data.android.server.tiktok;

import androidx.lifecycle.C2395z;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.h */
/* compiled from: PG */
class C61593h extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f166451b;

    /* renamed from: c */
    private final Object f166452c = new Object();

    /* renamed from: d */
    private boolean f166453d = false;

    /* renamed from: a */
    public final C68326i mo58140a() {
        if (this.f166451b == null) {
            synchronized (this.f166452c) {
                if (this.f166451b == null) {
                    this.f166451b = new C68326i(this);
                }
            }
        }
        return this.f166451b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo58140a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f166453d) {
            this.f166453d = true;
            InteractorProcessEndpointService interactorProcessEndpointService = (InteractorProcessEndpointService) this;
            amb amb = (amb) mo58140a().mo17653jN();
            interactorProcessEndpointService.f166408b = amb.mo65957u();
            interactorProcessEndpointService.f166409c = (C70237q) amb.f197783ac.mo17428b();
            interactorProcessEndpointService.f166410d = (C70229i) amb.f197807b.bw.mo17428b();
        }
        super.onCreate();
    }
}
