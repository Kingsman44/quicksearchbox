package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87710as;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87711at;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87712au;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.e */
/* compiled from: PG */
final class C106049e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C106053i f296067a;

    public C106049e(C106053i iVar) {
        this.f296067a = iVar;
    }

    public final void onClick(View view) {
        C107698i iVar = this.f296067a.f296071a;
        C88489j jVar = new C88489j(C87739bu.CANCEL);
        C62940bt btVar = C87710as.f237179a;
        C87711at atVar = (C87711at) C87712au.f237180c.createBuilder();
        atVar.copyOnWrite();
        C87712au auVar = (C87712au) atVar.instance;
        auVar.f237182a |= 1;
        auVar.f237183b = false;
        jVar.mo82014b(btVar, (C87712au) atVar.build());
        iVar.mo96219b(jVar.mo82013a());
        this.f296067a.f296071a.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
        this.f296067a.mo95274g();
        this.f296067a.mo95277j(true);
        C106053i iVar2 = this.f296067a;
        iVar2.f296072b.setVisibility(8);
        iVar2.f296073c.setVisibility(8);
        iVar2.f296077g.setVisibility(0);
        this.f296067a.mo95276i(false);
    }
}
