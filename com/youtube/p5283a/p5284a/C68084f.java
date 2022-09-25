package com.youtube.p5283a.p5284a;

import com.google.p370af.C7490c;
import com.google.p370af.C7492e;

/* renamed from: com.youtube.a.a.f */
/* compiled from: PG */
public final class C68084f extends C7492e {
    /* renamed from: h */
    public static int m98384h(C7490c cVar, long j, long j2, int i, int i2) {
        cVar.mo16906n(4);
        cVar.mo16909r(3, i2);
        cVar.mo16910s(2, i);
        cVar.mo16909r(1, (int) j2);
        cVar.mo16909r(0, (int) j);
        return cVar.mo16895c();
    }

    /* renamed from: g */
    public final int mo60212g() {
        int a = mo16913a(10);
        if (a != 0) {
            return this.f24704b.getInt(a + this.f24703a);
        }
        return 0;
    }

    /* renamed from: i */
    public final long mo60213i() {
        int a = mo16913a(6);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: j */
    public final long mo60214j() {
        int a = mo16913a(4);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: k */
    public final C68039ab mo60215k() {
        C68039ab abVar = new C68039ab();
        int a = mo16913a(8);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        abVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return abVar;
    }
}
