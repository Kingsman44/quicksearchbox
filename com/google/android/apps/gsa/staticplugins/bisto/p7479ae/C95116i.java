package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95550y;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95498a;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95499b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.i */
/* compiled from: PG */
final class C95116i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C95118k f266118a;

    public C95116i(C95118k kVar) {
        this.f266118a = kVar;
    }

    public final void run() {
        C95118k kVar = this.f266118a;
        if (kVar.f266124j) {
            C89655j.m145957a("Playback should not have been able to finish if we took a mic action. Taking that action should have interrupted/terminated playback.");
        } else if (kVar.f266119e == null) {
            ((C95109bs) kVar.f266120f).mo89039h();
        } else {
            C95117j jVar = kVar.f266120f;
            C59104x b = C95109bs.f266079a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) b).mo56372aa(18080)).mo56386p("onCanceled");
            C95109bs bsVar = (C95109bs) jVar;
            C95498a aVar = bsVar.f266096q;
            if (aVar != null) {
                try {
                    C59104x c = C95499b.f267235a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ActionHandling");
                    ((C59052c) ((C59052c) c).mo56372aa(15131)).mo56386p("Transcription canceled");
                    ((C95550y) aVar.f267234c).mo89437d();
                } catch (Exception e) {
                    C59104x d = C95109bs.f266079a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(18081)).mo56386p("Callback exception");
                }
            }
            bsVar.mo89036e();
        }
    }
}
