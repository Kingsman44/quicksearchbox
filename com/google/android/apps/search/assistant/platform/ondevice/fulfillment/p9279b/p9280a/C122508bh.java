package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122412bd;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.nlp.p4730a.C62799s;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.bh */
/* compiled from: PG */
public final /* synthetic */ class C122508bh implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122519bs f339611a;

    /* renamed from: b */
    public final /* synthetic */ C62799s f339612b;

    public /* synthetic */ C122508bh(C122519bs bsVar, C62799s sVar) {
        this.f339611a = bsVar;
        this.f339612b = sVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122412bd bdVar = this.f339611a.f339629a;
        C70876o.m103763d(bdVar.f189039a.mo39510a(C122413be.m201885k(), bdVar.f189040b), this.f339612b, (C70862aj) obj, false);
        return "OnDeviceNluFulfillmentServiceConnectionImpl.realize";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
