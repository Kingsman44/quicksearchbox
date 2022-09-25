package com.google.android.apps.search.podcasts.language.p10578b;

import com.google.android.apps.search.podcasts.language.p10577a.C140516a;
import java.util.concurrent.Callable;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.b.c */
/* compiled from: PG */
public final class C140523c implements Callable {

    /* renamed from: a */
    final /* synthetic */ C140532l f381660a;

    /* renamed from: b */
    final /* synthetic */ String f381661b;

    public C140523c(C140532l lVar, String str) {
        this.f381660a = lVar;
        this.f381661b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C140532l lVar = this.f381660a;
        C140516a aVar = lVar.f381684g;
        String str = this.f381661b;
        aVar.f381652b = !C69664n.m101066l(lVar.mo115717a(aVar.f381651a), lVar.mo115717a(str));
        C69664n.m101061g(str, "<set-?>");
        aVar.f381651a = str;
        return C69788q.f186170a;
    }
}
