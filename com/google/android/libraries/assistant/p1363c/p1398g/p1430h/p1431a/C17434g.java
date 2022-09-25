package com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.C17448a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a.C17461m;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a.C17462n;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.c.g.h.a.g */
/* compiled from: PG */
public final /* synthetic */ class C17434g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17436i f50355a;

    public /* synthetic */ C17434g(C17436i iVar) {
        this.f50355a = iVar;
    }

    public final void run() {
        C17436i iVar = this.f50355a;
        C17462n nVar = iVar.f50370m;
        C57981b bVar = iVar.f50361d;
        C17435h hVar = iVar.f50369l;
        C58976aa aaVar = C58975e.f156826a;
        ((C17448a) nVar.f50425d.mo6453a()).mo23361a(hVar);
        ((C17448a) nVar.f50425d.mo6453a()).mo23363c();
        bVar.mo20440jJ(new C17461m(nVar));
        C59104x b = C17436i.f50358a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42744)).mo56354G("Started playback using ExoPlayer for clientInfo %s, sessionToken %s", C17377g.m34653a(iVar.f50359b), C17377g.m34655c(iVar.f50360c));
    }
}
