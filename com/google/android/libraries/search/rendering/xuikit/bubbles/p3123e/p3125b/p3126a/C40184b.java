package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a;

import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40544l;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57804ah;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57813j;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.a.b */
/* compiled from: PG */
final class C40184b implements Function {

    /* renamed from: a */
    final /* synthetic */ C69626l f105567a;

    public C40184b(C69626l lVar) {
        this.f105567a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C57804ah ahVar;
        C57827x xVar = (C57827x) obj;
        C57813j jVar = xVar.f154504d;
        if (jVar == null) {
            jVar = C57813j.f154466e;
        }
        int i = jVar.f154469b;
        C69626l lVar = this.f105567a;
        if (xVar.f154502b == 3) {
            ahVar = (C57804ah) xVar.f154503c;
        } else {
            ahVar = C57804ah.f154429f;
        }
        C69664n.m101060f(ahVar, "it.bubbleResponse");
        return new C40544l(i, (C57784p) lVar.mo5761a(ahVar), 4);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
