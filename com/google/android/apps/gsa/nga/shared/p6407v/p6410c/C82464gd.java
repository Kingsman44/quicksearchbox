package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gd */
/* compiled from: PG */
public final class C82464gd extends C82693oq {

    /* renamed from: a */
    private final String f225323a = "NGA_WARM_ACTIONS_RECOGNITION_RESULT_STATUS";

    /* renamed from: b */
    private final int f225324b;

    /* renamed from: c */
    private final String f225325c;

    public C82464gd(String str, int i, String str2) {
        this.f225324b = i;
        this.f225325c = str2;
    }

    /* renamed from: b */
    public final int mo76335b() {
        return this.f225324b;
    }

    /* renamed from: c */
    public final String mo76336c() {
        return this.f225325c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225323a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82693oq) {
            C82693oq oqVar = (C82693oq) obj;
            return this.f225323a.equals(oqVar.mo75583d()) && this.f225324b == oqVar.mo76335b() && this.f225325c.equals(oqVar.mo76336c());
        }
    }

    public final int hashCode() {
        return ((((this.f225323a.hashCode() ^ 1000003) * 1000003) ^ this.f225324b) * 1000003) ^ this.f225325c.hashCode();
    }

    public final String toString() {
        String str = this.f225323a;
        int i = this.f225324b;
        String str2 = this.f225325c;
        return "NgaWarmActionsRecognitionResultStatusEvent{token=" + str + ", contextType=" + i + ", status=" + str2 + "}";
    }
}
