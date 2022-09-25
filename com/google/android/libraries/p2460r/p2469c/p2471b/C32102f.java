package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;

/* renamed from: com.google.android.libraries.r.c.b.f */
/* compiled from: PG */
public final class C32102f extends LinearLayout.LayoutParams {

    /* renamed from: a */
    public final boolean f86201a;

    public C32102f(int i, float f, boolean z) {
        super(i, -2, f);
        if (z && f > 0.0f) {
            z = false;
        }
        if (i == -1) {
            C32054a.m59731b(5, "GridRowView", (Throwable) null, "GridRowView cells cannot have width MATCH_PARENT.", new Object[0]);
        }
        this.f86201a = z;
    }

    public C32102f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f86201a = false;
    }

    public C32102f(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.weight = layoutParams.weight;
        this.gravity = layoutParams.gravity;
        this.f86201a = false;
    }

    public C32102f(C32102f fVar) {
        super(fVar);
        this.f86201a = fVar.f86201a;
    }
}
