package com.google.frameworks.client.data.android.server.tiktok.aga;

import androidx.lifecycle.C2395z;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import p5488io.grpc.binder.C70229i;
import p5488io.grpc.binder.C70237q;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.aga.f */
/* compiled from: PG */
class C61582f extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f166430b;

    /* renamed from: c */
    private final Object f166431c = new Object();

    /* renamed from: d */
    private boolean f166432d = false;

    /* renamed from: a */
    public final C68326i mo58134a() {
        if (this.f166430b == null) {
            synchronized (this.f166431c) {
                if (this.f166430b == null) {
                    this.f166430b = new C68326i(this);
                }
            }
        }
        return this.f166430b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo58134a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f166432d) {
            this.f166432d = true;
            AssistantProcessEndpointService assistantProcessEndpointService = (AssistantProcessEndpointService) this;
            amb amb = (amb) mo58134a().mo17653jN();
            assistantProcessEndpointService.f166419b = amb.mo65957u();
            assistantProcessEndpointService.f166420c = (C70237q) amb.f197783ac.mo17428b();
            assistantProcessEndpointService.f166421d = (C70229i) amb.f197807b.bw.mo17428b();
        }
        super.onCreate();
    }
}
