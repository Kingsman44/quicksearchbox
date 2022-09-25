package androidx.customview.p103b;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;

/* renamed from: androidx.customview.b.a */
/* compiled from: PG */
final class C2143a extends C1995o {

    /* renamed from: b */
    final /* synthetic */ C2144b f6086b;

    public C2143a(C2144b bVar) {
        this.f6086b = bVar;
    }

    /* renamed from: a */
    public final C1991k mo5167a(int i) {
        return new C1991k(AccessibilityNodeInfo.obtain(this.f6086b.obtainAccessibilityNodeInfo(i).f5921a));
    }

    /* renamed from: b */
    public final C1991k mo5168b(int i) {
        int i2 = i == 2 ? this.f6086b.mAccessibilityFocusedVirtualViewId : this.f6086b.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo5167a(i2);
    }

    /* renamed from: c */
    public final boolean mo5169c(int i, int i2, Bundle bundle) {
        int i3;
        C2144b bVar = this.f6086b;
        if (i == -1) {
            return C2043bi.m5535aB(bVar.mHost, i2, bundle);
        }
        if (i2 == 1) {
            return bVar.requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return bVar.clearKeyboardFocusForVirtualView(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return bVar.onPerformActionForVirtualView$ar$ds(i, i2);
            }
            return bVar.clearAccessibilityFocus(i);
        } else if (!bVar.mManager.isEnabled() || !bVar.mManager.isTouchExplorationEnabled() || (i3 = bVar.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        } else {
            if (i3 != Integer.MIN_VALUE) {
                bVar.clearAccessibilityFocus(i3);
            }
            bVar.mAccessibilityFocusedVirtualViewId = i;
            bVar.mHost.invalidate();
            bVar.sendEventForVirtualView$ar$ds(i, 32768);
            return true;
        }
    }
}
