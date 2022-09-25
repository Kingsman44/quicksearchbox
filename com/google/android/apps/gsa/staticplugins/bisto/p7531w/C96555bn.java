package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bn */
/* compiled from: PG */
public final /* synthetic */ class C96555bn implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96558bq f270122a;

    /* renamed from: b */
    public final /* synthetic */ String f270123b;

    /* renamed from: c */
    public final /* synthetic */ C90919bp f270124c;

    /* renamed from: d */
    public final /* synthetic */ Exception f270125d;

    public /* synthetic */ C96555bn(C96558bq bqVar, String str, C90919bp bpVar, Exception exc) {
        this.f270122a = bqVar;
        this.f270123b = str;
        this.f270124c = bpVar;
        this.f270125d = exc;
    }

    public final void run() {
        C96558bq bqVar = this.f270122a;
        String str = this.f270123b;
        C90919bp bpVar = this.f270124c;
        Exception exc = this.f270125d;
        if (bqVar.f270135m) {
            C59104x b = C96558bq.f270132j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
            ((C59052c) ((C59052c) b).mo56372aa(16628)).mo56354G("Future %s failed when %s exited", str, bqVar.mo90224a());
            return;
        }
        bpVar.mo17870a(exc);
    }
}
