package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.assistant.libraries.p8956c.p8957a.C119256b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17268f;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60944c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a.C65482b;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5218j.C67039iu;
import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67065jt;
import com.google.speech.p5218j.C67066ju;
import com.google.speech.p5218j.C67078kf;
import com.google.speech.p5218j.C67079kg;
import com.google.speech.p5218j.C67080kh;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67098kz;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ew */
/* compiled from: PG */
final class C120329ew implements C17268f {

    /* renamed from: c */
    private static final C59071e f334768c = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.b.a.ew");

    /* renamed from: a */
    public final C60870cx f334769a;

    /* renamed from: b */
    public C2164c f334770b;

    /* renamed from: d */
    private final C120260cr f334771d;

    /* renamed from: e */
    private final C120342fi f334772e;

    /* renamed from: f */
    private final C120284dl f334773f;

    /* renamed from: g */
    private final C60870cx f334774g;

    /* renamed from: h */
    private final C120252cj f334775h;

    /* renamed from: i */
    private final C120227bq f334776i;

    /* renamed from: j */
    private final C120325es f334777j;

    /* renamed from: k */
    private boolean f334778k = false;

    public C120329ew(Executor executor, C120260cr crVar, C120342fi fiVar, C120284dl dlVar, C60870cx cxVar, C120252cj cjVar, C120227bq bqVar, C120325es esVar) {
        this.f334771d = crVar;
        this.f334772e = fiVar;
        this.f334773f = dlVar;
        this.f334774g = cxVar;
        this.f334775h = cjVar;
        this.f334776i = bqVar;
        this.f334777j = esVar;
        C60870cx a = C2169h.m6027a(new C120327eu(this));
        this.f334769a = a;
        ((C2168g) a).f6144b.mo4106b(C47810es.m84977q(new C120328ev(fiVar)), executor);
    }

