package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fw */
/* compiled from: PG */
final class C145378fw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f393003a;

    /* renamed from: b */
    final /* synthetic */ String f393004b;

    /* renamed from: c */
    final /* synthetic */ String f393005c;

    /* renamed from: d */
    final /* synthetic */ long f393006d;

    /* renamed from: e */
    final /* synthetic */ C145379fx f393007e;

    public C145378fw(C145379fx fxVar, String str, String str2, String str3, long j) {
        this.f393007e = fxVar;
        this.f393003a = str;
        this.f393004b = str2;
        this.f393005c = str3;
        this.f393006d = j;
    }

    public final void run() {
        String str = this.f393003a;
        if (str == null) {
            this.f393007e.f393008a.mo121230z(this.f393004b, (C145423hn) null);
            return;
        }
        this.f393007e.f393008a.mo121230z(this.f393004b, new C145423hn(this.f393005c, str, this.f393006d));
    }
}
