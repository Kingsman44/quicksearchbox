package com.google.android.libraries.assistant.p1363c.p1398g.p1439m.p1440a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17487aw;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.c.g.m.a.d */
/* compiled from: PG */
public final class C17532d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C17534f f50567a;

    public C17532d(C17534f fVar) {
        this.f50567a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C17534f.f50569a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42761)).mo56354G("Synthesis failed for clientInfo %s, sessionToken %s", C17377g.m34653a(this.f50567a.f50570b), C17377g.m34655c(this.f50567a.f50571c));
        ((C2164c) this.f50567a.f50577i.get()).mo5437b(C17586a.m34876c(6));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C17487aw awVar = (C17487aw) obj;
        C59104x b = C17534f.f50569a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42762)).mo56359L("Synthesis finished with status %s, for clientInfo %s, sessionToken %s", C17377g.m34657e(awVar), C17377g.m34653a(this.f50567a.f50570b), C17377g.m34655c(this.f50567a.f50571c));
        ((C2164c) this.f50567a.f50577i.get()).mo5437b(awVar);
    }
}
