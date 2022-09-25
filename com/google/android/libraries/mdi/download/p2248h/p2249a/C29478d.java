package com.google.android.libraries.mdi.download.p2248h.p2249a;

import com.google.android.libraries.mdi.download.C28706al;
import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.h.a.d */
/* compiled from: PG */
public final /* synthetic */ class C29478d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f79902a;

    public /* synthetic */ C29478d(List list) {
        this.f79902a = list;
    }

    public final Object apply(Object obj) {
        List<C28706al> list = this.f79902a;
        List list2 = (List) obj;
        C58480gp e = C58485gu.m89837e();
        for (C28706al alVar : list) {
            Iterator it = C58869cf.m90938d(":").mo56151a().mo56153g(alVar.f77979b).iterator();
            if (it.hasNext() && list2.contains(it.next())) {
                e.mo55395g(alVar);
            }
        }
        return e.mo55394f();
    }
}
