package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125097by;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bl */
/* compiled from: PG */
public final /* synthetic */ class C126225bl implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126233bt f347826a;

    /* renamed from: b */
    public final /* synthetic */ C125097by f347827b;

    public /* synthetic */ C126225bl(C126233bt btVar, C125097by byVar) {
        this.f347826a = btVar;
        this.f347827b = byVar;
    }

    public final void run() {
        C126233bt btVar = this.f347826a;
        C125097by byVar = this.f347827b;
        C126208av avVar = btVar.f347845f;
        if (avVar == null) {
            C59052c cVar = (C59052c) ((C59052c) C126233bt.f347840a.mo56226d()).mo56372aa(36973);
            C63070h hVar = byVar.f345098a;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            cVar.mo56389s("Ignoring button press outside oration: %s [SD]", C126288a.m206492d(C126336m.m206590a(hVar)));
            return;
        }
        avVar.mo107459b("Handling button press", new C126197ak(avVar, byVar));
    }
}
