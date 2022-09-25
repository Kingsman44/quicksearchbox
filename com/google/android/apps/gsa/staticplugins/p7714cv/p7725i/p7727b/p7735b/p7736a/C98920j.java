package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.j */
/* compiled from: PG */
public final /* synthetic */ class C98920j implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C98932v f276455a;

    public /* synthetic */ C98920j(C98932v vVar) {
        this.f276455a = vVar;
    }

    public final void run() {
        C86227bj bjVar;
        C98932v vVar = this.f276455a;
        if (!vVar.f276491n) {
            if ((!vVar.f276490m && vVar.f276488k == null) || ((bjVar = vVar.f276488k) != null && !bjVar.mo79856I())) {
                C59104x d = C98932v.f276474a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CarEngineCallback");
                ((C59052c) ((C59052c) d).mo56372aa(31290)).mo56386p("General network query timeout triggered, error out if online or offline did not finish fulfillment.");
                vVar.mo91351v(C89849ae.VOICE_SEARCH_NETWORK_TIMEOUT);
                vVar.mo87095a(new C90523o(C89885b.RECOGNIZER_GENERAL_VOICE_SEARCH_TIMEOUT_VALUE));
            }
        }
    }
}
