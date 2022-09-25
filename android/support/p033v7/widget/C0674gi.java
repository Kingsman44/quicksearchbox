package android.support.p033v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.gi */
/* compiled from: PG */
public final class C0674gi extends C2061c {

    /* renamed from: a */
    final C0675gj f2480a;

    /* renamed from: b */
    public final Map f2481b = new WeakHashMap();

    public C0674gi(C0675gj gjVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f2480a = gjVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            return cVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final C1995o getAccessibilityNodeProvider(View view) {
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            return cVar.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            cVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        C0653fo foVar;
        if (this.f2480a.f2482a.hasPendingAdapterUpdates() || (foVar = this.f2480a.f2482a.mLayout) == null) {
            super.onInitializeAccessibilityNodeInfo(view, kVar);
            return;
        }
        foVar.onInitializeAccessibilityNodeInfoForItem(view, kVar);
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            cVar.onInitializeAccessibilityNodeInfo(view, kVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, kVar);
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            cVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2061c cVar = (C2061c) this.f2481b.get(viewGroup);
        if (cVar != null) {
            return cVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (this.f2480a.f2482a.hasPendingAdapterUpdates() || this.f2480a.f2482a.mLayout == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            if (cVar.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        return this.f2480a.f2482a.mLayout.performAccessibilityActionForItem(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            cVar.sendAccessibilityEvent(view, i);
        } else {
            this.mOriginalDelegate.sendAccessibilityEvent(view, i);
        }
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C2061c cVar = (C2061c) this.f2481b.get(view);
        if (cVar != null) {
            cVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
