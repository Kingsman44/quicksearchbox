package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125131de;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.bs */
/* compiled from: PG */
public final /* synthetic */ class C126232bs implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126233bt f347838a;

    /* renamed from: b */
    public final /* synthetic */ C125131de f347839b;

    public /* synthetic */ C126232bs(C126233bt btVar, C125131de deVar) {
        this.f347838a = btVar;
        this.f347839b = deVar;
    }

    public final void run() {
        C126233bt btVar = this.f347838a;
        C125131de deVar = this.f347839b;
        C126208av avVar = btVar.f347845f;
        if (avVar == null) {
            C59052c cVar = (C59052c) ((C59052c) C126233bt.f347840a.mo56226d()).mo56372aa(36974);
            int i = deVar.f345201a;
            int i2 = 1;
            if (i != 0) {
                i2 = i != 1 ? i != 2 ? 0 : 3 : 2;
            }
            cVar.mo56389s("Ignoring latency event outside oration: %s [SD]", C126290c.m206496a(Integer.valueOf(i2 - 1)));
            return;
        }
        avVar.mo107460c(deVar);
    }
}
