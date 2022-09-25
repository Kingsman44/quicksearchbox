package com.google.android.libraries.onegoogle.account.p2345a;

/* renamed from: com.google.android.libraries.onegoogle.account.a.d */
/* compiled from: PG */
final class C30159d extends C30161f {

    /* renamed from: a */
    private boolean f81532a;

    /* renamed from: b */
    private byte f81533b;

    /* renamed from: c */
    private int f81534c;

    /* renamed from: a */
    public final C30163h mo35560a() {
        int i;
        if (this.f81533b == 1 && (i = this.f81534c) != 0) {
            return new C30160e(this.f81532a, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f81533b == 0) {
            sb.append(" isG1User");
        }
        if (this.f81534c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35561b(boolean z) {
        this.f81532a = z;
        this.f81533b = 1;
    }

    /* renamed from: c */
    public final void mo35562c(int i) {
        if (i != 0) {
            this.f81534c = i;
            return;
        }
        throw new NullPointerException("Null isUnicornUser");
    }
}
