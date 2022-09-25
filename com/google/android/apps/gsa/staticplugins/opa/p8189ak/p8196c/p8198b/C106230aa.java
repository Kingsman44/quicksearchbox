package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.search.assistant.p2714o.C34920f;
import com.google.assistant.p3897e.p3917i.p3918a.C51335dx;
import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C106230aa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106241al f296420a;

    public /* synthetic */ C106230aa(C106241al alVar) {
        this.f296420a = alVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106241al alVar = this.f296420a;
        C34920f fVar = (C34920f) obj;
        C51335dx dxVar = (C51335dx) C51336dy.f133713d.createBuilder();
        String b = fVar.mo39629b();
        dxVar.copyOnWrite();
        C51336dy dyVar = (C51336dy) dxVar.instance;
        b.getClass();
        boolean z = true;
        dyVar.f133715a |= 1;
        dyVar.f133716b = b;
        if (Duration.between(fVar.mo39628a(), alVar.f296436c.mo57444a()).compareTo(Duration.ofSeconds(alVar.f296437d.mo85399d(C90126fx.f251543km))) > 0) {
            z = false;
        }
        dxVar.copyOnWrite();
        C51336dy dyVar2 = (C51336dy) dxVar.instance;
        dyVar2.f133715a |= 2;
        dyVar2.f133717c = z;
        return (C51336dy) dxVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
