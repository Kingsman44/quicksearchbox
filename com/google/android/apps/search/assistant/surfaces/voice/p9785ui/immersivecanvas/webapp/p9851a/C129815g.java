package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9851a;

import com.google.common.p4526f.C59052c;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.a.g */
/* compiled from: PG */
public final /* synthetic */ class C129815g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C129816h f356186a;

    public /* synthetic */ C129815g(C129816h hVar) {
        this.f356186a = hVar;
    }

    public final void run() {
        C129816h hVar = this.f356186a;
        ((C59052c) ((C59052c) C129817i.f356194a.mo56226d()).mo56372aa(38498)).mo56389s("Immersive update: %s timed out. Cancelling the update.", hVar.f356188b);
        DesugarAtomicReference.updateAndGet(hVar.f356189c.f356196b, new C129814f(hVar.f356188b));
        hVar.f356187a.removeCallbacksAndMessages(hVar);
    }
}
