package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.android.libraries.assistant.pcp.p1583o.C19026c;
import com.google.assistant.p3803ag.p3809c.C49020dm;
import com.google.assistant.p3803ag.p3809c.C49023dp;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.o */
/* compiled from: PG */
public final /* synthetic */ class C18692o implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18692o f52742a = new C18692o();

    private /* synthetic */ C18692o() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C49020dm dmVar = (C49020dm) C49023dp.f126805e.createBuilder();
        int a = ((C18579g) entry.getKey()).mo24070a();
        dmVar.copyOnWrite();
        C49023dp dpVar = (C49023dp) dmVar.instance;
        dpVar.f126807a |= 1;
        dpVar.f126808b = a;
        C58528ij a2 = C19026c.m36454a((Set) entry.getValue());
        dmVar.copyOnWrite();
        C49023dp dpVar2 = (C49023dp) dmVar.instance;
        dpVar2.mo53211a();
        C62947c.addAll((Iterable) a2, (List) dpVar2.f126810d);
        return (C49023dp) dmVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
