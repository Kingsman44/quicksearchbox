package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ge */
/* compiled from: PG */
public final class C82465ge extends C82694or {

    /* renamed from: a */
    private final String f225326a = "NGA_WARM_ACTIONS_RECOGNITION_START_STATUS";

    /* renamed from: b */
    private final int f225327b;

    /* renamed from: c */
    private final String f225328c;

    public C82465ge(String str, int i, String str2) {
        this.f225327b = i;
        this.f225328c = str2;
    }

    /* renamed from: b */
    public final int mo76340b() {
        return this.f225327b;
    }

    /* renamed from: c */
    public final String mo76341c() {
        return this.f225328c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225326a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82694or) {
            C82694or orVar = (C82694or) obj;
            return this.f225326a.equals(orVar.mo75583d()) && this.f225327b == orVar.mo76340b() && this.f225328c.equals(orVar.mo76341c());
        }
    }

    public final int hashCode() {
        return ((((this.f225326a.hashCode() ^ 1000003) * 1000003) ^ this.f225327b) * 1000003) ^ this.f225328c.hashCode();
    }

    public final String toString() {
        String str = this.f225326a;
        int i = this.f225327b;
        String str2 = this.f225328c;
        return "NgaWarmActionsRecognitionStartStatusEvent{token=" + str + ", contextType=" + i + ", status=" + str2 + "}";
    }
}
