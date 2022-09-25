package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138221a;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138244w;
import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C138386ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138396ar f376478a;

    /* renamed from: b */
    public final /* synthetic */ C138467co f376479b;

    public /* synthetic */ C138386ah(C138396ar arVar, C138467co coVar) {
        this.f376478a = arVar;
        this.f376479b = coVar;
    }

    public final Object apply(Object obj) {
        C138396ar arVar = this.f376478a;
        C138467co coVar = this.f376479b;
        for (C138244w wVar : arVar.f376494d) {
            C69664n.m101061g(coVar, "cacheEntry");
            if (C138221a.m224578a()) {
                wVar.f376126a.mo114203b();
            }
        }
        return obj;
    }
}
