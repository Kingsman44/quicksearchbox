package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.b.s */
/* compiled from: PG */
public final /* synthetic */ class C10842s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C10844u f35887a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f35888b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f35889c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f35890d;

    public /* synthetic */ C10842s(C10844u uVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f35887a = uVar;
        this.f35888b = cxVar;
        this.f35889c = cxVar2;
        this.f35890d = cxVar3;
    }

    public final Object call() {
        C10844u uVar = this.f35887a;
        C60870cx cxVar = this.f35888b;
        C60870cx cxVar2 = this.f35889c;
        C60870cx cxVar3 = this.f35890d;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
        C58485gu guVar3 = (C58485gu) C60856cj.m92909r(cxVar3);
        if (!uVar.f35898e.booleanValue()) {
            return C58485gu.m89845m();
        }
        ((C58970a) ((C58970a) C10844u.f35894a.mo56224b()).mo56372aa(53989)).mo56386p("#calculateRolledBackPacks");
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(guVar);
        e.mo55396h(guVar2);
        return (C58485gu) Collection.EL.stream(e.mo55394f()).filter(new C10829f(guVar3)).collect(C58370cn.f155946a);
    }
}
