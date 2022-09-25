package com.google.android.libraries.assistant.p1363c.p1398g.p1430h.p1431a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.h.a.f */
/* compiled from: PG */
public final /* synthetic */ class C17433f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17436i f50352a;

    /* renamed from: b */
    public final /* synthetic */ C17508k f50353b;

    /* renamed from: c */
    public final /* synthetic */ C17477am f50354c;

    public /* synthetic */ C17433f(C17436i iVar, C17508k kVar, C17477am amVar) {
        this.f50352a = iVar;
        this.f50353b = kVar;
        this.f50354c = amVar;
    }

    public final void run() {
        C17436i iVar = this.f50352a;
        C17508k kVar = this.f50353b;
        C17477am amVar = this.f50354c;
        C59104x b = C17436i.f50358a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS");
        ((C59052c) ((C59052c) b).mo56372aa(42743)).mo56354G("Playback cancelled by the client before it started for clientInfo %s, sessionToken %s. Closing ExoPlayer.", C17377g.m34653a(kVar), C17377g.m34655c(amVar));
        iVar.f50370m.mo23370a();
        ((C2164c) iVar.f50367j.get()).mo5437b(C17586a.m34875b(C17471ag.PLAYBACK_CANCELLED_BY_CLIENT_BEFORE_STARTING));
    }
}
