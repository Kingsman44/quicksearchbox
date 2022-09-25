package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126345v;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ah */
/* compiled from: PG */
public final /* synthetic */ class C126194ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347723a;

    /* renamed from: b */
    public final /* synthetic */ String f347724b;

    public /* synthetic */ C126194ah(C126208av avVar, String str) {
        this.f347723a = avVar;
        this.f347724b = str;
    }

    public final void run() {
        C126208av avVar = this.f347723a;
        String str = this.f347724b;
        if (avVar.f347769r) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36925)).mo56389s("%s stopped, ignoring handlePrefixText [SD]", avVar.f347766o);
        } else {
            avVar.f347759h.mo107489i(C126345v.m206600b(str));
        }
    }
}
