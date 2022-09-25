package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4934ay.p4938c.C64278b;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C15523r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15526u f46490a;

    /* renamed from: b */
    public final /* synthetic */ C66611ci f46491b;

    public /* synthetic */ C15523r(C15526u uVar, C66611ci ciVar) {
        this.f46490a = uVar;
        this.f46491b = ciVar;
    }

    public final void run() {
        C15526u uVar = this.f46490a;
        C66611ci ciVar = this.f46491b;
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
            uVar.mo20122b(new C15528w(bVar));
        }
        uVar.f155056f.mo54591h(ciVar);
    }
}
