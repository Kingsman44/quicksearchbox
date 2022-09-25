package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.di */
/* compiled from: PG */
public final /* synthetic */ class C108636di implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108641dn f302173a;

    public /* synthetic */ C108636di(C108641dn dnVar) {
        this.f302173a = dnVar;
    }

    public final void onClick(View view) {
        C108641dn dnVar = this.f302173a;
        C83992d dVar = (C83992d) dnVar.f302184f.mo77447a().get(0);
        C58838bb.m90883r(dVar instanceof C108640dm);
        C108635dh dhVar = dnVar.f302183e;
        String str = (String) dnVar.f302182d.mo96984c().mo56107c();
        str.getClass();
        new C90873ag(dhVar.mo97040b(str, dnVar.f302182d.mo96983b(), ((C108640dm) dVar).f302177a), dnVar.f302181c, "update language callback", C108638dk.f302175a).mo85223a(C108639dl.f302176a);
        dnVar.mo77318iT().mo77312a();
    }
}
