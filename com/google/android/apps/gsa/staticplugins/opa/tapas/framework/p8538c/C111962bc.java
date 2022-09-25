package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bc */
/* compiled from: PG */
public final /* synthetic */ class C111962bc implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111971bl f311041a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311042b;

    public /* synthetic */ C111962bc(C111971bl blVar, C113405ep epVar) {
        this.f311041a = blVar;
        this.f311042b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111971bl blVar = this.f311041a;
        C113405ep epVar = this.f311042b;
        C111985p pVar = (C111985p) obj;
        blVar.f311065l.mo99804e(epVar.mo100016a(), C112976k.ON_DEVICE_RANKING);
        ((C113388b) blVar.f311060g.mo27525b()).mo99675j(epVar.mo100016a(), C89849ae.TAPAS_ENGINE_START_RANKING);
        C121509q l = C111971bl.f311053a.mo105243l("issueRank");
        try {
            C121537f fVar = C111971bl.f311053a;
            C60870cx a = blVar.f311061h.mo99270a(epVar, pVar.mo99311a());
            fVar.mo105244m("rank", a);
            if (blVar.f311058e.mo79746e(C90063do.f249461dv)) {
                C60870cx i = blVar.f311059f.mo28209i(a, "schedule ranking of delayed candidates", new C111957ay(blVar, pVar, epVar));
                l.close();
                return i;
            }
            l.close();
            return a;
        } catch (Throwable th) {
            C111950ar.m185805a(th, th);
        }
        throw th;
    }
}
