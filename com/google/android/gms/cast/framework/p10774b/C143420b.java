package com.google.android.gms.cast.framework.p10774b;

import android.widget.LinearLayout;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.cast.framework.b.b */
/* compiled from: PG */
public final /* synthetic */ class C143420b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143424f f388921a;

    public /* synthetic */ C143420b(C143424f fVar) {
        this.f388921a = fVar;
    }

    public final void run() {
        C143424f fVar = this.f388921a;
        LinearLayout linearLayout = fVar.f388932h;
        if (linearLayout != null && fVar.f388933i != null) {
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = fVar.f388933i;
            C143919bh.m233958a(linearLayout2);
            linearLayout2.setVisibility(0);
        }
    }
}
