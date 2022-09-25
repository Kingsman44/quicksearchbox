package com.google.android.libraries.p590as.p593b.p596b;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10879g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C10803ag implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C10812ap f35834a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f35835b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f35836c;

    /* renamed from: d */
    public final /* synthetic */ C10879g f35837d;

    public /* synthetic */ C10803ag(C10812ap apVar, C60870cx cxVar, C60870cx cxVar2, C10879g gVar) {
        this.f35834a = apVar;
        this.f35835b = cxVar;
        this.f35836c = cxVar2;
        this.f35837d = gVar;
    }

    public final Object call() {
        C10812ap apVar = this.f35834a;
        C60870cx cxVar = this.f35835b;
        C60870cx cxVar2 = this.f35836c;
        C10879g gVar = this.f35837d;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        return C10812ap.m25844c(C10812ap.m25843b((C58485gu) Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar2)).filter(new C10964z(apVar, guVar)).map(new C10797aa(guVar)).collect(C58370cn.f155946a)), gVar);
    }
}
