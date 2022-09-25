package androidx.core.p098j;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.p094f.C1888a;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;
import java.util.List;

/* renamed from: androidx.core.j.a */
/* compiled from: PG */
final class C1979a extends View.AccessibilityDelegate {

    /* renamed from: a */
    final C2061c f5897a;

    public C1979a(C2061c cVar) {
        this.f5897a = cVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5897a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1995o accessibilityNodeProvider = this.f5897a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.f5925a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5897a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C1991k kVar = new C1991k(accessibilityNodeInfo);
        kVar.f5921a.setScreenReaderFocusable(C2043bi.m5534aA(view));
        Boolean bool = (Boolean) C2043bi.m5593v().mo5185d(view);
        kVar.f5921a.setHeading(bool != null && bool.booleanValue());
        kVar.f5921a.setPaneTitle(C2043bi.m5509C(view));
        CharSequence D = C2043bi.m5510D(view);
        if (C1888a.m5148b()) {
            kVar.f5921a.setStateDescription(D);
        } else {
            kVar.f5921a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", D);
        }
        this.f5897a.onInitializeAccessibilityNodeInfo(view, kVar);
        accessibilityNodeInfo.getText();
        List actionList = C2061c.getActionList(view);
        for (int i = 0; i < actionList.size(); i++) {
            kVar.mo5153b((C1988h) actionList.get(i));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5897a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5897a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f5897a.performAccessibilityAction(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f5897a.sendAccessibilityEvent(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5897a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
