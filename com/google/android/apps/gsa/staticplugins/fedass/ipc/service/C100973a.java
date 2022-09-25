package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100735ar;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100777h;
import com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7944c.C100821b;
import com.google.android.apps.gsa.staticplugins.fedass.p7947f.C100849b;
import com.google.android.apps.gsa.staticplugins.fedass.p7948g.C100851b;
import com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100920c;
import com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100933p;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.a */
/* compiled from: PG */
abstract class C100973a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f282041a;

    /* renamed from: b */
    private final Object f282042b = new Object();

    /* renamed from: c */
    private boolean f282043c = false;

    /* renamed from: a */
    public final C68326i mo92126a() {
        if (this.f282041a == null) {
            synchronized (this.f282042b) {
                if (this.f282041a == null) {
                    this.f282041a = new C68326i(this);
                }
            }
        }
        return this.f282041a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92126a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f282043c) {
            this.f282043c = true;
            amb amb = (amb) mo92126a().mo17653jN();
            C58528ij K = C58528ij.m90011K(new C100851b(amb.f197807b.a.mo68147cE(), C68219e.m98518a(amb.f197807b.aF), C68219e.m98518a(amb.f197807b.d.f201718eR)), new C100821b((C100849b) amb.f197807b.aF.mo17428b()));
            aso aso = amb.f197807b.d;
            C69464a aVar = aso.f201719eS;
            aqy aqy = aso.f201488a;
            C100920c cVar = new C100920c(aVar, aqy.aF, (Executor) aqy.p.mo17428b(), (C60950i) aso.f201488a.bC.mo17428b());
            aso aso2 = amb.f197807b.d;
            C69464a aVar2 = aso2.f201719eS;
            aqy aqy2 = aso2.f201488a;
            ((TrainCommunicationService) this).f282039b = new C101012y((Context) amb.f197807b.g.mo17428b(), K, C58528ij.m90011K(cVar, new C100933p(aVar2, aqy2.aF, (Executor) aqy2.p.mo17428b(), (C60950i) aso2.f201488a.bC.mo17428b())), (Executor) amb.f197807b.p.mo17428b(), new C100735ar((C84413ad) amb.f197807b.a.f202689bn.mo17428b()), amb.f197807b.d.mo67678H(), (C100777h) amb.f197807b.d.f201718eR.mo17428b());
        }
        super.onCreate();
    }
}
