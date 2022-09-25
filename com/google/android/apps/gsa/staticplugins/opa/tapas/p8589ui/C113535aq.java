package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.assistant.shared.p.f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.aq */
/* compiled from: PG */
public final /* synthetic */ class C113535aq implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f314327a;

    /* renamed from: b */
    public final /* synthetic */ Optional f314328b;

    /* renamed from: c */
    public final /* synthetic */ C22871g f314329c;

    public /* synthetic */ C113535aq(C86124t tVar, Optional optional, C22871g gVar) {
        this.f314327a = tVar;
        this.f314328b = optional;
        this.f314329c = gVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C86124t tVar = this.f314327a;
        Optional optional = this.f314328b;
        C22871g gVar = this.f314329c;
        f fVar = (f) obj;
        if (tVar.mo79746e(C90063do.f249319bL) && fVar == f.b) {
            optional.ifPresent(new C113542ax(gVar));
        }
    }
}
