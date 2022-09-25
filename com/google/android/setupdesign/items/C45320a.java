package com.google.android.setupdesign.items;

import android.os.Bundle;
import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.setupdesign.items.a */
/* compiled from: PG */
final class C45320a extends C2061c {

    /* renamed from: a */
    final /* synthetic */ ExpandableSwitchItem f118403a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45320a(ExpandableSwitchItem expandableSwitchItem) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f118403a = expandableSwitchItem;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        C1988h hVar;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        if (this.f118403a.f118400a) {
            hVar = C1988h.f5910h;
        } else {
            hVar = C1988h.f5909g;
        }
        kVar.mo5153b(hVar);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 262144 && i != 524288) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        ExpandableSwitchItem expandableSwitchItem = this.f118403a;
        expandableSwitchItem.mo49245c(!expandableSwitchItem.f118400a);
        return true;
    }
}
