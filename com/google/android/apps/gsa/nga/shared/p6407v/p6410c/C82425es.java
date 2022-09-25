package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.es */
/* compiled from: PG */
public final class C82425es extends C82655nf {

    /* renamed from: a */
    private final String f225206a = "NGA_SENSOR_DID_SCORE";

    /* renamed from: b */
    private final Double f225207b;

    /* renamed from: c */
    private final String f225208c;

    /* renamed from: d */
    private final boolean f225209d;

    /* renamed from: e */
    private final String f225210e;

    public C82425es(String str, Double d, String str2, boolean z, String str3) {
        this.f225207b = d;
        this.f225208c = "unknown";
        this.f225209d = z;
        this.f225210e = str3;
    }

    /* renamed from: b */
    public final Double mo76161b() {
        return this.f225207b;
    }

    /* renamed from: c */
    public final String mo76162c() {
        return this.f225208c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225206a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82655nf) {
            C82655nf nfVar = (C82655nf) obj;
            return this.f225206a.equals(nfVar.mo75583d()) && this.f225207b.equals(nfVar.mo76161b()) && this.f225208c.equals(nfVar.mo76162c()) && this.f225209d == nfVar.mo76165g() && this.f225210e.equals(nfVar.mo76164f());
        }
    }

    /* renamed from: f */
    public final String mo76164f() {
        return this.f225210e;
    }

    /* renamed from: g */
    public final boolean mo76165g() {
        return this.f225209d;
    }

    public final int hashCode() {
        return ((((((((this.f225206a.hashCode() ^ 1000003) * 1000003) ^ this.f225207b.hashCode()) * 1000003) ^ this.f225208c.hashCode()) * 1000003) ^ (true != this.f225209d ? 1237 : 1231)) * 1000003) ^ this.f225210e.hashCode();
    }

    public final String toString() {
        String str = this.f225206a;
        Double d = this.f225207b;
        String str2 = this.f225208c;
        boolean z = this.f225209d;
        String str3 = this.f225210e;
        return "NgaSensorDidScoreEvent{token=" + str + ", value=" + d + ", modelVersion=" + str2 + ", allowedToStopContinuedConversation=" + z + ", nextState=" + str3 + "}";
    }
}
