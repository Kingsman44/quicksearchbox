package com.google.android.libraries.notifications.data;

/* renamed from: com.google.android.libraries.notifications.data.i */
/* compiled from: PG */
public final class C29795i {

    /* renamed from: a */
    private long f80801a;

    /* renamed from: b */
    private String f80802b;

    /* renamed from: c */
    private long f80803c;

    /* renamed from: d */
    private long f80804d;

    /* renamed from: e */
    private byte f80805e;

    /* renamed from: f */
    private int f80806f;

    /* renamed from: g */
    private int f80807g;

    /* renamed from: h */
    private int f80808h;

    /* renamed from: i */
    private int f80809i;

    public C29795i() {
    }

    public C29795i(C29828s sVar) {
        C29819j jVar = (C29819j) sVar;
        this.f80801a = jVar.f80835a;
        this.f80802b = jVar.f80836b;
        this.f80803c = jVar.f80837c;
        this.f80806f = jVar.f80839e;
        this.f80807g = jVar.f80840f;
        this.f80808h = jVar.f80841g;
        this.f80809i = jVar.f80842h;
        this.f80804d = jVar.f80838d;
        this.f80805e = 7;
    }

    /* renamed from: a */
    public final C29828s mo35075a() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f80805e == 7 && (str = this.f80802b) != null && (i = this.f80806f) != 0 && (i2 = this.f80807g) != 0 && (i3 = this.f80808h) != 0 && (i4 = this.f80809i) != 0) {
            return new C29819j(this.f80801a, str, this.f80803c, i, i2, i3, i4, this.f80804d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f80805e & 1) == 0) {
            sb.append(" id");
        }
        if (this.f80802b == null) {
            sb.append(" threadId");
        }
        if ((this.f80805e & 2) == 0) {
            sb.append(" lastUpdatedVersion");
        }
        if (this.f80806f == 0) {
            sb.append(" readState");
        }
        if (this.f80807g == 0) {
            sb.append(" deletionStatus");
        }
        if (this.f80808h == 0) {
            sb.append(" countBehavior");
        }
        if (this.f80809i == 0) {
            sb.append(" systemTrayBehavior");
        }
        if ((this.f80805e & 4) == 0) {
            sb.append(" modifiedTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35076b(long j) {
        this.f80801a = j;
        this.f80805e = (byte) (this.f80805e | 1);
    }

    /* renamed from: c */
    public final void mo35077c(Long l) {
        this.f80803c = l.longValue();
        this.f80805e = (byte) (this.f80805e | 2);
    }

    /* renamed from: d */
    public final void mo35078d(long j) {
        this.f80804d = j;
        this.f80805e = (byte) (this.f80805e | 4);
    }

    /* renamed from: e */
    public final void mo35079e(String str) {
        if (str != null) {
            this.f80802b = str;
            return;
        }
        throw new NullPointerException("Null threadId");
    }

    /* renamed from: f */
    public final void mo35080f(int i) {
        if (i != 0) {
            this.f80808h = i;
            return;
        }
        throw new NullPointerException("Null countBehavior");
    }

    /* renamed from: g */
    public final void mo35081g(int i) {
        if (i != 0) {
            this.f80807g = i;
            return;
        }
        throw new NullPointerException("Null deletionStatus");
    }

    /* renamed from: h */
    public final void mo35082h(int i) {
        if (i != 0) {
            this.f80806f = i;
            return;
        }
        throw new NullPointerException("Null readState");
    }

    /* renamed from: i */
    public final void mo35083i(int i) {
        if (i != 0) {
            this.f80809i = i;
            return;
        }
        throw new NullPointerException("Null systemTrayBehavior");
    }
}
