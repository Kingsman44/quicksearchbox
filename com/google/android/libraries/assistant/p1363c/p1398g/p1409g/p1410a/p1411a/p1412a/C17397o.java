package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4934ay.p4938c.C64278b;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C17397o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17398p f50287a;

    /* renamed from: b */
    public final /* synthetic */ C66611ci f50288b;

    public /* synthetic */ C17397o(C17398p pVar, C66611ci ciVar) {
        this.f50287a = pVar;
        this.f50288b = ciVar;
    }

    public final void run() {
        C17398p pVar = this.f50287a;
        C66611ci ciVar = this.f50288b;
        C58976aa aaVar = C58975e.f156826a;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_ERROR) {
            C64278b bVar = ciVar.f181212e;
            if (bVar == null) {
                bVar = C64278b.f173801e;
            }
            pVar.mo20122b(new C17400r(bVar));
        }
        pVar.f155056f.mo54591h(ciVar);
    }
}
