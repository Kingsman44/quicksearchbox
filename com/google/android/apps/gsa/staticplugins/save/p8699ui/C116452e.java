package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.e */
/* compiled from: PG */
final class C116452e extends C2061c {

    /* renamed from: a */
    final /* synthetic */ ConfirmationTray f322907a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116452e(ConfirmationTray confirmationTray) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f322907a = confirmationTray;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.mo5153b(new C1988h((Object) null, 16, this.f322907a.getContext().getString(R.string.view_all_items_a11y_action), (C1981aa) null, (Class) null));
    }
}
