package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.search.shared.common.util.C87510b;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.staticplugins.actionsui.C93454au;
import com.google.android.apps.gsa.staticplugins.actionsui.LocalResultsView;
import com.google.p4152bb.p4153a.C55112gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.aa */
/* compiled from: PG */
public final class C93523aa implements C93454au {

    /* renamed from: a */
    final /* synthetic */ LocalResultsView f261153a;

    /* renamed from: b */
    final /* synthetic */ C93524ab f261154b;

    public C93523aa(C93524ab abVar, LocalResultsView localResultsView) {
        this.f261154b = abVar;
        this.f261153a = localResultsView;
    }

    /* renamed from: a */
    public final void mo87769a(LocationArgument locationArgument, C55112gh ghVar) {
        if (locationArgument.f236147h) {
            this.f261154b.f261158d.mo88033ab(locationArgument);
        } else if (locationArgument.mo81263C() && ((Disambiguation) locationArgument.f236203n).mo81540h()) {
            ((Disambiguation) locationArgument.f236203n).mo81538f();
            C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
            jVar.copyOnWrite();
            C87423k kVar = (C87423k) jVar.instance;
            kVar.f236087b = 4;
            kVar.f236086a = 1 | kVar.f236086a;
            int i = locationArgument.f236140a;
            jVar.copyOnWrite();
            C87423k kVar2 = (C87423k) jVar.instance;
            kVar2.f236086a |= 2;
            kVar2.f236088c = i;
            this.f261154b.f261158d.mo88029X((Disambiguation) locationArgument.f236203n, (C87423k) jVar.build(), 2);
        } else if (locationArgument.mo81313h().f145037b.size() == 1) {
            mo87770b(locationArgument);
        } else {
            C93602cz czVar = this.f261154b.f261158d;
            C87422j jVar2 = (C87422j) C87423k.f236084e.createBuilder();
            jVar2.copyOnWrite();
            C87423k kVar3 = (C87423k) jVar2.instance;
            kVar3.f236087b = 2;
            kVar3.f236086a |= 1;
            int i2 = locationArgument.f236140a;
            jVar2.copyOnWrite();
            C87423k kVar4 = (C87423k) jVar2.instance;
            kVar4.f236086a = 2 | kVar4.f236086a;
            kVar4.f236088c = i2;
            czVar.mo82038C(1, (C87423k) jVar2.build());
            locationArgument.mo81314i(ghVar);
            this.f261154b.f261158d.mo82037B();
        }
    }

    /* renamed from: b */
    public final void mo87770b(LocationArgument locationArgument) {
        this.f261154b.f261158d.mo82041aq().mo65089a(C87510b.m142043a(locationArgument.mo81313h().f145040e, this.f261153a.getContext()));
    }
}
