package com.google.android.apps.gsa.search.shared.service;

import android.os.Trace;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87672g;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.android.apps.gsa.search.shared.service.w */
/* compiled from: PG */
public final /* synthetic */ class C88502w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87673aa f239210a;

    public /* synthetic */ C88502w(C87673aa aaVar) {
        this.f239210a = aaVar;
    }

    public final void run() {
        C87673aa aaVar = this.f239210a;
        if (aaVar.f236987c.mo84225b()) {
            Trace.beginSection("SearchServiceConnect");
        }
        C88503x xVar = aaVar.f236986b;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C22872h.m42743c(C0826b.class);
        C87673aa aaVar2 = xVar.f239211a;
        if (aaVar2.f236997m) {
            if (aaVar2.f236987c.mo84225b()) {
                C91030n.m148695a("SearchService.connectViaSingletonManager", xVar.f239211a.f236987c);
            }
            C87673aa aaVar3 = xVar.f239211a;
            if (aaVar3.f236995k == null) {
                aaVar3.f236995k = ((C87672g) aaVar3.f236990f.mo56107c()).mo81928a();
            }
            xVar.mo82023a();
            if (xVar.f239211a.f236987c.mo84225b()) {
                C91030n.m148696b(xVar.f239211a.f236987c);
            }
        }
        if (aaVar.f236987c.mo84225b()) {
            Trace.endSection();
        }
    }
}
