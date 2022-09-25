package com.google.android.material.internal;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.internal.y */
/* compiled from: PG */
final class C44765y extends C2061c {

    /* renamed from: a */
    final /* synthetic */ NavigationMenuItemView f116702a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44765y(NavigationMenuItemView navigationMenuItemView) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f116702a = navigationMenuItemView;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setCheckable(this.f116702a.f116518e);
    }
}
