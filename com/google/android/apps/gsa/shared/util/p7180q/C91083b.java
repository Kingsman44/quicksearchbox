package com.google.android.apps.gsa.shared.util.p7180q;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.q.b */
/* compiled from: PG */
public final class C91083b {

    /* renamed from: a */
    private static final C59071e f254359a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.q.b");

    /* renamed from: a */
    public static void m148803a(C91084c cVar) {
        C91084c cVar2 = (C91084c) C91081a.f254358b.getAndSet(cVar);
        if (cVar2 != null && !cVar2.equals(cVar)) {
            C59104x d = f254359a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MutableApplctnProcess");
            ((C59052c) ((C59052c) d).mo56372aa(11435)).mo56354G("Mismatched process initialization: [%s] vs [%s]", cVar2, cVar);
            int i = C90755l.f253831a;
        }
    }
}
