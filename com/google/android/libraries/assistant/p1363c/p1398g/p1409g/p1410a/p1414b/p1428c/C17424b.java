package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1428c;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1429d.C17426a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.c.b */
/* compiled from: PG */
final class C17424b extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C17425c f50332a;

    public C17424b(C17425c cVar) {
        this.f50332a = cVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f50332a.mo54591h((C66607ce) obj)) {
            this.f50332a.f50334b.mo20388jK();
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            C17425c cVar = this.f50332a;
            C66606cd a = C17426a.m34712a();
            a.copyOnWrite();
            C66607ce ceVar = (C66607ce) a.instance;
            C66607ce ceVar2 = C66607ce.f181191f;
            ceVar.f181193a |= 8;
            ceVar.f181197e = true;
            cVar.mo54591h((C66607ce) a.build());
        }
        this.f50332a.mo54589f(z);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C59104x d = C17425c.f50333a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42728)).mo56386p("Sink failure.");
        this.f50332a.mo54590g(th);
    }
}
