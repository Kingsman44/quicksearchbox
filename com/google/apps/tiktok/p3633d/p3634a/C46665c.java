package com.google.apps.tiktok.p3633d.p3634a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.d.a.c */
/* compiled from: PG */
final class C46665c extends C46676n {

    /* renamed from: a */
    public int f121923a;

    /* renamed from: b */
    private C58485gu f121924b;

    /* renamed from: c */
    private boolean f121925c;

    /* renamed from: d */
    private long f121926d;

    /* renamed from: e */
    private byte f121927e;

    /* renamed from: a */
    public final C46677o mo50693a() {
        C58485gu guVar;
        int i;
        if (this.f121927e == 3 && (guVar = this.f121924b) != null && (i = this.f121923a) != 0) {
            return new C46666d(guVar, this.f121925c, this.f121926d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f121924b == null) {
            sb.append(" acceptTypes");
        }
        if ((this.f121927e & 1) == 0) {
            sb.append(" allowPii");
        }
        if ((this.f121927e & 2) == 0) {
            sb.append(" timeLimitMs");
        }
        if (this.f121923a == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo50694b(C58485gu guVar) {
        if (guVar != null) {
            this.f121924b = guVar;
            return;
        }
        throw new NullPointerException("Null acceptTypes");
    }

    /* renamed from: c */
    public final void mo50695c(boolean z) {
        this.f121925c = z;
        this.f121927e = (byte) (this.f121927e | 1);
    }

    /* renamed from: d */
    public final void mo50696d(long j) {
        this.f121926d = j;
        this.f121927e = (byte) (this.f121927e | 2);
    }
}
