package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8358c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.c.a */
/* compiled from: PG */
public final class C108596a extends C108598c {

    /* renamed from: a */
    public String f302071a;

    /* renamed from: b */
    public String f302072b;

    /* renamed from: c */
    public String f302073c;

    /* renamed from: d */
    public Integer f302074d;

    /* renamed from: e */
    public String f302075e;

    /* renamed from: f */
    public Boolean f302076f;

    /* renamed from: g */
    public String f302077g;

    /* renamed from: h */
    public String f302078h;

    /* renamed from: i */
    public Integer f302079i;

    /* renamed from: j */
    public String f302080j;

    /* renamed from: k */
    public int f302081k;

    /* renamed from: l */
    private boolean f302082l;

    /* renamed from: m */
    private boolean f302083m;

    /* renamed from: n */
    private boolean f302084n;

    /* renamed from: o */
    private boolean f302085o;

    /* renamed from: p */
    private byte f302086p;

    /* renamed from: a */
    public final C108599d mo96998a() {
        int i;
        if (this.f302086p != 15 || (i = this.f302081k) == 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.f302086p & 1) == 0) {
                sb.append(" shouldTriggerPort");
            }
            if ((this.f302086p & 2) == 0) {
                sb.append(" hideAddressSequence");
            }
            if ((this.f302086p & 4) == 0) {
                sb.append(" hideRoomSequence");
            }
            if ((this.f302086p & 8) == 0) {
                sb.append(" showMediaSequence");
            }
            if (this.f302081k == 0) {
                sb.append(" action");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C108597b(this.f302071a, this.f302072b, this.f302073c, this.f302082l, this.f302083m, this.f302084n, this.f302085o, i, this.f302074d, this.f302075e, this.f302076f, this.f302077g, this.f302078h, this.f302079i, this.f302080j);
    }

    /* renamed from: b */
    public final void mo96999b(boolean z) {
        this.f302083m = z;
        this.f302086p = (byte) (this.f302086p | 2);
    }

    /* renamed from: c */
    public final void mo97000c(boolean z) {
        this.f302084n = z;
        this.f302086p = (byte) (this.f302086p | 4);
    }

    /* renamed from: d */
    public final void mo97001d(boolean z) {
        this.f302082l = z;
        this.f302086p = (byte) (this.f302086p | 1);
    }

    /* renamed from: e */
    public final void mo97002e(boolean z) {
        this.f302085o = z;
        this.f302086p = (byte) (this.f302086p | 8);
    }
}
