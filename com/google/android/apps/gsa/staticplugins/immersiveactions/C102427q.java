package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.q */
/* compiled from: PG */
final class C102427q extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ImmersiveActionsHeader f285861a;

    public C102427q(ImmersiveActionsHeader immersiveActionsHeader) {
        this.f285861a = immersiveActionsHeader;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        if (this.f285861a.mo93190i()) {
            ImmersiveActionsHeader immersiveActionsHeader = this.f285861a;
            if (immersiveActionsHeader.f285737i == 9 || ((ModularAction) immersiveActionsHeader.f285733e.f239226b).mo81133M()) {
                this.f285861a.f285733e.mo88028W();
            }
        }
    }
}
