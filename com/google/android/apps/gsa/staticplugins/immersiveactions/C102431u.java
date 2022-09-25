package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.u */
/* compiled from: PG */
final class C102431u extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ImmersiveActionsHeader f285866a;

    public C102431u(ImmersiveActionsHeader immersiveActionsHeader) {
        this.f285866a = immersiveActionsHeader;
    }

    /* renamed from: a */
    public final void mo84951a(View view) {
        for (Argument argument : ((ModularAction) this.f285866a.f285733e.f239226b).f236100f) {
            argument.f236147h = true;
        }
        C93602cz czVar = this.f285866a.f285733e;
        ProviderArgument providerArgument = ((ModularAction) czVar.f239226b).f236102h;
        if (providerArgument != null) {
            providerArgument.f236147h = true;
        }
        czVar.mo82050m(1, 4);
        this.f285866a.f285733e.mo88035ad(false);
        this.f285866a.f285733e.mo82057t();
    }
}
