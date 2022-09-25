package com.google.android.ssb.service;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.ssb.service.b */
/* compiled from: PG */
abstract class C45356b extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f118593a;

    /* renamed from: b */
    private final Object f118594b = new Object();

    /* renamed from: c */
    private boolean f118595c = false;

    /* renamed from: a */
    public final C68326i mo49368a() {
        if (this.f118593a == null) {
            synchronized (this.f118594b) {
                if (this.f118593a == null) {
                    this.f118593a = new C68326i(this);
                }
            }
        }
        return this.f118593a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo49368a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f118595c) {
            this.f118595c = true;
            SsbService ssbService = (SsbService) this;
            amb amb = (amb) mo49368a().mo17653jN();
            ssbService.f118569d = (C21370a) amb.f197807b.i.mo17428b();
            ssbService.f118570e = (C86124t) amb.f197807b.a.f202006C.mo17428b();
            ssbService.f118571f = (C86127w) amb.f197807b.a.f203497r.mo17428b();
            ssbService.f118572g = C68219e.m98518a(amb.f197807b.a.f203232m);
            ssbService.f118573h = C68219e.m98518a(amb.f197807b.a.f202651bB);
            ssbService.f118574i = C68219e.m98518a(amb.f197807b.a.f203126k);
            ssbService.f118575j = C68219e.m98518a(amb.f197807b.a.f202802du);
            aqy aqy = amb.f197807b;
            ssbService.f118576k = aqy.fp;
            ssbService.f118577l = C68219e.m98518a(aqy.a.f202377J);
            ssbService.f118578m = C68219e.m98518a(amb.f197807b.a.f202218G);
            ssbService.f118579n = (C90476a) amb.f197807b.r.mo17428b();
            ssbService.f118580o = (C58833ax) amb.f197747T.mo17428b();
        }
        super.onCreate();
    }
}
