package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.assistant.shared.n.t;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49894cy;
import com.google.assistant.p3861at.C49895cz;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.k */
/* compiled from: PG */
public final class C100872k {

    /* renamed from: a */
    public static final C59071e f281855a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.h.k");

    /* renamed from: b */
    public static final C58528ij f281856b = C58528ij.m90011K(C49875cf.NEXUS, C49875cf.MANHATTAN);

    /* renamed from: e */
    private static final Duration f281857e = Duration.ofSeconds(10);

    /* renamed from: c */
    public final C86054o f281858c;

    /* renamed from: d */
    public final C22871g f281859d;

    /* renamed from: f */
    private final l f281860f;

    public C100872k(l lVar, C22871g gVar, C86054o oVar) {
        this.f281860f = lVar;
        this.f281859d = gVar;
        this.f281858c = oVar;
    }

    /* renamed from: c */
    public static HashSet m167105c(act act) {
        C49893cx cxVar = act.f128900g;
        if (cxVar == null) {
            cxVar = C49893cx.f129688b;
        }
        return (HashSet) Collection.EL.stream(cxVar.f129690a).filter(C100868g.f281851a).filter(C100869h.f281852a).filter(C100870i.f281853a).collect(Collectors.toCollection(C100871j.f281854a));
    }

    /* renamed from: d */
    public static boolean m167106d(C63042fg fgVar) {
        Instant e = C62950b.m95474e(fgVar);
        C60948g gVar = C60948g.f165068a;
        return e.isAfter(Instant.now().minus(Duration.ofDays(60)));
    }

    /* renamed from: a */
    public final C60870cx mo92076a(String str) {
        Account w = this.f281858c.mo79689w(str);
        C49894cy cyVar = (C49894cy) C49895cz.f129691h.createBuilder();
        cyVar.copyOnWrite();
        C49895cz czVar = (C49895cz) cyVar.instance;
        czVar.f129693a |= 2;
        czVar.f129695c = true;
        cyVar.copyOnWrite();
        C49895cz czVar2 = (C49895cz) cyVar.instance;
        czVar2.f129693a |= 4;
        czVar2.f129696d = true;
        cyVar.copyOnWrite();
        C49895cz czVar3 = (C49895cz) cyVar.instance;
        czVar3.f129693a |= 1;
        czVar3.f129694b = true;
        C49895cz czVar4 = (C49895cz) cyVar.build();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128947c |= 65536;
        acv.f128944W = true;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        acv2.f128945a |= 512;
        acv2.f128954j = true;
        acu.copyOnWrite();
        acv acv3 = (acv) acu.instance;
        czVar4.getClass();
        acv3.f128955k = czVar4;
        acv3.f128945a |= 1024;
        l lVar = this.f281860f;
        p pVar = new p();
        pVar.e((acv) acu.build());
        pVar.b = C58833ax.m90833j(w);
        pVar.e = C58833ax.m90833j(getClass().getSimpleName());
        return lVar.a(pVar, f281857e.getSeconds(), TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public final C60870cx mo92077b(acx acx, Account account) {
        ((C59052c) ((C59052c) f281855a.mo56224b()).mo56372aa(19653)).mo56386p("updateServerSettings");
        l lVar = this.f281860f;
        t b = C73894n.m108499b();
        b.c(acx);
        C58833ax j = C58833ax.m90833j(account);
        t tVar = b;
        tVar.c = j;
        tVar.j = C58833ax.m90833j(getClass().getSimpleName());
        return this.f281859d.mo28210j(lVar.c(b, f281857e.getSeconds(), TimeUnit.SECONDS), "updateUnifiedDeviceSettingsServerAsync", C100866e.f281848a);
    }
}
