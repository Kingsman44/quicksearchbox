package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fr */
/* compiled from: PG */
final class C145373fr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f392990a;

    /* renamed from: b */
    final /* synthetic */ String f392991b;

    /* renamed from: c */
    final /* synthetic */ C145379fx f392992c;

    public C145373fr(C145379fx fxVar, EventParcel eventParcel, String str) {
        this.f392992c = fxVar;
        this.f392990a = eventParcel;
        this.f392991b = str;
    }

    public final void run() {
        this.f392992c.f393008a.mo121217m();
        this.f392992c.f393008a.mo121223s(this.f392990a, this.f392991b);
    }
}
