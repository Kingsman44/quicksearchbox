package com.google.android.libraries.search.assistant.performer.communication;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.c */
/* compiled from: PG */
public final class C35568c extends C35777w {

    /* renamed from: a */
    public final Boolean f93386a;

    public C35568c(Boolean bool) {
        this.f93386a = bool;
    }

    /* renamed from: a */
    public final Boolean mo39703a() {
        return this.f93386a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35777w) {
            return this.f93386a.equals(((C35777w) obj).mo39703a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f93386a.hashCode() ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.f93386a;
        return "CallExecutorConfig{enableTrackPhoneCallUsageTime=" + bool + "}";
    }
}
