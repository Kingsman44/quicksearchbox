package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125131de;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.aa */
/* compiled from: PG */
public final /* synthetic */ class C126187aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347712a;

    /* renamed from: b */
    public final /* synthetic */ C125131de f347713b;

    public /* synthetic */ C126187aa(C126208av avVar, C125131de deVar) {
        this.f347712a = avVar;
        this.f347713b = deVar;
    }

    public final void run() {
        C126208av avVar = this.f347712a;
        C125131de deVar = this.f347713b;
        if (avVar.f347769r) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36923)).mo56389s("%s stopped, ignoring handleLatencyEvent [SD]", avVar.f347766o);
        } else {
            avVar.f347759h.mo107488h(new C126256cp(new C126255co(deVar), false));
        }
    }
}
