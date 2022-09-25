package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.e */
/* compiled from: PG */
public final class C95430e extends C95392cp {

    /* renamed from: a */
    public String f267019a;

    /* renamed from: b */
    public int f267020b;

    /* renamed from: c */
    private int f267021c;

    /* renamed from: d */
    private byte[] f267022d;

    /* renamed from: e */
    private Duration f267023e;

    /* renamed from: f */
    private byte f267024f;

    /* renamed from: a */
    public final C95393cq mo89327a() {
        String str;
        int i;
        byte[] bArr;
        Duration duration;
        if (this.f267024f == 1 && (str = this.f267019a) != null && (i = this.f267020b) != 0 && (bArr = this.f267022d) != null && (duration = this.f267023e) != null) {
            return new C95433f(str, i, this.f267021c, bArr, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f267019a == null) {
            sb.append(" name");
        }
        if (this.f267020b == 0) {
            sb.append(" messageGroup");
        }
        if (this.f267024f == 0) {
            sb.append(" messageType");
        }
        if (this.f267022d == null) {
            sb.append(" messageBytes");
        }
        if (this.f267023e == null) {
            sb.append(" timeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo89328b(byte[] bArr) {
        if (bArr != null) {
            this.f267022d = bArr;
            return;
        }
        throw new NullPointerException("Null messageBytes");
    }

    /* renamed from: c */
    public final void mo89329c(int i) {
        this.f267021c = i;
        this.f267024f = 1;
    }

    /* renamed from: d */
    public final void mo89330d(Duration duration) {
        if (duration != null) {
            this.f267023e = duration;
            return;
        }
        throw new NullPointerException("Null timeout");
    }
}
