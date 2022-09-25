package com.google.android.libraries.p590as.p593b.p596b.p597a;

import com.google.android.libraries.p590as.p593b.p596b.C10949k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.as.b.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C10789e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C10795k f35815a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f35816b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f35817c;

    public /* synthetic */ C10789e(C10795k kVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f35815a = kVar;
        this.f35816b = cxVar;
        this.f35817c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C10795k kVar = this.f35815a;
        C60870cx cxVar = this.f35816b;
        C60870cx cxVar2 = this.f35817c;
        C58528ij F = C58528ij.m90006F((C58485gu) C60856cj.m92909r(cxVar));
        C58485gu guVar = (C58485gu) Collection.EL.stream(F).filter(new C10786b(C58528ij.m90006F((C58485gu) C60856cj.m92909r(cxVar2)))).collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) C10795k.f35823a.mo56224b()).mo56372aa(53986)).mo56393w("Background downloading %d packs, for an ideal set of %d total packs", guVar.size(), F.size());
        Stream stream = Collection.EL.stream(guVar);
        C10949k kVar2 = kVar.f35824b;
        Objects.requireNonNull(kVar2);
        return C60856cj.m92896e((Iterable) stream.map(new C10787c(kVar2)).collect(C58370cn.f155946a));
    }
}
