package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import android.util.Base64;
import com.google.android.apps.gsa.nga.api.a.cb;
import com.google.android.apps.gsa.nga.api.a.cd;
import com.google.android.apps.gsa.nga.api.a.y;
import com.google.android.apps.gsa.nga.api.p5883a.C74675ca;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a.C95662k;
import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95214aa;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95770bh;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95771bi;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c.C95791b;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124526g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142523o;
import com.google.android.p10712d.C142524p;
import com.google.assistant.p3897e.p3921j.C52409qr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60057jf;
import com.google.common.p4552o.C60087kg;
import com.google.common.p4552o.C60091kk;
import com.google.common.p4552o.C60092kl;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.k */
/* compiled from: PG */
public final /* synthetic */ class C95048k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95051n f265904a;

    /* renamed from: b */
    public final /* synthetic */ cb f265905b;

    public /* synthetic */ C95048k(C95051n nVar, cb cbVar) {
        this.f265904a = nVar;
        this.f265905b = cbVar;
    }

    public final void run() {
        y yVar;
        y yVar2;
        y yVar3;
        cd cdVar;
        cd cdVar2;
        cd cdVar3;
        C52409qr qrVar;
        C95051n nVar = this.f265904a;
        cb cbVar = this.f265905b;
        C37672hs hsVar = cbVar.c;
        if (hsVar == null) {
            hsVar = C37672hs.f100056c;
        }
        if (cbVar.c == null || nVar.f265923m.containsKey(hsVar)) {
            C95045h hVar = nVar.f265925o;
            int i = cbVar.a;
            int a = C74675ca.m120745a(i);
            int i2 = a - 1;
            if (a != 0) {
                switch (i2) {
                    case 0:
                        if (i == 2) {
                            yVar = (y) cbVar.b;
                        } else {
                            yVar = y.i;
                        }
                        if ((yVar.a == 2 || !yVar.h) && !yVar.b) {
                            C59104x c = C95051n.f265910a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "DialogHandler");
                            ((C59052c) ((C59052c) c).mo56372aa(18115)).mo56386p("HotwordVerified failed");
                            if (nVar.f265924n.isPresent()) {
                                C95832d dVar = (C95832d) nVar.f265924n.get();
                                if (cbVar.a == 2) {
                                    yVar3 = (y) cbVar.b;
                                } else {
                                    yVar3 = y.i;
                                }
                                dVar.mo89811l(C95832d.m158872a(yVar3));
                                if (nVar.f265916f.size() > 1) {
                                    C59104x d = C95051n.f265910a.mo56226d();
                                    d.mo56378ag(C58975e.f156826a, "DialogHandler");
                                    ((C59052c) ((C59052c) d).mo56372aa(18116)).mo56386p("possibly ambiguous non-detection");
                                }
                            }
                            nVar.f265918h = Optional.empty();
                            return;
                        }
                        C59104x b = C95051n.f265910a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "DialogHandler");
                        ((C59052c) ((C59052c) b).mo56372aa(18117)).mo56389s("Hotword invocation with ID: %s was verified.", hsVar);
                        if (nVar.f265914d.mo89026d()) {
                            nVar.f265914d.mo89023b();
                        }
                        nVar.mo88981u(3);
                        nVar.f265917g.mo89292e(nVar.f265915e);
                        if (cbVar.c != null) {
                            nVar.f265918h = Optional.m71637of(hsVar);
                            if (nVar.mo88982v()) {
                                C95832d r = nVar.mo88978r();
                                if (cbVar.a == 2) {
                                    yVar2 = (y) cbVar.b;
                                } else {
                                    yVar2 = y.i;
                                }
                                r.mo89804e(C60091kk.HOTWORD_RECOGNIZED_SECOND_STAGE, C95832d.m158872a(yVar2));
                            }
                        } else {
                            nVar.f265918h = Optional.empty();
                        }
                        nVar.f265915e.mo89277r(5);
                        return;
                    case 1:
                        nVar.mo88981u(1);
                        return;
                    case 2:
                        if (nVar.f265913c.mo83553h("bistoSpeechTestingMode")) {
                            C59104x b2 = C95051n.f265910a.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "DialogHandler");
                            C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(18114);
                            if (cbVar.a == 4) {
                                cdVar3 = (cd) cbVar.b;
                            } else {
                                cdVar3 = cd.b;
                            }
                            cVar.mo56389s("Recognized Text: %s", cdVar3.a);
                        } else {
                            C58976aa aaVar = C58975e.f156826a;
                            if (cbVar.a == 4) {
                                cdVar2 = (cd) cbVar.b;
                            } else {
                                cdVar2 = cd.b;
                            }
                            String str = cdVar2.a;
                            C90476a aVar = C90754k.f253829b;
                            C90476a aVar2 = C90754k.f253829b;
                            C90753j.m148239a(str);
                        }
                        if (hVar != null) {
                            if (cbVar.a == 4) {
                                cdVar = (cd) cbVar.b;
                            } else {
                                cdVar = cd.b;
                            }
                            hVar.mo88976k(cdVar.a);
                            nVar.f265919i = false;
                        }
                        if (nVar.mo88982v()) {
                            nVar.mo88978r().mo89805f(C60091kk.HOTWORD_QUERY_STARTED, (C60057jf) null, (C60087kg) C60092kl.f162479k.createBuilder(), (String) null);
                        }
                        nVar.f265915e.mo89277r(6);
                        return;
                    case 3:
                        if (!nVar.f265920j) {
                            nVar.mo88981u(4);
                            Integer num = (Integer) nVar.f265923m.get(hsVar);
                            C95045h hVar2 = nVar.f265925o;
                            if (hVar2 == null) {
                                return;
                            }
                            if (nVar.f265921k) {
                                C59104x b3 = C95051n.f265910a.mo56224b();
                                b3.mo56378ag(C58975e.f156826a, "DialogHandler");
                                ((C59052c) ((C59052c) b3).mo56372aa(18112)).mo56386p("No speech suppressed");
                                return;
                            } else if (num == null || !num.equals(3)) {
                                C59104x b4 = C95051n.f265910a.mo56224b();
                                b4.mo56378ag(C58975e.f156826a, "DialogHandler");
                                ((C59052c) ((C59052c) b4).mo56372aa(18109)).mo56386p("No speech edu prompt");
                                hVar2.mo88975j();
                                return;
                            } else {
                                C124548d s = nVar.mo88979s();
                                if (s == null || C124526g.m203994b(s)) {
                                    C59104x b5 = C95051n.f265910a.mo56224b();
                                    b5.mo56378ag(C58975e.f156826a, "DialogHandler");
                                    ((C59052c) ((C59052c) b5).mo56372aa(18110)).mo56386p("No speech fetch");
                                    C95771bi biVar = (C95771bi) hVar2;
                                    C95294af a2 = biVar.f268163g.mo89222a();
                                    C95662k kVar = biVar.f268168l;
                                    if (kVar == null) {
                                        C89655j.m145957a("No button handler");
                                        return;
                                    } else if (kVar.mo89630b(a2, new C95770bh(biVar))) {
                                        biVar.f268166j.mo89667b(C58485gu.m89846n(C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT), C142359ck.EXPAND_ANNOUNCEMENT, biVar.mo89760b());
                                        return;
                                    } else {
                                        biVar.mo89761c(a2);
                                        biVar.f268166j.mo89667b(C58485gu.m89846n(C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT), C142359ck.FETCH_ANNOUNCEMENTS, biVar.mo89760b());
                                        return;
                                    }
                                } else {
                                    C59104x b6 = C95051n.f265910a.mo56224b();
                                    b6.mo56378ag(C58975e.f156826a, "DialogHandler");
                                    ((C59052c) ((C59052c) b6).mo56372aa(18111)).mo56386p("No speech no fetch edu prompt");
                                    hVar2.mo88975j();
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    case 4:
                        C59104x b7 = C95051n.f265910a.mo56224b();
                        b7.mo56378ag(C58975e.f156826a, "DialogHandler");
                        ((C59052c) ((C59052c) b7).mo56372aa(18118)).mo56386p("Custom device action received");
                        if (cbVar.a == 6) {
                            qrVar = (C52409qr) cbVar.b;
                        } else {
                            qrVar = C52409qr.f137528b;
                        }
                        C63088z E = C63088z.m96143E(qrVar.f137530a);
                        try {
                            E = C63088z.m96139A(Base64.decode(E.mo59174N(), 0));
                        } catch (IllegalArgumentException e) {
                            C59104x d2 = C95051n.f265910a.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "DialogHandler");
                            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(18119)).mo56386p("Failed to Base64 decode device action payload");
                        }
                        C142523o oVar = (C142523o) C142524p.f386746c.createBuilder();
                        oVar.copyOnWrite();
                        C142524p pVar = (C142524p) oVar.instance;
                        pVar.f386748a |= 1;
                        pVar.f386749b = E;
                        nVar.f265915e.mo89257D(15, 3, ((C142524p) oVar.build()).toByteArray());
                        return;
                    case 5:
                    case 6:
                        C59104x b8 = C95051n.f265910a.mo56224b();
                        b8.mo56378ag(C58975e.f156826a, "DialogHandler");
                        ((C59052c) ((C59052c) b8).mo56372aa(18120)).mo56386p("Media focus change");
                        if (hVar != null) {
                            C95771bi biVar2 = (C95771bi) hVar;
                            C95214aa aaVar2 = biVar2.f268161e;
                            aaVar2.mo89127f(aaVar2.mo89122a());
                            C95791b bVar = biVar2.f268164h;
                            bVar.f268225a.getAndSet(false);
                            bVar.f268226b.set(false);
                            return;
                        }
                        return;
                    case 7:
                        nVar.mo88981u(2);
                        nVar.f265915e.mo89277r(7);
                        Integer num2 = (Integer) nVar.f265923m.get(hsVar);
                        if (num2 != null && hVar != null && num2.equals(3)) {
                            C95771bi biVar3 = (C95771bi) hVar;
                            biVar3.f268166j.mo89667b(C58485gu.m89846n(C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT), C142359ck.PERFORM_VOICE_INPUT, biVar3.mo89760b());
                            return;
                        }
                        return;
                    case 8:
                        nVar.mo88981u(0);
                        nVar.mo88980t(hsVar);
                        return;
                    default:
                        return;
                }
            } else {
                throw null;
            }
        } else {
            C59104x b9 = C95051n.f265910a.mo56224b();
            b9.mo56378ag(C58975e.f156826a, "DialogHandler");
            ((C59052c) ((C59052c) b9).mo56372aa(18121)).mo56387q("Received non-bisto status for token %s", hsVar.f100059b);
        }
    }
}
