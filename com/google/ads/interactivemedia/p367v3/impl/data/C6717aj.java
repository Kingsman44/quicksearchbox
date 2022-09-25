package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aj */
/* compiled from: PG */
final class C6717aj extends C6748bn {
    private final Integer height;
    private final Integer width;

    public C6717aj(Integer num, Integer num2) {
        if (num != null) {
            this.width = num;
            if (num2 != null) {
                this.height = num2;
                return;
            }
            throw new NullPointerException("Null height");
        }
        throw new NullPointerException("Null width");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6748bn) {
            C6748bn bnVar = (C6748bn) obj;
            return this.width.equals(bnVar.width()) && this.height.equals(bnVar.height());
        }
    }

    public int hashCode() {
        return ((this.width.hashCode() ^ 1000003) * 1000003) ^ this.height.hashCode();
    }

    public Integer height() {
        return this.height;
    }

    public String toString() {
        String valueOf = String.valueOf(this.width);
        String valueOf2 = String.valueOf(this.height);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length());
        sb.append("SizeData{width=");
        sb.append(valueOf);
        sb.append(", height=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public Integer width() {
        return this.width;
    }
}
