package com.google.android.apps.search.googleapp.accounts.p10126ui;

import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.f */
/* compiled from: PG */
final class C133257f implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C133339g f363191a;

    public C133257f(C133339g gVar) {
        this.f363191a = gVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C133339g.f363323a.mo56226d()).mo56382g(th)).mo56372aa(40008)).mo56386p("Can't get WAA status for Mavatar!");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            C30931r.m57728a(this.f363191a.f363336n.f82367a, Boolean.valueOf(bool.booleanValue()));
            return;
        }
        ((C59052c) ((C59052c) C133339g.f363323a.mo56226d()).mo56372aa(40009)).mo56386p("WAA status for Mavatar is not loaded!");
    }
}
