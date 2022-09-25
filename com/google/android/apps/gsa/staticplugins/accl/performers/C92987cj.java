package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.conversation.p1855h.C22720x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3902c.p3907c.C51075fl;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C52036ih;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.cj */
/* compiled from: PG */
public final class C92987cj extends C22538o {

    /* renamed from: a */
    public static final /* synthetic */ int f259384a = 0;

    /* renamed from: b */
    private final C22720x f259385b;

    /* renamed from: c */
    private final C22871g f259386c;

    public C92987cj(C22720x xVar, C22871g gVar) {
        this.f259385b = xVar;
        this.f259386c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Query query;
        C51075fl flVar;
        C51075fl flVar2;
        C22407c cVar = (C22407c) eVar;
        C84349ah ahVar = cVar.f61902d.mo56113h() ? (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56111f() : null;
        if ((ahVar instanceof C84349ah) && (query = ahVar.f229566a) != null && query.mo84404ck()) {
            String str = dyVar.f135936b;
            if (str.equals("ui.THIRD_PARTY_START_INDICATOR")) {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                C52036ih ihVar = (C52036ih) m41992m(dwVar, "third_party_start_indicator_args", C52036ih.f136574g.getParserForType());
                C51098gh ghVar = ihVar.f136578c;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                if (ghVar.f133012b == 3) {
                    flVar = (C51075fl) ghVar.f133013c;
                } else {
                    flVar = C51075fl.f132982e;
                }
                if (!flVar.f132985b.isEmpty()) {
                    C51098gh ghVar2 = ihVar.f136578c;
                    if (ghVar2 == null) {
                        ghVar2 = C51098gh.f133009e;
                    }
                    if (ghVar2.f133012b == 3) {
                        flVar2 = (C51075fl) ghVar2.f133013c;
                    } else {
                        flVar2 = C51075fl.f132982e;
                    }
                    if (!flVar2.f132986c.isEmpty()) {
                        this.f259386c.mo28212l("notify ssbservice entering Aog conversation", new C92985ch(ihVar));
                    }
                }
                throw new C22534k();
            } else if (str.equals("ui.THIRD_PARTY_EXIT_INDICATOR")) {
                this.f259386c.mo28212l("notify ssbservice exiting Aog converastion", C92986ci.f259383a);
            }
        }
        this.f259385b.mo27820i(dyVar, C58833ax.m90833j(eVar));
        return f62144n;
    }
}
