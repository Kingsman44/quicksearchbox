package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C83070ax implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C83070ax f226680a = new C83070ax();

    private /* synthetic */ C83070ax() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        String str = ((C52232kc) obj).f137065b;
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        str.getClass();
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        return (C52232kc) kbVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
