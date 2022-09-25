package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ae */
/* compiled from: PG */
public final /* synthetic */ class C126191ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347717a;

    /* renamed from: b */
    public final /* synthetic */ C125065at f347718b;

    public /* synthetic */ C126191ae(C126208av avVar, C125065at atVar) {
        this.f347717a = avVar;
        this.f347718b = atVar;
    }

    public final void run() {
        C126208av avVar = this.f347717a;
        C125065at atVar = this.f347718b;
        if (avVar.f347769r) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36927)).mo56389s("%s stopped, ignoring handleTranscription [SD]", avVar.f347766o);
        } else {
            avVar.f347759h.mo107489i(atVar);
        }
    }
}
