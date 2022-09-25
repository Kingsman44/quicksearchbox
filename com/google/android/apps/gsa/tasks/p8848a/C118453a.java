package com.google.android.apps.gsa.tasks.p8848a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.p8851c.C118525a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.tasks.a.a */
/* compiled from: PG */
public final class C118453a implements C118549h {

    /* renamed from: a */
    private static final C59071e f328795a = C59071e.m91332i("com.google.android.apps.gsa.tasks.a.a");

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C59104x b = f328795a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NoOpTask");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(34014);
        C62940bt r1 = C62942bv.checkIsLite(C118525a.f329108a);
        akVar.mo58887l(r1);
        Object l = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        cVar.mo56389s("Task running %d", obj);
        return C118826c.f331423b;
    }
}
