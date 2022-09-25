package com.google.android.material.internal;

import android.view.View;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1990j;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.internal.ab */
/* compiled from: PG */
final class C44703ab extends C2061c {

    /* renamed from: a */
    final /* synthetic */ int f116528a;

    /* renamed from: b */
    final /* synthetic */ boolean f116529b;

    /* renamed from: c */
    final /* synthetic */ C44704ac f116530c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44703ab(C44704ac acVar, int i, boolean z) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f116530c = acVar;
        this.f116528a = i;
        this.f116529b = z;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        C44704ac acVar = this.f116530c;
        int i = this.f116528a;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (acVar.f116534d.f116545e.getItemViewType(i3) == 2) {
                i2--;
            }
        }
        if (acVar.f116534d.f116542b.getChildCount() == 0) {
            i2--;
        }
        kVar.mo5155d(C1990j.m5333a(i2, 1, 1, 1, this.f116529b, view.isSelected()));
    }
}
