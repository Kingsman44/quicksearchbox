package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.g */
/* compiled from: PG */
public final /* synthetic */ class C76674g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f211945a;

    /* renamed from: b */
    public final /* synthetic */ C76684q f211946b;

    /* renamed from: c */
    public final /* synthetic */ C122549e f211947c;

    /* renamed from: d */
    public final /* synthetic */ C122461p f211948d;

    /* renamed from: e */
    public final /* synthetic */ C52091ex f211949e;

    /* renamed from: f */
    public final /* synthetic */ C122454i f211950f;

    /* renamed from: g */
    public final /* synthetic */ C122108a f211951g;

    /* renamed from: h */
    public final /* synthetic */ int f211952h;

    public /* synthetic */ C76674g(C47770dh dhVar, C76684q qVar, C122549e eVar, C122461p pVar, C52091ex exVar, int i, C122454i iVar, C122108a aVar) {
        this.f211945a = dhVar;
        this.f211946b = qVar;
        this.f211947c = eVar;
        this.f211948d = pVar;
        this.f211949e = exVar;
        this.f211952h = i;
        this.f211950f = iVar;
        this.f211951g = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C47770dh dhVar = this.f211945a;
        C76684q qVar = this.f211946b;
        C122549e eVar = this.f211947c;
        C122461p pVar = this.f211948d;
        C52091ex exVar = this.f211949e;
        int i = this.f211952h;
        C122454i iVar = this.f211950f;
        C122108a aVar = this.f211951g;
        C70862aj ajVar = (C70862aj) obj;
        C47538ax c = dhVar.mo51613c("NGA");
        try {
            qVar.f211972a = eVar.mo105653e(pVar, exVar, i, iVar, ajVar, aVar);
            if (c != null) {
                c.close();
            }
            return "[NGA] FulfillmentGrpcServiceImpl prefetch observer";
        } catch (Throwable th) {
            C76670c.m123281a(th, th);
        }
        throw th;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
