package com.google.android.libraries.flowlayoutmanager;

import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1972g;

/* renamed from: com.google.android.libraries.flowlayoutmanager.j */
/* compiled from: PG */
final class C21402j extends C21400h {

    /* renamed from: a */
    public static final C1971f f59868a = new C1972g(10);

    /* renamed from: b */
    public C21398f f59869b;

    /* renamed from: c */
    public boolean f59870c;

    /* renamed from: d */
    public int f59871d;

    /* renamed from: i */
    public int f59872i;

    /* renamed from: j */
    public int f59873j;

    /* renamed from: k */
    public int f59874k;

    /* renamed from: l */
    public int f59875l;

    /* renamed from: m */
    public C21404l f59876m;

    /* renamed from: n */
    public int f59877n;

    public C21402j() {
        mo26897g();
    }

    /* renamed from: a */
    public final int mo26891a(int i) {
        if (i == this.f59865f) {
            return this.f59869b.f59841p;
        }
        C21404l lVar = this.f59876m;
        if (lVar != null) {
            return this.f59869b.f59841p + this.f59874k + lVar.mo26913a(i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo26892b(boolean z, int i) {
        int i2;
        int i3;
        int i4;
        C21398f fVar = this.f59869b;
        if (fVar == null) {
            return 0;
        }
        int i5 = this.f59865f;
        int i6 = i5 + 1;
        if (i5 == 0) {
            i2 = fVar.f59831f;
        } else {
            i2 = fVar.f59830e;
        }
        fVar.f59841p = i2;
        if (i6 == i) {
            i3 = fVar.f59835j;
        } else {
            i3 = fVar.f59834i;
        }
        int max = Math.max(0, i2 + fVar.f59838m + i3);
        C21404l lVar = this.f59876m;
        int i7 = lVar != null ? lVar.mo26909i(i) : 0;
        if (this.f59870c) {
            this.f59877n = Math.max(0, ((this.f59874k + i7) + this.f59875l) - this.f59869b.f59838m);
            i4 = Math.max(this.f59872i, i7) + this.f59875l;
        } else {
            this.f59877n = 0;
            i4 = Math.max(this.f59872i + this.f59875l, i7);
        }
        return Math.max(max, this.f59869b.f59841p + this.f59874k + i4 + i3);
    }

    /* renamed from: c */
    public final int mo26893c() {
        if (this.f59869b == null) {
            return this.f59865f;
        }
        C21404l lVar = this.f59876m;
        return lVar == null ? this.f59865f + 1 : lVar.mo26893c();
    }

    /* renamed from: e */
    public final void mo26895e() {
        C21398f fVar = this.f59869b;
        if (fVar != null) {
            fVar.f59840o = false;
        }
        C21404l lVar = this.f59876m;
        if (lVar != null) {
            lVar.mo26916l();
        }
    }

    /* renamed from: f */
    public final void mo26896f() {
        mo26897g();
        f59868a.mo5127b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo26897g() {
        super.mo26897g();
        C21398f fVar = this.f59869b;
        if (fVar != null) {
            fVar.mo26900b();
            this.f59869b = null;
        }
        this.f59871d = 0;
        this.f59872i = 0;
        this.f59873j = 0;
        this.f59874k = 0;
        this.f59875l = 0;
        this.f59877n = 0;
        C21404l lVar = this.f59876m;
        if (lVar != null) {
            lVar.mo26917m();
            this.f59876m = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo26898h(int i) {
        C21404l lVar = this.f59876m;
        boolean z = false;
        if (lVar == null) {
            return false;
        }
        int j = lVar.mo26910j(i);
        if (j != 0) {
            z = true;
            if (j != 2) {
                return true;
            }
            this.f59876m.mo26917m();
            this.f59876m = null;
        }
        return z;
    }

    /* renamed from: k */
    public final void mo26911k(int i) {
        this.f59865f += i;
        C21404l lVar = this.f59876m;
        if (lVar != null) {
            lVar.mo26911k(i);
        }
    }
}
