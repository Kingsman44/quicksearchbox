package com.google.android.apps.gsa.unifiedime;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.unifiedime.j */
/* compiled from: PG */
abstract class C118592j extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f330872a;

    /* renamed from: b */
    private final Object f330873b = new Object();

    /* renamed from: c */
    private boolean f330874c = false;

    /* renamed from: a */
    public final C68326i mo103780a() {
        if (this.f330872a == null) {
            synchronized (this.f330873b) {
                if (this.f330872a == null) {
                    this.f330872a = new C68326i(this);
                }
            }
        }
        return this.f330872a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103780a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f330874c) {
            this.f330874c = true;
            UnifiedImeService unifiedImeService = (UnifiedImeService) this;
            amb amb = (amb) mo103780a().mo17653jN();
            unifiedImeService.f330814b = amb.f197741N;
            unifiedImeService.f330815c = C68219e.m98518a(amb.f197807b.a.f203603t);
            unifiedImeService.f330816d = C68219e.m98518a(amb.f197807b.bk);
        }
        super.onCreate();
    }
}
