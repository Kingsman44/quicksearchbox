package com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared;

import android.graphics.Point;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.c */
/* compiled from: PG */
public final class C110117c {

    /* renamed from: a */
    private int f306859a = 0;

    /* renamed from: b */
    private final Point f306860b = new Point(0, 0);

    /* renamed from: c */
    private int f306861c = -1;

    /* renamed from: d */
    private int f306862d = -1;

    /* renamed from: e */
    private boolean f306863e = true;

    /* renamed from: a */
    public final Point mo98399a() {
        int i = this.f306859a + 1;
        this.f306859a = i;
        if (i == 1) {
            int i2 = this.f306860b.x;
            int i3 = this.f306861c;
            int i4 = this.f306860b.y;
            int i5 = this.f306862d;
            int i6 = i4 + i5 + i5;
            boolean z = Math.abs(i2 + (i3 + i3)) > 14 || Math.abs(i6) > 28 || i6 > 0;
            this.f306859a = 0;
            if (z) {
                if (this.f306863e) {
                    this.f306863e = false;
                    this.f306861c = -this.f306861c;
                } else {
                    this.f306863e = true;
                    this.f306862d = -this.f306862d;
                }
            }
            Point point = this.f306860b;
            int i7 = point.x;
            int i8 = this.f306861c;
            point.x = i7 + i8 + i8;
            Point point2 = this.f306860b;
            int i9 = point2.y;
            int i10 = this.f306862d;
            point2.y = i9 + i10 + i10;
        }
        return new Point(this.f306860b.x, this.f306860b.y);
    }
}
