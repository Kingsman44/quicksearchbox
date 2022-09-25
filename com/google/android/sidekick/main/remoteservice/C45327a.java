package com.google.android.sidekick.main.remoteservice;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.sidekick.main.remoteservice.a */
/* compiled from: PG */
abstract class C45327a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f118452a;

    /* renamed from: b */
    private final Object f118453b = new Object();

    /* renamed from: c */
    private boolean f118454c = false;

    /* renamed from: a */
    public final C68326i mo49305a() {
        if (this.f118452a == null) {
            synchronized (this.f118453b) {
                if (this.f118452a == null) {
                    this.f118452a = new C68326i(this);
                }
            }
        }
        return this.f118452a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo49305a().mo17653jN();
    }

    public final void onCreate() {
        if (!this.f118454c) {
            this.f118454c = true;
            ((GoogleNowRemoteService) this).f118451a = ((amb) mo49305a().mo17653jN()).f197746S;
        }
        super.onCreate();
    }
}
