package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument;
import com.google.android.apps.gsa.shared.p7148ui.C90659bd;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dp */
/* compiled from: PG */
final class C93619dp extends C90659bd {

    /* renamed from: a */
    final /* synthetic */ StringArgumentView f261355a;

    public C93619dp(StringArgumentView stringArgumentView) {
        this.f261355a = stringArgumentView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84953a(boolean z) {
        StringArgumentView stringArgumentView = this.f261355a;
        stringArgumentView.f261105c = z;
        if (z) {
            ((InputMethodManager) stringArgumentView.getContext().getSystemService("input_method")).showSoftInput(this.f261355a.f261103a, 0);
        } else {
            View view = stringArgumentView.f261106d;
            if (view != null) {
                view.requestFocus();
                ((InputMethodManager) this.f261355a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f261355a.f261103a.getWindowToken(), 2);
            }
        }
        this.f261355a.refreshDrawableState();
        this.f261355a.mo87732f();
        StringArgumentView stringArgumentView2 = this.f261355a;
        C93622ds dsVar = stringArgumentView2.f261104b;
        if (dsVar != null) {
            dsVar.mo88050a((StringArgument) stringArgumentView2.f261447m, stringArgumentView2.f261105c);
        }
    }
}
