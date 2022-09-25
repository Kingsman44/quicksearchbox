package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.accounts.Account;
import android.view.View;
import com.google.assistant.p3861at.C49951fa;
import com.google.assistant.p3861at.C49952fb;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.m */
/* compiled from: PG */
public final /* synthetic */ class C94576m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94580q f264545a;

    public /* synthetic */ C94576m(C94580q qVar) {
        this.f264545a = qVar;
    }

    public final void onClick(View view) {
        C94580q qVar = this.f264545a;
        String str = qVar.f264551e.f264543c;
        C58976aa aaVar = C58975e.f156826a;
        C94583t tVar = qVar.f264548b;
        C49951fa faVar = (C49951fa) C49952fb.f129857j.createBuilder();
        faVar.copyOnWrite();
        C49952fb fbVar = (C49952fb) faVar.instance;
        str.getClass();
        fbVar.f129860b = 1;
        fbVar.f129861c = str;
        C49952fb fbVar2 = (C49952fb) faVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        fbVar2.getClass();
        acx.f128999p = fbVar2;
        acx.f128984a |= 65536;
        tVar.f264556c.n((Account) tVar.f264555b.mo77278a().mo56107c(), (acx) acw.build(), new C94582s(), tVar.getClass().getSimpleName());
        qVar.mo77318iT().mo77312a();
    }
}
