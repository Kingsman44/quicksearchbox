package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.o */
/* compiled from: PG */
final class C102447o extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ValyrianImmersiveActionsUiFooter f285922a;

    public C102447o(ValyrianImmersiveActionsUiFooter valyrianImmersiveActionsUiFooter) {
        this.f285922a = valyrianImmersiveActionsUiFooter;
    }

    /* renamed from: a */
    public final void mo84951a(View view) {
        for (Argument argument : ((ModularAction) this.f285922a.f285885b.f239226b).f236100f) {
            argument.f236147h = true;
        }
        C93602cz czVar = this.f285922a.f285885b;
        ProviderArgument providerArgument = ((ModularAction) czVar.f239226b).f236102h;
        if (providerArgument != null) {
            providerArgument.f236147h = true;
        }
        czVar.mo82050m(1, 4);
        this.f285922a.f285885b.mo88035ad(false);
        this.f285922a.f285885b.mo82057t();
    }
}
