package com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a;

/* renamed from: com.google.assistant.f.a.a.a.a.b */
/* compiled from: PG */
public final class C52800b extends C52805g {

    /* renamed from: a */
    public final boolean f138527a;

    public C52800b(boolean z) {
        this.f138527a = z;
    }

    /* renamed from: a */
    public final boolean mo53915a() {
        return this.f138527a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C52805g) && this.f138527a == ((C52805g) obj).mo53915a();
    }

    public final int hashCode() {
        return (true != this.f138527a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f138527a;
        return "GetDirectActionsMetadata{loading=" + z + "}";
    }
}
