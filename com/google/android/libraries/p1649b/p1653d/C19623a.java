package com.google.android.libraries.p1649b.p1653d;

/* renamed from: com.google.android.libraries.b.d.a */
/* compiled from: PG */
public final class C19623a extends C19624b {

    /* renamed from: a */
    public final int f54610a;

    public C19623a(int i) {
        this.f54610a = i;
    }

    /* renamed from: a */
    public final int mo24954a() {
        return this.f54610a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C19624b) && this.f54610a == ((C19624b) obj).mo24954a();
    }

    public final int hashCode() {
        return this.f54610a ^ 1000003;
    }

    public final String toString() {
        int i = this.f54610a;
        return "Event{eventType=" + C19625c.m37459a(i) + "}";
    }
}
