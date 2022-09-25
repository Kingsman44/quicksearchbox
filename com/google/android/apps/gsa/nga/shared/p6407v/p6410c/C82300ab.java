package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ab */
/* compiled from: PG */
public final class C82300ab extends C82528in {

    /* renamed from: a */
    private final String f224809a = "EMPTY_RECOGNITION";

    /* renamed from: b */
    private final String f224810b;

    /* renamed from: c */
    private final boolean f224811c;

    /* renamed from: d */
    private final boolean f224812d;

    public C82300ab(String str, String str2, boolean z, boolean z2) {
        this.f224810b = str2;
        this.f224811c = z;
        this.f224812d = z2;
    }

    /* renamed from: b */
    public final String mo75593b() {
        return this.f224810b;
    }

    /* renamed from: c */
    public final boolean mo75594c() {
        return this.f224812d;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224809a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82528in) {
            C82528in inVar = (C82528in) obj;
            return this.f224809a.equals(inVar.mo75583d()) && this.f224810b.equals(inVar.mo75593b()) && this.f224811c == inVar.mo75596f() && this.f224812d == inVar.mo75594c();
        }
    }

    /* renamed from: f */
    public final boolean mo75596f() {
        return this.f224811c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f224809a.hashCode() ^ 1000003) * 1000003) ^ this.f224810b.hashCode()) * 1000003) ^ (true != this.f224811c ? 1237 : 1231)) * 1000003;
        if (true == this.f224812d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f224809a;
        String str2 = this.f224810b;
        boolean z = this.f224811c;
        boolean z2 = this.f224812d;
        return "EmptyRecognitionEvent{token=" + str + ", speechRecognizer=" + str2 + ", nonfinalRecognition=" + z + ", finalRecognition=" + z2 + "}";
    }
}
