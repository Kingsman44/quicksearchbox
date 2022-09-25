package com.google.android.libraries.lens.view.p2159q;

import com.google.android.apps.gsa.g.e.e;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28724bb;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.q.bp */
/* compiled from: PG */
public final /* synthetic */ class C27622bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C28728bf f75475a;

    public /* synthetic */ C27622bp(C28728bf bfVar) {
        this.f75475a = bfVar;
    }

    public final Object apply(Object obj) {
        C28728bf bfVar = this.f75475a;
        C58480gp e = C58485gu.m89837e();
        Map unmodifiableMap = Collections.unmodifiableMap(((e) obj).a);
        for (C28725bc bcVar : bfVar.f78046b) {
            int i = bcVar.f78036a;
            if ((i & 2) != 0) {
                if ((i & 1) != 0) {
                    C28724bb bbVar = bcVar.f78037b;
                    if (bbVar == null) {
                        bbVar = C28724bb.f78028e;
                    }
                    if (bbVar.f78031b.size() != 0) {
                        C28724bb bbVar2 = bcVar.f78037b;
                        if (bbVar2 == null) {
                            bbVar2 = C28724bb.f78028e;
                        }
                        Iterator it = bbVar2.f78031b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (unmodifiableMap.containsKey((String) it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                C28708an anVar = bcVar.f78038c;
                if (anVar == null) {
                    anVar = C28708an.f77994l;
                }
                e.mo55395g(anVar);
            }
        }
        return e.mo55394f();
    }
}
