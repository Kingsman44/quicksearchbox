package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9667c;

import com.google.android.libraries.search.assistant.p2714o.C34920f;
import com.google.assistant.p3897e.p3917i.p3918a.C51335dx;
import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import com.google.protobuf.C62942bv;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.c.d */
/* compiled from: PG */
final class C127942d implements Function {

    /* renamed from: a */
    final /* synthetic */ C127947i f352167a;

    public C127942d(C127947i iVar) {
        this.f352167a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C34920f fVar = (C34920f) obj;
        C127947i iVar = this.f352167a;
        C51335dx dxVar = (C51335dx) C51336dy.f133713d.createBuilder();
        C69664n.m101060f(dxVar, "newBuilder()");
        C69664n.m101061g(dxVar, "builder");
        String b = fVar.mo39629b();
        C69664n.m101060f(b, "it.packageName()");
        C69664n.m101061g(b, "value");
        dxVar.copyOnWrite();
        C51336dy dyVar = (C51336dy) dxVar.instance;
        b.getClass();
        boolean z = true;
        dyVar.f133715a |= 1;
        dyVar.f133716b = b;
        Instant a = fVar.mo39628a();
        C69664n.m101060f(a, "it.instant()");
        if (Duration.between(a, iVar.f352181a.mo57444a()).compareTo(iVar.f352185e) > 0) {
            z = false;
        }
        dxVar.copyOnWrite();
        C51336dy dyVar2 = (C51336dy) dxVar.instance;
        dyVar2.f133715a |= 2;
        dyVar2.f133717c = z;
        C62942bv build = dxVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51336dy) build;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
