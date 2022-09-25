package com.google.android.libraries.notifications.p2268e.p2281g;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.notifications.e.g.a */
/* compiled from: PG */
public final class C29860a {

    /* renamed from: a */
    public MessageLite f80952a;

    /* renamed from: b */
    public MessageLite f80953b;

    /* renamed from: c */
    public Throwable f80954c;

    /* renamed from: d */
    private boolean f80955d;

    /* renamed from: e */
    private byte f80956e;

    /* renamed from: a */
    public final C29892c mo35180a() {
        if (this.f80956e == 1) {
            return new C29891b(this.f80952a, this.f80953b, this.f80954c, this.f80955d);
        }
        throw new IllegalStateException("Missing required properties: isRetryableError");
    }

    /* renamed from: b */
    public final void mo35181b(boolean z) {
        this.f80955d = z;
        this.f80956e = 1;
    }
}
