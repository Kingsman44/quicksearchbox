package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.g */
/* compiled from: PG */
final class C123059g extends C123029bw {

    /* renamed from: a */
    private final Object f340620a;

    /* renamed from: b */
    private final int f340621b;

    public C123059g(Object obj, int i) {
        if (obj != null) {
            this.f340620a = obj;
            this.f340621b = i;
            return;
        }
        throw new NullPointerException("Null popResponse");
    }

    /* renamed from: a */
    public final int mo105838a() {
        return this.f340621b;
    }

    /* renamed from: b */
    public final Object mo105839b() {
        return this.f340620a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123029bw) {
            C123029bw bwVar = (C123029bw) obj;
            return this.f340620a.equals(bwVar.mo105839b()) && this.f340621b == bwVar.mo105838a();
        }
    }

    public final int hashCode() {
        return ((this.f340620a.hashCode() ^ 1000003) * 1000003) ^ this.f340621b;
    }

    public final String toString() {
        String obj = this.f340620a.toString();
        int i = this.f340621b;
        return "Response{popResponse=" + obj + ", missingContextRetries=" + i + "}";
    }
}
