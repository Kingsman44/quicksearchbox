package com.google.android.libraries.logging.p2185ve.p2192d;

import android.util.SparseIntArray;
import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.d.d */
/* compiled from: PG */
public final class C28351d implements C28280k, C28349b {

    /* renamed from: a */
    public final C60218r f77069a;

    /* renamed from: b */
    public final List f77070b;

    /* renamed from: c */
    public final List f77071c;

    /* renamed from: d */
    public final SparseIntArray f77072d;

    /* renamed from: e */
    private final C58485gu f77073e;

    public C28351d(C60218r rVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.f77069a = rVar;
        this.f77070b = Collections.unmodifiableList(list);
        this.f77071c = Collections.unmodifiableList(list2);
        this.f77072d = sparseIntArray;
        Collections.unmodifiableList(list3);
        boolean z = true;
        C58838bb.m90869d(!list.isEmpty(), "Must have at least one graft");
        C58838bb.m90869d((list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size()) ? z : false, "All children must have a parent specified.");
        this.f77073e = C58485gu.m89846n(C28348a.m53028a((C28350c) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C58838bb.m90868c(C28348a.m53028a((C28350c) it.next()).equals(this.f77073e.get(0)));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C28481u mo33862a() {
        return C28348a.m53028a(this);
    }

    /* renamed from: b */
    public final List mo33863b() {
        return this.f77073e;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        C60214n nVar = C28348a.m53028a(this).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        b.mo56103c("rootVeId", String.valueOf(nVar.f162918c));
        C60214n nVar2 = C28348a.m53029b(this).f77290c;
        if (nVar2 == null) {
            nVar2 = C60214n.f162914g;
        }
        b.mo56103c("targetVeId", String.valueOf(nVar2.f162918c));
        return b.toString();
    }
}
