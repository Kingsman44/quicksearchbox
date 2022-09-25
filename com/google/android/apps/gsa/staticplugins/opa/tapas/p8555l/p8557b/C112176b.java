package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.android.apps.gsa.opa.p6448i.C83709a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.b */
/* compiled from: PG */
public final /* synthetic */ class C112176b implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112177c f311430a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311431b;

    public /* synthetic */ C112176b(C112177c cVar, C113405ep epVar) {
        this.f311430a = cVar;
        this.f311431b = epVar;
    }

    public final Object get() {
        C112177c cVar = this.f311430a;
        C113405ep epVar = this.f311431b;
        boolean a = C83709a.m133281a(cVar.f311434a);
        C58485gu guVar = (C58485gu) C112189o.f311482b.mo105235d("getMixAdjusters", new C112182h(cVar.f311435b, epVar.mo100024h()));
        C48674ai aiVar = C48674ai.UNKNOWN;
        if (epVar.mo100024h().ordinal() != 4) {
            if (cVar.f311436c.isEmpty()) {
                cVar.f311436c = Optional.m71637of(cVar.mo99462c(a, guVar));
            }
            return (C58485gu) cVar.f311436c.get();
        }
        if (cVar.f311437d.isEmpty()) {
            cVar.f311437d = Optional.m71637of(cVar.mo99462c(false, guVar));
        }
        return (C58485gu) cVar.f311437d.get();
    }
}
