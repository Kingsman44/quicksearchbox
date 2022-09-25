package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.q.bd */
/* compiled from: PG */
public final /* synthetic */ class C27610bd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C28728bf f75443a;

    public /* synthetic */ C27610bd(C28728bf bfVar) {
        this.f75443a = bfVar;
    }

    public final Object apply(Object obj) {
        C28728bf bfVar = this.f75443a;
        C27615bi biVar = (C27615bi) obj;
        C58480gp e = C58485gu.m89837e();
        Map unmodifiableMap = Collections.unmodifiableMap(biVar.f75451a);
        Map unmodifiableMap2 = Collections.unmodifiableMap(biVar.f75452b);
        for (C28725bc bcVar : bfVar.f78046b) {
            if ((bcVar.f78036a & 2) != 0) {
                C28708an anVar = bcVar.f78038c;
                if (anVar == null) {
                    anVar = C28708an.f77994l;
                }
                String str = anVar.f77997b;
                if (unmodifiableMap.containsKey(str) || unmodifiableMap2.containsKey(str)) {
                    C28708an anVar2 = bcVar.f78038c;
                    if (anVar2 == null) {
                        anVar2 = C28708an.f77994l;
                    }
                    e.mo55395g(anVar2);
                }
            }
        }
        return e.mo55394f();
    }
}
