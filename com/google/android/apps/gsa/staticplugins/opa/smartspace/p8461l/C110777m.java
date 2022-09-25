package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.m */
/* compiled from: PG */
public final /* synthetic */ class C110777m implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110779o f308663a;

    public /* synthetic */ C110777m(C110779o oVar) {
        this.f308663a = oVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110779o oVar = this.f308663a;
        List<C83741am> list = (List) obj;
        if (!list.isEmpty()) {
            if (oVar.f308668d.mo77177o()) {
                list = oVar.f308671g.mo98915a(list);
            }
            Collections.sort(list, oVar.f308665a);
            for (C83741am amVar : list) {
                C92111g gVar = oVar.f308666b;
                C50818do doVar = amVar.f228252c;
                if (doVar == null) {
                    doVar = C50818do.f132293H;
                }
                if (gVar.mo86743d(doVar)) {
                    C92111g gVar2 = oVar.f308666b;
                    C50818do doVar2 = amVar.f228252c;
                    if (doVar2 == null) {
                        doVar2 = C50818do.f132293H;
                    }
                    if (!gVar2.mo86741b(doVar2)) {
                        return C60856cj.m92900i(C58833ax.m90834k(amVar));
                    }
                }
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
