package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95358bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.f.a */
/* compiled from: PG */
public final class C95637a {

    /* renamed from: a */
    private final C95358bi f267678a;

    /* renamed from: b */
    private final C68214a f267679b;

    public C95637a(C68214a aVar, C68214a aVar2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f267678a = (C95358bi) aVar2.mo27525b();
        this.f267679b = aVar;
    }

    /* renamed from: a */
    public final C124548d mo89601a() {
        C95355bf bfVar;
        String str;
        Iterator it = this.f267678a.mo89301d().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                C58976aa aaVar = C58975e.f156826a;
                bfVar = null;
                break;
            }
            bfVar = (C95355bf) it.next();
            if (bfVar.mo89263d().equals(C124715m.FULLY_CONNECTED)) {
                break;
            }
        }
        if (bfVar == null) {
            str = null;
        } else {
            str = bfVar.mo89270k();
        }
        if (str == null) {
            return null;
        }
        return ((C89492cd) this.f267679b.mo27525b()).mo83401b(str);
    }
}
