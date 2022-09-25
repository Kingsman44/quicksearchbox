package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.drawerlayout.widget.g */
/* compiled from: PG */
final class C2178g extends C2061c {
    public C2178g() {
        super(C2061c.DEFAULT_DELEGATE);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        int i = DrawerLayout.f6147g;
        if (C2043bi.m5575d(view) == 4 || C2043bi.m5575d(view) == 2) {
            kVar.mo5156e((View) null);
        }
    }
}
