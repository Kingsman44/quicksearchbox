package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125097by;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ak */
/* compiled from: PG */
public final /* synthetic */ class C126197ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347730a;

    /* renamed from: b */
    public final /* synthetic */ C125097by f347731b;

    public /* synthetic */ C126197ak(C126208av avVar, C125097by byVar) {
        this.f347730a = avVar;
        this.f347731b = byVar;
    }

    public final void run() {
        C126208av avVar = this.f347730a;
        C125097by byVar = this.f347731b;
        if (avVar.f347769r) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36911)).mo56389s("%s stopped, ignoring handleButtonPress [SD]", avVar.f347766o);
        } else {
            avVar.f347759h.mo107488h(new C126256cp(new C126253cm(byVar), false));
        }
    }
}
