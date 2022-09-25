package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C122516bp implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122519bs f339625a;

    /* renamed from: b */
    public final /* synthetic */ C122463r f339626b;

    public /* synthetic */ C122516bp(C122519bs bsVar, C122463r rVar) {
        this.f339625a = bsVar;
        this.f339626b = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122412bd bdVar = this.f339625a.f339629a;
        C70876o.m103763d(bdVar.f189039a.mo39510a(C122413be.m201879e(), bdVar.f189040b), this.f339626b, (C70862aj) obj, false);
        return "OnDeviceNluFulfillmentServiceConnectionImpl.setResources";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
