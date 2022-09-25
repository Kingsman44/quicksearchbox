package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.af */
/* compiled from: PG */
public final /* synthetic */ class C126192af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347719a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f347720b;

    public /* synthetic */ C126192af(C126208av avVar, C58485gu guVar) {
        this.f347719a = avVar;
        this.f347720b = guVar;
    }

    public final void run() {
        C126208av avVar = this.f347719a;
        C58485gu guVar = this.f347720b;
        if (avVar.f347769r) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36921)).mo56389s("%s stopped, ignoring handleKeyboardUiSuggestions [SD]", avVar.f347766o);
            return;
        }
        C126257cq cqVar = avVar.f347759h;
        guVar.size();
        cqVar.mo107488h(new C126256cp(new C126254cn(guVar), false));
    }
}
