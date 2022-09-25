package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.assistant.p3994s.p3995a.C53442oa;
import com.google.assistant.p3994s.p3995a.C53458oq;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.d */
/* compiled from: PG */
public final /* synthetic */ class C19008d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C19008d f53381a = new C19008d();

    private /* synthetic */ C19008d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53442oa oaVar;
        C53458oq oqVar = (C53458oq) obj;
        if (oqVar.f140304a == 1) {
            oaVar = (C53442oa) oqVar.f140305b;
        } else {
            oaVar = C53442oa.f140266d;
        }
        return Collection.EL.stream(oaVar.f140270c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
