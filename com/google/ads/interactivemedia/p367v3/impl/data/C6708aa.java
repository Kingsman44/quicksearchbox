package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.aa */
/* compiled from: PG */
final class C6708aa extends C6742bh {
    private final int connectionTimeoutMs;

    /* renamed from: id */
    private final String f20039id;
    private final int readTimeoutMs;
    private final C6741bg requestType;
    private final String url;
    private final String userAgent;

    public C6708aa(C6741bg bgVar, String str, String str2, String str3, int i, int i2) {
        if (bgVar != null) {
            this.requestType = bgVar;
            if (str != null) {
                this.f20039id = str;
                if (str2 != null) {
                    this.url = str2;
                    if (str3 != null) {
                        this.userAgent = str3;
                        this.connectionTimeoutMs = i;
                        this.readTimeoutMs = i2;
                        return;
                    }
                    throw new NullPointerException("Null userAgent");
                }
                throw new NullPointerException("Null url");
            }
            throw new NullPointerException("Null id");
        }
        throw new NullPointerException("Null requestType");
    }

    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6742bh) {
            C6742bh bhVar = (C6742bh) obj;
            return this.requestType.equals(bhVar.requestType()) && this.f20039id.equals(bhVar.mo14021id()) && this.url.equals(bhVar.url()) && this.userAgent.equals(bhVar.userAgent()) && this.connectionTimeoutMs == bhVar.connectionTimeoutMs() && this.readTimeoutMs == bhVar.readTimeoutMs();
        }
    }

    public int hashCode() {
        return ((((((((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.f20039id.hashCode()) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    /* renamed from: id */
    public String mo14021id() {
        return this.f20039id;
    }

    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    public C6741bg requestType() {
        return this.requestType;
    }

    public String toString() {
        String valueOf = String.valueOf(this.requestType);
        String str = this.f20039id;
        String str2 = this.url;
        String str3 = this.userAgent;
        int i = this.connectionTimeoutMs;
        int i2 = this.readTimeoutMs;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 115 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("NetworkRequestData{requestType=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append(", userAgent=");
        sb.append(str3);
        sb.append(", connectionTimeoutMs=");
        sb.append(i);
        sb.append(", readTimeoutMs=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public String url() {
        return this.url;
    }

    public String userAgent() {
        return this.userAgent;
    }
}
