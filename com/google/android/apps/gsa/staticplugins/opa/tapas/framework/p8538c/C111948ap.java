package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111793a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111794b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a.C111806n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112686ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.LatencyValidatorImpl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111244g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111245h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ap */
/* compiled from: PG */
public final class C111948ap implements C90991b {

    /* renamed from: a */
    public static final C121537f f311012a = C121537f.m200840b("Tapas/SourceFetchOutcomeLogger", C121511c.f337208a);

    /* renamed from: b */
    public final C68214a f311013b;

    /* renamed from: c */
    public final C68214a f311014c;

    /* renamed from: d */
    public final C68214a f311015d;

    /* renamed from: e */
    public final AtomicLong f311016e = new AtomicLong();

    /* renamed from: f */
    private final C22871g f311017f;

    /* renamed from: g */
    private final C68214a f311018g;

    /* renamed from: h */
    private final C21370a f311019h;

    public C111948ap(C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C21370a aVar4, C68214a aVar5) {
        this.f311017f = gVar;
        this.f311013b = aVar;
        this.f311014c = aVar2;
        this.f311018g = aVar3;
        this.f311019h = aVar4;
        this.f311015d = aVar5;
    }

    /* renamed from: a */
    public final long mo99307a(long j) {
        return this.f311019h.mo26871c() - j;
    }

    /* renamed from: b */
    public final void mo99308b(long j, C60870cx cxVar, C113405ep epVar, C48672ag agVar) {
        String str = true != TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p())) ? "_N_PREFIX" : "_0_PREFIX";
        C121537f fVar = f311012a;
        String name = agVar.name();
        String s = epVar.mo100186s();
        C121492b a = fVar.mo105233a(name + "_LATENCY" + str + s);
        ((C113389c) this.f311015d.mo27525b()).mo99631f(epVar.mo100016a(), agVar);
        C90873ag agVar2 = new C90873ag(cxVar, this.f311017f, "get source latency", new C111944al(this, agVar, epVar, j, a, str));
        agVar2.mo85224b(TimeoutException.class, new C111945am(this, agVar, epVar, j));
        C48672ag agVar3 = agVar;
        C113405ep epVar2 = epVar;
        long j2 = j;
        agVar2.mo85224b(CancellationException.class, new C111946an(this, agVar3, epVar2, j2));
        agVar2.mo85223a(new C111947ao(this, agVar3, epVar2, j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo99309c(C113408es esVar, C113405ep epVar, long j, String str, int i, Exception exc) {
        String str2;
        String str3;
        int i2;
        C58485gu guVar;
        String str4 = str;
        Exception exc2 = exc;
        if (epVar.mo100017b() >= this.f311016e.get()) {
            C58485gu m = esVar == null ? C58485gu.m89845m() : esVar.mo100053o();
            C111806n nVar = (C111806n) this.f311018g.mo27525b();
            String p = epVar.mo100033p();
            long a = epVar.mo100016a();
            long a2 = mo99307a(j);
            if ((nVar.f310737c.mo79746e(C90063do.f249319bL) && ((C111248k) nVar.f310735a.mo27525b()).mo99077b()) || nVar.f310737c.mo79746e(C90063do.f249493ea)) {
                C111793a aVar = new C111793a();
                aVar.mo99237a(0);
                aVar.f310705g = 2;
                aVar.mo99238b(C58485gu.m89845m());
                if (p != null) {
                    aVar.f310699a = p;
                    if (str4 != null) {
                        aVar.f310700b = str4;
                        aVar.mo99237a(a2);
                        aVar.mo99238b(m);
                        aVar.f310705g = i;
                        if (exc2 != null) {
                            aVar.f310703e = Optional.m71637of(exc);
                            if (exc2 instanceof TimeoutException) {
                                aVar.f310705g = 4;
                            } else if (exc2 instanceof CancellationException) {
                                aVar.f310705g = 5;
                            }
                        }
                        if (aVar.f310704f != 1 || (str2 = aVar.f310699a) == null || (str3 = aVar.f310700b) == null || (i2 = aVar.f310705g) == 0 || (guVar = aVar.f310702d) == null) {
                            StringBuilder sb = new StringBuilder();
                            if (aVar.f310699a == null) {
                                sb.append(" prefix");
                            }
                            if (aVar.f310700b == null) {
                                sb.append(" sourceName");
                            }
                            if (aVar.f310704f == 0) {
                                sb.append(" latencyInMs");
                            }
                            if (aVar.f310705g == 0) {
                                sb.append(" state");
                            }
                            if (aVar.f310702d == null) {
                                sb.append(" suggestions");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        C111794b bVar = new C111794b(str2, str3, aVar.f310701c, i2, guVar, aVar.f310703e);
                        nVar.f310739e.add(bVar);
                        if (!nVar.f310737c.mo79746e(C90063do.f249441db) || bVar.f310706a.isEmpty()) {
                            ((C111248k) nVar.f310735a.mo27525b()).mo99076a(C111255r.SOURCES, String.format(Locale.US, "%s RequestId:%s", new Object[]{bVar.mo99252h(), Long.valueOf(a)}));
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            C58485gu guVar2 = bVar.f310706a;
                            int size = guVar2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                sb2.append(String.format(Locale.US, "%s\n\n", new Object[]{((C113415ez) guVar2.get(i3)).mo100200S()}));
                            }
                            C111248k kVar = (C111248k) nVar.f310735a.mo27525b();
                            C111255r rVar = C111255r.SOURCES;
                            String format = String.format(Locale.US, "%s RequestId:%s", new Object[]{bVar.mo99252h(), Long.valueOf(a)});
                            String sb3 = sb2.toString();
                            if (kVar.f309570b.mo79746e(C90063do.f249318bK) || kVar.f309570b.mo79746e(C90063do.f249319bL)) {
                                Collection.EL.stream(kVar.f309569a).filter(new C111244g(rVar)).findFirst().ifPresent(new C111245h(format, sb3));
                            }
                        }
                        bVar.mo99252h();
                        return;
                    }
                    throw new NullPointerException("Null sourceName");
                }
                throw new NullPointerException("Null prefix");
            }
        }
    }

    /* renamed from: e */
    public final void mo99310e(C48672ag agVar, int i, C113405ep epVar, long j) {
        if (agVar.equals(C48672ag.TAPAS_SERVER)) {
            C112686ax axVar = (C112686ax) this.f311014c.mo27525b();
            long a = mo99307a(j);
            int length = epVar.mo100033p().length();
            if (((LatencyValidatorImpl) axVar.f312367a.mo27525b()).mo99611a(j)) {
                long j2 = 1;
                if (length == 0) {
                    axVar.f312391y.mo104025g(i != 1 ? 0 : 1);
                    axVar.f312359A.mo104025g(a);
                } else {
                    if (i == 1) {
                        axVar.f312392z.mo104025g(1);
                        axVar.f312361C.mo104025g(a);
                    } else {
                        axVar.f312392z.mo104025g(0);
                        axVar.f312362D.mo104025g(a);
                    }
                    axVar.f312360B.mo104025g(a);
                }
                axVar.f312388v.mo104025g(i != 1 ? 0 : 1);
                axVar.f312389w.mo104025g(i != 2 ? 0 : 1);
                C118831d dVar = axVar.f312390x;
                if (i != 3) {
                    j2 = 0;
                }
                dVar.mo104025g(j2);
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("latest request timestamp").mo85276a(C90752i.m148230d(Long.valueOf(this.f311016e.get())));
    }
}
