package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.j */
/* compiled from: PG */
final class C6762j extends C6734b {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final boolean nativeViewAttached;
    private final C6726as nativeViewBounds;
    private final boolean nativeViewHidden;
    private final C6726as nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private C6762j(String str, String str2, String str3, long j, double d, boolean z, boolean z2, C6726as asVar, C6726as asVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j;
        this.nativeVolume = d;
        this.nativeViewAttached = z;
        this.nativeViewHidden = z2;
        this.nativeViewBounds = asVar;
        this.nativeViewVisibleBounds = asVar2;
    }

    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6734b) {
            C6734b bVar = (C6734b) obj;
            return this.queryId.equals(bVar.queryId()) && this.eventId.equals(bVar.eventId()) && this.appState.equals(bVar.appState()) && this.nativeTime == bVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(bVar.nativeVolume()) && this.nativeViewAttached == bVar.nativeViewAttached() && this.nativeViewHidden == bVar.nativeViewHidden() && this.nativeViewBounds.equals(bVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(bVar.nativeViewVisibleBounds());
        }
    }

    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int hashCode = this.queryId.hashCode();
        int hashCode2 = this.eventId.hashCode();
        int hashCode3 = this.appState.hashCode();
        long j = this.nativeTime;
        int doubleToLongBits = (((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume)))) * 1000003;
        int i = 1237;
        int i2 = (doubleToLongBits ^ (true != this.nativeViewAttached ? 1237 : 1231)) * 1000003;
        if (true == this.nativeViewHidden) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    public long nativeTime() {
        return this.nativeTime;
    }

    public boolean nativeViewAttached() {
        return this.nativeViewAttached;
    }

    public C6726as nativeViewBounds() {
        return this.nativeViewBounds;
    }

    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    public C6726as nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    public double nativeVolume() {
        return this.nativeVolume;
    }

    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        String str = this.queryId;
        String str2 = this.eventId;
        String str3 = this.appState;
        long j = this.nativeTime;
        double d = this.nativeVolume;
        boolean z = this.nativeViewAttached;
        boolean z2 = this.nativeViewHidden;
        String valueOf = String.valueOf(this.nativeViewBounds);
        String valueOf2 = String.valueOf(this.nativeViewVisibleBounds);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 217 + length2 + length3 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityMonitorData{queryId=");
        sb.append(str);
        sb.append(", eventId=");
        sb.append(str2);
        sb.append(", appState=");
        sb.append(str3);
        sb.append(", nativeTime=");
        sb.append(j);
        sb.append(", nativeVolume=");
        sb.append(d);
        sb.append(", nativeViewAttached=");
        sb.append(z);
        sb.append(", nativeViewHidden=");
        sb.append(z2);
        sb.append(", nativeViewBounds=");
        sb.append(valueOf);
        sb.append(", nativeViewVisibleBounds=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
