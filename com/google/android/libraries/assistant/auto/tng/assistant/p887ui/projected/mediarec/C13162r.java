package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4855d.p4858c.C63533f;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.r */
/* compiled from: PG */
public final /* synthetic */ class C13162r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C13162r f40768a = new C13162r();

    private /* synthetic */ C13162r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63533f fVar;
        C61748j jVar = ((C61746h) obj).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 22) {
            fVar = (C63533f) jVar.f166803b;
        } else {
            fVar = C63533f.f171842d;
        }
        return Collection.EL.stream(fVar.f171845b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
