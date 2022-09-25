package com.google.android.libraries.notifications.data;

/* renamed from: com.google.android.libraries.notifications.data.e */
/* compiled from: PG */
public final class C29791e {

    /* renamed from: a */
    public Long f80757a;

    /* renamed from: b */
    public Integer f80758b;

    /* renamed from: c */
    private byte[] f80759c;

    /* renamed from: a */
    public final C29825p mo35034a() {
        Integer num;
        byte[] bArr;
        Long l = this.f80757a;
        if (l != null && (num = this.f80758b) != null && (bArr = this.f80759c) != null) {
            return new C29792f(l, num, bArr);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80757a == null) {
            sb.append(" id");
        }
        if (this.f80758b == null) {
            sb.append(" jobType");
        }
        if (this.f80759c == null) {
            sb.append(" payload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35035b(byte[] bArr) {
        if (bArr != null) {
            this.f80759c = bArr;
            return;
        }
        throw new NullPointerException("Null payload");
    }
}
