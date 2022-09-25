package com.google.android.apps.search.fedora.localcompute;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.gms.learning.C144830q;
import com.google.common.p4522b.C58495hd;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.fedora.localcompute.d */
/* compiled from: PG */
abstract class C133062d extends C144830q implements C68288b {

    /* renamed from: a */
    private volatile C68326i f362809a;

    /* renamed from: b */
    private final Object f362810b = new Object();

    /* renamed from: c */
    private boolean f362811c = false;

    /* renamed from: b */
    public final C68326i mo110960b() {
        if (this.f362809a == null) {
            synchronized (this.f362810b) {
                if (this.f362809a == null) {
                    this.f362809a = new C68326i(this);
                }
            }
        }
        return this.f362809a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110960b().mo17653jN();
    }

    public final void onCreate() {
        if (!this.f362811c) {
            this.f362811c = true;
            FedoraLocalComputeResultHandlingService fedoraLocalComputeResultHandlingService = (FedoraLocalComputeResultHandlingService) this;
            amb amb = (amb) mo110960b().mo17653jN();
            fedoraLocalComputeResultHandlingService.f362795b = (Context) amb.f197807b.g.mo17428b();
            fedoraLocalComputeResultHandlingService.f362796c = C58495hd.m89901o("SheldonAsrP13nTrainerSession", amb.f197807b.d.mo67696Z(), "SheldonLmP13nTrainerSession", amb.f197807b.d.mo67696Z());
            fedoraLocalComputeResultHandlingService.f362797d = (Executor) amb.f197807b.p.mo17428b();
        }
        super.onCreate();
    }
}
