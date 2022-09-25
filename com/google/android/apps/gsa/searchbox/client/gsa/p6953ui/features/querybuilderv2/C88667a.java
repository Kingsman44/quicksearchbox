package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41640a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ane;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.querybuilderv2.a */
/* compiled from: PG */
public final class C88667a extends C41641b implements C89204i, C89203h {

    /* renamed from: a */
    public static final C59071e f239731a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.client.gsa.ui.features.querybuilderv2.a");

    /* renamed from: b */
    public C89205j f239732b;

    /* renamed from: a */
    public final void mo82351a(int i) {
        C89205j jVar = this.f239732b;
        if (jVar != null) {
            if (i < 0) {
                i = 0;
            }
            jVar.mo83171k("CHARS_SAVED", jVar.mo83161a("CHARS_SAVED") + i);
            this.f239732b.mo83169i("CHIPS_TAP_COUNT");
            return;
        }
        C59104x c = f239731a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.u.QBLogWriter");
        ((C59052c) ((C59052c) c).mo56372aa(9876)).mo56386p("SearchboxStateAccessor is null");
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239732b = jVar;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        C89205j jVar = this.f239732b;
        if (jVar != null) {
            jVar.mo83171k("CHARS_SAVED", 0);
            this.f239732b.mo83171k("CHIPS_TAP_COUNT", 0);
            this.f239732b.mo83171k("ZERO_PREFIX_CHIPS_TAPPED", 0);
        }
    }

    /* renamed from: l */
    public final void mo44232l(C41640a aVar) {
        C89205j jVar = this.f239732b;
        if (jVar != null) {
            if (jVar.mo83161a("CHARS_SAVED") > 0) {
                aVar.mo44227b(ane.QUERY_BUILDER_CHIPS_SAVED_CHARS, this.f239732b.mo83161a("CHARS_SAVED"));
            } else {
                aVar.mo44226a(ane.QUERY_BUILDER_CHIPS_SAVED_CHARS);
            }
            C89205j jVar2 = this.f239732b;
            jVar2.getClass();
            if (jVar2.mo83161a("CHIPS_TAP_COUNT") > 0) {
                ane ane = ane.QUERY_BUILDER_CHIPS_TAP_COUNT;
                C89205j jVar3 = this.f239732b;
                jVar3.getClass();
                aVar.mo44227b(ane, jVar3.mo83161a("CHIPS_TAP_COUNT"));
            } else {
                aVar.mo44226a(ane.QUERY_BUILDER_CHIPS_TAP_COUNT);
            }
            C89205j jVar4 = this.f239732b;
            jVar4.getClass();
            if (jVar4.mo83161a("ZERO_PREFIX_CHIPS_TAPPED") > 0) {
                ane ane2 = ane.ZERO_PREFIX_CHIPS_TAPPED;
                C89205j jVar5 = this.f239732b;
                jVar5.getClass();
                aVar.mo44227b(ane2, jVar5.mo83161a("ZERO_PREFIX_CHIPS_TAPPED"));
                return;
            }
            aVar.mo44226a(ane.ZERO_PREFIX_CHIPS_TAPPED);
            return;
        }
        C59104x c = f239731a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.u.QBLogWriter");
        ((C59052c) ((C59052c) c).mo56372aa(9878)).mo56386p("SearchboxStateAccessor is null");
    }
}
