package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125139dm;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125143dq;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.b.i */
/* compiled from: PG */
public final /* synthetic */ class C126009i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C125139dm f347278a;

    public /* synthetic */ C126009i(C125139dm dmVar) {
        this.f347278a = dmVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C58485gu) Collection.EL.stream(this.f347278a.f345216a).filter(new C126007g((C125143dq) obj)).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
