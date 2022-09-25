package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import com.google.assistant.p3781ad.p3789d.p3791b.C48676ak;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.l */
/* compiled from: PG */
public final /* synthetic */ class C111562l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111565o f310270a;

    /* renamed from: b */
    public final /* synthetic */ String f310271b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f310272c;

    /* renamed from: d */
    public final /* synthetic */ C48676ak f310273d;

    public /* synthetic */ C111562l(C111565o oVar, String str, C60870cx cxVar, C48676ak akVar) {
        this.f310270a = oVar;
        this.f310271b = str;
        this.f310272c = cxVar;
        this.f310273d = akVar;
    }

    public final Object call() {
        C111565o oVar = this.f310270a;
        String str = this.f310271b;
        C60870cx cxVar = this.f310272c;
        C48676ak akVar = this.f310273d;
        if (!((C58528ij) C60856cj.m92909r(oVar.f310285i)).contains(str)) {
            return Optional.empty();
        }
        return ((Optional) C60856cj.m92909r(cxVar)).flatMap(new C111560j(oVar, akVar));
    }
}
