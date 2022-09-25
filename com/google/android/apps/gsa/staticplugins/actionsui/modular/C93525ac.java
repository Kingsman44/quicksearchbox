package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.AudioArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ac */
/* compiled from: PG */
final class C93525ac extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ AudioArgumentView f261161a;

    public C93525ac(AudioArgumentView audioArgumentView) {
        this.f261161a = audioArgumentView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        AudioArgumentView audioArgumentView = this.f261161a;
        C93595cs csVar = audioArgumentView.f261444j;
        if (csVar != null) {
            csVar.mo88005b(8, audioArgumentView.mo87855a(), 1);
            this.f261161a.f261003b.setText("00:00");
        }
        ObjectAnimator objectAnimator = this.f261161a.f261006e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ((AudioArgument) this.f261161a.f261447m).mo81334P((Object) null);
        AudioArgumentView audioArgumentView2 = this.f261161a;
        audioArgumentView2.f261011v = 2;
        audioArgumentView2.mo87732f();
    }
}
