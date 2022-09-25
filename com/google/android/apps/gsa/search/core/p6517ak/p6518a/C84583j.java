package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.speech.tts.UtteranceProgressListener;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.j */
/* compiled from: PG */
final class C84583j extends UtteranceProgressListener {

    /* renamed from: a */
    final /* synthetic */ C84591r f230183a;

    public C84583j(C84591r rVar) {
        this.f230183a = rVar;
    }

    public final void onDone(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f230183a.mo78350b(str);
    }

    public final void onError(String str) {
        C84589p pVar;
        C84589p pVar2;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f230183a.f230211i) {
            pVar = (C84589p) this.f230183a.f230212j.get(str);
            if (pVar == null || pVar.f230200e != 1) {
                pVar = null;
            }
        }
        if (pVar != null) {
            C84591r rVar = this.f230183a;
            synchronized (rVar.f230211i) {
                rVar.f230215m = false;
                pVar2 = (C84589p) rVar.f230212j.get(str);
            }
            if (pVar2 != null) {
                pVar2.f230200e = 3;
                rVar.mo78351c();
                return;
            }
            rVar.mo78350b(str);
            return;
        }
        this.f230183a.mo78350b(str);
    }

    public final void onStart(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C84591r rVar = this.f230183a;
        rVar.f230218p = false;
        if (rVar.f230219q) {
            rVar.mo78353e();
            this.f230183a.f230219q = false;
        }
        C89949q.m146523g(405);
        ((C89859i) this.f230183a.f230214l.mo27525b()).mo83702b(C89849ae.TTS_PLAY_STARTED);
    }
}
