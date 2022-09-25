package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d;

import com.google.android.libraries.mdi.download.C28706al;
import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.d.i */
/* compiled from: PG */
public final /* synthetic */ class C131173i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f358697a;

    public /* synthetic */ C131173i(List list) {
        this.f358697a = list;
    }

    public final Object apply(Object obj) {
        List<C28706al> list = this.f358697a;
        C58485gu guVar = (C58485gu) obj;
        C58480gp e = C58485gu.m89837e();
        for (C28706al alVar : list) {
            Iterator it = C58869cf.m90938d(":").mo56151a().mo56153g(alVar.f77979b).iterator();
            if (it.hasNext() && guVar.contains(it.next())) {
                e.mo55395g(alVar);
            }
        }
        return e.mo55394f();
    }
}
