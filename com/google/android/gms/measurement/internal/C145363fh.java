package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fh */
/* compiled from: PG */
final class C145363fh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConditionalUserPropertyParcel f392960a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f392961b;

    /* renamed from: c */
    final /* synthetic */ C145379fx f392962c;

    public C145363fh(C145379fx fxVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        this.f392962c = fxVar;
        this.f392960a = conditionalUserPropertyParcel;
        this.f392961b = appMetadata;
    }

    public final void run() {
        this.f392962c.f393008a.mo121217m();
        if (this.f392960a.f392526c.mo120761a() == null) {
            this.f392962c.f393008a.mo121227w(this.f392960a, this.f392961b);
        } else {
            this.f392962c.f393008a.mo121200A(this.f392960a, this.f392961b);
        }
    }
}
