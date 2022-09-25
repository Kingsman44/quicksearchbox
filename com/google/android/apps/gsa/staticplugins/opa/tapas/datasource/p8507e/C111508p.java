package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113369dj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.p */
/* compiled from: PG */
public final /* synthetic */ class C111508p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111510r f310169a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310170b;

    public /* synthetic */ C111508p(C111510r rVar, C113405ep epVar) {
        this.f310169a = rVar;
        this.f310170b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111510r rVar = this.f310169a;
        C113405ep epVar = this.f310170b;
        C113408es esVar = (C113408es) obj;
        if (esVar.mo100131l().isPresent()) {
            return (C113408es) C111510r.f310174b.mo105235d("parsing", new C111509q(rVar, epVar, esVar));
        }
        C58976aa aaVar = C58975e.f156826a;
        if (rVar.f310177e.mo79746e(C90063do.f249577gE)) {
            C58485gu a = ((C113369dj) rVar.f310178f.mo27525b()).mo100145a(epVar.mo100033p());
            if (!a.isEmpty()) {
                C113407er p = C113408es.m187705p();
                p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(a)));
                return p.mo100091a();
            }
        }
        return C113408es.f314036b;
    }
}
