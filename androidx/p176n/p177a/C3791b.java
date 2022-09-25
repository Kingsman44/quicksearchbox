package androidx.p176n.p177a;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: androidx.n.a.b */
/* compiled from: PG */
final class C3791b {

    /* renamed from: a */
    public final int f12216a;

    /* renamed from: b */
    public int f12217b;

    /* renamed from: c */
    public int f12218c;

    /* renamed from: d */
    public int f12219d;

    /* renamed from: e */
    public int f12220e;

    /* renamed from: f */
    public int f12221f;

    /* renamed from: g */
    public int f12222g;

    /* renamed from: h */
    public int f12223h;

    /* renamed from: i */
    public int f12224i;

    /* renamed from: j */
    final /* synthetic */ C3792c f12225j;

    public C3791b(C3792c cVar, int i, int i2) {
        this.f12225j = cVar;
        this.f12216a = i;
        this.f12217b = i2;
        mo8019b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo8018a() {
        return ((this.f12220e - this.f12219d) + 1) * ((this.f12222g - this.f12221f) + 1) * ((this.f12224i - this.f12223h) + 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8019b() {
        C3792c cVar = this.f12225j;
        int[] iArr = cVar.f12227a;
        int[] iArr2 = cVar.f12228b;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = LinearLayoutManager.INVALID_OFFSET;
        int i5 = LinearLayoutManager.INVALID_OFFSET;
        int i6 = LinearLayoutManager.INVALID_OFFSET;
        int i7 = 0;
        for (int i8 = this.f12216a; i8 <= this.f12217b; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int c = C3792c.m10962c(i9);
            int b = C3792c.m10961b(i9);
            int i10 = i9 & 31;
            if (c > i4) {
                i4 = c;
            }
            if (c < i) {
                i = c;
            }
            if (b > i5) {
                i5 = b;
            }
            if (b < i2) {
                i2 = b;
            }
            if (i10 > i6) {
                i6 = i10;
            }
            if (i10 < i3) {
                i3 = i10;
            }
        }
        this.f12219d = i;
        this.f12220e = i4;
        this.f12221f = i2;
        this.f12222g = i5;
        this.f12223h = i3;
        this.f12224i = i6;
        this.f12218c = i7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo8020c() {
        return (this.f12217b + 1) - this.f12216a > 1;
    }
}
