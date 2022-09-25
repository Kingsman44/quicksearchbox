package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.o.i */
/* compiled from: PG */
public final /* synthetic */ class C19032i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C19032i f53418a = new C19032i();

    private /* synthetic */ C19032i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49019dl dlVar = (C49019dl) obj;
        return Map.CC.entry(new C18575c(dlVar.f126795b), (C58528ij) Collection.EL.stream(dlVar.f126798e).map(C19038o.f53424a).collect(C58370cn.f155947b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
