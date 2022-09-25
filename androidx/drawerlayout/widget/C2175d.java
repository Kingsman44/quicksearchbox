package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: androidx.drawerlayout.widget.d */
/* compiled from: PG */
final class C2175d extends C2061c {

    /* renamed from: a */
    final /* synthetic */ DrawerLayout f6187a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2175d(DrawerLayout drawerLayout) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f6187a = drawerLayout;
        new Rect();
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        View i = this.f6187a.mo5461i();
        if (i == null) {
            return true;
        }
        Gravity.getAbsoluteGravity(this.f6187a.mo5455f(i), C2043bi.m5577f(this.f6187a));
        return true;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        int i = DrawerLayout.f6147g;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        kVar.f5921a.setFocusable(false);
        kVar.f5921a.setFocused(false);
        kVar.mo5159g(C1988h.f5903a);
        kVar.mo5159g(C1988h.f5904b);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int i = DrawerLayout.f6147g;
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
