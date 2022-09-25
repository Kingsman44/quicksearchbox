package com.google.apps.tiktok.experiments.phenotype;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.experiments.C46891c;
import com.google.apps.tiktok.experiments.C46895g;
import com.google.apps.tiktok.experiments.C46896h;
import com.google.apps.tiktok.experiments.C46903o;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5462h.C69677g;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.cf */
/* compiled from: PG */
public final class C46966cf {

    /* renamed from: a */
    public final int f122467a;

    /* renamed from: b */
    public final C60887da f122468b;

    /* renamed from: c */
    public final C21370a f122469c;

    /* renamed from: d */
    public final String f122470d;

    /* renamed from: e */
    public final C46977cq f122471e;

    /* renamed from: f */
    public final C69630p f122472f;

    /* renamed from: g */
    public final C69464a f122473g;

    /* renamed from: h */
    public final Executor f122474h;

    /* renamed from: i */
    public final C58881cr f122475i;

    /* renamed from: j */
    public final C42876ab f122476j;

    /* renamed from: k */
    public final C69631q f122477k;

    /* renamed from: l */
    public final C60930r f122478l;

    /* renamed from: m */
    public final boolean f122479m;

    /* renamed from: n */
    public final C46423aj f122480n;

    public C46966cf(int i, C60887da daVar, C21370a aVar, String str, C46977cq cqVar, C69630p pVar, C69464a aVar2, Executor executor, C58881cr crVar, C42876ab abVar, C69631q qVar, C60930r rVar) {
        C69664n.m101061g(daVar, "blockingExecutor");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(str, "packageName");
        C69664n.m101061g(executor, "snapshotExecutor");
        C69664n.m101061g(crVar, "fallbackExperimentCache");
        this.f122467a = i;
        this.f122468b = daVar;
        this.f122469c = aVar;
        this.f122470d = str;
        this.f122471e = cqVar;
        this.f122472f = pVar;
        this.f122473g = aVar2;
        this.f122474h = executor;
        this.f122475i = crVar;
        this.f122476j = abVar;
        this.f122477k = qVar;
        this.f122478l = rVar;
        Boolean bool = true;
        this.f122479m = bool.booleanValue();
        this.f122480n = new C46423aj(new C46948bo(this), new C46949bp(cqVar));
    }

    /* renamed from: a */
    public final C46940bg mo50939a() {
        C46940bg bgVar;
        try {
            if (this.f122480n.f121487d.isDone()) {
                bgVar = (C46940bg) C60856cj.m92909r(this.f122480n.mo50395b());
            } else {
                bgVar = (C46940bg) this.f122471e.mo50958b(new C46951br(this));
            }
            C69664n.m101060f(bgVar, "get() =\n      try {\n    …xception(e.cause)\n      }");
            return bgVar;
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    /* renamed from: b */
    public final C58495hd mo50940b(C46891c cVar) {
        C46904p pVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C46896h hVar : cVar.f122347e) {
            C46904p pVar2 = (C46904p) ((Map) this.f122473g.mo17428b()).get(hVar.f122365d);
            if (pVar2 != null) {
                if (C46895g.m83534a(hVar.f122363b) == pVar2.f122373c) {
                    String str = hVar.f122365d;
                    C69664n.m101060f(str, "gcoreFlag.flagName");
                    C69664n.m101060f(hVar, "gcoreFlag");
                    switch (C46895g.m83534a(hVar.f122363b).ordinal()) {
                        case 0:
                            pVar = C46903o.m83544d(hVar.f122363b == 1 ? ((Long) hVar.f122364c).longValue() : 0);
                            break;
                        case 1:
                            pVar = C46903o.m83541a(hVar.f122363b == 2 ? ((Boolean) hVar.f122364c).booleanValue() : false);
                            break;
                        case 2:
                            pVar = C46903o.m83543c(hVar.f122363b == 3 ? ((Double) hVar.f122364c).doubleValue() : C59203do.f157270a);
                            break;
                        case 3:
                            String str2 = hVar.f122363b == 4 ? (String) hVar.f122364c : BuildConfig.FLAVOR;
                            C69664n.m101060f(str2, "flag.stringValue");
                            pVar = C46903o.m83546f(str2);
                            break;
                        case 4:
                            pVar = C46903o.m83542b(new C46952bs(hVar, pVar2));
                            break;
                        case 5:
                            C46953bt btVar = new C46953bt(pVar2, hVar);
                            MessageLite messageLite = pVar2.f122374d;
                            C69664n.m101058d(messageLite);
                            pVar = C46903o.m83545e(btVar, messageLite);
                            break;
                        case 6:
                            throw new IllegalStateException("No known flag type");
                        default:
                            throw new C69677g();
                    }
                    linkedHashMap.put(str, pVar);
                } else {
                    C46895g a = C46895g.m83534a(hVar.f122363b);
                    throw new IllegalStateException("Attempting to set a " + pVar2 + " type flag with a " + a + " value");
                }
            }
        }
        Object b = this.f122473g.mo17428b();
        C69664n.m101060f(b, "defaultMap\n      .get()");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : ((Map) b).entrySet()) {
            if (!linkedHashMap.containsKey((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap.put(entry2.getKey(), entry2.getValue());
        }
        return C58479go.m89813e(linkedHashMap);
    }

    /* renamed from: c */
    public final C60870cx mo50941c() {
        if (this.f122480n.f121487d.isDone()) {
            return this.f122480n.mo50395b();
        }
        return this.f122471e.mo50957a(new C46950bq(this));
    }

    /* renamed from: d */
    public final void mo50942d(String str, C63088z zVar) {
        C46945bl.m83606a(C60856cj.m92905n(C47810es.m84965e(new C46956bw(this, str, zVar)), this.f122468b), "Failed to commit to config");
    }

    /* renamed from: e */
    public final boolean mo50943e() {
        try {
            if (!this.f122480n.f121487d.isDone() || !((C46940bg) C60856cj.m92909r(this.f122480n.mo50395b())).mo50931f()) {
                return false;
            }
            return true;
        } catch (ExecutionException unused) {
            return false;
        }
    }
}
