package com.google.p3577ap.p3578a;

/* renamed from: com.google.ap.a.b */
/* compiled from: PG */
public final class C45604b extends C45609g {

    /* renamed from: a */
    public String f119951a;

    /* renamed from: b */
    public int f119952b;

    /* renamed from: c */
    public int f119953c;

    /* renamed from: d */
    public int f119954d;

    /* renamed from: e */
    public int f119955e;

    /* renamed from: f */
    public int f119956f;

    /* renamed from: g */
    public C45608f f119957g;

    /* renamed from: h */
    public boolean f119958h;

    /* renamed from: i */
    public short f119959i;

    /* renamed from: a */
    public final int mo49686a() {
        if ((this.f119959i & 2) != 0) {
            return this.f119953c;
        }
        throw new IllegalStateException("Property \"thumbHeight\" has not been set");
    }

    /* renamed from: b */
    public final int mo49687b() {
        if ((this.f119959i & 1) != 0) {
            return this.f119952b;
        }
        throw new IllegalStateException("Property \"thumbWidth\" has not been set");
    }

    /* renamed from: c */
    public final void mo49688c(int i) {
        this.f119955e = i;
        this.f119959i = (short) (this.f119959i | 8);
    }

    /* renamed from: d */
    public final void mo49689d(int i) {
        this.f119954d = i;
        this.f119959i = (short) (this.f119959i | 4);
    }

    /* renamed from: e */
    public final void mo49690e(int i) {
        this.f119953c = i;
        this.f119959i = (short) (this.f119959i | 2);
    }

    /* renamed from: f */
    public final void mo49691f(int i) {
        this.f119952b = i;
        this.f119959i = (short) (this.f119959i | 1);
    }
}
