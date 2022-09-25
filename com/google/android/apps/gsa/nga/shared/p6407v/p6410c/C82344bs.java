package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bs */
/* compiled from: PG */
public final class C82344bs extends C82574kf {

    /* renamed from: a */
    private final String f224940a = "NGA_FEEDBACK_REQUEST";

    public C82344bs(String str) {
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224940a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82574kf) {
            return this.f224940a.equals(((C82574kf) obj).mo75583d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f224940a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f224940a;
        return "NgaFeedbackRequestEvent{token=" + str + "}";
    }
}
