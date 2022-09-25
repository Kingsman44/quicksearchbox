package com.google.android.libraries.gsa.conversation.p1855h;

/* renamed from: com.google.android.libraries.gsa.conversation.h.f */
/* compiled from: PG */
final class C22702f extends C22703g {

    /* renamed from: a */
    private final String f62492a;

    public C22702f(String str) {
        this.f62492a = str;
    }

    /* renamed from: b */
    public final int mo27832b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo27836c() {
        return this.f62492a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22717u) {
            C22717u uVar = (C22717u) obj;
            if (uVar.mo27832b() != 1 || !this.f62492a.equals(uVar.mo27836c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f62492a.hashCode();
    }

    public final String toString() {
        String str = this.f62492a;
        return "ConversationEventId{eventId=" + str + "}";
    }
}
