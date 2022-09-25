package com.google.android.libraries.notifications.p2296j;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.notifications.j.a */
/* compiled from: PG */
public final class C30027a {

    /* renamed from: a */
    public Integer f81257a;

    /* renamed from: b */
    public MessageLite f81258b;

    /* renamed from: c */
    public Throwable f81259c;

    /* renamed from: d */
    private boolean f81260d;

    /* renamed from: e */
    private boolean f81261e;

    /* renamed from: f */
    private byte f81262f;

    /* renamed from: a */
    public final C30034d mo35347a() {
        if (this.f81262f == 3) {
            return new C30032b(this.f81257a, this.f81258b, this.f81259c, this.f81260d, this.f81261e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f81262f & 1) == 0) {
            sb.append(" isRetryableError");
        }
        if ((this.f81262f & 2) == 0) {
            sb.append(" isAuthError");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35348b(boolean z) {
        this.f81261e = z;
        this.f81262f = (byte) (this.f81262f | 2);
    }

    /* renamed from: c */
    public final void mo35349c(boolean z) {
        this.f81260d = z;
        this.f81262f = (byte) (this.f81262f | 1);
    }
}
