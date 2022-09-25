package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.o */
/* compiled from: PG */
final class C137955o extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ boolean f375325a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137955o(boolean z) {
        super(1);
        this.f375325a = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C137941aa aaVar = (C137941aa) obj;
        C69664n.m101061g(aaVar, "data");
        C137966z zVar = (C137966z) aaVar.toBuilder();
        boolean z = this.f375325a;
        zVar.copyOnWrite();
        C137941aa aaVar2 = (C137941aa) zVar.instance;
        aaVar2.f375289a |= 1;
        aaVar2.f375290b = z;
        C62942bv build = zVar.build();
        C69664n.m101060f(build, "data.toBuilder().setIsSi…nEnabled(enabled).build()");
        return (C137941aa) build;
    }
}
