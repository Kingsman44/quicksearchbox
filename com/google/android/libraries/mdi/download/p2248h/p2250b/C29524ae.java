package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ae */
/* compiled from: PG */
public final /* synthetic */ class C29524ae implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80010a;

    public /* synthetic */ C29524ae(C29538as asVar) {
        this.f80010a = asVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29538as asVar = this.f80010a;
        if (!((Boolean) asVar.f80059f.mo6453a()).booleanValue()) {
            C29045l.m53931c("%s: GDD Sync is disabled for corpus: %s", "GddFileGroupPopulator", asVar.f80055b.name());
            return C60866ct.f164955a;
        }
        C29045l.m53931c("%s: Starting GDD Sync for corpus: %s", "GddFileGroupPopulator", asVar.f80055b.name());
        C60870cx a = asVar.f80061h.mo34767a(C58836b.f156633a, new C58759qy(asVar.f80055b));
        C29531al alVar = new C29531al(asVar);
        return C60922j.m93045h(a, C47810es.m84966f(alVar), asVar.f80054a);
    }
}
