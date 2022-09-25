package com.google.android.libraries.lens.view.p2059ah.p2063b.p2064a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24449d;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.view.p2059ah.p2063b.C25131a;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.common.p4522b.C58468gd;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.ah.b.a.d */
/* compiled from: PG */
final class C25135d implements C24450e {

    /* renamed from: a */
    final /* synthetic */ C25136e f68441a;

    public C25135d(C25136e eVar) {
        this.f68441a = eVar;
    }

    /* renamed from: b */
    public final void mo29904b(C24449d dVar) {
        C25131a aVar;
        C25136e eVar = this.f68441a;
        String d = dVar.mo29899d();
        Locale e = dVar.mo29900e();
        if (e != null) {
            String a = C28136y.m52430a(e);
            C58468gd b = eVar.f68443b.mo31240b();
            String str = BuildConfig.FLAVOR;
            if (d.equals((String) b.getOrDefault(a, str)) && (aVar = (C25131a) this.f68441a.f68445d.get()) != null && dVar.mo29897b() != 1) {
                Locale e2 = dVar.mo29900e();
                if (e2 != null) {
                    str = C28136y.m52430a(e2);
                }
                if (dVar.mo29897b() == 2) {
                    aVar.mo30274f(str);
                } else if (dVar.mo29897b() == 3) {
                    aVar.mo30273e(str, ((Long) dVar.mo29898c().mo56109e(0L)).longValue());
                } else {
                    aVar.mo30272d(str, dVar.mo29896a());
                }
            }
        }
    }
}
