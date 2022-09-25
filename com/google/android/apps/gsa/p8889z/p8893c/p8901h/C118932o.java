package com.google.android.apps.gsa.p8889z.p8893c.p8901h;

import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.util.concurrent.C60845bz;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.z.c.h.o */
/* compiled from: PG */
final class C118932o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C118934q f331706a;

    public C118932o(C118934q qVar) {
        this.f331706a = qVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            this.f331706a.mo54589f(true);
            this.f331706a.f331708a.mo20388jK();
        } else if ((th instanceof C90523o) || (th instanceof RuntimeException)) {
            this.f331706a.mo104074c(th);
        } else if (th.getCause() instanceof C90523o) {
            this.f331706a.mo104074c(th.getCause());
        } else {
            this.f331706a.mo104074c(th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f331706a.mo54591h((C66607ce) obj);
        C118934q qVar = this.f331706a;
        qVar.f331708a.mo20440jJ(new C118933p(qVar));
    }
}
