package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.nga.api.a.at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125063ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ai */
/* compiled from: PG */
public final /* synthetic */ class C126195ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347725a;

    /* renamed from: b */
    public final /* synthetic */ C125063ar f347726b;

    public /* synthetic */ C126195ai(C126208av avVar, C125063ar arVar) {
        this.f347725a = avVar;
        this.f347726b = arVar;
    }

    public final void run() {
        C126208av avVar = this.f347725a;
        C125063ar arVar = this.f347726b;
        if (avVar.f347769r) {
            ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36913)).mo56389s("%s stopped, ignoring handleContextUpdate [SD]", avVar.f347766o);
            return;
        }
        C126057bv bvVar = avVar.f347754c;
        at atVar = arVar.f345039a;
        if (atVar == null) {
            atVar = at.b;
        }
        bvVar.mo107278b(atVar);
    }
}
