package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.f */
/* compiled from: PG */
public final /* synthetic */ class C79119f implements Function {

    /* renamed from: a */
    public final /* synthetic */ C61746h f217510a;

    public /* synthetic */ C79119f(C61746h hVar) {
        this.f217510a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C61752n nVar = (C61752n) obj;
        C61748j jVar = this.f217510a.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        C61747i iVar = (C61747i) jVar.toBuilder();
        iVar.copyOnWrite();
        C61748j jVar2 = (C61748j) iVar.instance;
        nVar.getClass();
        jVar2.f166803b = nVar;
        jVar2.f166802a = 2;
        return (C61748j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
