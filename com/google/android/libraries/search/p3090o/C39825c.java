package com.google.android.libraries.search.p3090o;

import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import com.google.protos.p4874ap.p4877b.p4878a.C63694e;
import com.google.protos.p4874ap.p4877b.p4878a.C63700k;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.o.c */
/* compiled from: PG */
public final /* synthetic */ class C39825c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C39825c f104725a = new C39825c();

    private /* synthetic */ C39825c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C39827e.f104728b;
        C63700k kVar = ((C63694e) obj).f172215a;
        if (kVar == null) {
            kVar = C63700k.f172226e;
        }
        return C56016b.m87883a(kVar.f172229b == 2 ? ((Integer) kVar.f172230c).intValue() : 0);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
