package com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17467ac;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17473ai;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C17428a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17436i f50337a;

    /* renamed from: b */
    public final /* synthetic */ C17473ai f50338b;

    /* renamed from: c */
    public final /* synthetic */ C17467ac f50339c;

    public /* synthetic */ C17428a(C17436i iVar, C17473ai aiVar, C17467ac acVar) {
        this.f50337a = iVar;
        this.f50338b = aiVar;
        this.f50339c = acVar;
    }

    public final void run() {
        C17436i iVar = this.f50337a;
        C17473ai aiVar = this.f50338b;
        C17467ac acVar = this.f50339c;
        iVar.f50370m.mo23370a();
        C59104x b = C17436i.f50358a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42741)).mo56354G("Closed ExoPlayer for clientInfo %s, sessionToken %s", C17377g.m34653a(iVar.f50359b), C17377g.m34655c(iVar.f50360c));
        ((C2164c) iVar.f50367j.get()).mo5437b(aiVar);
        ((C2164c) iVar.f50368k.get()).mo5437b(acVar);
    }
}
