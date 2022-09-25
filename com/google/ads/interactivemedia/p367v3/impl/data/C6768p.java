package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.p */
/* compiled from: PG */
final class C6768p extends C6726as {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private C6768p(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.height = i3;
        this.width = i4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6726as) {
            C6726as asVar = (C6726as) obj;
            return this.left == asVar.left() && this.top == asVar.top() && this.height == asVar.height() && this.width == asVar.width();
        }
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    public int height() {
        return this.height;
    }

    public int left() {
        return this.left;
    }

    public String toString() {
        int i = this.left;
        int i2 = this.top;
        int i3 = this.height;
        int i4 = this.width;
        StringBuilder sb = new StringBuilder(90);
        sb.append("BoundingRectData{left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        sb.append(", height=");
        sb.append(i3);
        sb.append(", width=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }

    public int top() {
        return this.top;
    }

    public int width() {
        return this.width;
    }
}
