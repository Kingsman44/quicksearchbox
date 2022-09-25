package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50667c;
import com.google.assistant.p3886c.p3887a.C50668d;
import p3186j$.time.Duration;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C131009aw implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C131009aw f358408a = new C131009aw();

    private /* synthetic */ C131009aw() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C50668d dVar = (C50668d) obj;
        C50668d dVar2 = (C50668d) obj2;
        Duration duration = C131043cc.f358455a;
        C50667c cVar = (C50667c) C50668d.f131800j.createBuilder();
        long j = dVar.f131805d;
        long j2 = dVar2.f131805d;
        cVar.copyOnWrite();
        C50668d dVar3 = (C50668d) cVar.instance;
        dVar3.f131802a |= 4;
        dVar3.f131805d = j + j2;
        long j3 = dVar.f131803b;
        long j4 = dVar2.f131803b;
        cVar.copyOnWrite();
        C50668d dVar4 = (C50668d) cVar.instance;
        dVar4.f131802a |= 1;
        dVar4.f131803b = j3 + j4;
        long j5 = dVar.f131804c;
        long j6 = dVar2.f131804c;
        cVar.copyOnWrite();
        C50668d dVar5 = (C50668d) cVar.instance;
        dVar5.f131802a |= 2;
        dVar5.f131804c = j5 + j6;
        long j7 = dVar.f131806e;
        long j8 = dVar2.f131806e;
        cVar.copyOnWrite();
        C50668d dVar6 = (C50668d) cVar.instance;
        dVar6.f131802a |= 8;
        dVar6.f131806e = j7 + j8;
        long j9 = dVar.f131809h;
        long j10 = dVar2.f131809h;
        cVar.copyOnWrite();
        C50668d dVar7 = (C50668d) cVar.instance;
        dVar7.f131802a |= 64;
        dVar7.f131809h = j9 + j10;
        long j11 = dVar.f131807f;
        long j12 = dVar2.f131807f;
        cVar.copyOnWrite();
        C50668d dVar8 = (C50668d) cVar.instance;
        dVar8.f131802a |= 16;
        dVar8.f131807f = j11 + j12;
        long j13 = dVar.f131810i;
        long j14 = dVar2.f131810i;
        cVar.copyOnWrite();
        C50668d dVar9 = (C50668d) cVar.instance;
        dVar9.f131802a |= 128;
        dVar9.f131810i = j13 + j14;
        long j15 = dVar.f131808g;
        long j16 = dVar2.f131808g;
        cVar.copyOnWrite();
        C50668d dVar10 = (C50668d) cVar.instance;
        dVar10.f131802a |= 32;
        dVar10.f131808g = j15 + j16;
        return (C50668d) cVar.build();
    }
}
