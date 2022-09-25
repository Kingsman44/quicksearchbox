package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63033ey;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.l */
/* compiled from: PG */
public final /* synthetic */ class C137217l implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C137230y f373338a;

    /* renamed from: b */
    public final /* synthetic */ List f373339b;

    public /* synthetic */ C137217l(C137230y yVar, List list) {
        this.f373338a = yVar;
        this.f373339b = list;
    }

    public final void accept(Object obj, Object obj2) {
        C137230y yVar = this.f373338a;
        List list = this.f373339b;
        String str = (String) obj;
        C60870cx d = yVar.f373361b.mo50344d(C63033ey.m95859a(str), C60856cj.m92900i(C63033ey.m95859a((String) obj2)));
        C137210e eVar = new C137210e(str);
        list.add(C60922j.m93044g(d, C47810es.m84963c(eVar), yVar.f373364e));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
