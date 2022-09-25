package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.f */
/* compiled from: PG */
public final class C33452f extends C33460n {

    /* renamed from: a */
    private final boolean f89554a;

    /* renamed from: b */
    private final C33457k f89555b;

    public C33452f(boolean z, C33457k kVar) {
        this.f89554a = z;
        if (kVar != null) {
            this.f89555b = kVar;
            return;
        }
        throw new NullPointerException("Null getUtteranceProcessingDetails");
    }

    /* renamed from: a */
    public final C33457k mo38863a() {
        return this.f89555b;
    }

    /* renamed from: b */
    public final boolean mo38864b() {
        return this.f89554a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33460n) {
            C33460n nVar = (C33460n) obj;
            return this.f89554a == nVar.mo38864b() && this.f89555b.equals(nVar.mo38863a());
        }
    }

    public final int hashCode() {
        return (((true != this.f89554a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f89555b.hashCode();
    }

    public final String toString() {
        boolean z = this.f89554a;
        String obj = this.f89555b.toString();
        return "Success{wasSpeechDetected=" + z + ", getUtteranceProcessingDetails=" + obj + "}";
    }
}
