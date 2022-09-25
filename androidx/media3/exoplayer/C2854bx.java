package androidx.media3.exoplayer;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.bx */
/* compiled from: PG */
final class C2854bx implements Comparable {

    /* renamed from: a */
    public final C2891ct f8025a;

    /* renamed from: b */
    public int f8026b;

    /* renamed from: c */
    public long f8027c;

    /* renamed from: d */
    public Object f8028d;

    public C2854bx(C2891ct ctVar) {
        this.f8025a = ctVar;
    }

    /* renamed from: a */
    public final void mo6603a(int i, long j, Object obj) {
        this.f8026b = i;
        this.f8027c = j;
        this.f8028d = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2854bx bxVar = (C2854bx) obj;
        Object obj2 = this.f8028d;
        if ((obj2 == null) != (bxVar.f8028d == null)) {
            return obj2 == null ? 1 : -1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i = this.f8026b - bxVar.f8026b;
        if (i != 0) {
            return i;
        }
        return C2612ak.m6980e(this.f8027c, bxVar.f8027c);
    }
}
