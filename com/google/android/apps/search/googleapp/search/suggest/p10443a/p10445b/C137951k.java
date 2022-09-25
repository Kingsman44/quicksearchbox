package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.k */
/* compiled from: PG */
final class C137951k extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ int f375315a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137951k(int i) {
        super(1);
        this.f375315a = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C137963w wVar = (C137963w) obj;
        C69664n.m101061g(wVar, "data");
        C137962v vVar = (C137962v) wVar.toBuilder();
        int i = this.f375315a;
        vVar.copyOnWrite();
        C137963w wVar2 = (C137963w) vVar.instance;
        wVar2.f375350a |= 1;
        wVar2.f375351b = i + 1;
        C62942bv build = vVar.build();
        C69664n.m101060f(build, "data.toBuilder().setNumb…ocalSearches + 1).build()");
        return (C137963w) build;
    }
}
