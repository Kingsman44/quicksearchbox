package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.libraries.search.location.p3029a.C38627bs;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.m */
/* compiled from: PG */
public final /* synthetic */ class C133562m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133567r f363888a;

    public /* synthetic */ C133562m(C133567r rVar) {
        this.f363888a = rVar;
    }

    public final C60870cx apply(Object obj) {
        C133567r rVar = this.f363888a;
        if (!((Boolean) obj).booleanValue()) {
            return C47633f.m84733g(((C38627bs) rVar.f363900e.get()).mo41510f()).mo51516i(C133553d.f363875a, rVar.f363897b);
        }
        C46459k.m82829b(C47633f.m84733g(rVar.f363902g.mo50246c(rVar.f363903h)).mo51516i(new C133561l(rVar, C133569t.BACKGROUND), rVar.f363897b), "Failed to sync CUMA preferences in account scope", new Object[0]);
        return C60856cj.m92900i(false);
    }
}
