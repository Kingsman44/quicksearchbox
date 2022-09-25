package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import com.google.android.apps.gsa.assistant.shared.n.r;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73893f;
import com.google.android.apps.gsa.shared.p7006ax.C89328g;
import com.google.common.base.C58833ax;
import com.google.speech.p5208h.C66595bu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.w */
/* compiled from: PG */
public final /* synthetic */ class C101569w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C101547aa f283422a;

    public /* synthetic */ C101569w(C101547aa aaVar) {
        this.f283422a = aaVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C101547aa aaVar = this.f283422a;
        C89328g gVar = (C89328g) obj;
        r b = C73893f.m108487b();
        r rVar = b;
        rVar.a = aaVar.f283381c.mo79689w(aaVar.f283383e);
        rVar.b = (C66595bu) aaVar.f283379a.mo87020a().mo56111f();
        rVar.c = gVar.mo83270g();
        rVar.d = null;
        rVar.e = null;
        b.c(gVar.mo83266d());
        b.b(gVar.mo83265c());
        b.d(gVar.mo83267e());
        rVar.i = gVar.mo83269f();
        rVar.k = C58833ax.m90833j(aaVar.getClass().getSimpleName());
        return b.a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
