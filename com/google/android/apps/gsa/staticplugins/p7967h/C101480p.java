package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48841bh;
import com.google.assistant.p3803ag.p3804a.C48843bj;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.assistant.p3803ag.p3804a.C48881x;
import com.google.assistant.p3803ag.p3804a.C48882y;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.p */
/* compiled from: PG */
public final /* synthetic */ class C101480p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C101480p f283129a = new C101480p();

    private /* synthetic */ C101480p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48840bg bgVar;
        C83685d dVar = (C83685d) obj;
        int i = C101483s.f283139m;
        C48881x xVar = (C48881x) C48882y.f126493d.createBuilder();
        if (dVar.f228116b == 4) {
            bgVar = (C48840bg) dVar.f228117c;
        } else {
            bgVar = C48840bg.f126386b;
        }
        C48855bv bvVar = bgVar.f126389a;
        if (bvVar == null) {
            bvVar = C48855bv.f126424b;
        }
        xVar.copyOnWrite();
        C48882y yVar = (C48882y) xVar.instance;
        bvVar.getClass();
        yVar.f126497c = bvVar;
        yVar.f126495a |= 2;
        C48841bh bhVar = (C48841bh) C48843bj.f126392c.createBuilder();
        bhVar.copyOnWrite();
        C48843bj bjVar = (C48843bj) bhVar.instance;
        bjVar.f126395b = 3;
        bjVar.f126394a |= 1;
        xVar.copyOnWrite();
        C48882y yVar2 = (C48882y) xVar.instance;
        C48843bj bjVar2 = (C48843bj) bhVar.build();
        bjVar2.getClass();
        yVar2.f126496b = bjVar2;
        yVar2.f126495a |= 1;
        return (C48882y) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
