package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.assistant.p3897e.p3921j.C52091ex;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.h */
/* compiled from: PG */
final class C125701h implements Function {

    /* renamed from: a */
    final /* synthetic */ C125702i f346449a;

    /* renamed from: b */
    final /* synthetic */ C122461p f346450b;

    /* renamed from: c */
    final /* synthetic */ C52091ex f346451c;

    /* renamed from: d */
    final /* synthetic */ C122108a f346452d;

    public C125701h(C125702i iVar, C122461p pVar, C52091ex exVar, C122108a aVar) {
        this.f346449a = iVar;
        this.f346450b = pVar;
        this.f346451c = exVar;
        this.f346452d = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C70862aj ajVar = (C70862aj) obj;
        C69664n.m101061g(ajVar, "observer");
        this.f346449a.f346459g.mo105652d(this.f346450b, this.f346451c, ajVar, this.f346452d);
        return "NlufServiceNlufFulfillmentHandler.fulfill";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
