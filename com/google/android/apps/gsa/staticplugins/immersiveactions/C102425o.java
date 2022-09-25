package com.google.android.apps.gsa.staticplugins.immersiveactions;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.actionsui.C93436ac;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.p4152bb.p4153a.C55361pn;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.o */
/* compiled from: PG */
final class C102425o implements C93436ac {

    /* renamed from: a */
    final /* synthetic */ ProviderArgument f285858a;

    /* renamed from: b */
    final /* synthetic */ ImmersiveActionsDisambiguationContent f285859b;

    public C102425o(ImmersiveActionsDisambiguationContent immersiveActionsDisambiguationContent, ProviderArgument providerArgument) {
        this.f285859b = immersiveActionsDisambiguationContent;
        this.f285858a = providerArgument;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87748b(Object obj) {
        this.f285858a.f236147h = false;
        C55361pn pnVar = (C55361pn) ((ProtoLiteParcelable) obj).mo84190c(C55361pn.f145866g);
        if (pnVar != null && !this.f285859b.f261015b.mo88041aj(pnVar) && this.f285859b.f261015b.mo88040ai()) {
            this.f285859b.f261015b.mo88035ad(false);
            this.f285859b.f261015b.mo82057t();
        }
        C93602cz czVar = this.f285859b.f261015b;
        Disambiguation a = this.f285858a.mo81320a();
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 2;
        kVar.f236086a |= 1;
        int i = this.f285858a.f236140a;
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236086a |= 2;
        kVar2.f236088c = i;
        czVar.mo88029X(a, (C87423k) jVar.build(), 2);
    }
}
