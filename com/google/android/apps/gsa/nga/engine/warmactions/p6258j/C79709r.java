package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.assistant.p3897e.p3908d.p3909a.C51174e;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.r */
/* compiled from: PG */
public final /* synthetic */ class C79709r implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79713v f218604a;

    public /* synthetic */ C79709r(C79713v vVar) {
        this.f218604a = vVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79713v vVar = this.f218604a;
        C51174e eVar = (C51174e) C51175f.f133205f.createBuilder();
        int i = vVar.f218609b;
        vVar.f218609b = i + 1;
        eVar.copyOnWrite();
        C51175f fVar = (C51175f) eVar.instance;
        fVar.f133207a |= 1;
        fVar.f133208b = i;
        eVar.mo53531b(((C52083ep) obj).f136694d);
        return (C51175f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
