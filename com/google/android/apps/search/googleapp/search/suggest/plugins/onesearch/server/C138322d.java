package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138154b;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import p5462h.C69613f;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server.d */
/* compiled from: PG */
final class C138322d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f376345a;

    public C138322d(C70862aj ajVar) {
        this.f376345a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C138331m.f376354a.mo56226d()).mo56382g(th)).mo56372aa(41157)).mo56386p("#getSuggestions failed");
        this.f376345a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C59071e eVar = C138331m.f376354a;
        C69613f fVar = C138165m.f375923a;
        ((C59052c) eVar.mo56223a(C138154b.m224512a()).mo56372aa(41158)).mo56386p("#getSuggestions succeeded");
        this.f376345a.mo20123c((C138317r) obj);
        this.f376345a.mo20121a();
    }
}
