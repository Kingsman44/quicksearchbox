package com.google.android.apps.gsa.staticplugins.opa.tapas.p8551j;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112113a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112122h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17001af;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.j.b */
/* compiled from: PG */
public final /* synthetic */ class C112104b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112106d f311321a;

    public /* synthetic */ C112104b(C112106d dVar) {
        this.f311321a = dVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112106d dVar = this.f311321a;
        if (((Optional) obj).isEmpty()) {
            C112127m mVar = (C112127m) dVar.f311324b.mo27525b();
            String str = true != mVar.f311362g.mo79746e(C90063do.f249403cq) ? "on_device_suggestions" : "on_device_suggestions_trielite";
            C121509q l = C112127m.f311355a.mo105243l("getOnDeviceSuggestionsFile");
            try {
                mVar.mo99407h(2, "Loading %s from MDD", str);
                C28804cs f = C28805ct.m53747f();
                C17001af afVar = mVar.f311363h;
                ((C29663j) f).f80313a = "tapas_cortex";
                C60870cx j = mVar.f311359d.mo28210j(((C29409fd) mVar.f311358c.mo27525b()).mo34717f(f.mo34447a()), "[Tapas] TapasMddClient.getOnDeviceSuggestionsFile", new C112122h(mVar, str));
                l.close();
                dVar.f311325c = dVar.f311323a.mo28210j(j, "initializeServing", C112103a.f311320a);
            } catch (Throwable th) {
                C112113a.m185984a(th, th);
            }
        }
        return dVar.f311325c;
        throw th;
    }
}
