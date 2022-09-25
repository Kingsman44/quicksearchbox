package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import com.google.android.libraries.componentview.services.application.LogData;

/* compiled from: PG */
final class AutoValue_AgsaLogData extends AgsaLogData {

    /* renamed from: a */
    private final LogData f229048a;

    /* renamed from: b */
    private final boolean f229049b;

    public AutoValue_AgsaLogData(LogData logData, boolean z) {
        this.f229048a = logData;
        this.f229049b = z;
    }

    /* renamed from: a */
    public final LogData mo77540a() {
        return this.f229048a;
    }

    /* renamed from: b */
    public final boolean mo77541b() {
        return this.f229049b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AgsaLogData) {
            AgsaLogData agsaLogData = (AgsaLogData) obj;
            return this.f229048a.equals(agsaLogData.mo77540a()) && this.f229049b == agsaLogData.mo77541b();
        }
    }

    public final int hashCode() {
        return ((this.f229048a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f229049b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f229048a.toString();
        boolean z = this.f229049b;
        return "AgsaLogData{logData=" + obj + ", setSqi=" + z + "}";
    }
}
