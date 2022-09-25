package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.assistant.p3897e.p3917i.p3918a.C51513km;
import com.google.assistant.p3897e.p3917i.p3918a.C51515ko;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.n */
/* compiled from: PG */
public final /* synthetic */ class C76388n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76388n f211521a = new C76388n();

    private /* synthetic */ C76388n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51513km kmVar = ((C51515ko) obj).f134215b;
        if (kmVar == null) {
            kmVar = C51513km.f134204e;
        }
        boolean z = true;
        if (1 != (kmVar.f134206a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
