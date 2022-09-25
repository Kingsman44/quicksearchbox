package com.google.android.libraries.gsa.conversation.p1855h.p1856a;

import com.google.android.libraries.gsa.conversation.p1852f.C22582i;

/* renamed from: com.google.android.libraries.gsa.conversation.h.a.a */
/* compiled from: PG */
public final class C22685a extends C22687c {

    /* renamed from: a */
    private final C22582i f62472a;

    public C22685a(C22582i iVar) {
        this.f62472a = iVar;
    }

    /* renamed from: a */
    public final C22582i mo27786a() {
        return this.f62472a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22687c) {
            return this.f62472a.equals(((C22687c) obj).mo27786a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f62472a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f62472a.toString();
        return "MicPerformMetadata{interactionMetadata=" + obj + "}";
    }
}
