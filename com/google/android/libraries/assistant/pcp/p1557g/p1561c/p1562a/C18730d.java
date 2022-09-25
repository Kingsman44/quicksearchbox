package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.ComponentName;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.d */
/* compiled from: PG */
public final /* synthetic */ class C18730d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18736j f52817a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f52818b;

    public /* synthetic */ C18730d(C18736j jVar, C53306j jVar2) {
        this.f52817a = jVar;
        this.f52818b = jVar2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18736j jVar = this.f52817a;
        C53306j jVar2 = this.f52818b;
        return jVar.f52829b.mo24192a((ComponentName) obj, jVar2, C58485gu.m89845m());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
