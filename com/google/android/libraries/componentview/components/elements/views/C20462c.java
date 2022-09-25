package com.google.android.libraries.componentview.components.elements.views;

import android.view.View;

/* renamed from: com.google.android.libraries.componentview.components.elements.views.c */
/* compiled from: PG */
final class C20462c implements C20463d {

    /* renamed from: a */
    private int f57566a = 0;

    /* renamed from: b */
    private final int[] f57567b;

    /* renamed from: c */
    private final View[] f57568c;

    /* renamed from: d */
    private final boolean f57569d;

    public C20462c(int[] iArr, boolean z) {
        this.f57567b = iArr;
        this.f57569d = z;
        this.f57568c = new View[iArr.length];
    }

    /* renamed from: a */
    public final void mo25407a(View view) {
        if (!mo25409c()) {
            int measuredWidth = view.getMeasuredWidth();
            int[] iArr = this.f57567b;
            int i = this.f57566a;
            if (measuredWidth <= iArr[i]) {
                View[] viewArr = this.f57568c;
                this.f57566a = i + 1;
                viewArr[i] = view;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo25409c() {
        return this.f57566a == this.f57567b.length;
    }

    /* renamed from: b */
    public final void mo25408b(int i, int i2, int i3, int i4) {
        if (this.f57569d) {
            int i5 = 0;
            while (i5 < this.f57566a) {
                int i6 = i3 - this.f57567b[i5];
                this.f57568c[i5].setVisibility(0);
                this.f57568c[i5].layout(i6, i2, i3, i4);
                i5++;
                i3 = i6;
            }
            return;
        }
        int i7 = 0;
        while (i7 < this.f57566a) {
            int i8 = this.f57567b[i7] + i;
            this.f57568c[i7].setVisibility(0);
            this.f57568c[i7].layout(i, i2, i8, i4);
            i7++;
            i = i8;
        }
    }
}
