package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100788s;
import com.google.android.gms.learning.C144757g;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.common.p4522b.C58495hd;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.q */
/* compiled from: PG */
abstract class C100812q extends C144757g implements C68288b {

    /* renamed from: a */
    private volatile C68326i f281759a;

    /* renamed from: b */
    private final Object f281760b = new Object();

    /* renamed from: c */
    private boolean f281761c = false;

    /* renamed from: b */
    public final C68326i mo92065b() {
        if (this.f281759a == null) {
            synchronized (this.f281760b) {
                if (this.f281759a == null) {
                    this.f281759a = new C68326i(this);
                }
            }
        }
        return this.f281759a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92065b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f281761c) {
            this.f281761c = true;
            GsaExampleStoreService gsaExampleStoreService = (GsaExampleStoreService) this;
            amb amb = (amb) mo92065b().mo17653jN();
            C69464a aVar = amb.f197733F;
            C69464a aVar2 = amb.f197734G;
            gsaExampleStoreService.f281714b = C58495hd.m89902p("/nlu_assistant_history", aVar, "/sheldon_asr_fine_tuning", aVar2, "/sheldon_lm_fine_tuning", aVar2);
            gsaExampleStoreService.f281715c = (C100788s) amb.f197807b.d.f201717eQ.mo17428b();
            gsaExampleStoreService.f281716d = (C100719ab) amb.f197807b.aF.mo17428b();
            Optional of = Optional.m71637of((C19435g) amb.f197807b.aG.mo17428b());
            amb.f197807b.d.mo67678H();
            gsaExampleStoreService.f281717e = new C100796a(of);
            gsaExampleStoreService.f281718f = (Executor) amb.f197807b.p.mo17428b();
        }
        super.onCreate();
    }
}
