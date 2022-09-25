package com.google.android.apps.search.googleapp.silkpane;

import androidx.activity.C0800m;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.d */
/* compiled from: PG */
final class C139282d extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C139283e f378838a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139282d(C139283e eVar) {
        super(true);
        this.f378838a = eVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        ((C59052c) ((C59052c) C139283e.f378839a.mo56224b()).mo56372aa(41358)).mo56386p("onBackPressed");
        C139303y yVar = (C139303y) this.f378838a.f378840b.f727a.f739a.f744e.f634a.mo671c("silk_fragment_tag");
        if (yVar != null) {
            C139304z a = yVar.mo17754z();
            ((C59052c) ((C59052c) C139304z.f378877a.mo56224b()).mo56372aa(41366)).mo56386p("onBackPressed");
            C139300v a2 = a.mo114885a();
            if (a2 != null) {
                C139301w a3 = a2.mo17754z();
                ((C59052c) ((C59052c) C139301w.f378869a.mo56224b()).mo56372aa(41364)).mo56386p("#onBackPressed");
                C43861g gVar = (C43861g) a3.f378871c.getChildFragmentManager().f634a.mo671c("SILK_PANE_WEB_FRAGMENT");
                if (gVar != null && gVar.mo17754z().mo46876d()) {
                    return;
                }
            }
        }
        this.f378838a.f378840b.finish();
    }
}
