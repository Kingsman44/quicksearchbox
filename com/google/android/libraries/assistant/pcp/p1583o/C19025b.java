package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.assistant.p3803ag.p3809c.C49020dm;
import com.google.assistant.p3803ag.p3809c.C49023dp;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.o.b */
/* compiled from: PG */
public final /* synthetic */ class C19025b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C19025b f53412a = new C19025b();

    private /* synthetic */ C19025b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49020dm dmVar = (C49020dm) C49023dp.f126805e.createBuilder();
        int a = ((C18579g) obj).mo24070a();
        dmVar.copyOnWrite();
        C49023dp dpVar = (C49023dp) dmVar.instance;
        dpVar.f126807a |= 1;
        dpVar.f126808b = a;
        return (C49023dp) dmVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
