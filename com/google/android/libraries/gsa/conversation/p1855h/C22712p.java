package com.google.android.libraries.gsa.conversation.p1855h;

/* renamed from: com.google.android.libraries.gsa.conversation.h.p */
/* compiled from: PG */
public final class C22712p extends C22696ai {

    /* renamed from: a */
    private final int f62526a;

    public C22712p(int i) {
        this.f62526a = i;
    }

    /* renamed from: a */
    public final int mo27812a() {
        return this.f62526a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C22696ai) && this.f62526a == ((C22696ai) obj).mo27812a();
    }

    public final int hashCode() {
        return this.f62526a ^ 1000003;
    }

    public final String toString() {
        String str = this.f62526a != 1 ? "PROCESSED_REMOTELY" : "PROCESSED_LOCALLY";
        return "InteractionReceipt{status=" + str + "}";
    }
}
