package com.google.android.material.datepicker;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.google.android.material.datepicker.r */
/* compiled from: PG */
final class C44645r extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C44616al f116310a;

    /* renamed from: b */
    final /* synthetic */ MaterialButton f116311b;

    /* renamed from: c */
    final /* synthetic */ C44649v f116312c;

    public C44645r(C44649v vVar, C44616al alVar, MaterialButton materialButton) {
        this.f116312c = vVar;
        this.f116310a = alVar;
        this.f116311b = materialButton;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f116311b.getText());
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i < 0) {
            i3 = this.f116312c.mo47881b().findFirstVisibleItemPosition();
        } else {
            i3 = this.f116312c.mo47881b().findLastVisibleItemPosition();
        }
        this.f116312c.f116320c = this.f116310a.mo47858b(i3);
        this.f116311b.setText(this.f116310a.mo47858b(i3).mo47828h());
    }
}
