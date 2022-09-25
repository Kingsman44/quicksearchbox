package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.u */
/* compiled from: PG */
final class C12854u implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12855v f40099a;

    public C12854u(C12855v vVar) {
        this.f40099a = vVar;
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C12867k kVar = (C12867k) obj;
        C12855v vVar = this.f40099a;
        if (vVar.f40107h != null) {
            vVar.mo20816f();
            C2164c cVar = this.f40099a.f40107h;
            cVar.getClass();
            cVar.mo5437b(kVar);
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x c = C12855v.f40100a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConvDeltaStreamSink");
        ((C59052c) ((C59052c) c).mo56372aa(44514)).mo56386p("Can't set DeltaHandlingResult, completer null");
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C12855v vVar = this.f40099a;
        if (vVar.f40107h != null) {
            vVar.mo20816f();
            if (th instanceof CancellationException) {
                C2164c cVar = this.f40099a.f40107h;
                cVar.getClass();
                cVar.mo5438c();
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            C2164c cVar2 = this.f40099a.f40107h;
            cVar2.getClass();
            cVar2.mo5439d(th);
            C59104x c = C12855v.f40100a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvDeltaStreamSink");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(44512)).mo56386p("Delta handling result creation failed");
            return;
        }
        C59104x c2 = C12855v.f40100a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "ConvDeltaStreamSink");
        ((C59052c) ((C59052c) c2).mo56372aa(44511)).mo56386p("Can't fail DeltaHandlingResult, completer null");
    }
}
