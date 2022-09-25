package com.google.android.libraries.home.coreui.devicetile.model;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.s */
/* compiled from: PG */
public final class C23744s extends C23739n {

    /* renamed from: a */
    private final boolean f65094a;

    public C23744s(boolean z) {
        super("expand-action");
        this.f65094a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23744s) && this.f65094a == ((C23744s) obj).f65094a;
    }

    public final int hashCode() {
        return this.f65094a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f65094a;
        return "ExpandAction(isExpanded=" + z + ")";
    }
}
