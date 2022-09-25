package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107489o;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107494t;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hr */
/* compiled from: PG */
final class C109253hr implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109254hs f304215a;

    public C109253hr(C109254hs hsVar) {
        this.f304215a = hsVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C109258hw.f304227a.mo56225c()).mo56382g(th)).mo56372aa(22743)).mo56386p("Failed to produce ClientOpResult.");
        if (th instanceof Exception) {
            this.f304215a.mo97710c((Exception) th);
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C109254hs hsVar = this.f304215a;
        C107489o oVar = (C107489o) C107494t.f299090e.createBuilder();
        String str = (String) hsVar.f304216a.mo56107c();
        oVar.copyOnWrite();
        C107494t tVar = (C107494t) oVar.instance;
        str.getClass();
        tVar.f299092a |= 1;
        tVar.f299095d = str;
        C63088z byteString = ((C52070ec) obj).toByteString();
        oVar.copyOnWrite();
        C107494t tVar2 = (C107494t) oVar.instance;
        byteString.getClass();
        tVar2.f299093b = 2;
        tVar2.f299094c = byteString;
        hsVar.f304218c.mo97718h((C107494t) oVar.build());
    }
}
