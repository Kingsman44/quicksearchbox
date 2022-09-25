package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.a */
/* compiled from: PG */
public final class C114481a extends C114492l {

    /* renamed from: a */
    private String f317440a;

    /* renamed from: b */
    private byte[] f317441b;

    /* renamed from: c */
    private long f317442c;

    /* renamed from: d */
    private byte f317443d;

    /* renamed from: a */
    public final C114493m mo101336a() {
        String str;
        byte[] bArr;
        if (this.f317443d == 1 && (str = this.f317440a) != null && (bArr = this.f317441b) != null) {
            return new C114482b(str, bArr, this.f317442c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f317440a == null) {
            sb.append(" groupingKey");
        }
        if (this.f317441b == null) {
            sb.append(" notificationArgs");
        }
        if (this.f317443d == 0) {
            sb.append(" uniqueId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo101337b(String str) {
        if (str != null) {
            this.f317440a = str;
            return;
        }
        throw new NullPointerException("Null groupingKey");
    }

    /* renamed from: c */
    public final void mo101338c(byte[] bArr) {
        if (bArr != null) {
            this.f317441b = bArr;
            return;
        }
        throw new NullPointerException("Null notificationArgs");
    }

    /* renamed from: d */
    public final void mo101339d(long j) {
        this.f317442c = j;
        this.f317443d = 1;
    }
}
