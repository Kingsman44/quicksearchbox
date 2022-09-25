package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bj */
/* compiled from: PG */
public final /* synthetic */ class C96551bj implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96558bq f270110a;

    /* renamed from: b */
    public final /* synthetic */ String f270111b;

    /* renamed from: c */
    public final /* synthetic */ C90919bp f270112c;

    /* renamed from: d */
    public final /* synthetic */ Object f270113d;

    public /* synthetic */ C96551bj(C96558bq bqVar, String str, C90919bp bpVar, Object obj) {
        this.f270110a = bqVar;
        this.f270111b = str;
        this.f270112c = bpVar;
        this.f270113d = obj;
    }

    public final void run() {
        C96558bq bqVar = this.f270110a;
        String str = this.f270111b;
        C90919bp bpVar = this.f270112c;
        Object obj = this.f270113d;
        if (bqVar.f270135m) {
            C59104x b = C96558bq.f270132j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
            ((C59052c) ((C59052c) b).mo56372aa(16627)).mo56354G("Future %s complete when %s exited", str, bqVar.mo90224a());
            return;
        }
        bpVar.mo17870a(obj);
    }
}
