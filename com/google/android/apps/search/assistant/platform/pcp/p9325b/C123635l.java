package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123731ay;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123780i;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123781j;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71206ap;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.l */
/* compiled from: PG */
public final /* synthetic */ class C123635l implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C123610ac f341561a;

    /* renamed from: b */
    public final /* synthetic */ List f341562b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f341563c;

    /* renamed from: d */
    public final /* synthetic */ C123777f f341564d;

    public /* synthetic */ C123635l(C123610ac acVar, List list, C53306j jVar, C123777f fVar) {
        this.f341561a = acVar;
        this.f341562b = list;
        this.f341563c = jVar;
        this.f341564d = fVar;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        C123610ac acVar = this.f341561a;
        List list = this.f341562b;
        C53306j jVar = this.f341563c;
        C123777f fVar = this.f341564d;
        C31520m c = C31167ax.m58112a().mo36912c();
        Cursor d = bfVar.mo45932d(C123611ad.m202953l(list, jVar));
        try {
            C58526ih ihVar = new C58526ih();
            C71208ar arVar = (C71208ar) C71209as.f190080g.createBuilder();
            while (d.moveToNext()) {
                if (!acVar.mo106069m(d, fVar)) {
                    C123731ay ayVar = (C123731ay) C123732az.f341771d.createBuilder();
                    C123744bk a = acVar.mo106057a(d, jVar, ayVar, arVar);
                    if ((a.f341806a & 1) != 0) {
                        long j = d.getLong(d.getColumnIndexOrThrow("last_update_timestamp"));
                        C123780i iVar = (C123780i) C123781j.f341939e.createBuilder();
                        iVar.copyOnWrite();
                        C123781j jVar2 = (C123781j) iVar.instance;
                        a.getClass();
                        jVar2.f341942b = a;
                        jVar2.f341941a = 1 | jVar2.f341941a;
                        C123732az azVar = (C123732az) ayVar.build();
                        iVar.copyOnWrite();
                        C123781j jVar3 = (C123781j) iVar.instance;
                        azVar.getClass();
                        jVar3.f341943c = azVar;
                        jVar3.f341941a |= 2;
                        C63042fg i = C62953e.m95484i(j);
                        iVar.copyOnWrite();
                        C123781j jVar4 = (C123781j) iVar.instance;
                        i.getClass();
                        jVar4.f341944d = i;
                        jVar4.f341941a |= 4;
                        ihVar.mo55373c((C123781j) iVar.build());
                    }
                }
            }
            C31167ax a2 = C31167ax.m58112a();
            C31164au a3 = C31164au.m58091a(C123610ac.f341529b, C31164au.m58093c((String) null, jVar));
            C71206ap apVar = (C71206ap) C71207aq.f190077a.createBuilder();
            apVar.mo58885m(C71209as.f190081h, (C71209as) arVar.build());
            a2.mo36919k(c, a3, (C71207aq) apVar.build(), 2);
            C58528ij f = ihVar.mo55486f();
            if (d != null) {
                d.close();
            }
            return f;
        } catch (IllegalArgumentException e) {
            C59104x d2 = C123610ac.f341528a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.Database");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(35179)).mo56386p("Failure to convert Database Bytes");
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
