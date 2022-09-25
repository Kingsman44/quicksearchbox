package com.facebook.p313c.p318e;

import com.facebook.litho.C6154cb;

/* renamed from: com.facebook.c.e.b */
/* compiled from: PG */
public final class C6042b {

    /* renamed from: a */
    public boolean f17761a;

    /* renamed from: b */
    public boolean f17762b;

    /* renamed from: c */
    public int f17763c;

    /* renamed from: d */
    public final C6154cb f17764d;

    /* renamed from: e */
    public C6154cb f17765e;

    /* renamed from: f */
    public C6154cb f17766f;

    public C6042b(C6154cb cbVar, C6154cb cbVar2, C6154cb cbVar3) {
        this.f17765e = cbVar;
        this.f17766f = cbVar2;
        this.f17764d = cbVar3;
    }

    /* renamed from: a */
    public final void mo12607a(boolean z) {
        this.f17763c = z ? this.f17763c | 32 : this.f17763c & -33;
    }

    /* renamed from: b */
    public final boolean mo12608b() {
        return (this.f17763c & 32) != 0;
    }

    /* renamed from: c */
    public final boolean mo12609c() {
        return (this.f17763c & 30) == 30;
    }
}
