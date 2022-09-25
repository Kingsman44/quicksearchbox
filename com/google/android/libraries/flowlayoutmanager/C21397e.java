package com.google.android.libraries.flowlayoutmanager;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1972g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.flowlayoutmanager.e */
/* compiled from: PG */
final class C21397e extends C21400h {

    /* renamed from: a */
    public static final C1971f f59822a = new C1972g(10);

    /* renamed from: b */
    public int f59823b;

    /* renamed from: c */
    public int f59824c;

    /* renamed from: d */
    public final List f59825d = new ArrayList();

    public C21397e() {
        mo26897g();
    }

    /* renamed from: a */
    public final int mo26891a(int i) {
        return ((C21398f) this.f59825d.get(i - this.f59865f)).f59841p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo26892b(boolean z, int i) {
        int i2 = LinearLayoutManager.INVALID_OFFSET;
        if (z) {
            int size = this.f59825d.size();
            int i3 = LinearLayoutManager.INVALID_OFFSET;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                C21398f fVar = (C21398f) this.f59825d.get(i6);
                if (fVar.f59836k == 0) {
                    int i7 = -fVar.f59839n;
                    fVar.f59841p = i7;
                    if (i7 < i5) {
                        i5 = i7;
                    }
                    int i8 = i7 + fVar.f59838m;
                    if (i8 > i4) {
                        i4 = i8;
                    }
                } else {
                    int i9 = fVar.f59838m;
                    if (i9 > i3) {
                        i3 = i9;
                    }
                }
            }
            if (i3 != Integer.MIN_VALUE) {
                int i10 = i4 - i5;
                if (i10 < i3) {
                    i5 = i10 == 0 ? 0 : (int) (((float) i3) * (((float) i5) / ((float) i10)));
                    i4 = i5 + i3;
                }
                for (int i11 = 0; i11 < size; i11++) {
                    C21398f fVar2 = (C21398f) this.f59825d.get(i11);
                    int i12 = fVar2.f59836k;
                    if (i12 == 1) {
                        fVar2.f59841p = i4 - fVar2.f59838m;
                    } else if (i12 == 2) {
                        fVar2.f59841p = i5;
                    }
                }
            }
        }
        int i13 = this.f59865f;
        int size2 = this.f59825d.size() + i13;
        int size3 = this.f59825d.size();
        if (size3 == 0) {
            return 0;
        }
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < size3; i15++) {
            C21398f fVar3 = (C21398f) this.f59825d.get(i15);
            int i16 = fVar3.f59841p;
            int i17 = i16 - (i13 == 0 ? fVar3.f59831f : fVar3.f59830e);
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = i16 + fVar3.f59838m + (size2 == i ? fVar3.f59835j : fVar3.f59834i);
            if (i18 > i2) {
                i2 = i18;
            }
        }
        if (i14 != 0) {
            for (int i19 = 0; i19 < size3; i19++) {
                ((C21398f) this.f59825d.get(i19)).f59841p -= i14;
            }
            i2 -= i14;
        }
        return Math.max(0, i2);
    }

    /* renamed from: c */
    public final int mo26893c() {
        return this.f59865f + this.f59825d.size();
    }

    /* renamed from: d */
    public final void mo26894d(C21398f fVar) {
        if (fVar.f59840o) {
            this.f59824c += fVar.f59837l + fVar.f59832g + fVar.f59833h;
            this.f59825d.add(fVar);
            this.f59867h = -1;
            return;
        }
        throw new IllegalArgumentException("Item not measured");
    }

    /* renamed from: e */
    public final void mo26895e() {
        int size = this.f59825d.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C21398f) this.f59825d.get(size)).f59840o = false;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo26896f() {
        mo26897g();
        f59822a.mo5127b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo26897g() {
        super.mo26897g();
        this.f59823b = 0;
        this.f59824c = 0;
        int size = this.f59825d.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C21398f) this.f59825d.get(size)).mo26900b();
            } else {
                this.f59825d.clear();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo26898h(int i) {
        int size = this.f59825d.size();
        int i2 = this.f59865f;
        if (i2 + size <= i) {
            return false;
        }
        int i3 = i - i2;
        while (true) {
            size--;
            if (size < i3) {
                return true;
            }
            C21398f fVar = (C21398f) this.f59825d.remove(size);
            this.f59824c -= (fVar.f59837l + fVar.f59832g) + fVar.f59833h;
            fVar.mo26900b();
        }
    }
}
