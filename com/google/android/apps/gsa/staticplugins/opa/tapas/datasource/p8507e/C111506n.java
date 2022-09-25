package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113302c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113368di;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113369dj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.p4017at.p4060h.p4073d.p4074a.C54240d;
import dagger.C68214a;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.n */
/* compiled from: PG */
public final class C111506n {

    /* renamed from: a */
    public final boolean f310165a;

    /* renamed from: b */
    private final C86124t f310166b;

    /* renamed from: c */
    private final C68214a f310167c;

    public C111506n(C86124t tVar, C68214a aVar) {
        this.f310165a = tVar.mo79746e(C90063do.f249324bQ);
        this.f310166b = tVar;
        this.f310167c = aVar;
    }

    /* renamed from: a */
    public final C113408es mo99160a(C113405ep epVar, C54229ar arVar) {
        C58485gu guVar;
        C58485gu guVar2;
        C58485gu guVar3;
        Integer num;
        C58485gu guVar4 = (C58485gu) Collection.EL.stream(arVar.f142355b).limit(5).filter(C111501i.f310159a).filter(new C111502j(this, epVar.mo100033p().toLowerCase(Locale.getDefault()))).map(C111503k.f310162a).filter(C111504l.f310163a).map(C111505m.f310164a).collect(C58370cn.f155946a);
        if (!this.f310166b.mo79746e(C90063do.f249577gE)) {
            guVar2 = guVar4;
        } else if (guVar4.isEmpty()) {
            guVar = ((C113369dj) this.f310167c.mo27525b()).mo100145a(epVar.mo100033p());
            C113407er p = C113408es.m187705p();
            p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(guVar)));
            ((C113302c) p).f313769a = Optional.m71637of(arVar);
            return p.mo100091a();
        } else {
            C113369dj djVar = (C113369dj) this.f310167c.mo27525b();
            synchronized (djVar.f313919b) {
                C58801sm G = guVar4.listIterator(0);
                while (G.hasNext()) {
                    C113415ez ezVar = (C113415ez) G.next();
                    Optional q = ezVar.mo100217q();
                    if (ezVar.mo100211k() != C48672ag.ANSWER || !q.isPresent()) {
                        C54229ar arVar2 = arVar;
                    } else {
                        long b = djVar.f313921d.mo26870b();
                        Map map = djVar.f313920c;
                        String L = ezVar.mo100199L();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        String str = ((C54240d) q.get()).f142413c;
                        long a = djVar.f313922e.mo79743a(C90063do.f249572g);
                        if (str != null) {
                            try {
                                int parseInt = Integer.parseInt(str);
                                C58495hd q2 = djVar.f313922e.mo79751q(C90063do.f249625h);
                                Integer valueOf = Integer.valueOf(parseInt);
                                if (q2.containsKey(valueOf) && (num = (Integer) q2.get(valueOf)) != null) {
                                    a = (long) num.intValue();
                                }
                            } catch (NumberFormatException e) {
                                guVar3 = guVar4;
                                ((C59052c) ((C59052c) ((C59052c) C113369dj.f313918a.mo56225c()).mo56382g(e)).mo56372aa(27851)).mo56386p("number format exception");
                            }
                        }
                        guVar3 = guVar4;
                        map.put(L, new C113368di(ezVar, b, (timeUnit.toMillis(a) + b) - 1));
                        C54229ar arVar3 = arVar;
                        guVar4 = guVar3;
                    }
                }
                guVar2 = guVar4;
            }
        }
        guVar = guVar2;
        C113407er p2 = C113408es.m187705p();
        p2.mo100096f(C113339cj.m187495c(C113339cj.m187496d(guVar)));
        ((C113302c) p2).f313769a = Optional.m71637of(arVar);
        return p2.mo100091a();
    }
}
