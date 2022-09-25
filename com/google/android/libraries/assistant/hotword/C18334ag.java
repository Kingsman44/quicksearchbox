package com.google.android.libraries.assistant.hotword;

import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.assistant.soda.p1604c.C19260b;
import com.google.android.libraries.assistant.soda.p1604c.C19261c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.hotword.ag */
/* compiled from: PG */
final class C18334ag implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C18339al f51991a;

    public C18334ag(C18339al alVar) {
        this.f51991a = alVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C58974d dVar = C18339al.f51996a;
        } else if (th instanceof InterruptedIOException) {
            ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47237)).mo56386p("Audio stopped.");
            this.f51991a.f52018t.mo103906d();
        } else if ((th instanceof C19260b) || (th instanceof C19261c)) {
            ((C58970a) ((C58970a) ((C58970a) C18339al.f51996a.mo56225c()).mo56382g(th)).mo56372aa(47235)).mo56386p("Error when starting SODA.");
            this.f51991a.f52018t.mo103906d();
            this.f51991a.f52019u.mo23786a((HotwordResult) null);
        } else {
            ((C58970a) ((C58970a) ((C58970a) C18339al.f51996a.mo56225c()).mo56382g(th)).mo56372aa(47236)).mo56386p("Error when pushing audio to Soda.");
            this.f51991a.f52018t.mo103906d();
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C58970a) ((C58970a) C18339al.f51996a.mo56224b()).mo56372aa(47239)).mo56386p("Finished pushing audio to soda.");
    }
}
