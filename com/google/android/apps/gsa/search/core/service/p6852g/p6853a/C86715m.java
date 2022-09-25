package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.shared.p7066m.C90111fi;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58529ik;
import com.google.common.p4522b.C58532in;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.m */
/* compiled from: PG */
public final class C86715m {

    /* renamed from: a */
    public final C58532in f234240a;

    public C86715m(C86124t tVar) {
        C58529ik ikVar = new C58529ik();
        C58485gu c = tVar.mo79745c(C90111fi.f250721a);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            ikVar.mo55495c(C86724d.SEARCH_TEXT, (String) c.get(i));
        }
        this.f234240a = ikVar.mo55493a();
    }
}