    /* renamed from: d */
    private final Optional m199332d() {
        try {
            return (Optional) C60856cj.m92909r(((C120511h) C60856cj.m92909r(this.f334774g)).mo104769b());
        } catch (CancellationException | ExecutionException e) {
            C59104x c = f334768c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(34701)).mo56386p("#getMicOpenElapsedRealtime: could not getMicOpenElapsedRealtime: the microphone is not yet open or failed to open.");
            return Optional.empty();
        }
    }

    /* renamed from: e */
    private static String m199333e(List list) {
        if (!list.isEmpty()) {
            return ((C67468p) list.get(0)).f183367b;
        }
        C59104x d = f334768c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        ((C59052c) ((C59052c) d).mo56372aa(34702)).mo56386p("Hypotheses is empty");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final void mo23256a() {
        this.f334771d.mo104715b(1);
        this.f334770b.mo5437b((Object) null);
    }

    /* renamed from: b */
    public final void mo23257b(Throwable th) {
        C65482b bVar;
        C120325es esVar = this.f334777j;
        C58976aa aaVar = C58975e.f156826a;
        esVar.f334763f.mo5437b(false);
        Optional a = C119256b.f332583a.mo104261a(th);
        C2164c cVar = this.f334770b;
        if (a.isPresent()) {
            th = (Throwable) a.get();
        } else {
            C34834b bVar2 = C34830d.m63595b(th).f92362c;
            if (bVar2 == null) {
                bVar2 = C34834b.f92401c;
            }
            if (C34830d.m63596c(C34819a.m63579b(bVar2))) {
                C59104x d = f334768c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                C95883aa.m158984e(d, "S3 speech recognition failed with low quality classification", 34703, C38505d.f101864b, 188759967, th);
                Status.Code code = Status.Code.OK;
                int ordinal = Status.m102100d(th).getCode().ordinal();
                if (ordinal == 1) {
                    bVar = C65482b.SPEECH_RECOGNITION_S3_GRPC_CANCELLED;
                } else if (ordinal == 3) {
                    bVar = C65482b.SPEECH_RECOGNITION_S3_GRPC_INVALID_ARGUMENT;
                } else if (ordinal == 14) {
                    bVar = C65482b.SPEECH_RECOGNITION_S3_GRPC_UNAVAILABLE;
                } else if (th instanceof IOException) {
                    bVar = C65482b.SPEECH_RECOGNITION_S3_IO_EXCEPTION;
                } else {
                    bVar = C65482b.SPEECH_RECOGNITION_S3_GENERIC_ERROR;
                }
                th = new C120236bz("S3 speech recognition failed", bVar, th);
            }
        }
        cVar.mo5439d(th);
    }

    /* renamed from: c */
    public final void mo23258c(C66611ci ciVar) {
        Object obj;
        C67098kz kzVar;
        Duration duration;
        Duration duration2;
        C62940bt r0 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r0);
        Object l = ciVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C67238p pVar = (C67238p) obj;
        if (pVar.f182740b == 1) {
            C67438ag agVar = (C67438ag) pVar.f182741c;
            Optional of = (pVar.f182739a & 8192) != 0 ? Optional.m71637of(pVar.f182742d) : Optional.empty();
            if ((agVar.f183258a & 8) != 0) {
                if (!this.f334778k) {
                    this.f334776i.f334569a.mo19974a(C37176a.f96916bh);
                    this.f334778k = true;
                }
                C120816a aVar = this.f334771d.f334627c;
                C67080kh khVar = (C67080kh) C67083kk.f182351g.createBuilder();
                C67476x xVar = agVar.f183262e;
                if (xVar == null) {
                    xVar = C67476x.f183390i;
                }
                C62971cq<C67474v> cqVar = xVar.f183393b;
                C67065jt jtVar = (C67065jt) C67066ju.f182302g.createBuilder();
                for (C67474v vVar : cqVar) {
                    String str = vVar.f183387b;
                    jtVar.copyOnWrite();
                    C67066ju juVar = (C67066ju) jtVar.instance;
                    str.getClass();
                    C62971cq cqVar2 = juVar.f182305b;
                    if (!cqVar2.mo58948c()) {
                        juVar.f182305b = C62942bv.mutableCopy(cqVar2);
                    }
                    juVar.f182305b.add(str);
                }
                C67066ju juVar2 = (C67066ju) jtVar.build();
                khVar.copyOnWrite();
                C67083kk kkVar = (C67083kk) khVar.instance;
                juVar2.getClass();
                kkVar.f182355c = juVar2;
                kkVar.f182354b = 2;
                if (of.isPresent()) {
                    String str2 = (String) of.get();
                    khVar.copyOnWrite();
                    C67083kk kkVar2 = (C67083kk) khVar.instance;
                    str2.getClass();
                    kkVar2.f182353a |= 32;
                    kkVar2.f182358f = str2;
                }
                C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
                knVar.copyOnWrite();
                C67087ko koVar = (C67087ko) knVar.instance;
                C67083kk kkVar3 = (C67083kk) khVar.build();
                kkVar3.getClass();
                koVar.f182370c = kkVar3;
                koVar.f182368a |= 2;
                aVar.mo104868a((C67087ko) knVar.build());
            }
            if ((agVar.f183258a & 32) != 0) {
                C67442ak akVar = agVar.f183264g;
                if (akVar == null) {
                    akVar = C67442ak.f183276i;
                }
                String e = m199333e(akVar.f183281d);
                C120816a aVar2 = this.f334771d.f334627c;
                C67086kn knVar2 = (C67086kn) C67087ko.f182366n.createBuilder();
                C67080kh khVar2 = (C67080kh) C67083kk.f182351g.createBuilder();
                C67078kf kfVar = (C67078kf) C67079kg.f182340h.createBuilder();
                kfVar.mo59768a(e);
                khVar2.copyOnWrite();
                C67083kk kkVar4 = (C67083kk) khVar2.instance;
                C67079kg kgVar = (C67079kg) kfVar.build();
                kgVar.getClass();
                kkVar4.f182355c = kgVar;
                kkVar4.f182354b = 4;
                knVar2.copyOnWrite();
                C67087ko koVar2 = (C67087ko) knVar2.instance;
                C67083kk kkVar5 = (C67083kk) khVar2.build();
                kkVar5.getClass();
                koVar2.f182370c = kkVar5;
                koVar2.f182368a |= 2;
                aVar2.mo104868a((C67087ko) knVar2.build());
            }
            if ((agVar.f183258a & 16) != 0) {
                this.f334776i.f334569a.mo19974a(C37176a.f96917bi);
                C67442ak akVar2 = agVar.f183263f;
                if (akVar2 == null) {
                    akVar2 = C67442ak.f183276i;
                }
                String e2 = m199333e(akVar2.f183281d);
                if (e2.isEmpty()) {
                    this.f334775h.mo104710c();
                    this.f334771d.mo104715b(1);
                } else {
                    C120260cr crVar = this.f334771d;
                    Optional d = m199332d();
                    if ((agVar.f183258a & 16) != 0 && d.isPresent()) {
                        C67442ak akVar3 = agVar.f183263f;
                        if (akVar3 == null) {
                            akVar3 = C67442ak.f183276i;
                        }
                        Duration duration3 = Duration.ZERO;
                        if ((akVar3.f183278a & 256) != 0 && akVar3.f183283f) {
                            duration3 = Duration.ofMillis(agVar.f183265h);
                        }
                        if ((agVar.f183258a & 4096) != 0) {
                            Duration minus = Duration.ofMillis(agVar.f183266i).minus(duration3);
                            crVar.mo104714a(minus, ((Duration) d.get()).plus(minus), C67098kz.S3_TRUE_EOQ);
                        }
                        if (akVar3.f183281d.size() <= 0 || (((C67468p) akVar3.f183281d.get(0)).f183366a & 8192) == 0) {
                            duration2 = C60944c.m93092e(akVar3.f183280c).minus(duration3);
                            duration = ((Duration) d.get()).plus(duration2);
                            kzVar = C67098kz.S3_ENDPOINTER_FALLBACK;
                        } else {
                            duration2 = C60944c.m93092e((long) ((C67468p) akVar3.f183281d.get(0)).f183370e).minus(duration3);
                            duration = ((Duration) d.get()).plus(duration2);
                            kzVar = C67098kz.S3_NATIVE;
                        }
                        crVar.mo104714a(duration2, duration, kzVar);
                    }
                    C120260cr crVar2 = this.f334771d;
                    if (!crVar2.f334628d.getAndSet(true)) {
                        C120816a aVar3 = crVar2.f334627c;
                        C67080kh khVar3 = (C67080kh) C67083kk.f182351g.createBuilder();
                        C67039iu iuVar = (C67039iu) C67042ix.f182227l.createBuilder();
                        iuVar.mo59766a(e2);
                        iuVar.copyOnWrite();
                        C67042ix ixVar = (C67042ix) iuVar.instance;
                        ixVar.f182238j = 0;
                        ixVar.f182229a |= 2048;
                        khVar3.copyOnWrite();
                        C67083kk kkVar6 = (C67083kk) khVar3.instance;
                        C67042ix ixVar2 = (C67042ix) iuVar.build();
                        ixVar2.getClass();
                        kkVar6.f182355c = ixVar2;
                        kkVar6.f182354b = 1;
                        if (of.isPresent()) {
                            String str3 = (String) of.get();
                            khVar3.copyOnWrite();
                            C67083kk kkVar7 = (C67083kk) khVar3.instance;
                            str3.getClass();
                            kkVar7.f182353a |= 32;
                            kkVar7.f182358f = str3;
                        }
                        C67086kn knVar3 = (C67086kn) C67087ko.f182366n.createBuilder();
                        knVar3.copyOnWrite();
                        C67087ko koVar3 = (C67087ko) knVar3.instance;
                        C67083kk kkVar8 = (C67083kk) khVar3.build();
                        kkVar8.getClass();
                        koVar3.f182370c = kkVar8;
                        koVar3.f182368a |= 2;
                        aVar3.mo104868a((C67087ko) knVar3.build());
                    }
                }
                this.f334770b.mo5437b((Object) null);
            }
        }
        if (pVar.f182740b == 2) {
            C67464l lVar = (C67464l) pVar.f182741c;
            C120284dl dlVar = this.f334773f;
            C67463k a = C67463k.m97475a(lVar.f183359b);
            if (a == null) {
                a = C67463k.START_OF_SPEECH;
            }
            if (a == C67463k.START_OF_SPEECH) {
                dlVar.f334676b.f334569a.mo19974a(C37176a.f96926br);
                dlVar.f334675a.mo23226b(C120284dl.m199257a(lVar));
            } else {
                C67463k a2 = C67463k.m97475a(lVar.f183359b);
                if (a2 == null) {
                    a2 = C67463k.START_OF_SPEECH;
                }
                if (a2 == C67463k.END_OF_SPEECH) {
                    dlVar.f334676b.f334569a.mo19974a(C37176a.f96927bs);
                    dlVar.f334675a.mo23225a(C120284dl.m199257a(lVar));
                }
            }
            C67463k a3 = C67463k.m97475a(lVar.f183359b);
            if (a3 == null) {
                a3 = C67463k.START_OF_SPEECH;
            }
            if (a3 == C67463k.END_OF_AUDIO) {
                this.f334776i.f334569a.mo19974a(C37176a.f96928bt);
                this.f334772e.mo104725d(C120510g.END_OF_AUDIO);
            }
        }
    }
}
