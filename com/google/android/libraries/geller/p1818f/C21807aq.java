package com.google.android.libraries.geller.p1818f;

import android.accounts.Account;
import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.f.aq */
/* compiled from: PG */
public final /* synthetic */ class C21807aq implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60164a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f60165b;

    public /* synthetic */ C21807aq(C21826bi biVar, C58528ij ijVar) {
        this.f60164a = biVar;
        this.f60165b = ijVar;
    }

    public final Object apply(Object obj) {
        C21826bi biVar = this.f60164a;
        C58528ij ijVar = this.f60165b;
        Exception exc = (Exception) obj;
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            C65753ak akVar = (C65753ak) lA.next();
            C21855e eVar = new C21855e();
            eVar.mo27148b().mo55395g(exc);
            C21850cf a = eVar.mo27147a();
            akVar.name();
            C21789d.m40905b(biVar.f60218b);
            gzVar.mo55429h(akVar, a);
            for (C21851cg e : biVar.f60221e) {
                e.mo17956e(akVar, (Account) biVar.f60218b.mo56111f(), a);
            }
        }
        return gzVar.mo55427f(true);
    }
}
