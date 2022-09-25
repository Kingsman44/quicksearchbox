package com.google.android.apps.gsa.nga.engine.p6042l;

import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.assistant.p3897e.p3929l.p3930a.C52748d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.l.l */
/* compiled from: PG */
public final /* synthetic */ class C76243l implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C76243l f211256a = new C76243l();

    private /* synthetic */ C76243l() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52432rn rnVar = ((C52748d) obj).f138426d;
        if (rnVar == null) {
            rnVar = C52432rn.f137634c;
        }
        C52431rm b = C52431rm.m86628b(rnVar.f137637b);
        return b == null ? C52431rm.UNKNOWN : b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
