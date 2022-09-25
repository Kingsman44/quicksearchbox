package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58526ih;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.d */
/* compiled from: PG */
public final /* synthetic */ class C111973d implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C111977h f311073a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f311074b;

    /* renamed from: c */
    public final /* synthetic */ C58480gp f311075c;

    /* renamed from: d */
    public final /* synthetic */ C58526ih f311076d;

    public /* synthetic */ C111973d(C111977h hVar, C58480gp gpVar, C58480gp gpVar2, C58526ih ihVar) {
        this.f311073a = hVar;
        this.f311074b = gpVar;
        this.f311075c = gpVar2;
        this.f311076d = ihVar;
    }

    public final void accept(Object obj, Object obj2) {
        C111977h hVar = this.f311073a;
        C58480gp gpVar = this.f311074b;
        C58480gp gpVar2 = this.f311075c;
        C58526ih ihVar = this.f311076d;
        C48672ag agVar = (C48672ag) obj;
        C60870cx cxVar = (C60870cx) obj2;
        if (C90877ak.m148480n(cxVar)) {
            if (C90877ak.m148474h(cxVar) != null) {
                gpVar.mo55395g((C113408es) C90877ak.m148474h(cxVar));
                return;
            }
        } else if (hVar.f311080a.mo79746e(C90063do.f249461dv) && !C90877ak.m148478l(cxVar)) {
            gpVar2.mo55395g(cxVar);
        }
        agVar.name();
        ihVar.mo55373c(agVar);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
