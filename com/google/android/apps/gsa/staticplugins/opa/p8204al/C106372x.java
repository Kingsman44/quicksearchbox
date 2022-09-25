package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import android.util.Pair;
import com.google.android.apps.gsa.p6487s3.producers.C84299a;
import com.google.android.apps.gsa.p6487s3.producers.C84304c;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118934q;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57986e;
import com.google.p4449cd.p4456g.p4459c.C57998b;
import com.google.p4449cd.p4456g.p4459c.C58002f;
import com.google.protobuf.C62940bt;
import com.google.speech.p5224k.p5225a.C67226d;
import com.google.speech.p5224k.p5225a.C67227e;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import dagger.p5295b.C68283d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.x */
/* compiled from: PG */
public final class C106372x {

    /* renamed from: a */
    public static final C118928k f296719a;

    static {
        C62940bt btVar = C67227e.f182707d;
        C67226d dVar = (C67226d) C67227e.f182706c.createBuilder();
        dVar.copyOnWrite();
        C67227e eVar = (C67227e) dVar.instance;
        eVar.f182710b = 2;
        eVar.f182709a |= 1;
        f296719a = new C118928k(C58833ax.m90834k((C67227e) dVar.build()), btVar);
    }

    /* renamed from: a */
    static C60870cx m177162a(C57981b bVar, C85133a aVar) {
        return aVar.mo78727a(bVar);
    }

    /* renamed from: b */
    static C57981b m177163b(C57981b bVar, C57981b bVar2, C68283d dVar, Executor executor) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        arrayList.add(bVar2);
        return new C118934q(executor, dVar.mo60297gq(), new C57986e(arrayList));
    }

    /* renamed from: c */
    static C57981b m177164c(C57981b bVar, boolean z, C86124t tVar) {
        return new C58002f(new C58002f(new C57998b(new C57998b(bVar, new C106368t(tVar.mo79747m(C90014bt.f247518if))), new C106369u(new HashSet())), C106370v.f296717a), new C106371w(z));
    }

    /* renamed from: d */
    static C57981b m177165d(C84299a aVar, Query query) {
        return new C84304c(aVar, query);
    }

    /* renamed from: e */
    public static String m177166e(C67438ag agVar) {
        C67442ak akVar;
        int a = C67437af.m97466a(agVar.f183259b);
        if (a != 0 && a == 2) {
            C23319a aVar = new C23319a();
            if ((agVar.f183258a & 16) != 0) {
                akVar = agVar.f183263f;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
            } else {
                akVar = agVar.f183261d;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
            }
            return (String) aVar.mo28813b(akVar).get(0);
        }
        Pair a2 = new C23319a().mo28812a(agVar);
        String trim = ((String) a2.first).trim();
        String trim2 = ((String) a2.second).trim();
        return (trim + " " + trim2).trim();
    }
}
