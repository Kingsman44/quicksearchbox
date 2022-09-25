package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.libraries.assistant.pcp.p1573k.C18929i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C18726ag implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18727ah f52806a;

    public /* synthetic */ C18726ag(C18727ah ahVar) {
        this.f52806a = ahVar;
    }

    public final Object apply(Object obj) {
        C18727ah ahVar = this.f52806a;
        List list = (List) obj;
        C58485gu m = list.get(0) == null ? C58485gu.m89845m() : (C58485gu) list.get(0);
        C58485gu m2 = list.get(1) == null ? C58485gu.m89845m() : (C58485gu) list.get(1);
        C58528ij F = C58528ij.m90006F((Collection) Collection.EL.stream(ahVar.f52812f.mo24217a()).map(C18750x.f52856a).collect(C58370cn.f155946a));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C18727ah.m36142c(m, F, linkedHashSet);
        C18727ah.m36142c(m2, F, linkedHashSet);
        C18727ah.m36142c(ahVar.f52812f.mo24218b(C18929i.MOSTLY_USED), F, linkedHashSet);
        return linkedHashSet;
    }
}
