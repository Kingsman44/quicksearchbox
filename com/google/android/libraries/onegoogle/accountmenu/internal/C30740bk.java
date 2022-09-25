package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.os.Bundle;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bk */
/* compiled from: PG */
final class C30740bk extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C30741bl f82974a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30740bk(C30741bl blVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f82974a = blVar;
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
        this.f82974a.dismiss();
        return true;
    }
}
