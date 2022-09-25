package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.k */
/* compiled from: PG */
public final /* synthetic */ class C137216k implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C137230y f373336a;

    /* renamed from: b */
    public final /* synthetic */ List f373337b;

    public /* synthetic */ C137216k(C137230y yVar, List list) {
        this.f373336a = yVar;
        this.f373337b = list;
    }

    public final void accept(Object obj, Object obj2) {
        C137230y yVar = this.f373336a;
        List list = this.f373337b;
        String str = (String) obj;
        String str2 = (String) obj2;
        C60870cx c = yVar.mo113595c(str);
        C137211f fVar = new C137211f(yVar, str);
        list.add(C60922j.m93045h(c, C47810es.m84966f(fVar), yVar.f373364e));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
