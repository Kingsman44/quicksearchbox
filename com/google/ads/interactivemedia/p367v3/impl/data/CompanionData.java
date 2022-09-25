package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.internal.aps;

@aps(mo15153a = C6769q.class)
/* renamed from: com.google.ads.interactivemedia.v3.impl.data.CompanionData */
/* compiled from: PG */
public abstract class CompanionData {
    private String companionId;

    private static CompanionData create(String str, String str2, String str3, C6727at atVar) {
        return new C6769q(str, str2, str3, atVar);
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public final String toString() {
        String companionId2 = companionId();
        String size = size();
        String src = src();
        String clickThroughUrl = clickThroughUrl();
        String valueOf = String.valueOf(type());
        int length = String.valueOf(companionId2).length();
        int length2 = String.valueOf(size).length();
        int length3 = String.valueOf(src).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + length3 + String.valueOf(clickThroughUrl).length() + String.valueOf(valueOf).length());
        sb.append("CompanionData [companionId=");
        sb.append(companionId2);
        sb.append(", size=");
        sb.append(size);
        sb.append(", src=");
        sb.append(src);
        sb.append(", clickThroughUrl=");
        sb.append(clickThroughUrl);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public abstract C6727at type();

    public static CompanionData create(String str, String str2, String str3, String str4, C6727at atVar) {
        CompanionData create = create(str2, str3, str4, atVar);
        create.companionId = str;
        return create;
    }
}
