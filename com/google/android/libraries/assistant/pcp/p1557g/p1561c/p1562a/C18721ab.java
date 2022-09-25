package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C18721ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ C18727ah f52801a;

    public /* synthetic */ C18721ab(C18727ah ahVar) {
        this.f52801a = ahVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C18727ah ahVar = this.f52801a;
        C123723aq aqVar = (C123723aq) obj;
        int i = aqVar.f341739a;
        int i2 = i & 1;
        if (i2 != 0 && (i & 2) != 0) {
            return Optional.m71637of(new ComponentName(aqVar.f341740b, aqVar.f341741c));
        }
        if (i2 != 0) {
            return ahVar.f52810d.mo24190a(aqVar.f341740b);
        }
        return Optional.empty();
    }
}
