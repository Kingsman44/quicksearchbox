package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4541l.C59337t;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bt */
/* compiled from: PG */
public final /* synthetic */ class C77793bt implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77795bv f214315a;

    /* renamed from: b */
    public final /* synthetic */ ac f214316b;

    public /* synthetic */ C77793bt(C77795bv bvVar, ac acVar) {
        this.f214315a = bvVar;
        this.f214316b = acVar;
    }

    public final void run() {
        C77795bv bvVar = this.f214315a;
        ac acVar = this.f214316b;
        C77787bn bnVar = bvVar.f214323d;
        if (bnVar != null && bnVar.f214291l.f218924a.equals(acVar)) {
            ((C58970a) ((C58970a) C77795bv.f214320a.mo56224b()).mo56372aa(4476)).mo56389s("Closing audio session for %s", acVar);
            C59337t.m92221a(bnVar.f214294o);
        }
    }
}
