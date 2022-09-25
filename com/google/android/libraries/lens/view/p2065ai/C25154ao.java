package com.google.android.libraries.lens.view.p2065ai;

import com.google.android.libraries.lens.view.p2067ak.C25269h;
import com.google.android.libraries.lens.view.p2067ak.C25284w;
import com.google.android.libraries.lens.view.p2067ak.C25285x;
import com.google.android.libraries.lens.view.p2067ak.C25287z;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.ai.ao */
/* compiled from: PG */
class C25154ao implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C25155ap f68497a;

    public C25154ao(C25155ap apVar) {
        this.f68497a = apVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C25155ap.f68498a.mo56226d()).mo56382g(th)).mo56372aa(49828)).mo56386p("Failure checking UDC settings");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C25155ap apVar = this.f68497a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (apVar.f68524w != booleanValue) {
            apVar.f68524w = booleanValue;
            if (apVar.f68513l && booleanValue) {
                apVar.mo30293b(apVar.mo30296e());
                if (apVar.mo30296e()) {
                    apVar.mo30297f(2);
                    long b = apVar.f68505d.mo26870b();
                    C25269h hVar = ((C25284w) apVar.f68508g.f68625a.mo30362b(true)).f68782c;
                    if (hVar == null) {
                        hVar = C25269h.f68742d;
                    }
                    if (hVar.f68744a + 2592000000L < b) {
                        apVar.mo30292a(true);
                        apVar.f68508g.f68625a.mo30363c(new C25285x(b));
                    }
                } else if (apVar.f68509h.mo30359o() && !apVar.f68523v.mo30525b()) {
                    C25269h hVar2 = ((C25284w) apVar.f68508g.f68625a.mo30362b(true)).f68782c;
                    if (hVar2 == null) {
                        hVar2 = C25269h.f68742d;
                    }
                    int i = hVar2.f68745b;
                    if (i < 2) {
                        apVar.mo30294c();
                        apVar.f68508g.f68625a.mo30363c(new C25287z(i + 1));
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
