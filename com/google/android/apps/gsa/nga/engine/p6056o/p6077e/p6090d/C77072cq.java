package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.cq */
/* compiled from: PG */
public final /* synthetic */ class C77072cq implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f212706a;

    /* renamed from: b */
    public final /* synthetic */ List f212707b;

    public /* synthetic */ C77072cq(C58485gu guVar, List list) {
        this.f212706a = guVar;
        this.f212707b = list;
    }

    public final Object call() {
        C58485gu guVar = this.f212706a;
        List list = this.f212707b;
        C58490gz gzVar = new C58490gz(4);
        for (int i = 0; i < guVar.size(); i++) {
            gzVar.mo55429h((Long) guVar.get(i), (C58485gu) C60856cj.m92909r((Future) list.get(i)));
        }
        return gzVar.mo55427f(false);
    }
}
