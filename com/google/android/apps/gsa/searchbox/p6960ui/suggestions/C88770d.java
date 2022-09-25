package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.d */
/* compiled from: PG */
final class C88770d {

    /* renamed from: a */
    public int f240187a;

    /* renamed from: b */
    public int f240188b;

    /* renamed from: c */
    public int f240189c;

    /* renamed from: d */
    public int f240190d;

    /* renamed from: e */
    public int f240191e;

    /* renamed from: f */
    public int f240192f;

    /* renamed from: g */
    public int f240193g;

    /* renamed from: h */
    public int f240194h;

    /* renamed from: i */
    public int f240195i;

    /* renamed from: j */
    private boolean f240196j;

    /* renamed from: k */
    private int f240197k;

    /* renamed from: a */
    public final void mo82511a(View view, Rect rect) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
        int i2 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
        int i3 = this.f240191e;
        if (i3 + i > this.f240197k && i3 != 0) {
            i3 = 0;
            this.f240191e = 0;
            this.f240192f = this.f240194h;
            this.f240195i++;
        }
        this.f240193g = Math.max(this.f240193g, i3 + i);
        this.f240194h = Math.max(this.f240194h, this.f240192f + i2);
        if (rect != null) {
            if (!this.f240196j) {
                rect.left = this.f240187a + this.f240191e + marginLayoutParams.leftMargin;
                rect.right = rect.left + measuredWidth;
            } else {
                rect.right = ((this.f240187a + this.f240197k) - this.f240191e) - marginLayoutParams.rightMargin;
                rect.left = rect.right - measuredWidth;
            }
            rect.top = this.f240192f + this.f240189c + marginLayoutParams.topMargin;
            rect.bottom = rect.top + measuredHeight;
        }
        this.f240191e += i;
    }

    /* renamed from: b */
    public final void mo82512b(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.f240187a = i;
        this.f240188b = i3;
        this.f240189c = i2;
        this.f240190d = i4;
        this.f240197k = (i5 - i) - i3;
        this.f240196j = z;
        this.f240191e = 0;
        this.f240192f = 0;
        this.f240195i = 0;
        this.f240193g = 0;
        this.f240194h = 0;
    }
}
