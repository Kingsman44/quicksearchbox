package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.bo */
/* compiled from: PG */
public final /* synthetic */ class C106907bo implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106918bz f297811a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f297812b;

    public /* synthetic */ C106907bo(C106918bz bzVar, C58485gu guVar) {
        this.f297811a = bzVar;
        this.f297812b = guVar;
    }

    public final Object apply(Object obj) {
        C106918bz bzVar = this.f297811a;
        C58485gu guVar = this.f297812b;
        Map map = (Map) obj;
        if (map == null) {
            return guVar;
        }
        return (C58485gu) Collection.EL.stream(guVar).peek(new C106898bf(bzVar, map)).collect(C58370cn.f155946a);
    }
}
