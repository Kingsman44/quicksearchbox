package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1021c.p1022a;

import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.C143118bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C13674g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13675h f41734a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f41735b;

    public /* synthetic */ C13674g(C13675h hVar, byte[] bArr) {
        this.f41734a = hVar;
        this.f41735b = bArr;
    }

    public final void run() {
        C13675h hVar = this.f41734a;
        byte[] bArr = this.f41735b;
        C58976aa aaVar = C58975e.f156826a;
        try {
            Optional optional = (Optional) hVar.f41737b.f41710a.get();
            if (optional.isPresent()) {
                ((C143118bb) optional.get()).mo118053c(bArr);
                return;
            }
            C59104x d = C13675h.f41736a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AapUniAssistUpstream");
            ((C59052c) ((C59052c) d).mo56372aa(44938)).mo56386p("Cannot send data as the vec is not connected.");
        } catch (C143111aw | IOException e) {
            C59104x c = C13675h.f41736a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AapUniAssistUpstream");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(44939)).mo56386p("Failure sending data over vec.");
        }
    }
}
