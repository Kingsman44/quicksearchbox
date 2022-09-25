package com.google.android.libraries.privatetelemetry.tqcobalt.p2452e;

import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32012f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.e.b */
/* compiled from: PG */
final class C32019b extends C32021d {

    /* renamed from: a */
    private final C32012f f86039a;

    /* renamed from: b */
    private final String f86040b;

    /* renamed from: c */
    private final boolean f86041c;

    /* renamed from: d */
    private final Duration f86042d;

    /* renamed from: e */
    private final int f86043e;

    public C32019b(C32012f fVar, int i, String str, boolean z, Duration duration) {
        this.f86039a = fVar;
        this.f86043e = i;
        this.f86040b = str;
        this.f86041c = z;
        this.f86042d = duration;
    }

    /* renamed from: a */
    public final C32012f mo37787a() {
        return this.f86039a;
    }

    /* renamed from: b */
    public final Duration mo37788b() {
        return this.f86042d;
    }

    /* renamed from: c */
    public final String mo37789c() {
        return this.f86040b;
    }

    /* renamed from: d */
    public final boolean mo37790d() {
        return this.f86041c;
    }

    /* renamed from: e */
    public final int mo37791e() {
        return this.f86043e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32021d) {
            C32021d dVar = (C32021d) obj;
            return this.f86039a.equals(dVar.mo37787a()) && this.f86043e == dVar.mo37791e() && this.f86040b.equals(dVar.mo37789c()) && this.f86041c == dVar.mo37790d() && this.f86042d.equals(dVar.mo37788b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f86039a.hashCode() ^ 1000003) * 1000003) ^ this.f86043e) * 1000003) ^ this.f86040b.hashCode()) * 1000003) ^ (true != this.f86041c ? 1237 : 1231)) * 1000003) ^ this.f86042d.hashCode();
    }

    public final String toString() {
        String obj = this.f86039a.toString();
        String str = this.f86043e != 1 ? "PROD" : "DEV";
        String str2 = this.f86040b;
        boolean z = this.f86041c;
        String obj2 = this.f86042d.toString();
        return "CobaltLoggerConfig{projectConfig=" + obj + ", pipelineType=" + str + ", internalHexApiKey=" + str2 + ", cobaltLoggerEnabled=" + z + ", internalUploadingInterval=" + obj2 + "}";
    }
}
