package com.google.android.apps.gsa.nga.engine.p6142u;

import com.google.android.apps.gsa.nga.engine.p6142u.p6143a.C78005c;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.nga.engine.u.j */
/* compiled from: PG */
public final /* synthetic */ class C78015j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78016k f214851a;

    /* renamed from: b */
    public final /* synthetic */ C79850ah f214852b;

    public /* synthetic */ C78015j(C78016k kVar, C79850ah ahVar) {
        this.f214851a = kVar;
        this.f214852b = ahVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        boolean z;
        C78016k kVar = this.f214851a;
        C79850ah ahVar = this.f214852b;
        C78005c cVar = (C78005c) obj;
        synchronized (kVar.f214859g) {
            if (cVar.equals(C78005c.WAS_ALREADY_LOADED)) {
                ahVar.mo74254a();
            }
            kVar.f214860h = !cVar.equals(C78005c.FAILED);
            kVar.mo72961c(cVar.equals(C78005c.LOADED_FROM_ASSETS), kVar.f214860h, true);
            z = kVar.f214860h;
        }
        return Boolean.valueOf(z);
    }
}
