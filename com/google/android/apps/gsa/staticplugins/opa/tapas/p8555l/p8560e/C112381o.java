package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.research.p5181a.p5187e.C66355e;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.o */
/* compiled from: PG */
public final /* synthetic */ class C112381o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311815a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311816b;

    public /* synthetic */ C112381o(C112312ag agVar, C113405ep epVar) {
        this.f311815a = agVar;
        this.f311816b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C112312ag agVar = this.f311815a;
        C113405ep epVar = this.f311816b;
        if (!((Boolean) obj).booleanValue() || agVar.f311678j.isEmpty() || !agVar.f311675g.mo79746e(C90063do.f249374cN)) {
            return null;
        }
        List a = ((C112369cj) agVar.f311678j.get()).mo99510a(Instant.ofEpochMilli(epVar.mo100018c()));
        synchronized (agVar) {
            Stream stream = Collection.EL.stream(a);
            C66355e eVar = agVar.f311681m;
            Objects.requireNonNull(eVar);
            stream.forEach(new C112373g(eVar));
        }
        return null;
    }
}
