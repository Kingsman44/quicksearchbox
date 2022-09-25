package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.bottomsheet.l */
/* compiled from: PG */
final class C44561l extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C44565p f115947a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44561l(C44565p pVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f115947a = pVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        if (this.f115947a.f115959p) {
            kVar.f5921a.addAction(1048576);
            kVar.f5921a.setDismissable(true);
            return;
        }
        kVar.f5921a.setDismissable(false);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            C44565p pVar = this.f115947a;
            if (!pVar.f115959p) {
                i = 1048576;
            } else {
                pVar.cancel();
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
