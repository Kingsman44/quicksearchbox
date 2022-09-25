package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.google.android.libraries.web.p3353c.C43363h;
import java.io.IOException;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.ac */
/* compiled from: PG */
final /* synthetic */ class C44272ac implements Function {

    /* renamed from: a */
    final /* synthetic */ C69626l f115133a;

    public C44272ac(C69626l lVar) {
        this.f115133a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        IOException iOException = (IOException) obj;
        C69664n.m101061g(iOException, "p0");
        return (C43363h) this.f115133a.mo5761a(iOException);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
