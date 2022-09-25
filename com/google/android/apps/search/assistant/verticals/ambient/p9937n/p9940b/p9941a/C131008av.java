package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131079b;
import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131080c;
import com.google.assistant.p3886c.p3887a.C50667c;
import com.google.assistant.p3886c.p3887a.C50668d;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.av */
/* compiled from: PG */
public final /* synthetic */ class C131008av implements Function {

    /* renamed from: a */
    public final /* synthetic */ Instant f358406a;

    /* renamed from: b */
    public final /* synthetic */ Instant f358407b;

    public /* synthetic */ C131008av(Instant instant, Instant instant2) {
        this.f358406a = instant;
        this.f358407b = instant2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Instant instant = this.f358406a;
        Instant instant2 = this.f358407b;
        C131080c cVar = (C131080c) obj;
        Duration duration = C131043cc.f358455a;
        Instant c = instant.isAfter(cVar.mo110043c()) ? instant : cVar.mo110043c();
        if (!instant2.isBefore(cVar.mo110042b())) {
            instant2 = cVar.mo110042b();
        }
        C50667c cVar2 = (C50667c) C50668d.f131800j.createBuilder();
        if (cVar.mo110041a() == C131079b.FOREGROUND_ACTIVITY) {
            long millis = Duration.between(c, instant2).toMillis();
            cVar2.copyOnWrite();
            C50668d dVar = (C50668d) cVar2.instance;
            dVar.f131802a |= 1;
            dVar.f131803b = millis;
            cVar2.copyOnWrite();
            C50668d dVar2 = (C50668d) cVar2.instance;
            dVar2.f131802a |= 64;
            dVar2.f131809h = 1;
            if (instant.isBefore(cVar.mo110043c())) {
                cVar2.copyOnWrite();
                C50668d dVar3 = (C50668d) cVar2.instance;
                dVar3.f131802a |= 4;
                dVar3.f131805d = 1;
            }
            if (c.isBefore(instant.plus(C131043cc.f358455a))) {
                cVar2.copyOnWrite();
                C50668d dVar4 = (C50668d) cVar2.instance;
                dVar4.f131802a |= 16;
                dVar4.f131807f = 1;
            }
        }
        if (cVar.mo110041a() == C131079b.FOREGROUND_SERVICE) {
            long millis2 = Duration.between(c, instant2).toMillis();
            cVar2.copyOnWrite();
            C50668d dVar5 = (C50668d) cVar2.instance;
            dVar5.f131802a |= 2;
            dVar5.f131804c = millis2;
            cVar2.copyOnWrite();
            C50668d dVar6 = (C50668d) cVar2.instance;
            dVar6.f131802a |= 128;
            dVar6.f131810i = 1;
            if (instant.isBefore(cVar.mo110043c())) {
                cVar2.copyOnWrite();
                C50668d dVar7 = (C50668d) cVar2.instance;
                dVar7.f131802a |= 8;
                dVar7.f131806e = 1;
            }
            if (c.isBefore(instant.plus(C131043cc.f358455a))) {
                cVar2.copyOnWrite();
                C50668d dVar8 = (C50668d) cVar2.instance;
                dVar8.f131802a |= 32;
                dVar8.f131808g = 1;
            }
        }
        return (C50668d) cVar2.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
