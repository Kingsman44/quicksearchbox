package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.google.android.libraries.web.p3353c.C43362g;
import p3186j$.util.function.Predicate;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.r */
/* compiled from: PG */
final class C44290r extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Predicate f115184a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44290r(Predicate predicate) {
        super(1);
        this.f115184a = predicate;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C43362g gVar = (C43362g) obj;
        C69664n.m101061g(gVar, "it");
        return Boolean.valueOf(this.f115184a.test(gVar));
    }
}
