package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.gj */
/* compiled from: PG */
public final /* synthetic */ class C145392gj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145416hg f393070a;

    /* renamed from: b */
    public final /* synthetic */ String f393071b;

    public /* synthetic */ C145392gj(C145416hg hgVar, String str) {
        this.f393070a = hgVar;
        this.f393071b = str;
    }

    public final void run() {
        C145416hg hgVar = this.f393070a;
        String str = this.f393071b;
        C145317dp d = hgVar.f393011w.mo120969d();
        String str2 = d.f392774o;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        d.f392774o = str;
        if (z) {
            hgVar.f393011w.mo120969d().mo120876h();
        }
    }
}
