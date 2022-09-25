package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.contacts.cl;
import com.google.android.apps.gsa.contacts.m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4152bb.p4153a.C55352pe;
import com.google.p4152bb.p4153a.C55353pf;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hm */
/* compiled from: PG */
public final /* synthetic */ class C109206hm implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C109209hp f304061a;

    /* renamed from: b */
    public final /* synthetic */ long f304062b;

    /* renamed from: c */
    public final /* synthetic */ List f304063c;

    public /* synthetic */ C109206hm(C109209hp hpVar, long j, List list) {
        this.f304061a = hpVar;
        this.f304062b = j;
        this.f304063c = list;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C109209hp hpVar = this.f304061a;
        long j = this.f304062b;
        List<C51058ev> list = this.f304063c;
        m mVar = hpVar.f304066a.f304288k;
        HashMap hashMap = new HashMap();
        for (C51058ev evVar : list) {
            int i = evVar.f132943a;
            if (!((i & 1) == 0 || (i & 256) == 0 || (i & 1024) == 0)) {
                String str = evVar.f132944b;
                C55352pe peVar = (C55352pe) C55353pf.f145846d.createBuilder();
                String str2 = evVar.f132951i;
                peVar.copyOnWrite();
                C55353pf pfVar = (C55353pf) peVar.instance;
                str2.getClass();
                pfVar.f145849a |= 2;
                pfVar.f145851c = str2;
                String str3 = evVar.f132953k;
                peVar.copyOnWrite();
                C55353pf pfVar2 = (C55353pf) peVar.instance;
                str3.getClass();
                pfVar2.f145849a |= 1;
                pfVar2.f145850b = str3;
                hashMap.put(str, (C55353pf) peVar.build());
            }
        }
        Person a = mVar.a(j, cl.d(hashMap), (Set) null);
        return a != null ? C58833ax.m90834k(cl.a(a, false, ((C86124t) hpVar.f304066a.f304283f.mo27525b()).mo79746e(C90025cd.f248142F))) : C58836b.f156633a;
    }
}
