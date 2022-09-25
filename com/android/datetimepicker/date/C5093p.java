package com.android.datetimepicker.date;

/* renamed from: com.android.datetimepicker.date.p */
/* compiled from: PG */
final class C5093p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f16248a;

    /* renamed from: b */
    final /* synthetic */ C5095r f16249b;

    public C5093p(C5095r rVar, int i) {
        this.f16249b = rVar;
        this.f16248a = i;
    }

    public final void run() {
        this.f16249b.setSelection(this.f16248a);
    }
}
