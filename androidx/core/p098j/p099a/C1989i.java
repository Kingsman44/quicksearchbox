package androidx.core.p098j.p099a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: androidx.core.j.a.i */
/* compiled from: PG */
public final class C1989i {

    /* renamed from: a */
    final Object f5919a;

    public C1989i(Object obj) {
        this.f5919a = obj;
    }

    /* renamed from: a */
    public static C1989i m5331a(int i, int i2, boolean z, int i3) {
        return new C1989i(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    /* renamed from: b */
    public static C1989i m5332b(int i) {
        return new C1989i(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
