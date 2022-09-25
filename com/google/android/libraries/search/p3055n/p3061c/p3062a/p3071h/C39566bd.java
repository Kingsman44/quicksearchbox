package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39392ah;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39394aj;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39395ak;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39638t;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39640v;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bd */
/* compiled from: PG */
public final /* synthetic */ class C39566bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104148a;

    public /* synthetic */ C39566bd(C39580br brVar) {
        this.f104148a = brVar;
    }

    public final C60870cx apply(Object obj) {
        C39580br brVar = this.f104148a;
        if (((Boolean) obj).booleanValue()) {
            C39562b b = ((C39583bu) brVar.f104188u.mo56107c()).mo41920b();
            C59104x b2 = C39580br.f104168a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b2).mo56372aa(53760)).mo56386p("#startPushingAudio");
            return C2169h.m6027a(new C39552aq(brVar, b));
        }
        C59104x d = C39580br.f104168a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) d).mo56372aa(53749)).mo56386p("Cannot start Hotword detection on Soda");
        C39394aj c = C39395ak.m68799c();
        C39638t tVar = new C39638t();
        tVar.mo41807b(C39392ah.SODA_START_CAPTURE_ERROR);
        tVar.f104350a = "Cannot start Hotword detection on Soda.";
        ((C39640v) c).f104354a = C58833ax.m90834k(tVar.mo41806a());
        return C60856cj.m92900i(c.mo41810a());
    }
}
