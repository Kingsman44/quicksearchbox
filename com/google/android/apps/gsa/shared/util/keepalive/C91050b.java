package com.google.android.apps.gsa.shared.util.keepalive;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.util.keepalive.StandaloneKeepAlive;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.shared.util.keepalive.b */
/* compiled from: PG */
abstract class C91050b extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f254315a;

    /* renamed from: b */
    private final Object f254316b = new Object();

    /* renamed from: c */
    private boolean f254317c = false;

    /* renamed from: a */
    public final C68326i mo85333a() {
        if (this.f254315a == null) {
            synchronized (this.f254316b) {
                if (this.f254315a == null) {
                    this.f254315a = new C68326i(this);
                }
            }
        }
        return this.f254315a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo85333a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f254317c) {
            this.f254317c = true;
            ((StandaloneKeepAlive.ForegroundService) this).f254307a = (C91051c) ((amb) mo85333a().mo17653jN()).f197807b.b.f200212fN.mo17428b();
        }
        super.onCreate();
    }
}
