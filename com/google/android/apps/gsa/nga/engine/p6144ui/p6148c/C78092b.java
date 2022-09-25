package com.google.android.apps.gsa.nga.engine.p6144ui.p6148c;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.c.b */
/* compiled from: PG */
public final /* synthetic */ class C78092b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78097g f215078a;

    /* renamed from: b */
    public final /* synthetic */ CharSequence f215079b;

    public /* synthetic */ C78092b(C78097g gVar, CharSequence charSequence) {
        this.f215078a = gVar;
        this.f215079b = charSequence;
    }

    public final void run() {
        C78097g gVar = this.f215078a;
        CharSequence charSequence = this.f215079b;
        C78091a aVar = gVar.f215088d;
        aVar.f215076a.add(0, charSequence);
        while (aVar.f215076a.size() > 1024) {
            aVar.f215076a.remove(1024);
        }
        aVar.notifyDataSetChanged();
    }
}
