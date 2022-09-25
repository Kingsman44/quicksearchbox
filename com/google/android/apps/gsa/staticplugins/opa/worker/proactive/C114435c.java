package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.c */
/* compiled from: PG */
public final /* synthetic */ class C114435c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C114469h f317303a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f317304b;

    public /* synthetic */ C114435c(C114469h hVar, C60870cx cxVar) {
        this.f317303a = hVar;
        this.f317304b = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C114469h hVar = this.f317303a;
        if (!Collection.EL.stream((List) C60856cj.m92909r(this.f317304b)).filter(C114467f.f317407a).findAny().isPresent()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        p pVar = new p();
        pVar.b = C58833ax.m90833j(hVar.f317413e.mo79668a());
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 128;
        acv.f128952h = true;
        pVar.e((acv) acu.build());
        return C60922j.m93044g(hVar.f317414f.a(pVar, 10, TimeUnit.SECONDS), C114466e.f317406a, hVar.f317418j);
    }
}
