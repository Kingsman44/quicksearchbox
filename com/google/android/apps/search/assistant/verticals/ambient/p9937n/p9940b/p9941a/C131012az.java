package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50665a;
import com.google.assistant.p3886c.p3887a.C50666b;
import com.google.assistant.p3886c.p3887a.C50668d;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.az */
/* compiled from: PG */
public final /* synthetic */ class C131012az implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131012az f358411a = new C131012az();

    private /* synthetic */ C131012az() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50666b bVar = (C50666b) obj;
        Duration duration = C131043cc.f358455a;
        C50668d dVar = (C50668d) Collection.EL.stream(bVar.f131799k).map(C131019bf.f358419a).reduce(C131009aw.f358408a).orElse(C50668d.f131800j);
        C50665a aVar = (C50665a) bVar.toBuilder();
        if ((dVar.f131802a & 4) != 0) {
            long j = dVar.f131805d;
            aVar.copyOnWrite();
            C50666b bVar2 = (C50666b) aVar.instance;
            bVar2.f131789a |= 16;
            bVar2.f131793e = j;
        }
        if ((dVar.f131802a & 1) != 0) {
            long j2 = dVar.f131803b;
            aVar.copyOnWrite();
            C50666b bVar3 = (C50666b) aVar.instance;
            bVar3.f131789a |= 4;
            bVar3.f131791c = j2;
        }
        if ((dVar.f131802a & 2) != 0) {
            long j3 = dVar.f131804c;
            aVar.copyOnWrite();
            C50666b bVar4 = (C50666b) aVar.instance;
            bVar4.f131789a |= 8;
            bVar4.f131792d = j3;
        }
        if ((dVar.f131802a & 8) != 0) {
            long j4 = dVar.f131806e;
            aVar.copyOnWrite();
            C50666b bVar5 = (C50666b) aVar.instance;
            bVar5.f131789a |= 32;
            bVar5.f131794f = j4;
        }
        if ((dVar.f131802a & 64) != 0) {
            long j5 = dVar.f131809h;
            aVar.copyOnWrite();
            C50666b bVar6 = (C50666b) aVar.instance;
            bVar6.f131789a |= 256;
            bVar6.f131797i = j5;
        }
        if ((dVar.f131802a & 16) != 0) {
            long j6 = dVar.f131807f;
            aVar.copyOnWrite();
            C50666b bVar7 = (C50666b) aVar.instance;
            bVar7.f131789a |= 64;
            bVar7.f131795g = j6;
        }
        if ((dVar.f131802a & 128) != 0) {
            long j7 = dVar.f131810i;
            aVar.copyOnWrite();
            C50666b bVar8 = (C50666b) aVar.instance;
            bVar8.f131789a |= 512;
            bVar8.f131798j = j7;
        }
        if ((dVar.f131802a & 32) != 0) {
            long j8 = dVar.f131808g;
            aVar.copyOnWrite();
            C50666b bVar9 = (C50666b) aVar.instance;
            bVar9.f131789a |= 128;
            bVar9.f131796h = j8;
        }
        return (C50666b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
