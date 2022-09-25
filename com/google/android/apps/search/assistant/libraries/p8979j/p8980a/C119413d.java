package com.google.android.apps.search.assistant.libraries.p8979j.p8980a;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.a.d */
/* compiled from: PG */
final class C119413d extends C119410a {

    /* renamed from: a */
    private final boolean f332913a;

    /* renamed from: b */
    private final boolean f332914b;

    public C119413d(boolean z, boolean z2) {
        this.f332913a = z;
        this.f332914b = z2;
    }

    /* renamed from: b */
    public final boolean mo104330b() {
        return this.f332913a;
    }

    /* renamed from: c */
    public final boolean mo104331c() {
        return this.f332914b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119410a) {
            C119410a aVar = (C119410a) obj;
            return this.f332913a == aVar.mo104330b() && this.f332914b == aVar.mo104331c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f332913a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f332914b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f332913a;
        boolean z2 = this.f332914b;
        return "AssistantHandoverConfiguration{eligible=" + z + ", enabled=" + z2 + "}";
    }
}
