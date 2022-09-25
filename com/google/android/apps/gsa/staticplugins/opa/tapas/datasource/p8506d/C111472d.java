package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8506d;

import com.google.android.apps.gsa.assistant.shared.d.i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109399b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58843bg;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.d.d */
/* compiled from: PG */
public final class C111472d extends C113409et {

    /* renamed from: a */
    public final C109399b f310106a;

    /* renamed from: b */
    public final C86124t f310107b;

    /* renamed from: c */
    private final i f310108c;

    /* renamed from: d */
    private final C22871g f310109d;

    public C111472d(i iVar, C22871g gVar, C109399b bVar, C86124t tVar) {
        this.f310108c = iVar;
        this.f310109d = gVar;
        this.f310106a = bVar;
        this.f310107b = tVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.CHALKBOARD;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo99157b() {
        C22871g gVar = this.f310109d;
        i iVar = this.f310108c;
        C58976aa aaVar = C58975e.f156826a;
        return gVar.mo28209i(iVar.a("Get chalkboard suggestions for OPA", new C58843bg(i.a)), "convert ChalkboardSuggestions to TapasSuggestions", new C111470b(this));
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        return mo99157b();
    }
}
