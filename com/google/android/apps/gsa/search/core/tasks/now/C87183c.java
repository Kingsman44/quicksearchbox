package com.google.android.apps.gsa.search.core.tasks.now;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.sidekick.main.notifications.C91544r;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.p489g.p493c.C9131d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.tasks.now.c */
/* compiled from: PG */
public final /* synthetic */ class C87183c implements C118549h {

    /* renamed from: a */
    public final /* synthetic */ C91544r f235586a;

    public /* synthetic */ C87183c(C91544r rVar) {
        this.f235586a = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C91544r rVar = this.f235586a;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r1 = C62942bv.checkIsLite(C9131d.f31425b);
        akVar.mo58887l(r1);
        Object l = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        List<C7718hj> list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            rVar.f255333b.mo85841f(list);
            for (C7718hj hjVar : list) {
                if (rVar.f255333b.mo85839c(hjVar) != null && rVar.f255333b.mo85847l(hjVar)) {
                    arrayList.add(hjVar);
                }
            }
            if (!arrayList.isEmpty()) {
                rVar.mo85931j();
                rVar.mo85927f();
            }
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }
}
