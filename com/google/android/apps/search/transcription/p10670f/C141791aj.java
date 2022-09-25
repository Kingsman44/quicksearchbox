package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141756o;
import com.google.android.apps.search.transcription.p10670f.p10677f.C141871e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.android.apps.search.transcription.f.aj */
/* compiled from: PG */
public final /* synthetic */ class C141791aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C141793al f384793a;

    /* renamed from: b */
    public final /* synthetic */ C66611ci f384794b;

    public /* synthetic */ C141791aj(C141793al alVar, C66611ci ciVar) {
        this.f384793a = alVar;
        this.f384794b = ciVar;
    }

    public final void run() {
        C141793al alVar = this.f384793a;
        C66611ci ciVar = this.f384794b;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a != C66610ch.DONE_SUCCESS) {
            C66610ch a2 = C66610ch.m97260a(ciVar.f181209b);
            if (a2 == null) {
                a2 = C66610ch.IN_PROGRESS;
            }
            if (a2 == C66610ch.DONE_ERROR) {
                alVar.mo20122b(new C141756o(ciVar.f181210c, ciVar.f181211d));
                return;
            }
            C58801sm G = ((C58485gu) alVar.f384797a).listIterator(0);
            while (G.hasNext()) {
                ((C141871e) G.next()).mo116863a(ciVar, alVar.f384798b.f384805e);
            }
        }
    }
}
