package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.b */
/* compiled from: PG */
final class C114482b extends C114493m {

    /* renamed from: a */
    private final String f317444a;

    /* renamed from: b */
    private final byte[] f317445b;

    /* renamed from: c */
    private final long f317446c;

    public C114482b(String str, byte[] bArr, long j) {
        this.f317444a = str;
        this.f317445b = bArr;
        this.f317446c = j;
    }

    /* renamed from: a */
    public final long mo101340a() {
        return this.f317446c;
    }

    /* renamed from: b */
    public final String mo101341b() {
        return this.f317444a;
    }

    /* renamed from: c */
    public final byte[] mo101342c() {
        return this.f317445b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114493m) {
            C114493m mVar = (C114493m) obj;
            if (this.f317444a.equals(mVar.mo101341b())) {
                return Arrays.equals(this.f317445b, mVar instanceof C114482b ? ((C114482b) mVar).f317445b : mVar.mo101342c()) && this.f317446c == mVar.mo101340a();
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.f317444a.hashCode();
        int hashCode2 = Arrays.hashCode(this.f317445b);
        long j = this.f317446c;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f317444a;
        String arrays = Arrays.toString(this.f317445b);
        long j = this.f317446c;
        return "DelayedNotificationEntity{groupingKey=" + str + ", notificationArgs=" + arrays + ", uniqueId=" + j + "}";
    }
}
