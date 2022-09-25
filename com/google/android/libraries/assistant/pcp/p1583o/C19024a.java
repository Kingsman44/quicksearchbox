package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.assistant.p3803ag.p3809c.C49021dn;
import com.google.assistant.p3803ag.p3809c.C49022do;
import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.o.a */
/* compiled from: PG */
public final /* synthetic */ class C19024a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C19024a f53411a = new C19024a();

    private /* synthetic */ C19024a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49021dn dnVar = (C49021dn) C49022do.f126800d.createBuilder();
        dnVar.copyOnWrite();
        C49022do doVar = (C49022do) dnVar.instance;
        doVar.f126803b = ((C53306j) obj).f139793X;
        doVar.f126802a |= 1;
        return (C49022do) dnVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
