package com.android.p271h.p272a;

import android.util.Log;

/* renamed from: com.android.h.a.f */
/* compiled from: PG */
final class C5158f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C5162j f16402a;

    public C5158f(C5162j jVar) {
        this.f16402a = jVar;
    }

    public final void run() {
        C5157e eVar = this.f16402a.mRenderer.f16410g;
        eVar.f16399x = true;
        C5154b bVar = eVar.f16372A;
        bVar.interrupt();
        try {
            bVar.join();
        } catch (InterruptedException unused) {
            Log.w("TiledImageRenderer", "Interrupted while waiting for TileDecoder thread to finish!");
        }
        synchronized (eVar.f16389n) {
            eVar.f16391p.f16370a = null;
            eVar.f16392q.f16370a = null;
            for (C5153a a = eVar.f16390o.mo10228a(); a != null; a = eVar.f16390o.mo10228a()) {
                a.mo10020g();
            }
        }
        int size = eVar.f16388m.size();
        for (int i = 0; i < size; i++) {
            ((C5153a) eVar.f16388m.valueAt(i)).mo10020g();
        }
        eVar.f16388m.clear();
        eVar.f16400y.set(0, 0, 0, 0);
        do {
        } while (C5157e.f16371a.mo5126a() != null);
    }
}
