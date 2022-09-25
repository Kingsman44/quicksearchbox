package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ez */
/* compiled from: PG */
public final class C82432ez extends C82662nm {

    /* renamed from: a */
    private final String f225231a = "NGA_SPEECH_ERROR";

    /* renamed from: b */
    private final boolean f225232b;

    /* renamed from: c */
    private final String f225233c;

    public C82432ez(String str, boolean z, String str2) {
        this.f225232b = z;
        this.f225233c = str2;
    }

    /* renamed from: b */
    public final String mo76196b() {
        return this.f225233c;
    }

    /* renamed from: c */
    public final boolean mo76197c() {
        return this.f225232b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225231a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82662nm) {
            C82662nm nmVar = (C82662nm) obj;
            return this.f225231a.equals(nmVar.mo75583d()) && this.f225232b == nmVar.mo76197c() && this.f225233c.equals(nmVar.mo76196b());
        }
    }

    public final int hashCode() {
        return ((((this.f225231a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f225232b ? 1237 : 1231)) * 1000003) ^ this.f225233c.hashCode();
    }

    public final String toString() {
        String str = this.f225231a;
        boolean z = this.f225232b;
        String str2 = this.f225233c;
        return "NgaSpeechErrorEvent{token=" + str + ", onDeviceEnabled=" + z + ", event=" + str2 + "}";
    }
}
