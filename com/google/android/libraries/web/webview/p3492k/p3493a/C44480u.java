package com.google.android.libraries.web.webview.p3492k.p3493a;

import com.google.android.libraries.web.p3353c.C43363h;
import java.io.IOException;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.k.a.u */
/* compiled from: PG */
final /* synthetic */ class C44480u implements Function {

    /* renamed from: a */
    final /* synthetic */ C69626l f115629a;

    public C44480u(C69626l lVar) {
        this.f115629a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        IOException iOException = (IOException) obj;
        C69664n.m101061g(iOException, "p0");
        return (C43363h) this.f115629a.mo5761a(iOException);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
