package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ah */
/* compiled from: PG */
final class C6715ah extends C6746bl {
    private final boolean attached;
    private final C6726as bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private C6715ah(boolean z, C6726as asVar, String str, boolean z2, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z;
        this.bounds = asVar;
        this.detailedReason = str;
        this.hidden = z2;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    public boolean attached() {
        return this.attached;
    }

    public C6726as bounds() {
        return this.bounds;
    }

    public String detailedReason() {
        return this.detailedReason;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r1 = r4.detailedReason;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.ads.interactivemedia.p367v3.impl.data.C6746bl
            r2 = 0
            if (r1 == 0) goto L_0x0056
            com.google.ads.interactivemedia.v3.impl.data.bl r5 = (com.google.ads.interactivemedia.p367v3.impl.data.C6746bl) r5
            boolean r1 = r4.attached
            boolean r3 = r5.attached()
            if (r1 != r3) goto L_0x0056
            com.google.ads.interactivemedia.v3.impl.data.as r1 = r4.bounds
            com.google.ads.interactivemedia.v3.impl.data.as r3 = r5.bounds()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.detailedReason
            if (r1 != 0) goto L_0x002a
            java.lang.String r1 = r5.detailedReason()
            if (r1 != 0) goto L_0x0056
            goto L_0x0035
        L_0x002a:
            java.lang.String r3 = r5.detailedReason()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0035
            goto L_0x0056
        L_0x0035:
            boolean r1 = r4.hidden
            boolean r3 = r5.hidden()
            if (r1 != r3) goto L_0x0056
            com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose r1 = r4.purpose
            com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose r3 = r5.purpose()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.type
            java.lang.String r5 = r5.type()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0056
            return r0
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.impl.data.C6715ah.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = ((((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode()) * 1000003;
        String str = this.detailedReason;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (true == this.hidden) {
            i2 = 1231;
        }
        return ((((i3 ^ i2) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    public boolean hidden() {
        return this.hidden;
    }

    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    public String toString() {
        boolean z = this.attached;
        String valueOf = String.valueOf(this.bounds);
        String str = this.detailedReason;
        boolean z2 = this.hidden;
        String valueOf2 = String.valueOf(this.purpose);
        String str2 = this.type;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 88 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("ObstructionData{attached=");
        sb.append(z);
        sb.append(", bounds=");
        sb.append(valueOf);
        sb.append(", detailedReason=");
        sb.append(str);
        sb.append(", hidden=");
        sb.append(z2);
        sb.append(", purpose=");
        sb.append(valueOf2);
        sb.append(", type=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public String type() {
        return this.type;
    }
}
