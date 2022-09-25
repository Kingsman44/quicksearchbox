package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8120a;

import com.google.android.libraries.gsa.p1884m.p1885a.C22934a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p375ai.p378b.C7817la;
import com.google.p375ai.p378b.C7818lb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.a.c */
/* compiled from: PG */
public final class C104996c {

    /* renamed from: a */
    public final List f292502a = new ArrayList();

    /* renamed from: a */
    public final C22934a mo94437a(C7817la laVar) {
        C22934a aVar = new C22934a(laVar);
        this.f292502a.add(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final List mo94438b() {
        if (!this.f292502a.isEmpty()) {
            return C58597ky.m90217h(this.f292502a, C104995b.f292501a);
        }
        return C58485gu.m89845m();
    }

    /* renamed from: c */
    public final void mo94439c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7818lb lbVar = (C7818lb) it.next();
            C7817la a = C7817la.m22859a(lbVar.f27420c);
            if (a == null) {
                a = C7817la.UNDEFINED;
            }
            this.f292502a.add(new C22934a(lbVar, a));
        }
    }
}
