package com.google.android.apps.gsa.staticplugins.voiceaccess;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118950d;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8792g.C117676a;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.d */
/* compiled from: PG */
public final /* synthetic */ class C117614d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C117618h f326482a;

    /* renamed from: b */
    public final /* synthetic */ C92473f f326483b;

    /* renamed from: c */
    public final /* synthetic */ C117676a f326484c;

    public /* synthetic */ C117614d(C117618h hVar, C117676a aVar, C92473f fVar) {
        this.f326482a = hVar;
        this.f326484c = aVar;
        this.f326483b = fVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C117618h hVar = this.f326482a;
        C117676a aVar = this.f326484c;
        C92473f fVar = this.f326483b;
        hVar.f326496i = true;
        hVar.f326492c.mo85091a();
        if (hVar.f326497j) {
            hVar.mo103408g(false);
        }
        hVar.f326497j = true;
        hVar.f326494g = new C117617g(hVar, aVar);
        hVar.f326498k = hVar.mo103406e(fVar, hVar.f326494g);
        hVar.f326495h = Long.valueOf(fVar.f258032t);
        ((C118950d) hVar.f326490a.mo27525b()).mo91289b(fVar, hVar.f326494g, hVar.f326493f, hVar.f326498k);
        hVar.f326496i = false;
        return C118826c.f331422a;
    }
}
