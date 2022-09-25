package com.google.android.libraries.onegoogle.accountmenu.features.education;

import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30576c;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30577d;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30586m;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.l */
/* compiled from: PG */
public final /* synthetic */ class C30594l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30601s f82645a;

    /* renamed from: b */
    public final /* synthetic */ C30576c f82646b;

    /* renamed from: c */
    public final /* synthetic */ List f82647c;

    public /* synthetic */ C30594l(C30601s sVar, C30576c cVar, List list) {
        this.f82645a = sVar;
        this.f82646b = cVar;
        this.f82647c = list;
    }

    public final void run() {
        C30601s sVar = this.f82645a;
        C30576c cVar = this.f82646b;
        List<C30586m> list = this.f82647c;
        sVar.mo36289e(cVar);
        for (C30586m mVar : list) {
            C30577d dVar = mVar.f82619b;
            if (dVar != null && dVar.f82610e) {
                dVar.f82610e = false;
                sVar.f82669e.mo36272f(dVar);
            }
        }
    }
}
