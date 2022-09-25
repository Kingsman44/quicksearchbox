package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.kd */
/* compiled from: PG */
final class C109341kd extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ String f304562a;

    /* renamed from: b */
    final /* synthetic */ String f304563b;

    /* renamed from: c */
    final /* synthetic */ C109354kq f304564c;

    /* renamed from: d */
    final /* synthetic */ C109346ki f304565d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109341kd(C109346ki kiVar, String str, String str2, C109354kq kqVar) {
        super("Add a offline voice tips bubble in OPA.");
        this.f304565d = kiVar;
        this.f304562a = str;
        this.f304563b = str2;
        this.f304564c = kqVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f304565d.mo97781h(this.f304562a, this.f304563b, this.f304564c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f304565d.mo97781h(this.f304562a, this.f304563b, this.f304564c);
        String b = C109346ki.m182023b((C58495hd) obj);
        if (b.length() > 0) {
            C109346ki kiVar = this.f304565d;
            kiVar.mo97780g(kiVar.mo97777a(R.string.opa_offline_voice_tips_prefix), this.f304564c);
            this.f304565d.mo97780g(b, this.f304564c);
        }
    }
}
