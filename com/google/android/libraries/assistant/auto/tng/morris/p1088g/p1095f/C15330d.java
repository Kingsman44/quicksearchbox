package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.d */
/* compiled from: PG */
final class C15330d extends C15335i {

    /* renamed from: a */
    private final int f46010a;

    /* renamed from: b */
    private final int f46011b;

    public C15330d(int i, int i2) {
        this.f46010a = i;
        this.f46011b = i2;
    }

    /* renamed from: a */
    public final int mo22197a() {
        return this.f46011b;
    }

    /* renamed from: b */
    public final int mo22198b() {
        return this.f46010a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15335i) {
            C15335i iVar = (C15335i) obj;
            return this.f46010a == iVar.mo22198b() && this.f46011b == iVar.mo22197a();
        }
    }

    public final int hashCode() {
        return ((this.f46010a ^ 1000003) * 1000003) ^ this.f46011b;
    }

    public final String toString() {
        int i = this.f46010a;
        int i2 = this.f46011b;
        return "LabelDescriptions{onResource=" + i + ", offResource=" + i2 + "}";
    }
}
