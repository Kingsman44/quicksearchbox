package com.google.android.apps.gsa.searchbox.p6960ui.p6961a;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41640a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.ane;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.a.h */
/* compiled from: PG */
public final class C88699h extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    public C89205j f239824a;

    /* renamed from: a */
    private static void m143576a(C41640a aVar, ane ane, int i) {
        if (i != 0) {
            aVar.mo44227b(ane, i);
        } else {
            aVar.mo44226a(ane);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239824a = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C89205j jVar = this.f239824a;
        if (jVar != null) {
            jVar.mo83171k("MANAGE_ACTIVITY_BUTTON_IMPRESSION_COUNT", 0);
            this.f239824a.mo83171k("MANAGE_ACTIVITY_BUTTON_TAP_COUNT", 0);
        }
    }

    /* renamed from: l */
    public final void mo44232l(C41640a aVar) {
        C89205j jVar = this.f239824a;
        if (jVar != null) {
            int a = jVar.mo83161a("MANAGE_ACTIVITY_BUTTON_IMPRESSION_COUNT");
            int a2 = this.f239824a.mo83161a("MANAGE_ACTIVITY_BUTTON_TAP_COUNT");
            m143576a(aVar, ane.MANAGE_ACTIVITY_BUTTON_IMPRESSION_COUNT, a);
            m143576a(aVar, ane.MANAGE_ACTIVITY_BUTTON_TAP_COUNT, a2);
        }
    }
}
