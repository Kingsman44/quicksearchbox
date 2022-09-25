package com.google.android.apps.search.assistant.verticals.ambient.p10017u;

import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.d */
/* compiled from: PG */
public final /* synthetic */ class C131832d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C131832d f360042a = new C131832d();

    private /* synthetic */ C131832d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83739ak akVar = (C83739ak) obj;
        if ((akVar.f228232a & 4096) == 0) {
            return akVar;
        }
        C83730ab abVar = (C83730ab) akVar.toBuilder();
        abVar.copyOnWrite();
        C83739ak akVar2 = (C83739ak) abVar.instance;
        akVar2.f228232a &= -4097;
        akVar2.f228245n = C83739ak.f228230q.f228245n;
        return (C83739ak) abVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
