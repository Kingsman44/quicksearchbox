package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1428c;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.c.a */
/* compiled from: PG */
final class C17423a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C17425c f50331a;

    public C17423a(C17425c cVar) {
        this.f50331a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C17425c.f50333a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42725)).mo56386p("Header Future failed.");
        if (th instanceof CancellationException) {
            this.f50331a.mo54589f(true);
            this.f50331a.f50334b.mo20388jK();
            return;
        }
        C17425c cVar = this.f50331a;
        cVar.mo54590g(th);
        cVar.f50334b.mo20388jK();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f50331a.mo54591h((C66607ce) obj);
        C17425c cVar = this.f50331a;
        C46459k.m82829b(cVar.f50334b.mo20440jJ(new C17424b(cVar)), "S3Wrapper: S3 request streaming failed", new Object[0]);
    }
}
