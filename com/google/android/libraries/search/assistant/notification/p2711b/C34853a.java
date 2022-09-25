package com.google.android.libraries.search.assistant.notification.p2711b;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.a */
/* compiled from: PG */
final class C34853a extends C34854b {

    /* renamed from: a */
    private final CharSequence f92427a;

    /* renamed from: b */
    private final String f92428b;

    public C34853a(CharSequence charSequence, String str) {
        if (charSequence != null) {
            this.f92427a = charSequence;
            this.f92428b = str;
            return;
        }
        throw new NullPointerException("Null message");
    }

    /* renamed from: a */
    public final CharSequence mo39530a() {
        return this.f92427a;
    }

    /* renamed from: b */
    public final String mo39531b() {
        return this.f92428b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34854b) {
            C34854b bVar = (C34854b) obj;
            return this.f92427a.equals(bVar.mo39530a()) && this.f92428b.equals(bVar.mo39531b());
        }
    }

    public final int hashCode() {
        return ((this.f92427a.hashCode() ^ 1000003) * 1000003) ^ this.f92428b.hashCode();
    }

    public final String toString() {
        String obj = this.f92427a.toString();
        String str = this.f92428b;
        return "MessageAndMimeType{message=" + obj + ", mimeType=" + str + "}";
    }
}
