package com.google.android.apps.gsa.search.core.preferences.cards;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.b */
/* compiled from: PG */
final class C86304b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C86305c f233351a;

    public C86304b(C86305c cVar) {
        this.f233351a = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C86305c cVar = this.f233351a;
        C86307e eVar = cVar.f233355d;
        int i2 = cVar.f233354c;
        C86312j jVar = eVar.f233357a.f233345b;
        jVar.f233366c.f233350g.mo85139d(new C86311i(jVar, (C86308f) jVar.f233364a.get(i2)));
        jVar.f233364a.remove(i2);
        jVar.notifyDataSetChanged();
    }
}
