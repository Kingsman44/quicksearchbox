package com.google.p5261vr.p5262a.p5263a.p5264a;

/* renamed from: com.google.vr.a.a.a.b */
/* compiled from: PG */
final class C67913b extends C67920i {

    /* renamed from: a */
    public final boolean f184090a;

    public C67913b(boolean z) {
        this.f184090a = z;
    }

    /* renamed from: a */
    public final boolean mo60048a() {
        return this.f184090a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C67920i) && this.f184090a == ((C67920i) obj).mo60048a();
    }

    public final int hashCode() {
        return (true != this.f184090a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f184090a;
        return "DeviceState{optedIntoCheckbox=" + z + "}";
    }
}
