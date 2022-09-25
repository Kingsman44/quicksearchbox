package com.google.android.apps.education.bloom.mathview.render;

import android.util.LruCache;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.j */
/* compiled from: PG */
public final class C9071j extends LruCache {
    public C9071j() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C9068g gVar = (C9068g) obj;
        C9065d dVar = (C9065d) obj2;
        C9065d dVar2 = (C9065d) obj3;
        if (gVar != null) {
            C9068g.f31293a.mo5127b(gVar);
        }
        if (dVar != null) {
            C9065d.f31289a.mo5127b(dVar);
        }
    }
}
