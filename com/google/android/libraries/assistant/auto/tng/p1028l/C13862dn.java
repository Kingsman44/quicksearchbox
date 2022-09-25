package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15482h;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15483i;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15484j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Optional;
import p5535j.p5536a.p5543b.C70958e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dn */
/* compiled from: PG */
public final /* synthetic */ class C13862dn implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13863do f42205a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f42206b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f42207c;

    /* renamed from: d */
    public final /* synthetic */ boolean f42208d;

    /* renamed from: e */
    public final /* synthetic */ C67438ag f42209e;

    public /* synthetic */ C13862dn(C13863do doVar, C60870cx cxVar, C60870cx cxVar2, boolean z, C67438ag agVar) {
        this.f42205a = doVar;
        this.f42206b = cxVar;
        this.f42207c = cxVar2;
        this.f42208d = z;
        this.f42209e = agVar;
    }

    public final Object call() {
        C37258g gVar;
        C37258g gVar2;
        Optional optional;
        Optional optional2;
        Optional optional3;
        C13863do doVar = this.f42205a;
        C60870cx cxVar = this.f42206b;
        C60870cx cxVar2 = this.f42207c;
        boolean z = this.f42208d;
        C67438ag agVar = this.f42209e;
        try {
            Optional optional4 = (Optional) C60856cj.m92909r(cxVar);
            Optional optional5 = (Optional) C60856cj.m92909r(cxVar2);
            Optional map = optional4.map(C13860dl.f42203a);
            if (optional5.isPresent() && ((Boolean) doVar.f42213d.mo17428b()).booleanValue()) {
                C67073ka kaVar = ((C13901e) optional5.get()).f42333b;
                if (kaVar == null) {
                    kaVar = C67073ka.f182324f;
                }
                C67171p pVar = kaVar.f182327b;
                if (pVar == null) {
                    pVar = C67171p.f182575e;
                }
                long j = pVar.f182580d;
                C67073ka kaVar2 = ((C13901e) optional5.get()).f42333b;
                if (kaVar2 == null) {
                    kaVar2 = C67073ka.f182324f;
                }
                int i = kaVar2.f182328c;
                C67073ka kaVar3 = ((C13901e) optional5.get()).f42333b;
                if (kaVar3 == null) {
                    kaVar3 = C67073ka.f182324f;
                }
                int i2 = kaVar3.f182329d;
                C21370a aVar = doVar.f42212c;
                if (optional5.isPresent()) {
                    C13901e eVar = (C13901e) optional5.get();
                    C67073ka kaVar4 = eVar.f42333b;
                    if (((kaVar4 == null ? C67073ka.f182324f : kaVar4).f182326a & 8) != 0) {
                        if (kaVar4 == null) {
                            kaVar4 = C67073ka.f182324f;
                        }
                        long nanos = Duration.ofMillis((long) kaVar4.f182329d).toNanos();
                        C67073ka kaVar5 = eVar.f42333b;
                        C67171p pVar2 = (kaVar5 == null ? C67073ka.f182324f : kaVar5).f182327b;
                        if (pVar2 == null) {
                            pVar2 = C67171p.f182575e;
                        }
                        if ((pVar2.f182577a & 4) != 0) {
                            if (kaVar5 == null) {
                                kaVar5 = C67073ka.f182324f;
                            }
                            if ((kaVar5.f182326a & 4) != 0) {
                                long d = aVar.mo26872d() - Duration.ofMillis(aVar.mo26870b()).toNanos();
                                C67073ka kaVar6 = eVar.f42333b;
                                C67171p pVar3 = (kaVar6 == null ? C67073ka.f182324f : kaVar6).f182327b;
                                if (pVar3 == null) {
                                    pVar3 = C67171p.f182575e;
                                }
                                long j2 = (pVar3.f182580d * 1000) + d;
                                C67171p pVar4 = (kaVar6 == null ? C67073ka.f182324f : kaVar6).f182327b;
                                if (pVar4 == null) {
                                    pVar4 = C67171p.f182575e;
                                }
                                long j3 = pVar4.f182580d;
                                int i3 = (kaVar6 == null ? C67073ka.f182324f : kaVar6).f182328c;
                                int i4 = (kaVar6 == null ? C67073ka.f182324f : kaVar6).f182329d;
                                if (j2 <= 0) {
                                    ((C59052c) ((C59052c) C15484j.f46431a.mo56226d()).mo56372aa(45166)).mo56386p("[hotwordTrigger] Audio recording time cannot be <= 0.");
                                    optional3 = Optional.empty();
                                } else {
                                    if (kaVar6 == null) {
                                        kaVar6 = C67073ka.f182324f;
                                    }
                                    optional3 = Optional.m71637of(Long.valueOf(Duration.ofMillis((long) kaVar6.f182328c).plusNanos(j2).toNanos()));
                                }
                                optional2 = optional3.map(new C15482h(nanos));
                            }
                        }
                        optional3 = Optional.empty();
                        optional2 = optional3.map(new C15482h(nanos));
                    } else {
                        optional2 = Optional.empty();
                    }
                    optional = optional2.map(C15483i.f46430a);
                } else {
                    optional = optional4.map(C15483i.f46430a);
                }
                map = optional.map(new C13861dm(agVar));
            }
            if (map.isEmpty()) {
                ((C59052c) ((C59052c) C13863do.f42210a.mo56226d()).mo56372aa(45085)).mo56386p("[Speech Event][logStartOfSpeech] Recording start time not present.");
                if (z) {
                    doVar.f42211b.mo19974a(C37179a.f97667ei.mo40812e(C70958e.f189198n, C13863do.m30148d(agVar)));
                    return null;
                }
                doVar.f42211b.mo19974a(C37179a.f97669ek.mo40812e(C70958e.f189198n, C13863do.m30148d(agVar)));
                return null;
            }
            Duration duration = (Duration) map.get();
            if (z) {
                doVar.f42211b.mo19974a(C37179a.f97666eh.mo40812e(C70958e.f189198n, C13863do.m30147c(duration.toMillis())));
            } else {
                doVar.f42211b.mo19974a(C37179a.f97668ej.mo40812e(C70958e.f189198n, C13863do.m30147c(duration.toMillis())));
            }
            C13722af afVar = doVar.f42214e;
            C60856cj.m92911t(C47633f.m84733g(C60856cj.m92908q(z ? afVar.f41846d : afVar.f41848f, 2, TimeUnit.SECONDS, afVar.f41845c)).f164926b, C47810es.m84974n(new C13720ad(afVar, z, duration)), afVar.f41845c);
            duration.toNanos();
            long j4 = agVar.f183266i;
            if (j4 > 0) {
                Long valueOf = Long.valueOf(duration.plusMillis(j4).toNanos());
                C37215b bVar = doVar.f42211b;
                C37252a d2 = (z ? C37179a.f97547cM : C37179a.f97548cN).mo40811d(valueOf.longValue());
                ((C37253b) d2).mo40792p(C70958e.f189198n, C13863do.m30148d(agVar));
                bVar.mo19974a(d2);
            }
            C67442ak akVar = agVar.f183263f;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            if (akVar.f183280c > 0) {
                C67442ak akVar2 = agVar.f183263f;
                if (akVar2 == null) {
                    akVar2 = C67442ak.f183276i;
                }
                Long valueOf2 = Long.valueOf(duration.plus(Duration.m71141of(akVar2.f183280c, ChronoUnit.MICROS)).toNanos());
                C37215b bVar2 = doVar.f42211b;
                if (z) {
                    gVar2 = C37179a.f97620dg;
                } else {
                    gVar2 = C37179a.f97621dh;
                }
                bVar2.mo19974a(gVar2.mo40811d(valueOf2.longValue()));
            }
            long j5 = agVar.f183267j;
            if (j5 <= 0) {
                return null;
            }
            Long valueOf3 = Long.valueOf(duration.plusMillis(j5).toNanos());
            C37215b bVar3 = doVar.f42211b;
            if (z) {
                gVar = C37179a.f97490bI;
            } else {
                gVar = C37179a.f97491bJ;
            }
            bVar3.mo19974a(gVar.mo40811d(valueOf3.longValue()));
            return null;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C13863do.f42210a.mo56226d()).mo56382g(e)).mo56372aa(45082)).mo56386p("[Speech Event] Could not log speech end");
            return null;
        }
    }
}
