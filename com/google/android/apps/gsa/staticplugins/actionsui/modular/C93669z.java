package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.z */
/* compiled from: PG */
public final class C93669z extends C93631ea {

    /* renamed from: a */
    final /* synthetic */ C93524ab f261459a;

    public C93669z(C93524ab abVar) {
        this.f261459a = abVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87963b(Argument argument) {
        PersonArgument personArgument = (PersonArgument) argument;
        if (personArgument.f236147h) {
            this.f261459a.f261158d.mo88033ab(personArgument);
        } else if (personArgument.mo81263C() && ((PersonDisambiguation) personArgument.f236203n).mo81606B()) {
            ((PersonDisambiguation) personArgument.f236203n).mo81613z();
            C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
            jVar.copyOnWrite();
            C87423k kVar = (C87423k) jVar.instance;
            kVar.f236087b = 5;
            kVar.f236086a |= 1;
            int i = personArgument.f236140a;
            jVar.copyOnWrite();
            C87423k kVar2 = (C87423k) jVar.instance;
            kVar2.f236086a |= 2;
            kVar2.f236088c = i;
            this.f261459a.f261158d.mo88029X((Disambiguation) personArgument.f236203n, (C87423k) jVar.build(), 2);
        } else if (!personArgument.mo81263C() || !((PersonDisambiguation) personArgument.f236203n).mo81540h()) {
            this.f261459a.f261158d.mo82051n();
        } else {
            ((PersonDisambiguation) personArgument.f236203n).mo81538f();
            C87422j jVar2 = (C87422j) C87423k.f236084e.createBuilder();
            jVar2.copyOnWrite();
            C87423k kVar3 = (C87423k) jVar2.instance;
            kVar3.f236087b = 4;
            kVar3.f236086a |= 1;
            int i2 = personArgument.f236140a;
            jVar2.copyOnWrite();
            C87423k kVar4 = (C87423k) jVar2.instance;
            kVar4.f236086a |= 2;
            kVar4.f236088c = i2;
            this.f261459a.f261158d.mo88029X((Disambiguation) personArgument.f236203n, (C87423k) jVar2.build(), 2);
        }
    }
}
