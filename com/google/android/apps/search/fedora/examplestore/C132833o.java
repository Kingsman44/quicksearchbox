package com.google.android.apps.search.fedora.examplestore;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10100f.C132837d;
import com.google.android.gms.learning.C144757g;
import com.google.common.p4522b.C58729pv;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.fedora.examplestore.o */
/* compiled from: PG */
abstract class C132833o extends C144757g implements C68288b {

    /* renamed from: a */
    private volatile C68326i f362436a;

    /* renamed from: b */
    private final Object f362437b = new Object();

    /* renamed from: c */
    private boolean f362438c = false;

    /* renamed from: b */
    public final C68326i mo92065b() {
        if (this.f362436a == null) {
            synchronized (this.f362437b) {
                if (this.f362436a == null) {
                    this.f362436a = new C68326i(this);
                }
            }
        }
        return this.f362436a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92065b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f362438c) {
            this.f362438c = true;
            FedoraExampleStoreService fedoraExampleStoreService = (FedoraExampleStoreService) this;
            amb amb = (amb) mo92065b().mo17653jN();
            Context context = (Context) amb.f197807b.g.mo17428b();
            fedoraExampleStoreService.f362403b = (Executor) amb.f197807b.p.mo17428b();
            fedoraExampleStoreService.f362404c = new C132826h(C58729pv.f156485a, (C132837d) amb.f197807b.kM.mo17428b(), new C132819a((C133072j) amb.f197807b.kJ.mo17428b()), (Executor) amb.f197807b.p.mo17428b());
        }
        super.onCreate();
    }
}
