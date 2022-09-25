package com.google.android.libraries.assistant.p1363c.p1398g.p1399a;

/* renamed from: com.google.android.libraries.assistant.c.g.a.d */
/* compiled from: PG */
public final class C17359d extends C17332a {

    /* renamed from: a */
    public final boolean f50213a;

    public C17359d(boolean z) {
        this.f50213a = z;
    }

    /* renamed from: a */
    public final boolean mo23278a() {
        return this.f50213a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C17332a) && this.f50213a == ((C17332a) obj).mo23278a();
    }

    public final int hashCode() {
        return (true != this.f50213a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f50213a;
        return "AudioOutputConfig{playWhenReady=" + z + "}";
    }
}
