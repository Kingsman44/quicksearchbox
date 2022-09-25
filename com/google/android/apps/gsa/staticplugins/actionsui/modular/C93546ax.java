package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.staticplugins.actionsui.C93436ac;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ax */
/* compiled from: PG */
final class C93546ax implements C93436ac {

    /* renamed from: a */
    final /* synthetic */ Disambiguation f261194a;

    /* renamed from: b */
    final /* synthetic */ C93602cz f261195b;

    /* renamed from: c */
    final /* synthetic */ int f261196c;

    public C93546ax(Disambiguation disambiguation, C93602cz czVar, int i) {
        this.f261194a = disambiguation;
        this.f261195b = czVar;
        this.f261196c = i;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87748b(Object obj) {
        EntityArgument.Entity entity = (EntityArgument.Entity) obj;
        if (this.f261194a.mo81545n()) {
            this.f261194a.mo81535d(entity, true);
        }
        C93602cz czVar = this.f261195b;
        Disambiguation disambiguation = this.f261194a;
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 2;
        kVar.f236086a = 1 | kVar.f236086a;
        int i = this.f261196c;
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236086a |= 2;
        kVar2.f236088c = i;
        czVar.mo88029X(disambiguation, (C87423k) jVar.build(), 2);
    }
}
