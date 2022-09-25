package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.dc */
/* compiled from: PG */
public final /* synthetic */ class C79807dc implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C79808dd f218798a;

    /* renamed from: b */
    public final /* synthetic */ Optional f218799b;

    public /* synthetic */ C79807dc(C79808dd ddVar, Optional optional) {
        this.f218798a = ddVar;
        this.f218799b = optional;
    }

    public final void run() {
        ArrayList arrayList;
        C79808dd ddVar = this.f218798a;
        Optional optional = this.f218799b;
        synchronized (ddVar.f218801b) {
            ddVar.f218804e = optional;
            ddVar.f218803d = true;
            arrayList = ddVar.f218802c;
            ddVar.f218802c = new ArrayList();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C89857g gVar = (C89857g) arrayList.get(i);
            ddVar.mo74249o(gVar, gVar.f246210e, (String) optional.orElse(null));
        }
    }
}
