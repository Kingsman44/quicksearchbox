package androidx.core.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1996p;

/* renamed from: androidx.core.widget.n */
/* compiled from: PG */
final class C2127n extends C2061c {
    public C2127n() {
        super(C2061c.DEFAULT_DELEGATE);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.mo5308fF() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        C1996p.m5347c(accessibilityEvent, nestedScrollView.getScrollX());
        C1996p.m5348d(accessibilityEvent, nestedScrollView.mo5308fF());
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        int fF;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        kVar.f5921a.setClassName(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (fF = nestedScrollView.mo5308fF()) > 0) {
            kVar.f5921a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                kVar.mo5153b(C1988h.f5908f);
                kVar.mo5153b(C1988h.f5912j);
            }
            if (nestedScrollView.getScrollY() < fF) {
                kVar.mo5153b(C1988h.f5907e);
                kVar.mo5153b(C1988h.f5913k);
            }
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo5322o(max, true);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.mo5308fF());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.mo5322o(min, true);
        return true;
    }
}
