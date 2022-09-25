package com.google.android.libraries.p1969j.p1970a.p1974b;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4184bj.p4193c.p4197c.C55951ay;

/* renamed from: com.google.android.libraries.j.a.b.ab */
/* compiled from: PG */
final class C23944ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C23948af f65483a;

    public C23944ab(C23948af afVar) {
        this.f65483a = afVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C23948af.f65488c.mo56224b()).mo56372aa(47947)).mo56386p("Fetching texts failed. Increase log verbosity level to get more information or consider debugging via Sherlog.");
        th.getMessage();
        C58838bb.m90866a(this.f65483a.f65493g, "Invalid state of the GRPC channel for FPOP");
        this.f65483a.f65493g.mo61974f();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C55951ay ayVar = (C55951ay) obj;
        ((C59052c) ((C59052c) C23948af.f65488c.mo56224b()).mo56372aa(47949)).mo56386p("GetSettingTextResponse is retrieved from FPOP.");
        C58838bb.m90866a(this.f65483a.f65493g, "Invalid state of the GRPC channel for FPOP");
        this.f65483a.f65493g.mo61974f();
    }
}
