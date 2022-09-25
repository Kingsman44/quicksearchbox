package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58528ij;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.q */
/* compiled from: PG */
public final /* synthetic */ class C18694q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C53306j f52744a;

    public /* synthetic */ C18694q(C53306j jVar) {
        this.f52744a = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C18700w.m36127d((C58528ij) ((Map.Entry) obj).getValue(), Optional.m71637of(this.f52744a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
