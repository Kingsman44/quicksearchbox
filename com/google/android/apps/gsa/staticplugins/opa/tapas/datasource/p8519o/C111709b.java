package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113189ct;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.b */
/* compiled from: PG */
public final /* synthetic */ class C111709b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C111725f f310541a;

    /* renamed from: b */
    public final /* synthetic */ C111644a f310542b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f310543c;

    public /* synthetic */ C111709b(C111725f fVar, C111644a aVar, C113405ep epVar) {
        this.f310541a = fVar;
        this.f310542b = aVar;
        this.f310543c = epVar;
    }

    public final void run() {
        C111725f fVar = this.f310541a;
        C111644a aVar = this.f310542b;
        C113405ep epVar = this.f310543c;
        C113404eo b = fVar.f310573d.mo99904b(epVar.mo100033p(), epVar.mo100022f(), epVar.mo100023g(), epVar.mo100024h());
        Optional n = epVar.mo100031n();
        Objects.requireNonNull(b);
        n.ifPresent(new C113189ct(b));
        C90873ag agVar = new C90873ag(C90877ak.m148471e(((C111739t) aVar).mo99220b(b.mo100001a()), fVar.f310572c.mo79743a(C90063do.f249618gt), TimeUnit.MILLISECONDS, fVar.f310571b), fVar.f310571b, "handle failure", C111714c.f310550a);
        agVar.mo85224b(TimeoutException.class, C111723d.f310568a);
        agVar.mo85223a(C111724e.f310569a);
    }
}
