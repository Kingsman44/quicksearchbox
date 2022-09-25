package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100768ag;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.a */
/* compiled from: PG */
abstract class C101198a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f282470a;

    /* renamed from: b */
    private final Object f282471b = new Object();

    /* renamed from: c */
    private boolean f282472c = false;

    /* renamed from: a */
    public final C68326i mo92177a() {
        if (this.f282470a == null) {
            synchronized (this.f282471b) {
                if (this.f282470a == null) {
                    this.f282470a = new C68326i(this);
                }
            }
        }
        return this.f282470a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92177a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f282472c) {
            this.f282472c = true;
            TrainingCacheService trainingCacheService = (TrainingCacheService) this;
            amb amb = (amb) mo92177a().mo17653jN();
            trainingCacheService.f282464b = (C100768ag) amb.f197807b.d.f201720eT.mo17428b();
            trainingCacheService.f282465c = C68219e.m98518a(amb.f197807b.aF);
            trainingCacheService.f282466d = (C91022f) amb.f197807b.a.f202649b.mo17428b();
            trainingCacheService.f282467e = (Executor) amb.f197807b.p.mo17428b();
        }
        super.onCreate();
    }
}
