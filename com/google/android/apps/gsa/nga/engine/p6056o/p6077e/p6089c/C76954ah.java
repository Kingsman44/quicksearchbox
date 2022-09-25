package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import com.google.android.apps.gsa.nga.engine.p6056o.C76534ab;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C76954ah implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76957ak f212460a;

    public /* synthetic */ C76954ah(C76957ak akVar) {
        this.f212460a = akVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76957ak akVar = this.f212460a;
        C76534ab abVar = (C76534ab) obj;
        if (abVar.mo72226b().isPresent()) {
            return C60856cj.m92900i(abVar);
        }
        return akVar.f212464a.mo28209i(akVar.f212465b.mo71519b(), "[NGA] take screenshot using uiScreenshotProviderProxy", new C76955ai(akVar));
    }
}
