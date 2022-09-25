package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.shared.util.c.ae */
/* compiled from: PG */
final class C90871ae implements C22868d {

    /* renamed from: a */
    private final C90919bp f254077a;

    /* renamed from: b */
    private final C58485gu f254078b;

    /* renamed from: c */
    private final C90919bp f254079c;

    public C90871ae(C90919bp bpVar, C58485gu guVar, C90919bp bpVar2) {
        this.f254077a = bpVar;
        this.f254078b = guVar;
        this.f254079c = bpVar2;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        boolean z;
        C58485gu guVar = this.f254078b;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (i2 < i) {
            C90872af afVar = (C90872af) guVar.get(i2);
            if (afVar.f254080a.isInstance(th)) {
                afVar.f254081b.mo17870a(afVar.f254080a.cast(th));
                z = true;
            } else {
                z = false;
            }
            i2++;
            if (z) {
                return;
            }
        }
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof CancellationException) {
            this.f254079c.mo17870a((CancellationException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Exception) {
            this.f254079c.mo17870a((Exception) th);
        } else {
            throw new RuntimeException("Future failed with an unsupported Throwable class", th);
        }
    }

    /* renamed from: gm */
    public final void mo17702gm(Object obj) {
        this.f254077a.mo17870a(obj);
    }
}
