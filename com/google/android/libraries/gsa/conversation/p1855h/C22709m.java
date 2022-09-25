package com.google.android.libraries.gsa.conversation.p1855h;

/* renamed from: com.google.android.libraries.gsa.conversation.h.m */
/* compiled from: PG */
public final class C22709m extends C22689ab {

    /* renamed from: a */
    public final int f62510a;

    public C22709m(int i) {
        this.f62510a = i;
    }

    /* renamed from: a */
    public final int mo27792a() {
        return this.f62510a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C22689ab) && this.f62510a == ((C22689ab) obj).mo27792a();
    }

    public final int hashCode() {
        return this.f62510a ^ 1000003;
    }

    public final String toString() {
        int i = this.f62510a;
        String str = i != 1 ? i != 2 ? i != 3 ? "PROCESSED" : "CANCELLED" : "FAILED" : "RECEIVED";
        return "DeltaStreamEventData{eventType=" + str + "}";
    }
}
