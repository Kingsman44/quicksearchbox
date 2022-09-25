package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70883v;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bg */
/* compiled from: PG */
public final /* synthetic */ class C122248bg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122261bt f338991a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f338992b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f338993c;

    /* renamed from: d */
    public final /* synthetic */ C70883v f338994d;

    /* renamed from: e */
    public final /* synthetic */ C58485gu f338995e;

    public /* synthetic */ C122248bg(C122261bt btVar, C60870cx cxVar, C58833ax axVar, C70883v vVar, C58485gu guVar) {
        this.f338991a = btVar;
        this.f338992b = cxVar;
        this.f338993c = axVar;
        this.f338994d = vVar;
        this.f338995e = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122261bt btVar = this.f338991a;
        C60870cx cxVar = this.f338992b;
        C122222ah ahVar = new C122222ah((C122260bs) obj, this.f338993c, this.f338994d, this.f338995e);
        return C60922j.m93044g(cxVar, C47810es.m84963c(ahVar), btVar.f339020c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
