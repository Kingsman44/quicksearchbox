package com.google.android.material.datepicker;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;

/* renamed from: com.google.android.material.datepicker.n */
/* compiled from: PG */
final class C44641n extends C44623as {

    /* renamed from: a */
    final /* synthetic */ int f116303a;

    /* renamed from: b */
    final /* synthetic */ C44649v f116304b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44641n(C44649v vVar, Context context, int i, int i2) {
        super(context, i);
        this.f116304b = vVar;
        this.f116303a = i2;
    }

    /* access modifiers changed from: protected */
    public final void calculateExtraLayoutSpace(C0670ge geVar, int[] iArr) {
        if (this.f116303a == 0) {
            iArr[0] = this.f116304b.f116323f.getWidth();
            iArr[1] = this.f116304b.f116323f.getWidth();
            return;
        }
        iArr[0] = this.f116304b.f116323f.getHeight();
        iArr[1] = this.f116304b.f116323f.getHeight();
    }
}
