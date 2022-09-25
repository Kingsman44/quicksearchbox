package com.google.android.libraries.flowlayoutmanager;

/* renamed from: com.google.android.libraries.flowlayoutmanager.i */
/* compiled from: PG */
abstract class C21401i {

    /* renamed from: f */
    public int f59865f;

    /* renamed from: g */
    public int f59866g;

    /* renamed from: h */
    public int f59867h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo26892b(boolean z, int i);

    /* renamed from: c */
    public abstract int mo26893c();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26897g() {
        this.f59867h = -1;
        this.f59865f = -1;
        this.f59866g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo26898h(int i);

    /* renamed from: i */
    public final int mo26909i(int i) {
        boolean z = true;
        int i2 = (this.f59865f == 0 ? 1 : 0) | (mo26893c() == i ? 2 : 0);
        int i3 = this.f59867h;
        if (i3 != -1 && i2 == this.f59866g) {
            return i3;
        }
        if (i3 != -1) {
            z = false;
        }
        int max = Math.max(0, mo26892b(z, i));
        this.f59867h = max;
        this.f59866g = i2;
        return max;
    }

    /* renamed from: j */
    public final int mo26910j(int i) {
        if (i <= this.f59865f) {
            this.f59867h = -1;
            return 2;
        } else if (!mo26898h(i)) {
            return 0;
        } else {
            this.f59867h = -1;
            return 1;
        }
    }

    /* renamed from: k */
    public void mo26911k(int i) {
        this.f59865f += i;
    }
}
