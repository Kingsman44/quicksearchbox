package com.android.datetimepicker.date;

/* renamed from: com.android.datetimepicker.date.af */
/* compiled from: PG */
final class C5076af implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f16196a;

    /* renamed from: b */
    final /* synthetic */ int f16197b;

    /* renamed from: c */
    final /* synthetic */ C5078ah f16198c;

    public C5076af(C5078ah ahVar, int i, int i2) {
        this.f16198c = ahVar;
        this.f16196a = i;
        this.f16197b = i2;
    }

    public final void run() {
        this.f16198c.setSelectionFromTop(this.f16196a, this.f16197b);
        this.f16198c.requestLayout();
    }
}
