package com.google.android.libraries.onegoogle.tooltip;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.g */
/* compiled from: PG */
public final /* synthetic */ class C31071g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31075k f83703a;

    public /* synthetic */ C31071g(C31075k kVar) {
        this.f83703a = kVar;
    }

    public final void run() {
        C31075k kVar = this.f83703a;
        C31074j jVar = kVar.f83710d;
        jVar.getClass();
        C31068d dVar = (C31068d) jVar;
        kVar.f83708b = new C31079o(dVar.f83695b, dVar.f83694a, new C31070f(kVar));
        View rootView = ((SelectedAccountDisc) ((C31068d) kVar.f83710d).f83695b).f81902c.getRootView();
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new C31073i(kVar, rootView));
        rootView.requestLayout();
    }
}
