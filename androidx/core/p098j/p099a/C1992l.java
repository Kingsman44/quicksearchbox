package androidx.core.p098j.p099a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: androidx.core.j.a.l */
/* compiled from: PG */
class C1992l extends AccessibilityNodeProvider {

    /* renamed from: a */
    final C1995o f5924a;

    public C1992l(C1995o oVar) {
        this.f5924a = oVar;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1991k a = this.f5924a.mo5167a(i);
        if (a == null) {
            return null;
        }
        return a.f5921a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f5924a.mo5169c(i, i2, bundle);
    }
}
