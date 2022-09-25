package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.assistant.p3861at.C49947ex;
import com.google.assistant.p3861at.C49949ez;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.t */
/* compiled from: PG */
public final class C94583t {

    /* renamed from: a */
    public static final C59071e f264554a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.c.t");

    /* renamed from: b */
    public final C83893b f264555b;

    /* renamed from: c */
    public final l f264556c;

    public C94583t(C83893b bVar, l lVar) {
        this.f264555b = bVar;
        this.f264556c = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo88522a() {
        C58976aa aaVar = C58975e.f156826a;
        SettableFuture settableFuture = new SettableFuture();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 268435456;
        acv.f128968x = true;
        C49947ex exVar = (C49947ex) C49949ez.f129843c.createBuilder();
        exVar.copyOnWrite();
        C49949ez ezVar = (C49949ez) exVar.instance;
        ezVar.f129846b = 1;
        ezVar.f129845a = 1 | ezVar.f129845a;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        C49949ez ezVar2 = (C49949ez) exVar.build();
        ezVar2.getClass();
        acv2.f128969y = ezVar2;
        acv2.f128945a |= 536870912;
        l lVar = this.f264556c;
        p pVar = new p();
        pVar.b = C58833ax.m90834k((Account) this.f264555b.mo77278a().mo56107c());
        pVar.e((acv) acu.build());
        pVar.a = new C94581r(settableFuture);
        pVar.e = C58833ax.m90833j(getClass().getSimpleName());
        lVar.h(pVar.a());
        return settableFuture;
    }
}
