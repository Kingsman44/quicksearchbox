package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.y */
/* compiled from: PG */
public final class C93668y extends C93631ea {

    /* renamed from: a */
    final /* synthetic */ C93524ab f261458a;

    public C93668y(C93524ab abVar) {
        this.f261458a = abVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87963b(Argument argument) {
        EntityArgument entityArgument = (EntityArgument) argument;
        ((Disambiguation) entityArgument.f236203n).mo81538f();
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 4;
        kVar.f236086a |= 1;
        int i = entityArgument.f236140a;
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236086a |= 2;
        kVar2.f236088c = i;
        this.f261458a.f261158d.mo88029X((Disambiguation) entityArgument.f236203n, (C87423k) jVar.build(), 2);
    }
}
