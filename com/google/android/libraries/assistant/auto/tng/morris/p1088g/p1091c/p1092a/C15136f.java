package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a;

import android.graphics.PointF;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C15136f implements Function {

    /* renamed from: a */
    public final /* synthetic */ C15134d f45425a;

    public /* synthetic */ C15136f(C15134d dVar) {
        this.f45425a = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C15134d dVar = this.f45425a;
        C15134d dVar2 = (C15134d) obj;
        return Float.valueOf(PointF.length(dVar2.mo21997a() - dVar.mo21997a(), dVar2.mo21998b() - dVar.mo21998b()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
