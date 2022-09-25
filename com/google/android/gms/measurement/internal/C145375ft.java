package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ft */
/* compiled from: PG */
final class C145375ft implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UserAttributeParcel f392996a;

    /* renamed from: b */
    final /* synthetic */ AppMetadata f392997b;

    /* renamed from: c */
    final /* synthetic */ C145379fx f392998c;

    public C145375ft(C145379fx fxVar, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.f392998c = fxVar;
        this.f392996a = userAttributeParcel;
        this.f392997b = appMetadata;
    }

    public final void run() {
        this.f392998c.f393008a.mo121217m();
        if (this.f392996a.mo120761a() == null) {
            this.f392998c.f393008a.mo121228x(this.f392996a, this.f392997b);
        } else {
            this.f392998c.f393008a.mo121203D(this.f392996a, this.f392997b);
        }
    }
}
