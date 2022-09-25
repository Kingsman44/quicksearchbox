package org.chromium.net.impl;

import org.chromium.net.QuicException;

/* renamed from: org.chromium.net.impl.cn */
/* compiled from: PG */
public final class C72508cn extends QuicException {

    /* renamed from: a */
    private final int f192920a;

    /* renamed from: b */
    private final C72505ck f192921b;

    public C72508cn(String str, int i, int i2, int i3) {
        super(str, (Throwable) null);
        this.f192921b = new C72505ck(str, i, i2);
        this.f192920a = i3;
    }

    public final int getCronetInternalErrorCode() {
        return this.f192921b.f192919b;
    }

    public final int getErrorCode() {
        return this.f192921b.f192918a;
    }

    public final String getMessage() {
        return this.f192921b.getMessage() + ", QuicDetailedErrorCode=" + this.f192920a;
    }

    public final int getQuicDetailedErrorCode() {
        return this.f192920a;
    }

    public final boolean immediatelyRetryable() {
        return this.f192921b.immediatelyRetryable();
    }
}
