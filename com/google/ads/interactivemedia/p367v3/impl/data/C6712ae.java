package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.arn;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ae */
/* compiled from: PG */
final class C6712ae extends C6747bm {
    private final arn obstructions;

    private C6712ae(arn arn) {
        this.obstructions = arn;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6747bm) {
            return this.obstructions.equals(((C6747bm) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    public arn obstructions() {
        return this.obstructions;
    }

    public String toString() {
        String valueOf = String.valueOf(this.obstructions);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("ObstructionListData{obstructions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
