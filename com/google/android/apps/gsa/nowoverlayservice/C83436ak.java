package com.google.android.apps.gsa.nowoverlayservice;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ak */
/* compiled from: PG */
abstract class C83436ak extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f227423a;

    /* renamed from: b */
    private final Object f227424b = new Object();

    /* renamed from: c */
    private boolean f227425c = false;

    /* renamed from: a */
    public final C68326i mo76771a() {
        if (this.f227423a == null) {
            synchronized (this.f227424b) {
                if (this.f227423a == null) {
                    this.f227423a = new C68326i(this);
                }
            }
        }
        return this.f227423a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo76771a().mo17653jN();
    }

    public void onCreate() {
        C83480bn bnVar;
        if (!this.f227425c) {
            this.f227425c = true;
            DrawerOverlayService drawerOverlayService = (DrawerOverlayService) this;
            amb amb = (amb) mo76771a().mo17653jN();
            C69464a aVar = amb.f197812c;
            C69464a aVar2 = amb.f197813d;
            if (((C84486a) amb.f197807b.a.f202660bK.mo17428b()).mo78203j()) {
                bnVar = (C83480bn) aVar2.mo17428b();
            } else {
                bnVar = (C83480bn) aVar.mo17428b();
            }
            C68225k.m98532d(bnVar);
            drawerOverlayService.f227396a = bnVar;
        }
        super.onCreate();
    }
}
