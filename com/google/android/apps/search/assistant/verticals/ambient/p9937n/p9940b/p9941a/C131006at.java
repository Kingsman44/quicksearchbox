package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50673i;
import com.google.assistant.p3886c.p3887a.C50674j;
import com.google.assistant.p3886c.p3887a.C50680p;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.at */
/* compiled from: PG */
public final /* synthetic */ class C131006at implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131006at f358404a = new C131006at();

    private /* synthetic */ C131006at() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        Duration duration = C131043cc.f358455a;
        C50673i iVar = (C50673i) ((C50674j) guVar.get(0)).toBuilder();
        C50680p pVar = (C50680p) Collection.EL.stream(guVar).map(C130999am.f358397a).reduce(C131000an.f358398a).orElseGet(C131001ao.f358399a);
        iVar.copyOnWrite();
        C50674j jVar = (C50674j) iVar.instance;
        pVar.getClass();
        jVar.f131825c = pVar;
        jVar.f131823a |= 2;
        return (C50674j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
