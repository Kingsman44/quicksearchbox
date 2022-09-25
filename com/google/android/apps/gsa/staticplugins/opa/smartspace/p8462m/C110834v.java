package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.v */
/* compiled from: PG */
final class C110834v implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C110835w f308784a;

    public C110834v(C110835w wVar) {
        this.f308784a = wVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.m.v").mo56226d()).mo56382g(th)).mo56372aa(26788)).mo56386p("Failed to get cached Smartspace content.");
        this.f308784a.f308795k.mo109872H(false, th.getClass().getName());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C83800p pVar = (C83800p) obj;
        this.f308784a.f308795k.mo109872H(true, "OK");
    }
}
