package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.jf */
/* compiled from: PG */
final class C0752jf {

    /* renamed from: a */
    int f2631a = 0;

    /* renamed from: b */
    int f2632b;

    /* renamed from: c */
    int f2633c;

    /* renamed from: d */
    int f2634d;

    /* renamed from: e */
    int f2635e;

    /* renamed from: c */
    static final int m2536c(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 2 : 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3259a(int i, int i2, int i3, int i4) {
        this.f2632b = i;
        this.f2633c = i2;
        this.f2634d = i3;
        this.f2635e = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo3260b() {
        int i = this.f2631a;
        if ((i & 7) != 0 && (m2536c(this.f2634d, this.f2632b) & i) == 0) {
            return false;
        }
        if ((i & 112) != 0 && ((m2536c(this.f2634d, this.f2633c) << 4) & i) == 0) {
            return false;
        }
        if ((i & 1792) == 0 || ((m2536c(this.f2635e, this.f2632b) << 8) & i) != 0) {
            return (i & 28672) == 0 || (i & (m2536c(this.f2635e, this.f2633c) << 12)) != 0;
        }
        return false;
    }
}
