package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location;

import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location.r */
/* compiled from: PG */
public final class C110874r {

    /* renamed from: a */
    public final C83793i f308881a;

    /* renamed from: b */
    private final C83794j f308882b;

    /* renamed from: c */
    private final C68214a f308883c;

    /* renamed from: d */
    private final u f308884d;

    /* renamed from: e */
    private final C60888db f308885e;

    public C110874r(C83793i iVar, C83794j jVar, C68214a aVar, u uVar, C60888db dbVar) {
        this.f308881a = iVar;
        this.f308882b = jVar;
        this.f308883c = aVar;
        this.f308884d = uVar;
        this.f308885e = dbVar;
    }

    /* renamed from: a */
    public final void mo98914a() {
        if (this.f308882b.mo77163H() || this.f308882b.mo77181t()) {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx d = ((C42876ab) this.f308883c.mo27525b()).mo46042d();
            C60870cx a = this.f308884d.a();
            C47638k.m84751b(d, a).mo51521b(new C110873q(this, a, d), this.f308885e);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }
}
