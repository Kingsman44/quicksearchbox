package androidx.emoji.p108a;

import androidx.p191s.p192a.p193a.C4080a;

/* renamed from: androidx.emoji.a.m */
/* compiled from: PG */
final class C2203m {

    /* renamed from: a */
    public int f6237a = 1;

    /* renamed from: b */
    public C2214x f6238b;

    /* renamed from: c */
    public C2214x f6239c;

    /* renamed from: d */
    public int f6240d;

    /* renamed from: e */
    public int f6241e;

    /* renamed from: f */
    private final C2214x f6242f;

    public C2203m(C2214x xVar) {
        this.f6242f = xVar;
        this.f6238b = xVar;
    }

    /* renamed from: a */
    public static boolean m6096a(int i) {
        return i == 65039;
    }

    /* renamed from: b */
    public final boolean mo5520b() {
        C4080a a = this.f6238b.f6263a.mo5518a();
        int e = a.mo8580e(6);
        return !(e == 0 || a.f13069b.get(e + a.f13068a) == 0) || m6096a(this.f6240d);
    }

    /* renamed from: c */
    public final void mo5521c() {
        this.f6237a = 1;
        this.f6238b = this.f6242f;
        this.f6241e = 0;
    }
}
