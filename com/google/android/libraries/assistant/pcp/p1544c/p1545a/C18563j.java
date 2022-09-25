package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.j */
/* compiled from: PG */
public final /* synthetic */ class C18563j implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f52575a;

    public /* synthetic */ C18563j(Map map) {
        this.f52575a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f52575a;
        C18579g gVar = (C18579g) obj;
        if (map.containsKey(gVar)) {
            return C58528ij.m90006F((Collection) map.get(gVar));
        }
        return C58733pz.f156496a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
