package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.o */
/* compiled from: PG */
public abstract class C81381o extends Exception {
    /* renamed from: d */
    public static C81380n m129461d() {
        C81369c cVar = new C81369c();
        cVar.mo75044c(C80267v.FLOW_ID_UNKNOWN);
        cVar.mo75045d(1);
        cVar.mo75043b(C80265t.FAILURE_CAUSE_UNKNOWN);
        return cVar;
    }

    /* renamed from: a */
    public abstract C80265t mo75046a();

    /* renamed from: b */
    public abstract C80267v mo75047b();

    /* renamed from: c */
    public abstract int mo75048c();

    public final String getMessage() {
        Object[] objArr = new Object[3];
        objArr[0] = mo75047b();
        int c = mo75048c();
        objArr[1] = c != 0 ? Integer.toString(c - 1) : "null";
        objArr[2] = mo75046a();
        return String.format("Triggering failed: %s - %s - %s", objArr);
    }
}
