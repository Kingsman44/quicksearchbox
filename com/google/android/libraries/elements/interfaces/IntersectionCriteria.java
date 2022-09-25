package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class IntersectionCriteria {
    final boolean isIncreasing;
    final float ratio;

    public IntersectionCriteria(float f, boolean z) {
        this.ratio = f;
        this.isIncreasing = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IntersectionCriteria)) {
            return false;
        }
        IntersectionCriteria intersectionCriteria = (IntersectionCriteria) obj;
        if (this.ratio == intersectionCriteria.ratio && this.isIncreasing == intersectionCriteria.isIncreasing) {
            return true;
        }
        return false;
    }

    public boolean getIsIncreasing() {
        return this.isIncreasing;
    }

    public float getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(this.ratio) + 527) * 31) + (this.isIncreasing ? 1 : 0);
    }

    public String toString() {
        float f = this.ratio;
        boolean z = this.isIncreasing;
        return "IntersectionCriteria{ratio=" + f + ",isIncreasing=" + z + "}";
    }
}
