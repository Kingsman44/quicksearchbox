package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.assistant.soda.speakerid.p1613a.C19372j;
import com.google.android.libraries.search.p3055n.p3081g.p3082a.p3083a.C39717b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.g.a.c */
/* compiled from: PG */
public final /* synthetic */ class C39732c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39751v f104547a;

    /* renamed from: b */
    public final /* synthetic */ Locale f104548b;

    public /* synthetic */ C39732c(C39751v vVar, Locale locale) {
        this.f104547a = vVar;
        this.f104548b = locale;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C39751v vVar = this.f104547a;
        Locale locale = this.f104548b;
        Optional optional = (Optional) obj;
        if (vVar.f104576f.isEmpty()) {
            ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53829)).mo56386p("Tdsid model queries skipped because no provider is bound.");
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C60870cx b = ((C19372j) vVar.f104576f.get()).mo24513b(C39751v.m69186b(locale, optional.map(C39746q.f104567a)));
            C39734e eVar = C39734e.f104551a;
            cxVar = C60922j.m93044g(b, C47810es.m84963c(eVar), vVar.f104578h);
        }
        if (vVar.f104576f.isEmpty() || vVar.f104577g.isEmpty()) {
            ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53835)).mo56386p("Tdsid model updates skipped because no provider is bound.");
        } else {
            C39717b b2 = C39751v.m69186b(locale, optional.map(C39746q.f104567a));
            C47633f i = C47633f.m84733g(((C19372j) vVar.f104576f.get()).mo24512a(b2)).mo51516i(new C39747r(vVar), vVar.f104578h).mo51516i(new C39748s(vVar, b2), vVar.f104578h);
            C39749t tVar = new C39749t();
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(tVar), vVar.f104578h);
        }
        return cxVar;
    }
}
