package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1303b;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.b.b */
/* compiled from: PG */
final class C16604b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C16606d f48678a;

    public C16604b(C16606d dVar) {
        this.f48678a = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C16606d.f48681a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "S3WrapperSource");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(46405)).mo56386p("Header Future failed.");
        if (th instanceof CancellationException) {
            this.f48678a.mo54589f(true);
            this.f48678a.f48682b.mo20388jK();
            return;
        }
        C16606d dVar = this.f48678a;
        dVar.mo54590g(th);
        dVar.f48682b.mo20388jK();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f48678a.mo54591h((C66607ce) obj);
        C16606d dVar = this.f48678a;
        C46459k.m82829b(dVar.f48682b.mo20440jJ(new C16605c(dVar)), "S3Wrapper: S3 request streaming failed", new Object[0]);
    }
}
