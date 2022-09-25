package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.t */
/* compiled from: PG */
public final /* synthetic */ class C12853t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12855v f40098a;

    public /* synthetic */ C12853t(C12855v vVar) {
        this.f40098a = vVar;
    }

    public final void run() {
        C12855v vVar = this.f40098a;
        vVar.f40109j = true;
        vVar.f40108i.cancel(false);
        C2164c cVar = vVar.f40107h;
        if (cVar == null) {
            C59104x c = C12855v.f40100a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvDeltaStreamSink");
            ((C59052c) ((C59052c) c).mo56372aa(44522)).mo56386p("Can't cancel DeltaHandlingResult, completer null");
            return;
        }
        cVar.mo5438c();
        C58976aa aaVar = C58975e.f156826a;
    }
}
