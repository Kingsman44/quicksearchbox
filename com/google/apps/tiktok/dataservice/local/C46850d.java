package com.google.apps.tiktok.dataservice.local;

/* renamed from: com.google.apps.tiktok.dataservice.local.d */
/* compiled from: PG */
final class C46850d extends C46843ar {

    /* renamed from: a */
    private final Object f122284a;

    public C46850d(Object obj) {
        if (obj != null) {
            this.f122284a = obj;
            return;
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: b */
    public final Object mo50851b() {
        return this.f122284a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46843ar) {
            return this.f122284a.equals(((C46843ar) obj).mo50851b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f122284a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f122284a.toString();
        return "Success{data=" + obj + "}";
    }
}
