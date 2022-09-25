package com.google.p4486ci.p4487a;

import com.google.common.base.C58838bb;

/* renamed from: com.google.ci.a.n */
/* compiled from: PG */
class C58109n implements C58097b {

    /* renamed from: a */
    private final C58097b f155334a;

    /* renamed from: b */
    private final long f155335b;

    /* renamed from: c */
    private final long f155336c;

    /* renamed from: d */
    private long f155337d;

    /* renamed from: e */
    private long f155338e;

    public C58109n(C58097b bVar, long j) {
        if (bVar.mo54641c() < Long.MAX_VALUE) {
            C58838bb.m90868c(j <= bVar.mo54641c() - (bVar.mo54643d() - bVar.mo54640b()));
        }
        this.f155334a = bVar;
        this.f155335b = bVar.mo54643d();
        this.f155336c = j;
    }

    /* renamed from: a */
    public final synchronized int mo54639a(byte[] bArr, int i, int i2) {
        int a;
        C58838bb.m90869d(65536 - i >= i2, "Cannot read into a buffer smaller than given length");
        int min = (int) Math.min((long) i2, this.f155336c - this.f155337d);
        if (this.f155335b + this.f155337d != this.f155334a.mo54643d()) {
            this.f155334a.mo54647h();
            long b = (this.f155335b - this.f155334a.mo54640b()) + this.f155337d;
            while (b > 0) {
                b -= this.f155334a.mo54645f(b);
            }
        }
        a = this.f155334a.mo54639a(bArr, i, min);
        this.f155337d += (long) a;
        return a;
    }

    /* renamed from: b */
    public final synchronized long mo54640b() {
        return this.f155338e;
    }

    /* renamed from: c */
    public final synchronized long mo54641c() {
        return Long.MAX_VALUE;
    }

    public final synchronized void close() {
        this.f155334a.close();
    }

    /* renamed from: d */
    public final synchronized long mo54643d() {
        return this.f155337d;
    }

    /* renamed from: e */
    public final synchronized long mo54644e() {
        return this.f155336c;
    }

    /* renamed from: f */
    public final synchronized long mo54645f(long j) {
        long f;
        long min = Math.min(j, this.f155336c - this.f155337d);
        if (this.f155335b + this.f155337d != this.f155334a.mo54643d()) {
            this.f155334a.mo54647h();
            long b = (this.f155335b - this.f155334a.mo54640b()) + this.f155337d;
            while (b > 0) {
                b -= this.f155334a.mo54645f(b);
            }
        }
        f = this.f155334a.mo54645f(min);
        this.f155337d += f;
        return f;
    }

    /* renamed from: g */
    public final synchronized void mo54646g() {
        this.f155338e = this.f155337d;
    }

    /* renamed from: h */
    public final synchronized void mo54647h() {
        this.f155337d = this.f155338e;
    }

    /* renamed from: i */
    public final synchronized boolean mo54648i() {
        return this.f155337d < this.f155336c;
    }
}
