package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.voiceinteraction.hotword.C118719g;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.voiceinteraction.m */
/* compiled from: PG */
public final /* synthetic */ class C45405m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C45407o f118779a;

    public /* synthetic */ C45405m(C45407o oVar) {
        this.f118779a = oVar;
    }

    public final Object call() {
        C45407o oVar = this.f118779a;
        synchronized (oVar.f118781a.f118726v) {
            C118719g gVar = oVar.f118781a.f118632D;
            if (gVar != null && gVar.f331147j.mo103926e()) {
                oVar.f118781a.mo49395J();
            }
        }
        oVar.f118781a.mo49392G();
        return true;
    }
}
