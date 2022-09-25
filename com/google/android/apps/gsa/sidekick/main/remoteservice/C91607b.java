package com.google.android.apps.gsa.sidekick.main.remoteservice;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.remoteservice.b */
/* compiled from: PG */
abstract class C91607b extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f255502a;

    /* renamed from: b */
    private final Object f255503b = new Object();

    /* renamed from: c */
    private boolean f255504c = false;

    /* renamed from: a */
    public final C68326i mo85971a() {
        if (this.f255502a == null) {
            synchronized (this.f255503b) {
                if (this.f255502a == null) {
                    this.f255502a = new C68326i(this);
                }
            }
        }
        return this.f255502a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo85971a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f255504c) {
            this.f255504c = true;
            ((NowService) this).f255498a = ((amb) mo85971a().mo17653jN()).f197814e;
        }
        super.onCreate();
    }
}
