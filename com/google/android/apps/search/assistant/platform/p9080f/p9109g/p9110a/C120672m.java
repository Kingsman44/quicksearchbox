package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.apps.gsa.binaries.satin.app.avl;
import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119833ca;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9080f.p9092d.C120531a;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120692g;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120693h;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120694i;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120700o;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120783a;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120813f;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127404a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32873s;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2572a.p2573a.C33437e;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33442b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33443c;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2584f.C33475c;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.speech.p5218j.C67039iu;
import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67080kh;
import com.google.speech.p5218j.C67083kk;
import dagger.hilt.C68286a;
import java.util.Random;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.m */
/* compiled from: PG */
public final class C120672m implements C120692g {

    /* renamed from: a */
    public final Executor f335637a;

    /* renamed from: b */
    public final C119259a f335638b = new C119259a(Optional.empty());

    /* renamed from: c */
    public boolean f335639c;

    /* renamed from: d */
    private final C120674n f335640d;

    /* renamed from: e */
    private final C33443c f335641e;

    /* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.m$a */
    /* compiled from: PG */
    public interface C120673a {
        /* renamed from: g */
        C120531a mo104879g();

        /* renamed from: i */
        C120682v mo104880i();

        /* renamed from: l */
        C33447g mo104881l();
    }

    public C120672m(Executor executor, C33443c cVar, C33437e eVar, C120674n nVar) {
        this.f335637a = new C60904dr(executor);
        this.f335641e = cVar;
        this.f335640d = nVar;
        eVar.mo38840a(new C120666g(this));
    }

    /* renamed from: a */
    public final C60870cx mo104876a(C120695j jVar) {
        return C60856cj.m92904m(C47810es.m84978r(new C120670k(this, jVar)), this.f335637a);
    }

    /* renamed from: b */
    public final C119259a mo104877b() {
        return this.f335638b;
    }

