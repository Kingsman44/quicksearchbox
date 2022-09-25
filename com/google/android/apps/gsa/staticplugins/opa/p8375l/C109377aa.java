package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.aa */
/* compiled from: PG */
public final /* synthetic */ class C109377aa implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C109377aa f304660a = new C109377aa();

    private /* synthetic */ C109377aa() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123770cj cjVar;
        C123744bk bkVar = (C123744bk) obj;
        if (bkVar.f341808c == 4) {
            cjVar = (C123770cj) bkVar.f341809d;
        } else {
            cjVar = C123770cj.f341899b;
        }
        return Collection.EL.stream(cjVar.f341901a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
