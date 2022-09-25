package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c.C131088k;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3886c.p3887a.C50673i;
import com.google.assistant.p3886c.p3887a.C50674j;
import com.google.assistant.p3886c.p3887a.C50679o;
import com.google.assistant.p3886c.p3887a.C50680p;
import com.google.assistant.p3886c.p3887a.C50682r;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C131003aq implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131003aq f358401a = new C131003aq();

    private /* synthetic */ C131003aq() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131088k kVar = (C131088k) obj;
        Duration duration = C131043cc.f358455a;
        C50682r a = kVar.mo110058a();
        Duration between = Duration.between(Instant.ofEpochMilli(a.f131857c), Instant.ofEpochMilli(a.f131858d));
        C50673i iVar = (C50673i) C50674j.f131821d.createBuilder();
        C50672h f = C131043cc.m213553f(kVar);
        iVar.copyOnWrite();
        C50674j jVar = (C50674j) iVar.instance;
        f.getClass();
        jVar.f131824b = f;
        jVar.f131823a |= 1;
        C50679o oVar = (C50679o) C50680p.f131848d.createBuilder();
        oVar.copyOnWrite();
        C50680p pVar = (C50680p) oVar.instance;
        pVar.f131850a |= 1;
        pVar.f131851b = 1;
        long millis = between.toMillis();
        oVar.copyOnWrite();
        C50680p pVar2 = (C50680p) oVar.instance;
        pVar2.f131850a |= 2;
        pVar2.f131852c = millis;
        iVar.copyOnWrite();
        C50674j jVar2 = (C50674j) iVar.instance;
        C50680p pVar3 = (C50680p) oVar.build();
        pVar3.getClass();
        jVar2.f131825c = pVar3;
        jVar2.f131823a |= 2;
        return (C50674j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
