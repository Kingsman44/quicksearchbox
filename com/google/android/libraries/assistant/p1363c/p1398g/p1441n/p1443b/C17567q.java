package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1442a.C17538a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.q */
/* compiled from: PG */
public final /* synthetic */ class C17567q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17572v f50644a;

    /* renamed from: b */
    public final /* synthetic */ C17477am f50645b;

    public /* synthetic */ C17567q(C17572v vVar, C17477am amVar) {
        this.f50644a = vVar;
        this.f50645b = amVar;
    }

    public final void run() {
        C17572v vVar = this.f50644a;
        C17477am amVar = this.f50645b;
        C59104x b = C17572v.f50658a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.Server");
        ((C59052c) ((C59052c) b).mo56372aa(42795)).mo56389s("Server synthesis cancelled for sessionToken %s. Requests S3 cancellation.", C17377g.m34655c(amVar));
        C46459k.m82829b(((C17538a) vVar.f50662e.mo6453a()).mo23384b(), "Failed to cancel S3 synthesis for sessionToken %s", C17377g.m34655c(amVar));
    }
}
