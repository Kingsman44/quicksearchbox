package com.google.android.libraries.gsa.conversation.p1852f;

/* renamed from: com.google.android.libraries.gsa.conversation.f.b */
/* compiled from: PG */
final class C22575b extends C22584k {

    /* renamed from: a */
    private final String f62211a;

    public C22575b(String str) {
        this.f62211a = str;
    }

    /* renamed from: a */
    public final String mo27667a() {
        return this.f62211a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22584k) {
            return this.f62211a.equals(((C22584k) obj).mo27667a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f62211a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f62211a;
        return "ResponseMetadata{responseEventId=" + str + "}";
    }
}
