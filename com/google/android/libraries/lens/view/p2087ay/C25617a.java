package com.google.android.libraries.lens.view.p2087ay;

import android.graphics.Rect;

/* renamed from: com.google.android.libraries.lens.view.ay.a */
/* compiled from: PG */
public final class C25617a extends C25620ac {

    /* renamed from: a */
    public Rect f69680a;

    /* renamed from: b */
    public Rect f69681b;

    /* renamed from: c */
    public int f69682c;

    /* renamed from: a */
    public final C25621ad mo30728a() {
        Rect rect;
        Rect rect2;
        int i = this.f69682c;
        if (i != 0 && (rect = this.f69680a) != null && (rect2 = this.f69681b) != null) {
            return new C25641b(i, rect, rect2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f69682c == 0) {
            sb.append(" density");
        }
        if (this.f69680a == null) {
            sb.append(" imageRegion");
        }
        if (this.f69681b == null) {
            sb.append(" highDensityRegion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
