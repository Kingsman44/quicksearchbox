package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24449d;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.view.utils.C28136y;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.g */
/* compiled from: PG */
final class C25127g implements C24450e {

    /* renamed from: a */
    final /* synthetic */ C25128h f68426a;

    public C25127g(C25128h hVar) {
        this.f68426a = hVar;
    }

    /* renamed from: b */
    public final void mo29904b(C24449d dVar) {
        Locale e = dVar.mo29900e();
        if (!e.equals(Locale.ENGLISH)) {
            String a = C28136y.m52430a(e);
            boolean equals = dVar.mo29899d().equals("ocr_multiscript_tflite");
            int b = dVar.mo29897b();
            if (b == 2) {
                this.f68426a.f68434h.mo30247b(1, a, 1, false, equals);
            } else if (b == 4) {
                if (dVar.mo29896a() == 4) {
                    this.f68426a.f68434h.mo30247b(2, a, 1, false, equals);
                } else {
                    this.f68426a.f68434h.mo30247b(3, a, 1, false, equals);
                }
            }
        }
    }
}
