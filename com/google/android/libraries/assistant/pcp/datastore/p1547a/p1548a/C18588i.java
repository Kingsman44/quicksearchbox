package com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a;

import com.google.android.libraries.assistant.pcp.C18798k;
import com.google.android.libraries.assistant.pcp.C18947l;
import com.google.android.libraries.assistant.pcp.p1578m.C18966ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.datastore.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C18588i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C18588i f52612a = new C18588i();

    private /* synthetic */ C18588i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C18798k b = C18947l.m36401b();
        b.mo24051b((C58528ij) Collection.EL.stream(((C18966ag) obj).f53292a).map(C18587h.f52611a).collect(C58370cn.f155947b));
        return b.mo24050a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
