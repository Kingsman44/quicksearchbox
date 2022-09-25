package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.e */
/* compiled from: PG */
public final class C33451e extends C33458l {

    /* renamed from: a */
    private final Throwable f89553a;

    public C33451e(Throwable th) {
        if (th != null) {
            this.f89553a = th;
            return;
        }
        throw new NullPointerException("Null throwable");
    }

    /* renamed from: a */
    public final Throwable mo38859a() {
        return this.f89553a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33458l) {
            return this.f89553a.equals(((C33458l) obj).mo38859a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f89553a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f89553a.toString();
        return "Failure{throwable=" + obj + "}";
    }
}
