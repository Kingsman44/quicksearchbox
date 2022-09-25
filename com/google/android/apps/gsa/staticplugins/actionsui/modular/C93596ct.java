package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ct */
/* compiled from: PG */
final class C93596ct extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ModularActionCardUnlabeledFooter f261309a;

    public C93596ct(ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter) {
        this.f261309a = modularActionCardUnlabeledFooter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        int i;
        if (this.f261309a.mo87903h()) {
            ObjectAnimator objectAnimator = this.f261309a.f261085d;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                C93602cz czVar = this.f261309a.f261084c;
                czVar.getClass();
                czVar.mo82046i();
                i = 2;
            } else {
                C93602cz czVar2 = this.f261309a.f261084c;
                czVar2.getClass();
                czVar2.mo82047j();
                i = 1;
            }
            C93602cz czVar3 = this.f261309a.f261084c;
            czVar3.getClass();
            czVar3.mo82050m(i, 4);
        }
    }
}
