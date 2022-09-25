package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50665a;
import com.google.assistant.p3886c.p3887a.C50666b;
import p3186j$.time.Duration;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C131032bs implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C131032bs f358442a = new C131032bs();

    private /* synthetic */ C131032bs() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C50666b bVar = (C50666b) obj;
        C50666b bVar2 = (C50666b) obj2;
        Duration duration = C131043cc.f358455a;
        C50665a aVar = (C50665a) C50666b.f131787l.createBuilder();
        String str = bVar.f131790b;
        aVar.copyOnWrite();
        C50666b bVar3 = (C50666b) aVar.instance;
        str.getClass();
        bVar3.f131789a |= 1;
        bVar3.f131790b = str;
        long j = bVar.f131793e;
        long j2 = bVar2.f131793e;
        aVar.copyOnWrite();
        C50666b bVar4 = (C50666b) aVar.instance;
        bVar4.f131789a |= 16;
        bVar4.f131793e = j + j2;
        long j3 = bVar.f131791c;
        long j4 = bVar2.f131791c;
        aVar.copyOnWrite();
        C50666b bVar5 = (C50666b) aVar.instance;
        bVar5.f131789a |= 4;
        bVar5.f131791c = j3 + j4;
        long j5 = bVar.f131792d;
        long j6 = bVar2.f131792d;
        aVar.copyOnWrite();
        C50666b bVar6 = (C50666b) aVar.instance;
        bVar6.f131789a |= 8;
        bVar6.f131792d = j5 + j6;
        long j7 = bVar.f131794f;
        long j8 = bVar2.f131794f;
        aVar.copyOnWrite();
        C50666b bVar7 = (C50666b) aVar.instance;
        bVar7.f131789a |= 32;
        bVar7.f131794f = j7 + j8;
        long j9 = bVar.f131797i;
        long j10 = bVar2.f131797i;
        aVar.copyOnWrite();
        C50666b bVar8 = (C50666b) aVar.instance;
        bVar8.f131789a |= 256;
        bVar8.f131797i = j9 + j10;
        long j11 = bVar.f131795g;
        long j12 = bVar2.f131795g;
        aVar.copyOnWrite();
        C50666b bVar9 = (C50666b) aVar.instance;
        bVar9.f131789a |= 64;
        bVar9.f131795g = j11 + j12;
        long j13 = bVar.f131798j;
        long j14 = bVar2.f131798j;
        aVar.copyOnWrite();
        C50666b bVar10 = (C50666b) aVar.instance;
        bVar10.f131789a |= 512;
        bVar10.f131798j = j13 + j14;
        long j15 = bVar.f131796h + bVar2.f131796h;
        aVar.copyOnWrite();
        C50666b bVar11 = (C50666b) aVar.instance;
        bVar11.f131789a |= 128;
        bVar11.f131796h = j15;
        return (C50666b) aVar.build();
    }
}
