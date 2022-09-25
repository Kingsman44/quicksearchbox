package com.google.android.libraries.notifications;

/* renamed from: com.google.android.libraries.notifications.c */
/* compiled from: PG */
public final class C29781c {

    /* renamed from: a */
    public Long f80703a;

    /* renamed from: b */
    private long f80704b;

    /* renamed from: c */
    private byte f80705c;

    /* renamed from: a */
    public final C30007h mo34975a() {
        if (this.f80705c == 1) {
            return new C29784d(this.f80703a, this.f80704b);
        }
        throw new IllegalStateException("Missing required properties: startTime");
    }

    /* renamed from: b */
    public final void mo34976b(long j) {
        this.f80704b = j;
        this.f80705c = 1;
    }
}
