package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113072bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113083cd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113399ej;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48588ad;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ec */
/* compiled from: PG */
public final /* synthetic */ class C112395ec implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311837a;

    /* renamed from: b */
    public final /* synthetic */ C113415ez f311838b;

    /* renamed from: c */
    public final /* synthetic */ C48588ad f311839c;

    /* renamed from: d */
    public final /* synthetic */ C113083cd f311840d;

    public /* synthetic */ C112395ec(C112435fh fhVar, C113415ez ezVar, C48588ad adVar, C113083cd cdVar) {
        this.f311837a = fhVar;
        this.f311838b = ezVar;
        this.f311839c = adVar;
        this.f311840d = cdVar;
    }

    public final Object get() {
        C60870cx cxVar;
        C112435fh fhVar = this.f311837a;
        C113415ez ezVar = this.f311838b;
        C48588ad adVar = this.f311839c;
        C113083cd cdVar = this.f311840d;
        C112433ff e = fhVar.mo99521e(ezVar, adVar, Optional.empty(), cdVar, C58528ij.m90006F(adVar.f125584e));
        C22871g gVar = fhVar.f311937j;
        C113415ez ezVar2 = e.f311924a;
        C60870cx cxVar2 = cdVar.f313335p;
        if (cxVar2 == null) {
            C113083cd.f313320a.mo105240i("extractFeatures_called_without_precompute");
            cxVar = C60856cj.m92900i(C113399ej.f314007x);
        } else {
            cxVar = cdVar.f313333n.mo28209i(cxVar2, "precompute succeeded", new C113072bt(cdVar, ezVar2));
        }
        return fhVar.f311937j.mo28209i(gVar.mo28205e(cxVar, "tapasUserProfileFeaturesExtractor.extractFeatures(suggestion)", Exception.class, C112428fa.f311914a), "extractedFeatures", new C112429fb(e));
    }
}
