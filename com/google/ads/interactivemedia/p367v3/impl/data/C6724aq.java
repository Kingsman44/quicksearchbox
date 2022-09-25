package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aq */
/* compiled from: PG */
final class C6724aq extends C6754bt {
    private final float volume;

    private C6724aq(float f) {
        this.volume = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6754bt) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((C6754bt) obj).volume());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        float f = this.volume;
        StringBuilder sb = new StringBuilder(40);
        sb.append("VolumeUpdateData{volume=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }

    public float volume() {
        return this.volume;
    }
}
