package com.google.android.apps.gsa.shared.p6993ao;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.shared.ao.p */
/* compiled from: PG */
public final class C89251p {

    /* renamed from: a */
    public final EnumMap f242007a = new EnumMap(C90208n.class);

    /* renamed from: a */
    public final C89252q mo83205a(C90208n nVar) {
        if (nVar == C90208n.UNKNOWN_TAB) {
            nVar = C90208n.INTERESTS_TAB;
        }
        C89252q qVar = (C89252q) this.f242007a.get(nVar);
        if (qVar != null) {
            return qVar;
        }
        C89252q qVar2 = new C89252q();
        this.f242007a.put(nVar, qVar2);
        return qVar2;
    }
}
