package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a;

import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.shared.p7041h.C89782n;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.a.g */
/* compiled from: PG */
public final /* synthetic */ class C114548g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C114549h f317647a;

    public /* synthetic */ C114548g(C114549h hVar) {
        this.f317647a = hVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C114549h hVar = this.f317647a;
        HashSet hashSet = new HashSet();
        Collection<C89776h> f = hVar.f317650c.mo83624f(hVar.f317651d.mo26870b(), C114549h.f317648a, false);
        Collection e = hVar.f317650c.mo83623e();
        ArrayList d = C58597ky.m90213d(f.size());
        for (C89776h hVar2 : f) {
            String c = C89782n.m146153c(hVar2);
            if (c != null && hashSet.add(c)) {
                long j = hVar2.f242992l;
                if (j == 0 || C89782n.m146152b(j, e) != null) {
                    d.add(C114874f.m190401a(hVar2));
                }
            }
        }
        return d;
    }
}
