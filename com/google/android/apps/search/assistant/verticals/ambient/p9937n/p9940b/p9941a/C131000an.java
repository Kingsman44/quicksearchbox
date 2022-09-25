package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50679o;
import com.google.assistant.p3886c.p3887a.C50680p;
import p3186j$.time.Duration;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.an */
/* compiled from: PG */
public final /* synthetic */ class C131000an implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C131000an f358398a = new C131000an();

    private /* synthetic */ C131000an() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C50680p pVar = (C50680p) obj;
        C50680p pVar2 = (C50680p) obj2;
        Duration duration = C131043cc.f358455a;
        C50679o oVar = (C50679o) C50680p.f131848d.createBuilder();
        long j = pVar.f131851b;
        long j2 = pVar2.f131851b;
        oVar.copyOnWrite();
        C50680p pVar3 = (C50680p) oVar.instance;
        pVar3.f131850a |= 1;
        pVar3.f131851b = j + j2;
        long j3 = pVar.f131852c;
        long j4 = pVar2.f131852c;
        oVar.copyOnWrite();
        C50680p pVar4 = (C50680p) oVar.instance;
        pVar4.f131850a |= 2;
        pVar4.f131852c = j3 + j4;
        return (C50680p) oVar.build();
    }
}
