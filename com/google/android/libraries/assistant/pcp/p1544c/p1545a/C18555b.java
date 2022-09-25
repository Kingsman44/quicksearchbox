package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.android.libraries.assistant.pcp.C18947l;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58472gh;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C18555b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f52567a;

    public /* synthetic */ C18555b(C58495hd hdVar) {
        this.f52567a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53306j jVar = (C53306j) obj;
        return new C58472gh(jVar, (Optional) this.f52567a.getOrDefault(jVar, Optional.m71637of(C18947l.m36401b().mo24050a())));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
