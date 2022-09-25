package com.google.frameworks.client.data.android.server.tiktok;

import androidx.lifecycle.C2395z;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.j */
/* compiled from: PG */
class C61595j extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f166457b;

    /* renamed from: c */
    private final Object f166458c = new Object();

    /* renamed from: d */
    private boolean f166459d = false;

    /* renamed from: a */
    public final C68326i mo58142a() {
        if (this.f166457b == null) {
            synchronized (this.f166458c) {
                if (this.f166457b == null) {
                    this.f166457b = new C68326i(this);
                }
            }
        }
        return this.f166457b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo58142a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f166459d) {
            this.f166459d = true;
            TrainProcessEndpointService trainProcessEndpointService = (TrainProcessEndpointService) this;
            amb amb = (amb) mo58142a().mo17653jN();
            trainProcessEndpointService.f166414b = amb.mo65957u();
            trainProcessEndpointService.f166415c = (C70237q) amb.f197783ac.mo17428b();
            trainProcessEndpointService.f166416d = (C70229i) amb.f197807b.bw.mo17428b();
        }
        super.onCreate();
    }
}
