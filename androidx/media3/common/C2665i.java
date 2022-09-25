package androidx.media3.common;

/* renamed from: androidx.media3.common.i */
/* compiled from: PG */
public final class C2665i {

    /* renamed from: a */
    public final int f7425a = 0;

    /* renamed from: b */
    public final float f7426b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2665i iVar = (C2665i) obj;
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}
