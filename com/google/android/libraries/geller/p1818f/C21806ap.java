package com.google.android.libraries.geller.p1818f;

import android.accounts.Account;
import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.f.ap */
/* compiled from: PG */
public final /* synthetic */ class C21806ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60163a;

    public /* synthetic */ C21806ap(C21826bi biVar) {
        this.f60163a = biVar;
    }

    public final Object apply(Object obj) {
        C21826bi biVar = this.f60163a;
        Map map = (Map) obj;
        for (C65753ak akVar : map.keySet()) {
            C21850cf cfVar = (C21850cf) map.get(akVar);
            akVar.name();
            C21789d.m40905b(biVar.f60218b);
            cfVar.mo27153c().size();
            cfVar.mo27154d().size();
            cfVar.mo27152b().size();
            cfVar.mo27153c();
            cfVar.mo27154d();
            for (C21851cg e : biVar.f60221e) {
                e.mo17956e(akVar, (Account) biVar.f60218b.mo56111f(), cfVar);
            }
        }
        return map;
    }
}
