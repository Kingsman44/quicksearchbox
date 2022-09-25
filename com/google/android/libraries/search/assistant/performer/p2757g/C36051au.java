package com.google.android.libraries.search.assistant.performer.p2757g;

import com.google.assistant.p3897e.p3921j.C52161hm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.au */
/* compiled from: PG */
final class C36051au implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C52161hm f94289a;

    public C36051au(C52161hm hmVar) {
        this.f94289a = hmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C36052av.f94290a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(52108)).mo56389s("Failed to start fallback intent with AndroidMethod %s.", this.f94289a.name());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C36052av.f94290a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) b).mo56372aa(52109)).mo56389s("Successfully started fallback intent with AndroidMethod %s.", this.f94289a.name());
    }
}
