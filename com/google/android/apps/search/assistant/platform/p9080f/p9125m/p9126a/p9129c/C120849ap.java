package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.libraries.search.p2904c.C37611fw;
import com.google.android.libraries.search.p2904c.C37612fx;
import com.google.android.libraries.search.p2904c.p2952o.C37904a;
import com.google.android.libraries.search.p2904c.p2952o.C37907b;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38287c;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38289e;
import com.google.android.libraries.search.p3055n.C39664cr;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60944c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67041iw;
import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67046ja;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67095kw;
import com.google.speech.p5218j.C67098kz;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5223d.C66883b;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5548c.C71143c;
import p5535j.p5536a.p5545c.p5548c.C71152f;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ap */
/* compiled from: PG */
public final /* synthetic */ class C120849ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C120851ar f336037a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f336038b;

    public /* synthetic */ C120849ap(C120851ar arVar, C67087ko koVar) {
        this.f336037a = arVar;
        this.f336038b = koVar;
    }

    public final void run() {
        Object obj;
        C67042ix ixVar;
        C120851ar arVar = this.f336037a;
        C67087ko koVar = this.f336038b;
        arVar.f336042c.mo54591h(koVar);
        int i = koVar.f182368a;
        if ((i & 2) != 0) {
            C67083kk kkVar = koVar.f182370c;
            if (kkVar == null) {
                kkVar = C67083kk.f182351g;
            }
            if (kkVar.f182354b != 2 || !arVar.f336045f) {
                C67083kk kkVar2 = koVar.f182370c;
                if (kkVar2 == null) {
                    kkVar2 = C67083kk.f182351g;
                }
                if (kkVar2.f182354b == 1) {
                    arVar.f336043d.f336064b.mo19974a(C37176a.f97176gc);
                    C59104x b = C120851ar.f336040a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
                    ((C59052c) ((C59052c) b).mo56372aa(35626)).mo56386p("#handleRecognitionEvent: final recognition result received from SODA.");
                    C67083kk kkVar3 = koVar.f182370c;
                    if (kkVar3 == null) {
                        kkVar3 = C67083kk.f182351g;
                    }
                    if (kkVar3.f182354b == 1) {
                        ixVar = (C67042ix) kkVar3.f182355c;
                    } else {
                        ixVar = C67042ix.f182227l;
                    }
                    C59104x b2 = C120851ar.f336040a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
                    ((C59052c) ((C59052c) b2).mo56372aa(35632)).mo56386p("Storing audio after final recognition.");
                    C67171p pVar = ixVar.f182234f;
                    if (pVar == null) {
                        pVar = C67171p.f182575e;
                    }
                    C38289e eVar = arVar.f336047h;
                    C37611fw fwVar = (C37611fw) C37612fx.f99944d.createBuilder();
                    C67175t tVar = pVar.f182579c;
                    if (tVar == null) {
                        tVar = C67175t.f182588e;
                    }
                    int i2 = tVar.f182593d;
                    fwVar.copyOnWrite();
                    C37612fx fxVar = (C37612fx) fwVar.instance;
                    fxVar.f99946a = 2 | fxVar.f99946a;
                    fxVar.f99948c = i2;
                    C67175t tVar2 = pVar.f182579c;
                    if (tVar2 == null) {
                        tVar2 = C67175t.f182588e;
                    }
                    int i3 = tVar2.f182592c;
                    fwVar.copyOnWrite();
                    C37612fx fxVar2 = (C37612fx) fwVar.instance;
                    fxVar2.f99946a |= 1;
                    fxVar2.f99947b = i3;
                    C62940bt btVar = C37907b.f100488e;
                    C37904a aVar = (C37904a) C37907b.f100487d.createBuilder();
                    C67095kw kwVar = ixVar.f182237i;
                    if (kwVar == null) {
                        kwVar = C67095kw.f182399i;
                    }
                    long j = kwVar.f182402b;
                    aVar.copyOnWrite();
                    C37907b bVar = (C37907b) aVar.instance;
                    bVar.f100490a |= 1;
                    bVar.f100491b = j;
                    Iterable iterable = (Iterable) Collection.EL.stream(ixVar.f182231c).map(new C120847an(ixVar)).collect(C58370cn.f155946a);
                    aVar.copyOnWrite();
                    C37907b bVar2 = (C37907b) aVar.instance;
                    C62964ck ckVar = bVar2.f100492c;
                    if (!ckVar.mo58948c()) {
                        bVar2.f100492c = C62942bv.mutableCopy(ckVar);
                    }
                    C62947c.addAll(iterable, (List) bVar2.f100492c);
                    fwVar.mo58885m(btVar, (C37907b) aVar.build());
                    C38287c a = eVar.mo41359a((C37612fx) fwVar.build());
                    a.mo41358b(pVar.f182578b);
                    a.mo41357a();
                    if ((ixVar.f182229a & 64) != 0) {
                        int i4 = ixVar.f182236h;
                        int a2 = C67041iw.m97416a(i4);
                        if (a2 == 0 || a2 != 6) {
                            int a3 = C67041iw.m97416a(i4);
                            if (a3 != 0 && a3 == 5) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (ixVar.f182230b.size() == 0 || ((String) ixVar.f182230b.get(0)).isEmpty()) {
                        arVar.f336041b.mo104955c(1);
                    } else {
                        arVar.f336041b.mo104954b(koVar);
                        Optional d = arVar.mo104947d();
                        if (d.isPresent()) {
                            C67095kw kwVar2 = ixVar.f182237i;
                            if (kwVar2 == null) {
                                kwVar2 = C67095kw.f182399i;
                            }
                            if ((kwVar2.f182401a & 128) != 0) {
                                Duration ofMillis = Duration.ofMillis(kwVar2.f182406f);
                                arVar.f336041b.mo104953a(ofMillis, ((Duration) d.get()).plus(ofMillis), C67098kz.SODA_TRUE_EOQ);
                            }
                            int i5 = kwVar2.f182401a;
                            if ((i5 & 512) != 0) {
                                Duration e = C60944c.m93092e(kwVar2.f182408h);
                                arVar.f336041b.mo104953a(e, ((Duration) d.get()).plus(e), C67098kz.SODA_NATIVE);
                            } else if ((i5 & 8) != 0) {
                                Duration e2 = C60944c.m93092e(kwVar2.f182404d);
                                arVar.f336041b.mo104953a(e2, ((Duration) d.get()).plus(e2), C67098kz.SODA_ENDPOINTER_FALLBACK);
                            }
                        }
                    }
                    arVar.mo104948e(C120510g.FINAL_RECOGNITION);
                    arVar.f336046g.mo5437b((Object) null);
                    return;
                }
                arVar.f336041b.mo104954b(koVar);
                return;
            }
            arVar.f336043d.f336064b.mo19974a(C37176a.f97175gb);
            arVar.f336045f = false;
            arVar.f336041b.mo104954b(koVar);
        } else if ((i & 8) != 0) {
            arVar.f336041b.mo104954b(koVar);
            C67038it itVar = koVar.f182372e;
            if (itVar == null) {
                itVar = C67038it.f182220d;
            }
            C67037is a4 = C67037is.m97413a(itVar.f182223b);
            if (a4 == null) {
                a4 = C67037is.START_OF_SPEECH;
            }
            if (!a4.equals(C67037is.END_OF_SPEECH)) {
                C67037is a5 = C67037is.m97413a(itVar.f182223b);
                if (a5 == null) {
                    a5 = C67037is.START_OF_SPEECH;
                }
                if (a5.equals(C67037is.START_OF_SPEECH)) {
                    arVar.f336043d.f336064b.mo19974a(C37176a.f97120fZ);
                    return;
                }
                return;
            }
            arVar.f336043d.f336064b.mo19974a(C37176a.f97174ga);
        } else {
            if ((i & 32768) != 0) {
                C67046ja jaVar = koVar.f182378k;
                if (jaVar == null) {
                    jaVar = C67046ja.f182243i;
                }
                if (jaVar.f182246b) {
                    C59104x b3 = C120851ar.f336040a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
                    ((C59052c) ((C59052c) b3).mo56372aa(35627)).mo56386p("#handleSodaEvent: hotmatch matched, stop current ASR session.");
                    C120861ba baVar = arVar.f336043d;
                    C67046ja jaVar2 = koVar.f182378k;
                    if (jaVar2 == null) {
                        jaVar2 = C67046ja.f182243i;
                    }
                    C37215b bVar3 = baVar.f336064b;
                    C37258g gVar = C37176a.f97179gf;
                    C62940bt btVar2 = C71152f.f189814g;
                    C71143c cVar = (C71143c) C71152f.f189813f.createBuilder();
                    C66883b a6 = C120861ba.f336063a.apply(jaVar2);
                    cVar.copyOnWrite();
                    C71152f fVar = (C71152f) cVar.instance;
                    a6.getClass();
                    fVar.f189819d = a6;
                    fVar.f189816a |= 4;
                    bVar3.mo19974a(gVar.mo40812e(btVar2, (C71152f) cVar.build()));
                    arVar.f336041b.mo104955c(2);
                    arVar.mo104948e(C120510g.NO_SPEECH_DETECTED);
                    arVar.f336046g.mo5437b((Object) null);
                    return;
                }
            }
            C62940bt r2 = C62942bv.checkIsLite(C39664cr.f104411d);
            koVar.mo58887l(r2);
            if (koVar.f169962ag.mo58857o(r2.f169971d)) {
                C62940bt r22 = C62942bv.checkIsLite(C39664cr.f104411d);
                koVar.mo58887l(r22);
                Object l = koVar.f169962ag.mo58854l(r22.f169971d);
                if (l == null) {
                    obj = r22.f169969b;
                } else {
                    obj = r22.mo58889c(l);
                }
                if ((((C39664cr) obj).f104413a & 1) != 0) {
                    arVar.mo104949f();
                }
            }
        }
    }
}
