package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7726a;

import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.speech.p7269b.C92217b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.micro.C67363a;
import com.google.speech.micro.GoogleEndpointer;
import com.google.speech.recognizer.p5233a.C67461i;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.a.e */
/* compiled from: PG */
final class C98792e {

    /* renamed from: a */
    final /* synthetic */ C92217b f275963a;

    public C98792e(C92217b bVar) {
        this.f275963a = bVar;
    }

    /* renamed from: a */
    public final void mo91301a(GoogleEndpointer.GoogleEndpointerResult googleEndpointerResult) {
        C67463k kVar;
        C67363a event = googleEndpointerResult.getEvent();
        C90607o oVar = new C90607o(7, (byte[]) null, googleEndpointerResult.getEventTimestampMs());
        C67461i iVar = (C67461i) C67464l.f183356e.createBuilder();
        if (event == C67363a.SPEECH) {
            kVar = C67463k.START_OF_SPEECH;
        } else {
            kVar = C67463k.END_OF_SPEECH;
        }
        iVar.copyOnWrite();
        C67464l lVar = (C67464l) iVar.instance;
        lVar.f183359b = kVar.f183355e;
        lVar.f183358a |= 1;
        C58976aa aaVar = C58975e.f156826a;
        this.f275963a.mo70941c(new C90532c((C67464l) iVar.build(), oVar));
    }
}
