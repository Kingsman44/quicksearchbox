package com.google.android.apps.gsa.projection;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.binaries.satin.app.C74199om;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.projection.p6477a.C84184a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11628d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p656f.p657a.C11439a;
import com.google.android.libraries.assistant.auto.jumpboost.p701k.C11830a;
import com.google.android.libraries.assistant.auto.tng.common.p918h.C13270f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.apps.gsa.projection.e */
/* compiled from: PG */
abstract class C84193e extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f229179a;

    /* renamed from: b */
    private final Object f229180b = new Object();

    /* renamed from: c */
    private boolean f229181c = false;

    /* renamed from: a */
    public final C68326i mo77658a() {
        if (this.f229179a == null) {
            synchronized (this.f229180b) {
                if (this.f229179a == null) {
                    this.f229179a = new C68326i(this);
                }
            }
        }
        return this.f229179a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo77658a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f229181c) {
            this.f229181c = true;
            CarAssistantService carAssistantService = (CarAssistantService) this;
            amb amb = (amb) mo77658a().mo17653jN();
            carAssistantService.f229138b = (Context) amb.f197807b.g.mo17428b();
            carAssistantService.f229139c = (C22871g) amb.f197807b.aT.mo17428b();
            carAssistantService.f229140d = new C84188c((PackageManager) amb.f197807b.J.mo17428b(), (C86124t) amb.f197807b.a.f202006C.mo17428b());
            aqy aqy = amb.f197807b;
            carAssistantService.f229151o = new C74199om(aqy);
            carAssistantService.f229141e = (C84184a) aqy.b.f200059cT.mo17428b();
            carAssistantService.f229142f = (C118561t) amb.f197807b.a.f202112E.mo17428b();
            carAssistantService.f229143g = (C11628d) amb.f197807b.b.f200134dp.mo17428b();
            carAssistantService.f229144h = (C11636b) amb.f197807b.c.f201232bM.mo17428b();
            carAssistantService.f229145i = (C11830a) amb.f197807b.lr.mo17428b();
            aso aso = amb.f197807b.d;
            carAssistantService.f229146j = new C13270f(aso.f201716eP, (Executor) aso.f201488a.p.mo17428b(), (ScheduledExecutorService) aso.f201488a.n.mo17428b());
            carAssistantService.f229152p = (C11439a) amb.f197807b.d.mo67764bN();
            aqy aqy2 = amb.f197807b;
            carAssistantService.f229147k = aqy2.c.f201231bL;
            aso aso2 = aqy2.d;
            carAssistantService.f229148l = aso2.f201534at;
            carAssistantService.f229149m = aso2.f201535au;
        }
        super.onCreate();
    }
}
