package com.google.android.apps.gsa.search.shared.multiuser;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.libraries.p1730f.C21370a;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.a */
/* compiled from: PG */
abstract class C87598a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f236669a;

    /* renamed from: b */
    private final Object f236670b = new Object();

    /* renamed from: c */
    private boolean f236671c = false;

    /* renamed from: a */
    public final C68326i mo81735a() {
        if (this.f236669a == null) {
            synchronized (this.f236670b) {
                if (this.f236669a == null) {
                    this.f236669a = new C68326i(this);
                }
            }
        }
        return this.f236669a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo81735a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f236671c) {
            this.f236671c = true;
            amb amb = (amb) mo81735a().mo17653jN();
            C21370a aVar = (C21370a) amb.f197807b.i.mo17428b();
            ((WorkDataService) this).f236668a = new C87619v((Context) amb.f197807b.g.mo17428b(), (C90465g) amb.f197807b.a.f202977hJ.mo17428b());
        }
        super.onCreate();
    }
}
