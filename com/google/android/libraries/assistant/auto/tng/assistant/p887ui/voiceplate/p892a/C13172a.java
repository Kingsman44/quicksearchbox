package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.voiceplate.p892a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.voiceplate.a.a */
/* compiled from: PG */
public final class C13172a extends C13173b {

    /* renamed from: a */
    private final boolean f40783a;

    public C13172a(boolean z) {
        this.f40783a = z;
    }

    /* renamed from: a */
    public final boolean mo20948a() {
        return this.f40783a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C13173b) && this.f40783a == ((C13173b) obj).mo20948a();
    }

    public final int hashCode() {
        return (true != this.f40783a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f40783a;
        return "DismissFragmentHostEvent{onStop=" + z + "}";
    }
}
