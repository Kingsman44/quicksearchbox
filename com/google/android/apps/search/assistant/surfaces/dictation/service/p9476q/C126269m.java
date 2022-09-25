package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.m */
/* compiled from: PG */
public final /* synthetic */ class C126269m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126276t f347923a;

    /* renamed from: b */
    public final /* synthetic */ C126207au f347924b;

    public /* synthetic */ C126269m(C126276t tVar, C126207au auVar) {
        this.f347923a = tVar;
        this.f347924b = auVar;
    }

    public final void run() {
        C126276t tVar = this.f347923a;
        C126207au auVar = this.f347924b;
        ((C59052c) ((C59052c) C126276t.f347929a.mo56224b()).mo56372aa(36898)).mo56389s("Stopping %s on request [SD]", tVar.f347939k);
        if (tVar.f347936h.compareAndSet(false, true)) {
            C2164c cVar = (C2164c) tVar.f347937i.get();
            if (cVar != null && cVar.mo5438c()) {
                ((C59052c) ((C59052c) C126276t.f347929a.mo56224b()).mo56372aa(36901)).mo56389s("%s stopped before ASR started [SD]", tVar.f347939k);
            }
            tVar.f347930b.mo106963b(tVar);
            C126268l lVar = tVar.f347934f;
            C126290c.m206496a(auVar);
            C126264h hVar = (C126264h) lVar;
            if (hVar.f347916e.compareAndSet(false, true)) {
                C47632e eVar = hVar.f347917f;
                C125234by byVar = hVar.f347920i;
                Objects.requireNonNull(byVar);
                C46459k.m82829b(eVar.mo51512b(new C126213b(byVar), hVar.f347914c), "Error when stopping %s [SD]", hVar.f347920i);
            }
        }
    }
}
