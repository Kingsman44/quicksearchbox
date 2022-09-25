package com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher.e */
/* compiled from: PG */
public final class C138807e extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C138809g f377563a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138807e(C138809g gVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f377563a = gVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.mo5158f(this.f377563a.f377565a.getString(R.string.googleapp_switcher_description));
    }
}
