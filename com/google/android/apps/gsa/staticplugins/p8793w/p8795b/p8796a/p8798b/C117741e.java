package com.google.android.apps.gsa.staticplugins.p8793w.p8795b.p8796a.p8798b;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.b.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C117741e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f326813a;

    public /* synthetic */ C117741e(List list) {
        this.f326813a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f326813a;
        C58528ij ijVar = C117747k.f326826a;
        if (((Boolean) obj).booleanValue()) {
            return C58485gu.m89842j(list);
        }
        return (C58485gu) Collection.EL.stream(list).filter(C117743g.f326815a).collect(C58370cn.f155946a);
    }
}
