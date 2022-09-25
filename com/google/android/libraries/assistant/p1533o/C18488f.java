package com.google.android.libraries.assistant.p1533o;

import com.google.android.libraries.assistant.p1533o.p1534a.C18437b;

/* renamed from: com.google.android.libraries.assistant.o.f */
/* compiled from: PG */
final class C18488f extends C18435a {

    /* renamed from: a */
    private final C18437b f52428a;

    public C18488f(C18437b bVar) {
        if (bVar != null) {
            this.f52428a = bVar;
            return;
        }
        throw new NullPointerException("Null proto");
    }

    /* renamed from: b */
    public final C18437b mo23985b() {
        return this.f52428a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18435a) {
            return this.f52428a.equals(((C18435a) obj).mo23985b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f52428a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f52428a.toString();
        return "AssistantErrorCode{proto=" + obj + "}";
    }
}
