package com.google.android.apps.gsa.staticplugins.opapayments.p8664a.p8665a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.a.f */
/* compiled from: PG */
public final class C115911f extends C68247h {

    /* renamed from: a */
    private final C68283d f321394a;

    /* renamed from: c */
    private final C68283d f321395c;

    /* renamed from: d */
    private final C68283d f321396d;

    public C115911f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C115911f.class), aVar);
        this.f321394a = C68236af.m98549d(dVar);
        this.f321395c = C68236af.m98549d(dVar2);
        this.f321396d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        int i;
        String str;
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        C89012aj ajVar = (C89012aj) list.get(1);
        String str2 = (String) list.get(2);
        if (str2 != null) {
            String x = tVar.mo79758x(C90014bt.f247499iM);
            C58976aa aaVar = C58975e.f156826a;
            List i2 = C58869cf.m90936b(new C58903m(':')).mo56155i(x);
            if (i2.size() == 1) {
                str = x;
                i = 443;
            } else if (i2.size() == 2) {
                str = (String) i2.get(0);
                i = Integer.parseInt((String) i2.get(1));
            } else {
                throw new IllegalArgumentException("Invalid opa_payment_grpc_service_endpoint: %s".concat(String.valueOf(x)));
            }
            C70334de deVar = new C70334de();
            deVar.mo62033h(new C70290cs("Accept-Language", C70334de.f187481c), Locale.getDefault().toLanguageTag());
            return ajVar.mo27501m(str, i, deVar, str2, 60);
        }
        C59104x c = C115907b.f321387a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaPaymentsSvMd");
        ((C59052c) ((C59052c) c).mo56372aa(30170)).mo56386p("Auth token is not available");
        throw new IllegalArgumentException("Auth token is not available");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f321394a.mo60297gq(), this.f321395c.mo60297gq(), this.f321396d.mo60297gq());
    }
}
