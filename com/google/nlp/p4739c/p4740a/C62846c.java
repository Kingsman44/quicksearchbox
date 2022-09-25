package com.google.nlp.p4739c.p4740a;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Function;

/* renamed from: com.google.nlp.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C62846c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C62846c f169722a = new C62846c();

    private /* synthetic */ C62846c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61752n nVar;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 2) {
            nVar = (C61752n) jVar.f166803b;
        } else {
            nVar = C61752n.f166808f;
        }
        return Boolean.valueOf(nVar.f166811b.equals("Song"));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
