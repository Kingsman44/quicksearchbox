package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124625ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.bm */
/* compiled from: PG */
public final /* synthetic */ class C96554bm implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96558bq f270120a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f270121b;

    public /* synthetic */ C96554bm(C96558bq bqVar, SettableFuture settableFuture) {
        this.f270120a = bqVar;
        this.f270121b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96558bq bqVar = this.f270120a;
        SettableFuture settableFuture = this.f270121b;
        C59104x c = C96558bq.f270132j.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OtaSessionStateBase");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(16624)).mo56386p("Failed to abort OTA");
        bqVar.f270142t.mo90283g();
        bqVar.mo90240o(C124625ar.UNKNOWN_INTERNAL_OTA_STATE);
        settableFuture.mo57356n(C118826c.f331422a);
    }
}
