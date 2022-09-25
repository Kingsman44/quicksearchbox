package com.google.android.libraries.lens.view.filecache;

/* renamed from: com.google.android.libraries.lens.view.filecache.a */
/* compiled from: PG */
final class C25837a extends C25847k {

    /* renamed from: a */
    private final C25846j f70194a;

    public C25837a(C25846j jVar) {
        this.f70194a = jVar;
    }

    /* renamed from: a */
    public final C25846j mo30980a() {
        return this.f70194a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25847k) {
            return this.f70194a.equals(((C25847k) obj).mo30980a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f70194a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f70194a.toString();
        return "ByteWriter{byteSupplier=" + obj + "}";
    }
}
