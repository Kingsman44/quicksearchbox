package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ab */
/* compiled from: PG */
final class C6709ab extends C6743bi {
    private final String content;
    private final String contentType;

    /* renamed from: id */
    private final String f20040id;

    public C6709ab(String str, String str2, String str3) {
        if (str != null) {
            this.f20040id = str;
            if (str2 != null) {
                this.content = str2;
                if (str3 != null) {
                    this.contentType = str3;
                    return;
                }
                throw new NullPointerException("Null contentType");
            }
            throw new NullPointerException("Null content");
        }
        throw new NullPointerException("Null id");
    }

    public String content() {
        return this.content;
    }

    public String contentType() {
        return this.contentType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6743bi) {
            C6743bi biVar = (C6743bi) obj;
            return this.f20040id.equals(biVar.mo14031id()) && this.content.equals(biVar.content()) && this.contentType.equals(biVar.contentType());
        }
    }

    public int hashCode() {
        return ((((this.f20040id.hashCode() ^ 1000003) * 1000003) ^ this.content.hashCode()) * 1000003) ^ this.contentType.hashCode();
    }

    /* renamed from: id */
    public String mo14031id() {
        return this.f20040id;
    }

    public String toString() {
        String str = this.f20040id;
        String str2 = this.content;
        String str3 = this.contentType;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("NetworkResponseData{id=");
        sb.append(str);
        sb.append(", content=");
        sb.append(str2);
        sb.append(", contentType=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
