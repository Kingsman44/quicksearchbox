package com.google.android.libraries.assistant.pcp.p1557g;

import com.google.common.p4522b.C58495hd;
import java.util.HashMap;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d */
/* compiled from: PG */
public final /* synthetic */ class C18753d implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C18769h f52860a;

    public /* synthetic */ C18753d(C18769h hVar) {
        this.f52860a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18769h hVar = this.f52860a;
        HashMap hashMap = new HashMap((C58495hd) obj);
        hashMap.put(((C18770i) hVar).f52886a, hVar);
        return C58495hd.m89898l(hashMap);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
