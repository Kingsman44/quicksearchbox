package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.b */
/* compiled from: PG */
public final class C95851b {

    /* renamed from: a */
    private final Context f268409a;

    /* renamed from: b */
    private final C89656k f268410b;

    public C95851b(Context context, C89656k kVar) {
        this.f268409a = context;
        this.f268410b = kVar;
    }

    /* renamed from: a */
    public final void mo89822a(C60298nk nkVar) {
        if (!this.f268410b.mo83552g("clearcut_logging")) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1029;
        amo amo = amo.BISTO;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164070D = amo.f159234au;
        ufVar2.f164146b |= 8;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        C60300nm nmVar = (C60300nm) nkVar.build();
        nmVar.getClass();
        ufVar3.f164131al = nmVar;
        ufVar3.f164199c |= LinearLayoutManager.INVALID_OFFSET;
        C89949q.m146524i(this.f268409a, (C60555uf) tzVar.build(), false);
        C58976aa aaVar2 = C58975e.f156826a;
    }
}
