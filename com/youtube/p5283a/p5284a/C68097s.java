package com.youtube.p5283a.p5284a;

import com.google.p370af.C7490c;
import com.google.p370af.C7492e;

/* renamed from: com.youtube.a.a.s */
/* compiled from: PG */
public final class C68097s extends C7492e {
    /* renamed from: g */
    public static int m98424g(C7490c cVar, long j, long j2, int i, int i2) {
        cVar.mo16906n(4);
        cVar.mo16910s(3, i2);
        cVar.mo16910s(2, i);
        cVar.mo16909r(1, (int) j2);
        cVar.mo16909r(0, (int) j);
        return cVar.mo16895c();
    }

    /* renamed from: h */
    public final long mo60246h() {
        int a = mo16913a(6);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: i */
    public final long mo60247i() {
        int a = mo16913a(4);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: j */
    public final C68044ag mo60248j() {
        C68044ag agVar = new C68044ag();
        int a = mo16913a(10);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        agVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return agVar;
    }

    /* renamed from: k */
    public final C68044ag mo60249k() {
        C68044ag agVar = new C68044ag();
        int a = mo16913a(8);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        agVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return agVar;
    }
}
