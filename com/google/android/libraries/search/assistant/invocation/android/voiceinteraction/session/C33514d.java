package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d */
/* compiled from: PG */
public final class C33514d {

    /* renamed from: a */
    public final long f89676a;

    public C33514d(long j) {
        this.f89676a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33514d) && this.f89676a == ((C33514d) obj).f89676a;
    }

    public final int hashCode() {
        long j = this.f89676a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return String.valueOf(this.f89676a);
    }
}
