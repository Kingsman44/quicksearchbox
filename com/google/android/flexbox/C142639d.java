package com.google.android.flexbox;

/* renamed from: com.google.android.flexbox.d */
/* compiled from: PG */
final class C142639d implements Comparable {

    /* renamed from: a */
    int f387055a;

    /* renamed from: b */
    int f387056b;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C142639d dVar = (C142639d) obj;
        int i = this.f387056b;
        int i2 = dVar.f387056b;
        if (i != i2) {
            return i - i2;
        }
        return this.f387055a - dVar.f387055a;
    }

    public final String toString() {
        return "Order{order=" + this.f387056b + ", index=" + this.f387055a + '}';
    }
}
