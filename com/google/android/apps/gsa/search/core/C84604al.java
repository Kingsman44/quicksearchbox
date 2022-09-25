package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.search.core.al */
/* compiled from: PG */
abstract class C84604al extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f230257a;

    /* renamed from: b */
    private final Object f230258b = new Object();

    /* renamed from: c */
    private boolean f230259c = false;

    /* renamed from: d */
    public final C68326i mo78368d() {
        if (this.f230257a == null) {
            synchronized (this.f230258b) {
                if (this.f230257a == null) {
                    this.f230257a = new C68326i(this);
                }
            }
        }
        return this.f230257a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo78368d().mo17653jN();
    }

    public void onCreate() {
        if (!this.f230259c) {
            this.f230259c = true;
            BroadcastListenerService broadcastListenerService = (BroadcastListenerService) this;
            amb amb = (amb) mo78368d().mo17653jN();
            broadcastListenerService.f229529c = C68219e.m98518a(amb.f197807b.a.f202006C);
            broadcastListenerService.f229531e = (C89331a) amb.f197807b.a.f202773dR.mo17428b();
            broadcastListenerService.f229532f = C68219e.m98518a(amb.f197807b.a.f202651bB);
            broadcastListenerService.f229533g = C68219e.m98518a(amb.f197807b.a.f202803dv);
        }
        super.onCreate();
    }
}
