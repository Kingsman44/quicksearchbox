package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.voiceinteraction.hotword.C118719g;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.voiceinteraction.n */
/* compiled from: PG */
public final /* synthetic */ class C45406n implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C45407o f118780a;

    public /* synthetic */ C45406n(C45407o oVar) {
        this.f118780a = oVar;
    }

    public final Object call() {
        C45407o oVar = this.f118780a;
        synchronized (oVar.f118781a.f118726v) {
            C118719g gVar = oVar.f118781a.f118632D;
            if (gVar != null && gVar.f331147j.mo103925d()) {
                oVar.f118781a.mo49395J();
            }
        }
        oVar.f118781a.mo49392G();
        return true;
    }
}
