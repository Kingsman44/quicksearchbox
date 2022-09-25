package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.bb */
/* compiled from: PG */
final class C104327bb extends C2061c {

    /* renamed from: a */
    private final boolean f290235a;

    public C104327bb(boolean z) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f290235a = z;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        if (this.f290235a) {
            kVar.f5921a.addAction(524288);
        } else {
            kVar.f5921a.addAction(C89885b.HTTP_VALUE);
        }
    }
}
