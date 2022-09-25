package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.actionsui.C93436ac;
import com.google.p4152bb.p4153a.C55361pn;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.az */
/* compiled from: PG */
final class C93548az implements C93436ac {

    /* renamed from: a */
    final /* synthetic */ ProviderArgument f261202a;

    /* renamed from: b */
    final /* synthetic */ DisambiguationContent f261203b;

    public C93548az(DisambiguationContent disambiguationContent, ProviderArgument providerArgument) {
        this.f261203b = disambiguationContent;
        this.f261202a = providerArgument;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87748b(Object obj) {
        this.f261202a.f236147h = false;
        this.f261203b.f261015b.mo88041aj((C55361pn) ((ProtoLiteParcelable) obj).mo84190c(C55361pn.f145866g));
        C93602cz czVar = this.f261203b.f261015b;
        Disambiguation a = this.f261202a.mo81320a();
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 2;
        kVar.f236086a |= 1;
        int i = this.f261202a.f236140a;
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236086a |= 2;
        kVar2.f236088c = i;
        czVar.mo88029X(a, (C87423k) jVar.build(), 2);
    }
}
