package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.aj */
/* compiled from: PG */
public final /* synthetic */ class C125382aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C125383ak f345813a;

    /* renamed from: b */
    public final /* synthetic */ C125374ab f345814b;

    public /* synthetic */ C125382aj(C125383ak akVar, C125374ab abVar) {
        this.f345813a = akVar;
        this.f345814b = abVar;
    }

    public final void run() {
        C125383ak akVar = this.f345813a;
        C125374ab abVar = this.f345814b;
        if (akVar.f345818d == abVar) {
            ((C59052c) ((C59052c) C125383ak.f345815a.mo56224b()).mo56372aa(36526)).mo56389s("Forgetting %s [SD]", abVar.f345795n);
            akVar.f345818d = null;
        }
    }
}
