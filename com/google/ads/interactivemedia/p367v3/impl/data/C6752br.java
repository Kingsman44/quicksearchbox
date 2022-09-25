package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.UniversalAdId;
import com.google.ads.interactivemedia.p367v3.internal.auj;
import com.google.ads.interactivemedia.p367v3.internal.aul;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.br */
/* compiled from: PG */
public final class C6752br implements UniversalAdId {
    private String adIdRegistry = "unknown";
    private String adIdValue = "unknown";

    public boolean equals(Object obj) {
        return auj.m19669c(this, obj, new String[0]);
    }

    public String getAdIdRegistry() {
        return this.adIdRegistry;
    }

    public String getAdIdValue() {
        return this.adIdValue;
    }

    public int hashCode() {
        return aul.m19677b(this, new String[0]);
    }

    public void setAdIdRegistry(String str) {
        this.adIdRegistry = str;
    }

    public void setAdIdValue(String str) {
        this.adIdValue = str;
    }

    public String toString() {
        String str = this.adIdValue;
        String str2 = this.adIdRegistry;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41 + String.valueOf(str2).length());
        sb.append("UniversalAdId [adIdValue=");
        sb.append(str);
        sb.append(", adIdRegistry=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
