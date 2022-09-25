package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4552o.C60324oh;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.g */
/* compiled from: PG */
public final /* synthetic */ class C99249g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C89061q f277662a;

    public /* synthetic */ C99249g(C89061q qVar) {
        this.f277662a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C89061q qVar = this.f277662a;
        C89060p pVar = (C89060p) obj;
        if (C99252j.f277664a.contains(pVar.f241367e)) {
            return C118826c.f331423b;
        }
        if (pVar.f241367e == C60324oh.QUALITY_NOT_MET) {
            C90457d dVar = pVar.f241368f;
            dVar.getClass();
            return C60856cj.m92899h(dVar);
        }
        C60870cx h = C60922j.m93045h(qVar.mo27438h(C99252j.f277665b), C99250h.f277663a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
