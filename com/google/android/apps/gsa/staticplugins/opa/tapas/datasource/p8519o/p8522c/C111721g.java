package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8522c;

import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111739t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111740u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111741v;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.c.g */
/* compiled from: PG */
public final class C111721g implements C111741v {

    /* renamed from: a */
    public static final C59071e f310564a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.c.g");

    /* renamed from: b */
    public final C22871g f310565b;

    /* renamed from: c */
    public final C107698i f310566c;

    /* renamed from: d */
    private final C111739t f310567d;

    public C111721g(C111740u uVar, C111720f fVar, C107698i iVar, C22871g gVar, C86124t tVar, h hVar, C2391v vVar) {
        this.f310566c = iVar;
        this.f310565b = gVar;
        this.f310567d = uVar.mo99223a(fVar);
        if (tVar.mo79746e(C90063do.f249583gK) && !tVar.mo79746e(C90063do.f249269aO)) {
            gVar.mo28212l("observe livedata on ui thread", new C111717c(this, hVar, vVar));
        }
    }

    /* renamed from: a */
    public final C60870cx mo99217a(C113405ep epVar) {
        return this.f310567d.mo99220b(epVar);
    }
}
