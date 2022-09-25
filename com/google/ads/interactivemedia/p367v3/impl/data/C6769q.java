package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.q */
/* compiled from: PG */
final class C6769q extends CompanionData {
    private final String clickThroughUrl;
    private final String size;
    private final String src;
    private final C6727at type;

    public C6769q(String str, String str2, String str3, C6727at atVar) {
        if (str != null) {
            this.size = str;
            if (str2 != null) {
                this.src = str2;
                if (str3 != null) {
                    this.clickThroughUrl = str3;
                    if (atVar != null) {
                        this.type = atVar;
                        return;
                    }
                    throw new NullPointerException("Null type");
                }
                throw new NullPointerException("Null clickThroughUrl");
            }
            throw new NullPointerException("Null src");
        }
        throw new NullPointerException("Null size");
    }

    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionData) {
            CompanionData companionData = (CompanionData) obj;
            return this.size.equals(companionData.size()) && this.src.equals(companionData.src()) && this.clickThroughUrl.equals(companionData.clickThroughUrl()) && this.type.equals(companionData.type());
        }
    }

    public int hashCode() {
        return ((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    public String size() {
        return this.size;
    }

    public String src() {
        return this.src;
    }

    public C6727at type() {
        return this.type;
    }
}
