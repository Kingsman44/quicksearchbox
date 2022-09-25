package com.google.android.apps.search.assistant.platform.pcp.ondeviceserver;

import androidx.lifecycle.C2395z;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.ondeviceserver.c */
/* compiled from: PG */
class C124143c extends C2395z implements C68288b {

    /* renamed from: b */
    private volatile C68326i f342837b;

    /* renamed from: c */
    private final Object f342838c = new Object();

    /* renamed from: d */
    private boolean f342839d = false;

    /* renamed from: a */
    public final C68326i mo106297a() {
        if (this.f342837b == null) {
            synchronized (this.f342838c) {
                if (this.f342837b == null) {
                    this.f342837b = new C68326i(this);
                }
            }
        }
        return this.f342837b;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106297a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f342839d) {
            this.f342839d = true;
            mo106297a().mo17653jN();
            PcpDataServerEndpointService pcpDataServerEndpointService = (PcpDataServerEndpointService) this;
        }
        super.onCreate();
    }
}
