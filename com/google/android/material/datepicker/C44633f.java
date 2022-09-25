package com.google.android.material.datepicker;

import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.f */
/* compiled from: PG */
public final /* synthetic */ class C44633f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C44634g f116289a;

    /* renamed from: b */
    public final /* synthetic */ long f116290b;

    public /* synthetic */ C44633f(C44634g gVar, long j) {
        this.f116289a = gVar;
        this.f116290b = j;
    }

    public final void run() {
        String str;
        C44634g gVar = this.f116289a;
        long j = this.f116290b;
        if (C44636i.m79095b(j)) {
            str = C44625au.m79081b("MMMd", Locale.getDefault()).format(new Date(j));
        } else {
            str = C44636i.m79094a(j, Locale.getDefault());
        }
        gVar.f116291a.mo48470e(String.format(gVar.f116293c, new Object[]{C44634g.m79091c(str)}));
        gVar.mo47860a();
    }
}
