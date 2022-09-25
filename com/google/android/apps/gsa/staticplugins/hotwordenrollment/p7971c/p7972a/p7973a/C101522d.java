package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.h.s.z;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C101522d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101525g f283340a;

    /* renamed from: b */
    public final /* synthetic */ l f283341b;

    public /* synthetic */ C101522d(C101525g gVar, l lVar) {
        this.f283340a = gVar;
        this.f283341b = lVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101525g gVar = this.f283340a;
        l lVar = this.f283341b;
        C101527i iVar = (C101527i) obj;
        if (iVar.mo92381c()) {
            lVar.f(true);
            return null;
        } else if (gVar.f283352j.mo70885c().mo70898b() == z.c) {
            lVar.f(true);
            return null;
        } else {
            ((C59052c) ((C59052c) C101525g.f283343a.mo56225c()).mo56372aa(20293)).mo56386p("Enrollment not completed after retries exhausted.");
            lVar.f(false);
            throw new Exception((String) iVar.mo92379a().mo56109e("Enrollment did not complete"));
        }
    }
}
