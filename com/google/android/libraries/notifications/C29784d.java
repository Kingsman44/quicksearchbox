package com.google.android.libraries.notifications;

/* renamed from: com.google.android.libraries.notifications.d */
/* compiled from: PG */
final class C29784d extends C30007h {

    /* renamed from: a */
    private final Long f80710a;

    /* renamed from: b */
    private final long f80711b;

    public C29784d(Long l, long j) {
        this.f80710a = l;
        this.f80711b = j;
    }

    /* renamed from: a */
    public final long mo34983a() {
        return this.f80711b;
    }

    /* renamed from: b */
    public final Long mo34984b() {
        return this.f80710a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30007h) {
            C30007h hVar = (C30007h) obj;
            Long l = this.f80710a;
            if (l != null ? l.equals(hVar.mo34984b()) : hVar.mo34984b() == null) {
                if (this.f80711b == hVar.mo34983a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.f80710a;
        int hashCode = l == null ? 0 : l.hashCode();
        long j = this.f80711b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Long l = this.f80710a;
        long j = this.f80711b;
        return "Timeout{value=" + l + ", startTime=" + j + "}";
    }
}
