package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2082cp;

/* renamed from: com.google.android.material.datepicker.z */
/* compiled from: PG */
final class C44653z implements C2010ad {

    /* renamed from: a */
    final /* synthetic */ int f116333a;

    /* renamed from: b */
    final /* synthetic */ View f116334b;

    /* renamed from: c */
    final /* synthetic */ int f116335c;

    public C44653z(int i, View view, int i2) {
        this.f116333a = i;
        this.f116334b = view;
        this.f116335c = i2;
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        int i = cpVar.f5994b.mo5216a(7).f5822c;
        if (this.f116333a >= 0) {
            this.f116334b.getLayoutParams().height = this.f116333a + i;
            View view2 = this.f116334b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f116334b;
        view3.setPadding(view3.getPaddingLeft(), this.f116335c + i, this.f116334b.getPaddingRight(), this.f116334b.getPaddingBottom());
        return cpVar;
    }
}
