package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p853l;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h;
import com.google.android.libraries.assistant.auto.tng.media.p1060e.C14008d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16645j;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16706v;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.p3926e.C51831as;
import com.google.assistant.p3897e.p3921j.p3926e.C51837ay;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.k */
/* compiled from: PG */
public final class C12817k extends C22538o {

    /* renamed from: a */
    private static final C59071e f40024a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.l.k");

    /* renamed from: b */
    private final C12865i f40025b;

    public C12817k(C12865i iVar) {
        this.f40025b = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C16662b bVar;
        Optional optional;
        C51016dg dgVar;
        C51016dg dgVar2;
        C51058ev evVar;
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        Optional b = C12875h.m29134b(dwVar, "show_disambiguation_cards_args", C51837ay.f135986b.getParserForType());
        if (b.isEmpty()) {
            C59104x d = f40024a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(44467)).mo56386p("Failed to get client op args");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        C51837ay ayVar = (C51837ay) b.get();
        if (ayVar.f135988a.size() > 0) {
            C62971cq<C51831as> cqVar = ayVar.f135988a;
            C16627a aVar = (C16627a) C16662b.f48800l.createBuilder();
            for (C51831as asVar : cqVar) {
                if (asVar.f135978a == 1) {
                    C52560wg wgVar = (C52560wg) asVar.f135979b;
                    C16645j jVar = (C16645j) C16646k.f48751g.createBuilder();
                    if ((wgVar.f137945a & 8) != 0) {
                        C52568wo woVar = wgVar.f137950f;
                        if (woVar == null) {
                            woVar = C52568wo.f137992v;
                        }
                        if ((woVar.f137994a & 512) != 0) {
                            C52567wn b2 = C52567wn.m86649b(woVar.f138003j);
                            if (b2 == null) {
                                b2 = C52567wn.UNKNOWN;
                            }
                            if (b2 == C52567wn.TRACK) {
                                int i = woVar.f137994a;
                                if ((i & 1) == 0) {
                                    C59104x d2 = C16706v.f48874a.mo56226d();
                                    d2.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsToImmersiveArgs");
                                    ((C59052c) ((C59052c) d2).mo56372aa(46790)).mo56386p("MediaItem provided does not have entity title.");
                                    optional = Optional.empty();
                                } else if ((i & 2) != 0) {
                                    C16661z zVar = (C16661z) C16632ad.f48719e.createBuilder();
                                    String str = woVar.f137999f;
                                    zVar.copyOnWrite();
                                    C16632ad adVar = (C16632ad) zVar.instance;
                                    str.getClass();
                                    adVar.f48722b = 1;
                                    adVar.f48723c = str;
                                    jVar.copyOnWrite();
                                    C16646k kVar = (C16646k) jVar.instance;
                                    C16632ad adVar2 = (C16632ad) zVar.build();
                                    adVar2.getClass();
                                    kVar.f48754b = adVar2;
                                    kVar.f48753a |= 1;
                                    C16661z zVar2 = (C16661z) C16632ad.f48719e.createBuilder();
                                    String str2 = woVar.f137998e;
                                    zVar2.copyOnWrite();
                                    C16632ad adVar3 = (C16632ad) zVar2.instance;
                                    str2.getClass();
                                    adVar3.f48722b = 1;
                                    adVar3.f48723c = str2;
                                    jVar.copyOnWrite();
                                    C16646k kVar2 = (C16646k) jVar.instance;
                                    C16632ad adVar4 = (C16632ad) zVar2.build();
                                    adVar4.getClass();
                                    kVar2.f48755c = adVar4;
                                    kVar2.f48753a |= 2;
                                    if ((woVar.f137994a & 1024) != 0) {
                                        C16649n nVar = (C16649n) C16654s.f48773e.createBuilder();
                                        C16650o oVar = (C16650o) C16651p.f48768c.createBuilder();
                                        C51012dc dcVar = woVar.f138004k;
                                        if (dcVar == null) {
                                            dcVar = C51012dc.f132813k;
                                        }
                                        String str3 = dcVar.f132817c;
                                        oVar.copyOnWrite();
                                        C16651p pVar = (C16651p) oVar.instance;
                                        str3.getClass();
                                        pVar.f48770a = 1;
                                        pVar.f48771b = str3;
                                        C16651p pVar2 = (C16651p) oVar.build();
                                        nVar.copyOnWrite();
                                        C16654s sVar = (C16654s) nVar.instance;
                                        pVar2.getClass();
                                        sVar.f48777c = pVar2;
                                        sVar.f48775a |= 2;
                                        C16654s sVar2 = (C16654s) nVar.build();
                                        jVar.copyOnWrite();
                                        C16646k kVar3 = (C16646k) jVar.instance;
                                        sVar2.getClass();
                                        kVar3.f48756d = sVar2;
                                        kVar3.f48753a |= 4;
                                        if (wgVar.f137946b == 16) {
                                            dgVar = (C51016dg) wgVar.f137947c;
                                        } else {
                                            dgVar = C51016dg.f132827g;
                                        }
                                        if ((dgVar.f132829a & 8) != 0) {
                                            if (wgVar.f137946b == 16) {
                                                dgVar2 = (C51016dg) wgVar.f137947c;
                                            } else {
                                                dgVar2 = C51016dg.f132827g;
                                            }
                                            C51805du duVar = dgVar2.f132833e;
                                            if (duVar == null) {
                                                duVar = C51805du.f135924e;
                                            }
                                            C16769s sVar3 = (C16769s) C16770t.f49073f.createBuilder();
                                            if (C14008d.m30294a(duVar).mo56113h() && (wgVar.f137945a & 4) != 0) {
                                                C51098gh ghVar = wgVar.f137949e;
                                                if (ghVar == null) {
                                                    ghVar = C51098gh.f133009e;
                                                }
                                                if (ghVar.f133012b == 1) {
                                                    C51098gh ghVar2 = wgVar.f137949e;
                                                    if (ghVar2 == null) {
                                                        ghVar2 = C51098gh.f133009e;
                                                    }
                                                    if (ghVar2.f133012b == 1) {
                                                        evVar = (C51058ev) ghVar2.f133013c;
                                                    } else {
                                                        evVar = C51058ev.f132941o;
                                                    }
                                                    if ((evVar.f132943a & 1) != 0) {
                                                        sVar3.copyOnWrite();
                                                        C16770t tVar = (C16770t) sVar3.instance;
                                                        wgVar.getClass();
                                                        tVar.f49077c = wgVar;
                                                        tVar.f49076b = 8;
                                                        C16743bd bdVar = (C16743bd) C16744be.f48963e.createBuilder();
                                                        C16747bh bhVar = (C16747bh) C16748bi.f48976c.createBuilder();
                                                        bhVar.copyOnWrite();
                                                        C16748bi biVar = (C16748bi) bhVar.instance;
                                                        biVar.f48978a |= 1;
                                                        biVar.f48979b = 158632;
                                                        C16748bi biVar2 = (C16748bi) bhVar.build();
                                                        bdVar.copyOnWrite();
                                                        C16744be beVar = (C16744be) bdVar.instance;
                                                        biVar2.getClass();
                                                        beVar.f48968d = biVar2;
                                                        beVar.f48965a |= 4;
                                                        C16770t tVar2 = (C16770t) sVar3.build();
                                                        bdVar.copyOnWrite();
                                                        C16744be beVar2 = (C16744be) bdVar.instance;
                                                        tVar2.getClass();
                                                        beVar2.f48966b = tVar2;
                                                        beVar2.f48965a = 1 | beVar2.f48965a;
                                                        C16744be beVar3 = (C16744be) bdVar.build();
                                                        jVar.copyOnWrite();
                                                        C16646k kVar4 = (C16646k) jVar.instance;
                                                        beVar3.getClass();
                                                        kVar4.f48757e = beVar3;
                                                        kVar4.f48753a |= 8;
                                                    }
                                                }
                                            }
                                            sVar3.copyOnWrite();
                                            C16770t tVar3 = (C16770t) sVar3.instance;
                                            duVar.getClass();
                                            tVar3.f49077c = duVar;
                                            tVar3.f49076b = 2;
                                            C16743bd bdVar2 = (C16743bd) C16744be.f48963e.createBuilder();
                                            C16747bh bhVar2 = (C16747bh) C16748bi.f48976c.createBuilder();
                                            bhVar2.copyOnWrite();
                                            C16748bi biVar3 = (C16748bi) bhVar2.instance;
                                            biVar3.f48978a |= 1;
                                            biVar3.f48979b = 158632;
                                            C16748bi biVar22 = (C16748bi) bhVar2.build();
                                            bdVar2.copyOnWrite();
                                            C16744be beVar4 = (C16744be) bdVar2.instance;
                                            biVar22.getClass();
                                            beVar4.f48968d = biVar22;
                                            beVar4.f48965a |= 4;
                                            C16770t tVar22 = (C16770t) sVar3.build();
                                            bdVar2.copyOnWrite();
                                            C16744be beVar22 = (C16744be) bdVar2.instance;
                                            tVar22.getClass();
                                            beVar22.f48966b = tVar22;
                                            beVar22.f48965a = 1 | beVar22.f48965a;
                                            C16744be beVar32 = (C16744be) bdVar2.build();
                                            jVar.copyOnWrite();
                                            C16646k kVar42 = (C16646k) jVar.instance;
                                            beVar32.getClass();
                                            kVar42.f48757e = beVar32;
                                            kVar42.f48753a |= 8;
                                        } else {
                                            C16743bd bdVar3 = (C16743bd) C16744be.f48963e.createBuilder();
                                            C16747bh bhVar3 = (C16747bh) C16748bi.f48976c.createBuilder();
                                            bhVar3.copyOnWrite();
                                            C16748bi biVar4 = (C16748bi) bhVar3.instance;
                                            biVar4.f48978a |= 1;
                                            biVar4.f48979b = 158632;
                                            C16748bi biVar5 = (C16748bi) bhVar3.build();
                                            bdVar3.copyOnWrite();
                                            C16744be beVar5 = (C16744be) bdVar3.instance;
                                            biVar5.getClass();
                                            beVar5.f48968d = biVar5;
                                            beVar5.f48965a |= 4;
                                            C16769s sVar4 = (C16769s) C16770t.f49073f.createBuilder();
                                            String str4 = woVar.f137998e;
                                            sVar4.copyOnWrite();
                                            C16770t tVar4 = (C16770t) sVar4.instance;
                                            str4.getClass();
                                            tVar4.f49076b = 1;
                                            tVar4.f49077c = str4;
                                            bdVar3.copyOnWrite();
                                            C16744be beVar6 = (C16744be) bdVar3.instance;
                                            C16770t tVar5 = (C16770t) sVar4.build();
                                            tVar5.getClass();
                                            beVar6.f48966b = tVar5;
                                            beVar6.f48965a = 1 | beVar6.f48965a;
                                            C16744be beVar7 = (C16744be) bdVar3.build();
                                            jVar.copyOnWrite();
                                            C16646k kVar5 = (C16646k) jVar.instance;
                                            beVar7.getClass();
                                            kVar5.f48757e = beVar7;
                                            kVar5.f48753a |= 8;
                                        }
                                        optional = Optional.m71637of((C16646k) jVar.build());
                                    } else {
                                        C59104x d3 = C16706v.f48874a.mo56226d();
                                        d3.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsToImmersiveArgs");
                                        ((C59052c) ((C59052c) d3).mo56372aa(46788)).mo56386p("MediaItem provided does not have any image.");
                                        optional = Optional.empty();
                                    }
                                } else {
                                    C59104x d4 = C16706v.f48874a.mo56226d();
                                    d4.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsToImmersiveArgs");
                                    ((C59052c) ((C59052c) d4).mo56372aa(46789)).mo56386p("MediaItem provided does not have an artist name.");
                                    optional = Optional.empty();
                                }
                            }
                        }
                        C59104x d5 = C16706v.f48874a.mo56226d();
                        d5.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsToImmersiveArgs");
                        ((C59052c) ((C59052c) d5).mo56372aa(46787)).mo56386p("MediaItem is not of type TRACK.");
                        optional = Optional.empty();
                    } else {
                        C59104x d6 = C16706v.f48874a.mo56226d();
                        d6.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsToImmersiveArgs");
                        ((C59052c) ((C59052c) d6).mo56372aa(46791)).mo56386p("MediaItem provided does not contain a provider.");
                        optional = Optional.empty();
                    }
                    if (optional.isPresent()) {
                        aVar.mo22942a((C16646k) optional.get());
                    }
                }
            }
            aVar.copyOnWrite();
            C16662b bVar2 = (C16662b) aVar.instance;
            bVar2.f48802a |= 1;
            bVar2.f48803b = true;
            bVar = (C16662b) aVar.build();
        } else {
            C59104x d7 = C16706v.f48874a.mo56226d();
            d7.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsToImmersiveArgs");
            ((C59052c) ((C59052c) d7).mo56372aa(46786)).mo56386p("Client op args didn't have any disambiguation items.");
            bVar = null;
        }
        if (bVar == null) {
            C59104x d8 = f40024a.mo56226d();
            d8.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsPerformer");
            ((C59052c) ((C59052c) d8).mo56372aa(44466)).mo56386p("immersiveArgs is null, likely no disambiguation args present in the client op args.");
            return C60856cj.m92900i(C12788a.f39966a);
        } else if (bVar.f48806e.size() == 0) {
            C59104x d9 = f40024a.mo56226d();
            d9.mo56378ag(C58975e.f156826a, "ShowDisambiguationCardsPerformer");
            ((C59052c) ((C59052c) d9).mo56372aa(44465)).mo56386p("none of the disambiguation args were translated into immersive args.");
            return C60856cj.m92900i(C12788a.f39966a);
        } else {
            this.f40025b.mo20751d(bVar);
            return C60856cj.m92900i(C12788a.f39968c);
        }
    }
}
