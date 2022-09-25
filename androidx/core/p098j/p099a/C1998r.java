package androidx.core.p098j.p099a;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.j.a.r */
/* compiled from: PG */
public final class C1998r {

    /* renamed from: a */
    public final AccessibilityRecord f5926a;

    @Deprecated
    public C1998r(Object obj) {
        this.f5926a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1998r)) {
            return false;
        }
        C1998r rVar = (C1998r) obj;
        AccessibilityRecord accessibilityRecord = this.f5926a;
        if (accessibilityRecord == null) {
            return rVar.f5926a == null;
        }
        return accessibilityRecord.equals(rVar.f5926a);
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f5926a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
