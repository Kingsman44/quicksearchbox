package androidx.media3.extractor.p162i;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.i.l */
/* compiled from: PG */
abstract class C3452l {

    /* renamed from: b */
    public final C3446f f10656b = new C3446f();

    /* renamed from: c */
    public C3368bf f10657c;

    /* renamed from: d */
    public C3329ad f10658d;

    /* renamed from: e */
    public C3448h f10659e;

    /* renamed from: f */
    public long f10660f;

    /* renamed from: g */
    public long f10661g;

    /* renamed from: h */
    public long f10662h;

    /* renamed from: i */
    public int f10663i;

    /* renamed from: j */
    public int f10664j;

    /* renamed from: k */
    public C3450j f10665k = new C3450j();

    /* renamed from: l */
    public long f10666l;

    /* renamed from: m */
    public boolean f10667m;

    /* renamed from: n */
    public boolean f10668n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo7403a(C2604ac acVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7404b(boolean z) {
        int i;
        if (z) {
            this.f10665k = new C3450j();
            this.f10661g = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f10663i = i;
        this.f10660f = -1;
        this.f10662h = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo7405c(C2604ac acVar, long j, C3450j jVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo7410e(long j) {
        return (j * 1000000) / ((long) this.f10664j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo7411f(long j) {
        return (((long) this.f10664j) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7412g(long j) {
        this.f10662h = j;
    }
}
