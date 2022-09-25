package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p4008y.p4009a.C53573bf;
import com.google.assistant.p4008y.p4009a.C53575bh;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.au */
/* compiled from: PG */
public final /* synthetic */ class C75696au implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75743bc f210125a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f210126b;

    public /* synthetic */ C75696au(C75743bc bcVar, C58495hd hdVar) {
        this.f210125a = bcVar;
        this.f210126b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75743bc bcVar = this.f210125a;
        C58495hd hdVar = this.f210126b;
        C53575bh bhVar = (C53575bh) obj;
        C53573bf a = C53573bf.m86872a(bhVar.f140618d);
        if (a == null) {
            a = C53573bf.CONTEXT_KEY_UNKNOWN;
        }
        if (!hdVar.containsKey(a)) {
            return C60856cj.m92900i(false);
        }
        C22871g gVar = bcVar.f210221b;
        C53573bf a2 = C53573bf.m86872a(bhVar.f140618d);
        if (a2 == null) {
            a2 = C53573bf.CONTEXT_KEY_UNKNOWN;
        }
        return gVar.mo28209i(((C75742bb) hdVar.get(a2)).mo71868a(), "[NGA] Check if any values matches", new C75700ay(bhVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
