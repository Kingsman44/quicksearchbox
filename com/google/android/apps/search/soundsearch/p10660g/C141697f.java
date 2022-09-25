package com.google.android.apps.search.soundsearch.p10660g;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.soundsearch.g.f */
/* compiled from: PG */
final class C141697f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C141701j f384569a;

    public C141697f(C141701j jVar) {
        this.f384569a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C141701j.f384577a.mo56226d()).mo56382g(th)).mo56372aa(41787)).mo56386p("Failed uploading data to S3");
        C70862aj ajVar = this.f384569a.f384583g;
        ajVar.getClass();
        ajVar.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C141701j.f384577a.mo56224b()).mo56372aa(41788)).mo56386p("Finished uploading data to S3");
    }
}
