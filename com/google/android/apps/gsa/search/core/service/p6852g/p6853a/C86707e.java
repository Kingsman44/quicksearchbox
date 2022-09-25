package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6859i.C86749a;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58374cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.e */
/* compiled from: PG */
public final /* synthetic */ class C86707e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86710h f234207a;

    /* renamed from: b */
    public final /* synthetic */ C86744b f234208b;

    public /* synthetic */ C86707e(C86710h hVar, C86744b bVar) {
        this.f234207a = hVar;
        this.f234208b = bVar;
    }

    public final void run() {
        C86710h hVar = this.f234207a;
        C86744b bVar = this.f234208b;
        try {
            Collection<C86731k> b = C58374cr.m89410b(hVar.f234216b.mo80318b(), new C86711i(bVar.mo80349ia()));
            C58976aa aaVar = C58975e.f156826a;
            for (C86731k kVar : b) {
                if (!C90877ak.m148479m(((C86749a) hVar.f234218d.mo27525b()).mo80361b(kVar.mo80347i()), Throwable.class)) {
                    hVar.mo80317h(kVar, bVar);
                }
            }
        } finally {
            ((C86749a) hVar.f234218d.mo27525b()).mo80362c(bVar);
        }
    }
}
