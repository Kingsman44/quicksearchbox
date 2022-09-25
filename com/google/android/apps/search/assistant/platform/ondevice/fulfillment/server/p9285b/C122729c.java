package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9285b;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122813m;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122814n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122815o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.b.c */
/* compiled from: PG */
public final /* synthetic */ class C122729c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122727a f340043a;

    public /* synthetic */ C122729c(C122727a aVar) {
        this.f340043a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122815o oVar = (C122815o) obj;
        C122727a a = this.f340043a.mo105730a("Lifecycle");
        a.mo105731b("id", Integer.toString(oVar.f340187c.f340158a));
        a.mo105731b("created", Long.toString(oVar.f340187c.f340159b.toEpochMilli()));
        a.mo105731b("locale", oVar.f340186b);
        return C47633f.m84733g(oVar.f340185a.mo105884b()).mo51515h(new C122813m(a), C60826bg.f164896a).mo51513e(Throwable.class, new C122814n(a), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
