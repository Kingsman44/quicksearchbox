package com.google.android.material.appbar;

import android.view.View;
import android.widget.ScrollView;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.e */
/* compiled from: PG */
final class C44509e extends C2061c {

    /* renamed from: a */
    final /* synthetic */ AppBarLayout.BaseBehavior f115740a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44509e(AppBarLayout.BaseBehavior baseBehavior) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f115740a = baseBehavior;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setScrollable(this.f115740a.f115686c);
        kVar.f5921a.setClassName(ScrollView.class.getName());
    }
}
