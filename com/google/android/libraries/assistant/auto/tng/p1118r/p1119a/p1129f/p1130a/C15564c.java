package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1129f.p1130a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.assistant.p3897e.p3921j.C52091ex;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C15564c implements Function {

    /* renamed from: a */
    public final /* synthetic */ boolean f46565a;

    /* renamed from: b */
    public final /* synthetic */ boolean f46566b;

    /* renamed from: c */
    public final /* synthetic */ C122549e f46567c;

    /* renamed from: d */
    public final /* synthetic */ C122419bk f46568d;

    /* renamed from: e */
    public final /* synthetic */ C122461p f46569e;

    /* renamed from: f */
    public final /* synthetic */ C122108a f46570f;

    public /* synthetic */ C15564c(boolean z, boolean z2, C122549e eVar, C122419bk bkVar, C122461p pVar, C122108a aVar) {
        this.f46565a = z;
        this.f46566b = z2;
        this.f46567c = eVar;
        this.f46568d = bkVar;
        this.f46569e = pVar;
        this.f46570f = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f46565a;
        boolean z2 = this.f46566b;
        C122549e eVar = this.f46567c;
        C122419bk bkVar = this.f46568d;
        C122461p pVar = this.f46569e;
        C122108a aVar = this.f46570f;
        C70862aj ajVar = (C70862aj) obj;
        if (!z || !z2) {
            eVar.mo105650b(bkVar);
        }
        eVar.mo105654f(pVar, C52091ex.f136710b, ajVar, aVar);
        return "[AAP] AapOnDeviceNluFulfillmentProducerModule POP fulfillment";
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
