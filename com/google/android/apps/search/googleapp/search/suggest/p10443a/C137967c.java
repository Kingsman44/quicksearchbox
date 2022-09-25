package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137978d;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10447d.C137979e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.c */
/* compiled from: PG */
public final /* synthetic */ class C137967c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138001s f375358a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f375359b;

    /* renamed from: c */
    public final /* synthetic */ C138134p f375360c;

    public /* synthetic */ C137967c(C138001s sVar, C138133o oVar, C138134p pVar) {
        this.f375358a = sVar;
        this.f375359b = oVar;
        this.f375360c = pVar;
    }

    public final C60870cx apply(Object obj) {
        C138001s sVar = this.f375358a;
        C138133o oVar = this.f375359b;
        C138134p pVar = this.f375360c;
        List list = (List) obj;
        C137979e eVar = sVar.f375435g;
        C69664n.m101061g(oVar, "request");
        C69664n.m101061g(list, "suggestions");
        C69664n.m101061g(pVar, "responseParameters");
        return C71663i.m104688a(C71803m.m105042c(eVar.f375392a, (C69585o) null, (C71424ay) null, new C137978d(eVar, oVar, list, pVar, (C69577g) null), 3));
    }
}
