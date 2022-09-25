package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122399ar;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bn */
/* compiled from: PG */
public final /* synthetic */ class C122514bn implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122519bs f339622a;

    /* renamed from: b */
    public final /* synthetic */ C122399ar f339623b;

    public /* synthetic */ C122514bn(C122519bs bsVar, C122399ar arVar) {
        this.f339622a = bsVar;
        this.f339623b = arVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122412bd bdVar = this.f339622a.f339629a;
        C70876o.m103763d(bdVar.f189039a.mo39510a(C122413be.m201887m(), bdVar.f189040b), this.f339623b, (C70862aj) obj, false);
        return "OnDeviceNluFulfillmentServiceConnectionImpl.updateGellerData";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
