package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.CompanionAd;
import com.google.ads.interactivemedia.p367v3.internal.auj;
import com.google.ads.interactivemedia.p367v3.internal.aul;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.CompanionAdImpl */
/* compiled from: PG */
public class CompanionAdImpl implements CompanionAd {
    private String apiFramework;
    private String resourceValue;
    private C6748bn size;

    public boolean equals(Object obj) {
        return auj.m19669c(this, obj, new String[0]);
    }

    public String getApiFramework() {
        return this.apiFramework;
    }

    public int getHeight() {
        return this.size.height().intValue();
    }

    public String getResourceValue() {
        return this.resourceValue;
    }

    public int getWidth() {
        return this.size.width().intValue();
    }

    public int hashCode() {
        return aul.m19677b(this, new String[0]);
    }

    /* access modifiers changed from: package-private */
    public void setApiFramework(String str) {
        this.apiFramework = str;
    }

    /* access modifiers changed from: package-private */
    public void setResourceValue(String str) {
        this.resourceValue = str;
    }

    /* access modifiers changed from: package-private */
    public void setSize(C6748bn bnVar) {
        this.size = bnVar;
    }

    public String toString() {
        String str = this.apiFramework;
        String str2 = this.resourceValue;
        String valueOf = String.valueOf(this.size.width());
        String valueOf2 = String.valueOf(this.size.height());
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 58 + length2 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("CompanionAd [apiFramework=");
        sb.append(str);
        sb.append(", resourceUrl=");
        sb.append(str2);
        sb.append(", width=");
        sb.append(valueOf);
        sb.append(", height=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
