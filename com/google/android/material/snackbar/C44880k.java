package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.snackbar.k */
/* compiled from: PG */
final class C44880k extends C2061c {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117127a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44880k(BaseTransientBottomBar baseTransientBottomBar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f117127a = baseTransientBottomBar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.addAction(1048576);
        kVar.f5921a.setDismissable(true);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.f117127a.mo48340e(3);
        return true;
    }
}
