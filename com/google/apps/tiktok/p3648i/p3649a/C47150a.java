package com.google.apps.tiktok.p3648i.p3649a;

/* renamed from: com.google.apps.tiktok.i.a.a */
/* compiled from: PG */
final class C47150a extends C47153d {

    /* renamed from: a */
    private final int f122770a;

    /* renamed from: b */
    private final int f122771b;

    public C47150a(int i, int i2) {
        if (i != 0) {
            this.f122770a = i;
            this.f122771b = i2;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final int mo51044a() {
        return this.f122771b;
    }

    /* renamed from: b */
    public final int mo51045b() {
        return this.f122770a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47153d) {
            C47153d dVar = (C47153d) obj;
            return this.f122770a == dVar.mo51045b() && this.f122771b == dVar.mo51044a();
        }
    }

    public final int hashCode() {
        return ((this.f122770a ^ 1000003) * 1000003) ^ this.f122771b;
    }

    public final String toString() {
        String a = C47154e.m83868a(this.f122770a);
        String str = this.f122771b != 1 ? "CREDENTIAL" : "DEVICE";
        return "StorageSpec{type=" + a + ", directBoot=" + str + "}";
    }
}
