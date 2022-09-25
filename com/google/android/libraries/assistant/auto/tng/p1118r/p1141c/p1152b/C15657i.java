package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.i */
/* compiled from: PG */
public final class C15657i extends C15664p {

    /* renamed from: a */
    private final String f46786a;

    public C15657i(String str) {
        if (str != null) {
            this.f46786a = str;
            return;
        }
        throw new NullPointerException("Null queryString");
    }

    /* renamed from: a */
    public final String mo22487a() {
        return this.f46786a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15664p) {
            return this.f46786a.equals(((C15664p) obj).mo22487a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f46786a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f46786a;
        return "QueryInfo{queryString=" + str + "}";
    }
}
