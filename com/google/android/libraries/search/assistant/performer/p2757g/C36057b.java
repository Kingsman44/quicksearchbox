package com.google.android.libraries.search.assistant.performer.p2757g;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b */
/* compiled from: PG */
final class C36057b extends C36054ax {

    /* renamed from: a */
    private final boolean f94316a;

    public C36057b(boolean z) {
        this.f94316a = z;
    }

    /* renamed from: a */
    public final boolean mo39951a() {
        return this.f94316a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C36054ax) && this.f94316a == ((C36054ax) obj).mo39951a();
    }

    public final int hashCode() {
        return (true != this.f94316a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f94316a;
        return "MediaInitiationPerformerConfig{tngReadaloudEnabled=" + z + "}";
    }
}
