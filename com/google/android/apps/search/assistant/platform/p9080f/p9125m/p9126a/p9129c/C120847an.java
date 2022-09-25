package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67058jm;
import com.google.speech.p5218j.C67095kw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.an */
/* compiled from: PG */
public final /* synthetic */ class C120847an implements Function {

    /* renamed from: a */
    public final /* synthetic */ C67042ix f336035a;

    public /* synthetic */ C120847an(C67042ix ixVar) {
        this.f336035a = ixVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C67042ix ixVar = this.f336035a;
        long j = ((C67058jm) obj).f182286a;
        C67095kw kwVar = ixVar.f182237i;
        if (kwVar == null) {
            kwVar = C67095kw.f182399i;
        }
        return Long.valueOf(j - kwVar.f182405e);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