    /* renamed from: c */
    public final C120678r mo104878c(C120695j jVar) {
        C60870cx cxVar;
        C120811d dVar;
        C120811d dVar2;
        C52078ek ekVar;
        if (!this.f335639c) {
            if (jVar.f335684d == null) {
                C120693h hVar = (C120693h) jVar.toBuilder();
                C120674n nVar = this.f335640d;
                long nextLong = new Random().nextLong();
                synchronized (nVar.f335643b) {
                    long j = nVar.f335642a;
                    if (nextLong == j) {
                        nextLong = 1 + j;
                    }
                    nVar.f335642a = nextLong;
                }
                C119833ca caVar = (C119833ca) C119834cb.f333765b.createBuilder();
                String b = C39191a.m68623b(nextLong);
                caVar.copyOnWrite();
                b.getClass();
                ((C119834cb) caVar.instance).f333767a = b;
                C119834cb cbVar = (C119834cb) caVar.build();
                hVar.copyOnWrite();
                cbVar.getClass();
                ((C120695j) hVar.instance).f335684d = cbVar;
                jVar = (C120695j) hVar.build();
            }
            C47558bi a = C47831fm.m85006a("InteractionController onAnotherActivityRequested");
            try {
                ((Optional) this.f335638b.f332586a.get()).map(C120667h.f335630a).ifPresent(C120668i.f335631a);
                a.close();
                C47558bi a2 = C47831fm.m85006a("InteractionController startUtterance");
                try {
                    C120648ab abVar = new C120648ab(jVar);
                    avl avl = (avl) this.f335641e.f89544a.mo17428b();
                    avl.getClass();
                    C120678r rVar = new C120678r(new C33442b(abVar, avl));
                    this.f335638b.mo104263a(Optional.m71637of(rVar));
                    C120673a aVar = (C120673a) C68286a.m98629a(rVar.f335645b.f89543a, C120673a.class);
                    aVar.mo104881l().mo38849b(new C120669j(this, rVar));
                    C120682v i = aVar.mo104880i();
                    C119935d dVar3 = i.f335658h;
                    C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
                    C32873s sVar = C32873s.f88105a;
                    ajVar.copyOnWrite();
                    C32796ar arVar = (C32796ar) ajVar.instance;
                    sVar.getClass();
                    arVar.f87976b = sVar;
                    arVar.f87975a = 6;
                    C60856cj.m92911t(dVar3.mo104562a((C32796ar) ajVar.build(), true), C47810es.m84974n(new C120681u(i)), C60826bg.f164896a);
                    i.f335654d.f335622b.mo19974a(C37176a.f96814L);
                    C120647aa aaVar = i.f335657g;
                    aaVar.f335586a.mo38878a("Interaction Id:", aaVar.f335587b.f333767a);
                    aaVar.f335586a.mo38878a("Is Reopening Mic:", String.valueOf(aaVar.f335588c.f335685e));
                    C33475c cVar = aaVar.f335586a;
                    int a3 = C120694i.m199841a(aaVar.f335588c.f335682b);
                    String str = a3 != 1 ? a3 != 2 ? a3 != 3 ? "null" : "INPUT_NOT_SET" : "ONE_OFF" : "SPEECH";
                    if (a3 != 0) {
                        cVar.mo38878a("InteractionStart Input Case:", str);
                        aaVar.f335586a.mo38878a("Hotword Detected Event Present:", String.valueOf(aaVar.f335589d.isPresent()));
                        C120695j jVar2 = i.f335655e;
                        int i2 = jVar2.f335682b;
                        int a4 = C120694i.m199841a(i2);
                        int i3 = a4 - 1;
                        if (a4 != 0) {
                            if (i3 == 0) {
                                C59104x b2 = C120682v.f335651a.mo56224b();
                                b2.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
                                ((C59052c) ((C59052c) b2).mo56372aa(35551)).mo56386p("Start to handle voice interaction request.");
                                cxVar = ((C120657ak) i.f335652b.mo27525b()).mo104869b();
                            } else if (i3 != 1) {
                                cxVar = C60856cj.m92899h(new IllegalArgumentException("Unimplemented Assistant activity type"));
                            } else {
                                if (!jVar2.f335689i) {
                                    if (i2 == 3) {
                                        dVar2 = (C120811d) jVar2.f335683c;
                                    } else {
                                        dVar2 = C120811d.f335965c;
                                    }
                                    if (dVar2.f335967a == 2) {
                                        C120813f fVar = (C120813f) dVar2.f335968b;
                                        if (fVar.f335971a.size() == 1 && ((C52083ep) fVar.f335971a.get(0)).f136692b == 3) {
                                            C52083ep epVar = (C52083ep) fVar.f335971a.get(0);
                                            if (epVar.f136692b == 3) {
                                                ekVar = (C52078ek) epVar.f136693c;
                                            } else {
                                                ekVar = C52078ek.f136671f;
                                            }
                                            if (ekVar.f136674b == 5) {
                                                C51805du duVar = (C51805du) ekVar.f136675c;
                                                if (duVar.f135929d.containsKey("text_input_params")) {
                                                    C120686z zVar = i.f335656f;
                                                    C62995dn dnVar = duVar.f135929d;
                                                    if (dnVar.containsKey("text_input_params")) {
                                                        C52230ka kaVar = (C52230ka) dnVar.get("text_input_params");
                                                        C67080kh khVar = (C67080kh) C67083kk.f182351g.createBuilder();
                                                        C67039iu iuVar = (C67039iu) C67042ix.f182227l.createBuilder();
                                                        iuVar.mo59766a(((C51682amp) C127404a.f350819a.mo38880b(kaVar)).f135387b);
                                                        khVar.copyOnWrite();
                                                        C67083kk kkVar = (C67083kk) khVar.instance;
                                                        C67042ix ixVar = (C67042ix) iuVar.build();
                                                        ixVar.getClass();
                                                        kkVar.f182355c = ixVar;
                                                        kkVar.f182354b = 1;
                                                        zVar.mo104890e(C120700o.m199846d((C67083kk) khVar.build()));
                                                    } else {
                                                        throw new IllegalArgumentException();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C120783a aVar2 = (C120783a) i.f335653c.mo27525b();
                                C120695j jVar3 = i.f335655e;
                                if (jVar3.f335682b == 3) {
                                    dVar = (C120811d) jVar3.f335683c;
                                } else {
                                    dVar = C120811d.f335965c;
                                }
                                aVar2.mo104933b(dVar, true);
                                C59104x b3 = C120682v.f335651a.mo56224b();
                                b3.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
                                ((C59052c) ((C59052c) b3).mo56372aa(35552)).mo56386p("Start to handle ClientInput interaction request.");
                                cxVar = ((C120783a) i.f335653c.mo27525b()).mo104932a();
                            }
                            C60856cj.m92911t(cxVar, C47810es.m84974n(new C120680t(i)), C60826bg.f164896a);
                            i.f335661k.mo38849b(new C120679s(i, cxVar));
                            a2.close();
                            return rVar;
                        }
                        throw null;
                    }
                    throw null;
                } catch (C62974ct e) {
                    C59104x c = C120686z.f335667a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(35553)).mo56386p("Unable to parse text query from ClientInput");
                } catch (Throwable th) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        C120662c.m199813a(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                C120662c.m199813a(th, th3);
            }
        } else {
            throw new IllegalStateException("Configuration was shut down");
        }
        throw th;
    }
}
