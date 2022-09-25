package android.support.p033v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: android.support.v7.widget.gj */
/* compiled from: PG */
public class C0675gj extends C2061c {

    /* renamed from: a */
    final RecyclerView f2482a;

    /* renamed from: b */
    public final C0674gi f2483b;

    public C0675gj(RecyclerView recyclerView) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f2482a = recyclerView;
        C2061c a = mo3098a();
        if (a == null || !(a instanceof C0674gi)) {
            this.f2483b = new C0674gi(this);
        } else {
            this.f2483b = (C0674gi) a;
        }
    }

    /* renamed from: a */
    public C2061c mo3098a() {
        return this.f2483b;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C0653fo foVar;
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f2482a.hasPendingAdapterUpdates() && (foVar = ((RecyclerView) view).mLayout) != null) {
            foVar.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        C0653fo foVar;
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        if (!this.f2482a.hasPendingAdapterUpdates() && (foVar = this.f2482a.mLayout) != null) {
            foVar.onInitializeAccessibilityNodeInfo(kVar);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        C0653fo foVar;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (this.f2482a.hasPendingAdapterUpdates() || (foVar = this.f2482a.mLayout) == null) {
            return false;
        }
        return foVar.performAccessibilityAction(i, bundle);
    }
}
