package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C123232e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f340939a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f340940b;

    public /* synthetic */ C123232e(C70862aj ajVar, C70862aj ajVar2) {
        this.f340939a = ajVar;
        this.f340940b = ajVar2;
    }

    public final Object apply(Object obj) {
        C70862aj ajVar = this.f340939a;
        C70862aj ajVar2 = this.f340940b;
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) ((C59052c) C123238k.f340954a.mo56226d()).mo56382g(th)).mo56372aa(34959)).mo56386p("Failed to add side channel info to initial request to S3");
        StatusException asException = Status.f186915m.mo61678e(th).asException();
        ajVar.mo20122b(asException);
        ajVar2.mo20122b(asException);
        return null;
    }
}
