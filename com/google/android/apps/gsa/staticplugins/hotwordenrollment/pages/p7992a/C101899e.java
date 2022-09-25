package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7992a;

import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.a.e */
/* compiled from: PG */
public final /* synthetic */ class C101899e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C101899e f284232a = new C101899e();

    private /* synthetic */ C101899e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
        C63088z A = C63088z.m96139A((byte[]) obj);
        oVar.copyOnWrite();
        C67171p pVar = (C67171p) oVar.instance;
        pVar.f182577a |= 1;
        pVar.f182578b = A;
        C67172q e = C19245ah.m36697e();
        oVar.copyOnWrite();
        C67171p pVar2 = (C67171p) oVar.instance;
        C67175t tVar = (C67175t) e.build();
        tVar.getClass();
        pVar2.f182579c = tVar;
        pVar2.f182577a |= 2;
        return (C67171p) oVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
