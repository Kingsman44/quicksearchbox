package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.l */
/* compiled from: PG */
final class C44639l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f116301a;

    /* renamed from: b */
    final /* synthetic */ C44649v f116302b;

    public C44639l(C44649v vVar, int i) {
        this.f116302b = vVar;
        this.f116301a = i;
    }

    public final void run() {
        this.f116302b.f116323f.smoothScrollToPosition(this.f116301a);
    }
}
