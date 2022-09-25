package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ed */
/* compiled from: PG */
public final class C82410ed extends C82639mq {

    /* renamed from: a */
    private final String f225148a = "NGA_PIE_FLOW_SUCCESS";

    /* renamed from: b */
    private final String f225149b;

    /* renamed from: c */
    private final String f225150c;

    public C82410ed(String str, String str2, String str3) {
        this.f225149b = str2;
        this.f225150c = str3;
    }

    /* renamed from: b */
    public final String mo76081b() {
        return this.f225150c;
    }

    /* renamed from: c */
    public final String mo76082c() {
        return this.f225149b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225148a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82639mq) {
            C82639mq mqVar = (C82639mq) obj;
            return this.f225148a.equals(mqVar.mo75583d()) && this.f225149b.equals(mqVar.mo76082c()) && this.f225150c.equals(mqVar.mo76081b());
        }
    }

    public final int hashCode() {
        return ((((this.f225148a.hashCode() ^ 1000003) * 1000003) ^ this.f225149b.hashCode()) * 1000003) ^ this.f225150c.hashCode();
    }

    public final String toString() {
        String str = this.f225148a;
        String str2 = this.f225149b;
        String str3 = this.f225150c;
        return "NgaPieFlowSuccessEvent{token=" + str + ", triggerSource=" + str2 + ", flowId=" + str3 + "}";
    }
}
