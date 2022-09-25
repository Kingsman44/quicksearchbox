package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ke */
/* compiled from: PG */
final class C109342ke extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C109354kq f304566a;

    /* renamed from: b */
    final /* synthetic */ String f304567b;

    /* renamed from: c */
    final /* synthetic */ String f304568c;

    /* renamed from: d */
    final /* synthetic */ C109346ki f304569d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109342ke(C109346ki kiVar, C109354kq kqVar, String str, String str2) {
        super("Add a offline voice tips bubble in OPA.");
        this.f304569d = kiVar;
        this.f304566a = kqVar;
        this.f304567b = str;
        this.f304568c = str2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f304569d.mo97781h(this.f304567b, this.f304568c, this.f304566a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String b = C109346ki.m182023b((C58495hd) obj);
        if (b.length() > 0) {
            C109346ki kiVar = this.f304569d;
            kiVar.mo97781h(kiVar.mo97777a(R.string.opa_offline_help_prefix_tts), this.f304569d.mo97777a(R.string.opa_offline_help_prefix), this.f304566a);
            this.f304569d.mo97780g(b, this.f304566a);
            return;
        }
        this.f304569d.mo97781h(this.f304567b, this.f304568c, this.f304566a);
    }
}
