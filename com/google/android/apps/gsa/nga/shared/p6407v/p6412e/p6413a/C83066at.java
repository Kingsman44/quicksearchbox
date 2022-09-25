package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80078x;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.at */
/* compiled from: PG */
public final /* synthetic */ class C83066at implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C83066at f226677a = new C83066at();

    private /* synthetic */ C83066at() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80078x xVar = (C80078x) C80047aa.f219655i.createBuilder();
        C80080z a = C80080z.m128077a(((C80047aa) obj).f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        xVar.copyOnWrite();
        ((C80047aa) xVar.instance).f219659c = a.getNumber();
        return (C80047aa) xVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
