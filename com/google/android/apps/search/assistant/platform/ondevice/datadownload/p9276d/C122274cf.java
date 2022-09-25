package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17034aa;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17081z;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.cf */
/* compiled from: PG */
final class C122274cf implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f339059a;

    public C122274cf(C70862aj ajVar) {
        this.f339059a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C122275cg.f339060a.mo56225c()).mo56382g(th)).mo56372aa(34747)).mo56386p("Failure in downloading missing groups.");
        C70862aj ajVar = this.f339059a;
        C17081z zVar = (C17081z) C17034aa.f49636c.createBuilder();
        zVar.copyOnWrite();
        C17034aa aaVar = (C17034aa) zVar.instance;
        aaVar.f49638a |= 1;
        aaVar.f49639b = false;
        ajVar.mo20123c((C17034aa) zVar.build());
        this.f339059a.mo20121a();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C70862aj ajVar = this.f339059a;
        C17081z zVar = (C17081z) C17034aa.f49636c.createBuilder();
        zVar.copyOnWrite();
        C17034aa aaVar = (C17034aa) zVar.instance;
        aaVar.f49638a |= 1;
        aaVar.f49639b = true;
        ajVar.mo20123c((C17034aa) zVar.build());
        this.f339059a.mo20121a();
    }
}
