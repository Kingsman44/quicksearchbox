package com.google.android.libraries.lens.view.sensors.orientation;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.g */
/* compiled from: PG */
public final class C27730g {

    /* renamed from: a */
    public final int f75706a;

    public C27730g(int i) {
        this.f75706a = i;
    }

    /* renamed from: a */
    public final int mo33214a() {
        int i = this.f75706a;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new AssertionError("Invalid rotation " + i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C27730g) && ((C27730g) obj).f75706a == this.f75706a;
    }

    public final int hashCode() {
        return this.f75706a;
    }

    public final String toString() {
        int a = mo33214a();
        return a + "°";
    }
}
