package com.google.android.flexbox;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.google.android.flexbox.g */
/* compiled from: PG */
final class C142642g {

    /* renamed from: a */
    public int f387062a;

    /* renamed from: b */
    public int f387063b;

    /* renamed from: c */
    public int f387064c;

    /* renamed from: d */
    public int f387065d = 0;

    /* renamed from: e */
    public boolean f387066e;

    /* renamed from: f */
    public boolean f387067f;

    /* renamed from: g */
    public boolean f387068g;

    /* renamed from: h */
    final /* synthetic */ FlexboxLayoutManager f387069h;

    public C142642g(FlexboxLayoutManager flexboxLayoutManager) {
        this.f387069h = flexboxLayoutManager;
    }

    /* renamed from: b */
    public final void mo117419b() {
        this.f387062a = -1;
        this.f387063b = -1;
        this.f387064c = LinearLayoutManager.INVALID_OFFSET;
        boolean z = false;
        this.f387067f = false;
        this.f387068g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.f387069h;
        if (flexboxLayoutManager.mo117379v()) {
            if (flexboxLayoutManager.f387003b == 0) {
                if (flexboxLayoutManager.f387002a == 1) {
                    z = true;
                }
                this.f387066e = z;
                return;
            }
            this.f387066e = false;
        } else if (flexboxLayoutManager.f387003b == 0) {
            if (flexboxLayoutManager.f387002a == 3) {
                z = true;
            }
            this.f387066e = z;
        } else {
            this.f387066e = false;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f387062a + ", mFlexLinePosition=" + this.f387063b + ", mCoordinate=" + this.f387064c + ", mPerpendicularCoordinate=" + this.f387065d + ", mLayoutFromEnd=" + this.f387066e + ", mValid=" + this.f387067f + ", mAssignedFromSavedState=" + this.f387068g + '}';
    }

    /* renamed from: a */
    public final void mo117418a() {
        int i;
        int i2;
        FlexboxLayoutManager flexboxLayoutManager = this.f387069h;
        if (flexboxLayoutManager.mo117379v() || !flexboxLayoutManager.f387004c) {
            if (this.f387066e) {
                i = flexboxLayoutManager.f387007f.mo2843f();
            } else {
                i = flexboxLayoutManager.f387007f.mo2847j();
            }
            this.f387064c = i;
            return;
        }
        if (this.f387066e) {
            i2 = flexboxLayoutManager.f387007f.mo2843f();
        } else {
            i2 = flexboxLayoutManager.getWidth() - this.f387069h.f387007f.mo2847j();
        }
        this.f387064c = i2;
    }
}
