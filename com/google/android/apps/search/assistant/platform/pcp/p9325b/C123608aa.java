package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123731ay;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C123608aa implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C123610ac f341522a;

    /* renamed from: b */
    public final /* synthetic */ boolean f341523b;

    /* renamed from: c */
    public final /* synthetic */ List f341524c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f341525d;

    /* renamed from: e */
    public final /* synthetic */ C123777f f341526e;

    public /* synthetic */ C123608aa(C123610ac acVar, boolean z, List list, C53306j jVar, C123777f fVar) {
        this.f341522a = acVar;
        this.f341523b = z;
        this.f341524c = list;
        this.f341525d = jVar;
        this.f341526e = fVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C42839ay ayVar;
        C58495hd hdVar;
        C123610ac acVar = this.f341522a;
        boolean z = this.f341523b;
        List list = this.f341524c;
        C53306j jVar = this.f341525d;
        C123777f fVar = this.f341526e;
        C31520m c = C31167ax.m58112a().mo36912c();
        if (z) {
            ayVar = C123611ad.m202952k(new ArrayList(), list, jVar);
        } else {
            ayVar = C123611ad.m202953l(list, jVar);
        }
        Cursor d = bfVar.mo45932d(ayVar);
        try {
            C58490gz gzVar = new C58490gz(4);
            C71208ar arVar = (C71208ar) C71209as.f190080g.createBuilder();
            while (d != null) {
                if (!d.moveToNext()) {
                    break;
                } else if (!acVar.mo106069m(d, fVar)) {
                    C123731ay ayVar2 = (C123731ay) C123732az.f341771d.createBuilder();
                    C123744bk a = acVar.mo106057a(d, jVar, ayVar2, arVar);
                    if (a.isInitialized()) {
                        gzVar.mo55429h(a, (C123732az) ayVar2.build());
                    }
                }
            }
            C71209as asVar = (C71209as) arVar.build();
            try {
                hdVar = gzVar.mo55427f(false);
                C31167ax a2 = C31167ax.m58112a();
                C31164au a3 = C31164au.m58091a(C123610ac.f341529b, C31164au.m58093c((String) null, jVar));
                C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
                apVar.mo58885m(C71209as.f190081h, asVar);
                a2.mo36919k(c, a3, (C71207aq) apVar.build(), 2);
                if (d != null) {
                    d.close();
                    return hdVar;
                }
            } catch (IllegalArgumentException e) {
                C59104x c2 = C123610ac.f341528a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "PCP.Database");
                C59052c cVar = (C59052c) c2;
                cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_CREATE_PROACTIVE_DATA_MAP_FROM_DB_VALUE));
                ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(35177)).mo56386p("Failed to build ProactiveDataMap");
                C31167ax a4 = C31167ax.m58112a();
                C31164au a5 = C31164au.m58091a(C123610ac.f341529b, C31164au.m58093c((String) null, jVar));
                C71206ap apVar2 = (C71206ap) C71207aq.f190077a.createBuilder();
                apVar2.mo58885m(C71209as.f190081h, asVar);
                a4.mo36919k(c, a5, (C71207aq) apVar2.build(), 3);
                hdVar = C58729pv.f156485a;
                if (d != null) {
                    d.close();
                    return hdVar;
                }
            }
            return hdVar;
        } catch (IllegalArgumentException e2) {
            C59104x d2 = C123610ac.f341528a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.Database");
            C59052c cVar2 = (C59052c) d2;
            cVar2.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_CREATE_PROACTIVE_DATA_MAP_FROM_DB_VALUE));
            ((C59052c) ((C59052c) cVar2.mo56382g(e2)).mo56372aa(35180)).mo56386p("Failed to build ProactiveDataMap");
            C59104x d3 = C123610ac.f341528a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "PCP.Database");
            C59052c cVar3 = (C59052c) d3;
            cVar3.mo56380ai(C58979ad.MEDIUM);
            C59052c cVar4 = (C59052c) cVar3.mo56382g(e2);
            cVar4.mo56378ag(C38505d.f101864b, 179719748);
            ((C59052c) cVar4.mo56372aa(35181)).mo56389s("Duplicate key in ProactiveDataMap Exception: %s", e2.getMessage());
        } catch (Throwable th) {
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    C123633j.m203004a(th, th2);
                }
            }
            throw th;
        }
    }
}
