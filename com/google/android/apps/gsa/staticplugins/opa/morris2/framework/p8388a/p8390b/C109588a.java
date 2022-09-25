package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a.p8390b;

import com.google.android.apps.gsa.location.an;
import com.google.android.apps.gsa.location.ao;
import com.google.android.apps.gsa.location.n;
import com.google.android.apps.gsa.location.p5873a.C74632a;
import com.google.android.apps.gsa.location.w;
import com.google.android.apps.gsa.location.z;
import com.google.android.gms.location.C144889at;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.p1085a.C14785a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.b.a */
/* compiled from: PG */
public final class C109588a implements C14785a {

    /* renamed from: a */
    private final ao f305212a;

    public C109588a(ao aoVar) {
        this.f305212a = aoVar;
    }

    /* renamed from: a */
    public final void mo21735a() {
        C60870cx cxVar;
        ao aoVar = this.f305212a;
        C39226b bVar = C39226b.TAG_CLASSIC_ASSISTANT_MORRIS_LO;
        if (aoVar.b.mo56113h()) {
            cxVar = ((C74632a) aoVar.b.mo56107c()).mo71010a();
        } else {
            cxVar = C60856cj.m92900i(true);
        }
        C60856cj.m92911t(cxVar, new an(aoVar, bVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo21736b() {
        ao aoVar = this.f305212a;
        C39226b bVar = C39226b.TAG_CLASSIC_ASSISTANT_MORRIS_LO;
        synchronized (aoVar.e) {
            C144889at atVar = aoVar.d;
            if (atVar != null) {
                aoVar.d = null;
                z zVar = aoVar.c;
                C60922j.m93044g(C60838bs.m92859i(zVar.mo84765i(new w(zVar, bVar, atVar), "stopBackgroundUpdates")), new n(zVar, atVar), C60826bg.f164896a);
            }
        }
    }
}
