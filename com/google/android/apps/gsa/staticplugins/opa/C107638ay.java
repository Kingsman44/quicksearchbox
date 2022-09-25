package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108228az;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay */
/* compiled from: PG */
public final /* synthetic */ class C107638ay implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f299468a;

    public /* synthetic */ C107638ay(C109040fj fjVar) {
        this.f299468a = fjVar;
    }

    public final void onClick(View view) {
        C109040fj fjVar = this.f299468a;
        C58976aa aaVar = C58975e.f156826a;
        if (fjVar.f303305bL == C108228az.IS_THINKING) {
            fjVar.f303450o.mo95392ac(C108228az.IS_NOT_THINKING);
        }
        if (fjVar.mo97529bw()) {
            fjVar.f303300bG = true;
        }
        C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
        e eVar = e.w;
        abVar.copyOnWrite();
        C83614ac acVar = (C83614ac) abVar.instance;
        acVar.f227955c = eVar.ca;
        acVar.f227953a |= 2;
        abVar.copyOnWrite();
        C83614ac acVar2 = (C83614ac) abVar.instance;
        acVar2.f227954b = 1;
        acVar2.f227953a = 1 | acVar2.f227953a;
        ((C107759j) fjVar.f303375cg.mo27525b()).mo96272h((C83614ac) abVar.build());
    }
}
