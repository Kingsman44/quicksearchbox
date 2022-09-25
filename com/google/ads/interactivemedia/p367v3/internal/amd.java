package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amd */
/* compiled from: PG */
final class amd extends alt {
    private final int appVersion;
    private final String packageName;

    public amd(int i, String str) {
        this.appVersion = i;
        if (str != null) {
            this.packageName = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public int appVersion() {
        return this.appVersion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alt) {
            alt alt = (alt) obj;
            return this.appVersion == alt.appVersion() && this.packageName.equals(alt.packageName());
        }
    }

    public int hashCode() {
        return ((this.appVersion ^ 1000003) * 1000003) ^ this.packageName.hashCode();
    }

    public String packageName() {
        return this.packageName;
    }

    public String toString() {
        int i = this.appVersion;
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("MarketAppInfo{appVersion=");
        sb.append(i);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
