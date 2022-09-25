package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.search.shared.common.util.C87510b;
import com.google.android.apps.gsa.staticplugins.actionsui.C93454au;
import com.google.p4152bb.p4153a.C55112gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ba */
/* compiled from: PG */
final class C93550ba implements C93454au {

    /* renamed from: a */
    final /* synthetic */ C93602cz f261207a;

    /* renamed from: b */
    final /* synthetic */ DisambiguationContent f261208b;

    public C93550ba(DisambiguationContent disambiguationContent, C93602cz czVar) {
        this.f261208b = disambiguationContent;
        this.f261207a = czVar;
    }

    /* renamed from: a */
    public final void mo87769a(LocationArgument locationArgument, C55112gh ghVar) {
        locationArgument.f236147h = false;
        locationArgument.mo81314i(ghVar);
        this.f261207a.mo82037B();
        C93602cz czVar = this.f261208b.f261015b;
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 2;
        kVar.f236086a |= 1;
        int i = locationArgument.f236140a;
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236086a = 2 | kVar2.f236086a;
        kVar2.f236088c = i;
        czVar.mo82038C(1, (C87423k) jVar.build());
    }

    /* renamed from: b */
    public final void mo87770b(LocationArgument locationArgument) {
        locationArgument.f236147h = false;
        this.f261207a.mo82041aq().mo65089a(C87510b.m142043a(locationArgument.mo81313h().f145040e, this.f261208b.getContext()));
    }
}
