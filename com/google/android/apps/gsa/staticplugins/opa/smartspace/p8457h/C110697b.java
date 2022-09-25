package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8457h;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83805u;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.C110927t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.h.b */
/* compiled from: PG */
public final class C110697b implements C83805u {

    /* renamed from: a */
    public final C83785c f308457a;

    /* renamed from: b */
    private final C22871g f308458b;

    /* renamed from: c */
    private final C110927t f308459c;

    /* renamed from: d */
    private final C90021c f308460d;

    public C110697b(C22871g gVar, C83785c cVar, C110927t tVar, C90021c cVar2) {
        this.f308458b = gVar;
        this.f308457a = cVar;
        this.f308459c = tVar;
        this.f308460d = cVar2;
    }

    /* renamed from: a */
    public final C60870cx mo77190a(C83739ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f308460d.mo79746e(C90014bt.f247651lF)) {
            return C118826c.f331423b;
        }
        if (akVar.f228234c.isEmpty()) {
            return this.f308457a.mo77128j(C50794cr.HAMMERSPACE_DEBUG);
        }
        return this.f308458b.mo28210j(this.f308459c.mo98939d(akVar), "createSmartspaceHammerspaceCard", new C110696a(this));
    }
}
