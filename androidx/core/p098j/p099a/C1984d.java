package androidx.core.p098j.p099a;

import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.C6067a;
import com.facebook.litho.C6204dx;
import com.facebook.litho.LithoView;

/* renamed from: androidx.core.j.a.d */
/* compiled from: PG */
public final class C1984d implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a */
    final C1983c f5901a;

    public C1984d(C1983c cVar) {
        this.f5901a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1984d)) {
            return false;
        }
        return this.f5901a.equals(((C1984d) obj).f5901a);
    }

    public final int hashCode() {
        return this.f5901a.hashCode();
    }

    public final void onAccessibilityStateChanged(boolean z) {
        C1983c cVar = this.f5901a;
        C6067a.m15728a();
        LithoView lithoView = (LithoView) ((C6204dx) cVar).f18347a.get();
        if (lithoView != null) {
            lithoView.mo12683l(z);
            lithoView.f17942r = true;
            lithoView.requestLayout();
        }
    }
}
