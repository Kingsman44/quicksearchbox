package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.webkit.ValueCallback;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.libraries.assistant.p1528m.p1529a.C18422g;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.ad */
/* compiled from: PG */
public final class C106005ad {

    /* renamed from: a */
    final /* synthetic */ C106025ax f295946a;

    public C106005ad(C106025ax axVar) {
        this.f295946a = axVar;
    }

    /* renamed from: a */
    public final void mo95209a(int i) {
        if (this.f295946a.f296013k.mo79746e(C90041ct.f248692e)) {
            if (!this.f295946a.f296005c.mo56113h()) {
                C59104x d = C106025ax.f295983a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                ((C59052c) ((C59052c) d).mo56372aa(24655)).mo56386p("Cannot update input status when canvas webview container is not present.");
                return;
            }
            C18431p pVar = (C18431p) this.f295946a.f296005c.mo56107c();
            if (pVar.f52320l.mo23950a() != C18422g.LOADED) {
                ((C59052c) ((C59052c) C18431p.f52308a.mo56225c()).mo56372aa(47312)).mo56386p("Page content not loaded.");
                return;
            }
            pVar.f52310b.evaluateJavascript(pVar.mo23953c("onInputStatusChanged", Integer.valueOf(i - 1)), (ValueCallback) null);
        }
    }
}
