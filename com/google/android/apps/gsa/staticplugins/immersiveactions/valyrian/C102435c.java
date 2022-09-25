package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.c */
/* compiled from: PG */
final class C102435c extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ValyrianImmersiveActionsHeader f285898a;

    public C102435c(ValyrianImmersiveActionsHeader valyrianImmersiveActionsHeader) {
        this.f285898a = valyrianImmersiveActionsHeader;
    }

    /* renamed from: a */
    public final void mo84951a(View view) {
        for (Argument argument : ((ModularAction) this.f285898a.f285872d.f239226b).f236100f) {
            argument.f236147h = true;
        }
        C93602cz czVar = this.f285898a.f285872d;
        ProviderArgument providerArgument = ((ModularAction) czVar.f239226b).f236102h;
        if (providerArgument != null) {
            providerArgument.f236147h = true;
        }
        czVar.mo82050m(1, 4);
        this.f285898a.f285872d.mo88035ad(false);
        this.f285898a.f285872d.mo82057t();
    }
}
