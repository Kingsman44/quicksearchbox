package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.research.p5181a.p5187e.C66361k;
import com.google.research.p5181a.p5187e.C66367q;
import com.google.research.p5181a.p5188f.C66376a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bf */
/* compiled from: PG */
public final /* synthetic */ class C112338bf implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C112341bi f311723a;

    /* renamed from: b */
    public final /* synthetic */ C66361k f311724b;

    /* renamed from: c */
    public final /* synthetic */ C66376a f311725c;

    public /* synthetic */ C112338bf(C112341bi biVar, C66361k kVar, C66376a aVar) {
        this.f311723a = biVar;
        this.f311724b = kVar;
        this.f311725c = aVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C112341bi biVar = this.f311723a;
        C66361k kVar = this.f311724b;
        C66376a aVar = this.f311725c;
        C121537f fVar = C112341bi.f311728a;
        String e = kVar.mo59575e();
        ArrayList arrayList = ((C66367q) fVar.mo105235d("predict_".concat(String.valueOf(e)), new C112336bd(kVar, aVar))).f180459b;
        return arrayList.subList(0, Math.min(arrayList.size(), biVar.mo59598c(kVar).intValue()));
    }
}
