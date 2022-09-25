package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.t */
/* compiled from: PG */
final class C6772t extends C6730aw {
    private final int experimentId;
    private final boolean shouldReport;

    public C6772t(int i, boolean z) {
        this.experimentId = i;
        this.shouldReport = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6730aw) {
            C6730aw awVar = (C6730aw) obj;
            return this.experimentId == awVar.experimentId() && this.shouldReport == awVar.shouldReport();
        }
    }

    public int experimentId() {
        return this.experimentId;
    }

    public int hashCode() {
        return ((this.experimentId ^ 1000003) * 1000003) ^ (true != this.shouldReport ? 1237 : 1231);
    }

    public boolean shouldReport() {
        return this.shouldReport;
    }

    public String toString() {
        int i = this.experimentId;
        boolean z = this.shouldReport;
        StringBuilder sb = new StringBuilder(65);
        sb.append("ExperimentLayerData{experimentId=");
        sb.append(i);
        sb.append(", shouldReport=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
