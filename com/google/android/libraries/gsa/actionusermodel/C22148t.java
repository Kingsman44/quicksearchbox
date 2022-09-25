package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22100c;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.t */
/* compiled from: PG */
public final /* synthetic */ class C22148t implements Function {

    /* renamed from: a */
    public final /* synthetic */ C22153y f61094a;

    public /* synthetic */ C22148t(C22153y yVar) {
        this.f61094a = yVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str;
        C22153y yVar = this.f61094a;
        C22101d dVar = (C22101d) obj;
        C22100c cVar = (C22100c) dVar.toBuilder();
        if (dVar.f60917b.equals("SMS")) {
            str = yVar.mo27366h();
        } else {
            str = C22063au.m41310m(dVar.f60917b);
        }
        cVar.copyOnWrite();
        C22101d dVar2 = (C22101d) cVar.instance;
        str.getClass();
        dVar2.f60916a |= 1;
        dVar2.f60917b = str;
        return (C22101d) cVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
