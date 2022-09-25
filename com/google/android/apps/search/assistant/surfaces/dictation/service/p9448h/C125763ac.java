package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.common.p4526f.C59052c;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.ac */
/* compiled from: PG */
public final /* synthetic */ class C125763ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C125774an f346591a;

    /* renamed from: b */
    public final /* synthetic */ C63122a f346592b;

    public /* synthetic */ C125763ac(C125774an anVar, C63122a aVar) {
        this.f346591a = anVar;
        this.f346592b = aVar;
    }

    public final void run() {
        C125774an anVar = this.f346591a;
        C63122a aVar = this.f346592b;
        ((C59052c) ((C59052c) C125774an.f346613a.mo56226d()).mo56372aa(36681)).mo56386p("No active dictation. Running failsafe stop action. [SD]");
        anVar.f346620g.mo107280d(aVar);
    }
}
