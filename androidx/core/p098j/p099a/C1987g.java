package androidx.core.p098j.p099a;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.core.j.a.g */
/* compiled from: PG */
final class C1987g implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    final C1986f f5902a;

    public C1987g(C1986f fVar) {
        this.f5902a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1987g)) {
            return false;
        }
        return this.f5902a.equals(((C1987g) obj).f5902a);
    }

    public final int hashCode() {
        return this.f5902a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        this.f5902a.mo5144a(z);
    }
}
