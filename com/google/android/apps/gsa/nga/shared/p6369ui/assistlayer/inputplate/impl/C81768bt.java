package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80724cz;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80727db;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3775ac.p3779d.C48462b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bt */
/* compiled from: PG */
public final /* synthetic */ class C81768bt implements C81780ce {

    /* renamed from: a */
    public final /* synthetic */ C81722aa f223629a;

    public /* synthetic */ C81768bt(C81722aa aaVar) {
        this.f223629a = aaVar;
    }

    /* renamed from: a */
    public final C28293k mo75287a() {
        Optional optional;
        C81722aa aaVar = this.f223629a;
        C48462b bVar = aaVar.f223555h.f223508f.f221704g;
        if (bVar != null) {
            optional = Optional.m71637of(bVar);
        } else {
            optional = Optional.empty();
        }
        C80727db dbVar = aaVar.f223555h.f223508f.f221700c;
        if (dbVar == null) {
            dbVar = C80727db.f221610d;
        }
        C80724cz czVar = dbVar.f221613b;
        if (czVar == null) {
            czVar = C80724cz.f221601d;
        }
        C28292j k = C81772bx.m129918k(132881, optional, czVar, 1);
        C28295m.m52919e(aaVar.f223555h, k);
        if ((dbVar.f221612a & 2) == 0) {
            return C28293k.m52908e(k, new C28293k[0]);
        }
        C80724cz czVar2 = dbVar.f221613b;
        if (czVar2 == null) {
            czVar2 = C80724cz.f221601d;
        }
        return C28293k.m52908e(k, C28293k.m52908e(C81772bx.m129918k(132881, optional, czVar2, 3), new C28293k[0]));
    }
}
