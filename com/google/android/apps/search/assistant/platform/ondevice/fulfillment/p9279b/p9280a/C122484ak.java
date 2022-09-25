package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C122484ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122504bd f339564a;

    /* renamed from: b */
    public final /* synthetic */ Map f339565b;

    public /* synthetic */ C122484ak(C122504bd bdVar, Map map) {
        this.f339564a = bdVar;
        this.f339565b = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122504bd bdVar = this.f339564a;
        C122485al alVar = new C122485al(this.f339565b, (Integer) obj);
        return C60856cj.m92904m(C47810es.m84978r(alVar), bdVar.f339603c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
