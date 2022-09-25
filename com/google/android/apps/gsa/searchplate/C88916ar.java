package com.google.android.apps.gsa.searchplate;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchplate.ar */
/* compiled from: PG */
public final class C88916ar extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C88923ay f240870a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88916ar(C88923ay ayVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f240870a = ayVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.mo5158f(this.f240870a.f240880c.getString(R.string.switcher_description));
    }
}
