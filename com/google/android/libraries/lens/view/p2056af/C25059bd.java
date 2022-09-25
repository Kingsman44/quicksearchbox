package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.ondevice.p2032i.C24529g;
import com.google.android.libraries.lens.ondevice.p2037n.C24774ag;
import com.google.android.libraries.lens.ondevice.p2037n.C24787at;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59886av;
import com.google.common.p4552o.p4563i.C59887aw;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59940cv;
import com.google.common.p4552o.p4563i.C59943cy;
import com.google.lens.p4701g.C62277b;
import com.google.lens.p4701g.C62331d;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62995dn;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63233f;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;
import java.util.Collections;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.af.bd */
/* compiled from: PG */
public final class C25059bd implements C24529g {

    /* renamed from: a */
    private static final C58974d f68299a = C58974d.m91135i("LensOnDeviceLogger");

    /* renamed from: b */
    private static final C58495hd f68300b;

    /* renamed from: c */
    private static final C58495hd f68301c;

    /* renamed from: d */
    private static final C58495hd f68302d;

    /* renamed from: e */
    private static final C58495hd f68303e;

    /* renamed from: f */
    private final C37215b f68304f;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("OcrDetectionEngine", C37194a.f98469af.mo40779c());
        gzVar.mo55429h("OcrRecognitionEngine", C37194a.f98473aj.mo40779c());
        gzVar.mo55429h("OcrEngine", C37194a.f98477an.mo40779c());
        gzVar.mo55429h("ScriptLanguageStatsPrimitive", C37194a.f98533bq.mo40779c());
        gzVar.mo55429h("RegionDetectionEngine", C37194a.f98495bE.mo40779c());
        gzVar.mo55429h("PageLayoutMutatorLineDetection", C37194a.f98512bV.mo40779c());
        gzVar.mo55429h("PageLayoutMutatorScriptDetection", C37194a.f98516bZ.mo40779c());
        gzVar.mo55429h("PageLayoutMutatorLineRecognition", C37194a.f98573cd.mo40779c());
        gzVar.mo55429h("PageLayoutMutatorLayoutAnalysis", C37194a.f98577ch.mo40779c());
        gzVar.mo55429h("PageLayoutMutatorDeepParagraphs", C37194a.f98581cl.mo40779c());
        gzVar.mo55429h("TranslateEngine", C37194a.f98544cA.mo40779c());
        gzVar.mo55429h("ServerTranslateEngine", C37194a.f98566cW.mo40779c());
        gzVar.mo55429h("InpaintingEngine", C37194a.f98600da.mo40779c());
        f68300b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("OcrDetectionEngine", C37194a.f98470ag.mo40779c());
        gzVar2.mo55429h("OcrRecognitionEngine", C37194a.f98474ak.mo40779c());
        gzVar2.mo55429h("OcrEngine", C37194a.f98478ao.mo40779c());
        gzVar2.mo55429h("ScriptLanguageStatsPrimitive", C37194a.f98534br.mo40779c());
        gzVar2.mo55429h("RegionDetectionEngine", C37194a.f98496bF.mo40779c());
        gzVar2.mo55429h("PageLayoutMutatorLineDetection", C37194a.f98513bW.mo40779c());
        gzVar2.mo55429h("PageLayoutMutatorScriptDetection", C37194a.f98570ca.mo40779c());
        gzVar2.mo55429h("PageLayoutMutatorLineRecognition", C37194a.f98574ce.mo40779c());
        gzVar2.mo55429h("PageLayoutMutatorLayoutAnalysis", C37194a.f98578ci.mo40779c());
        gzVar2.mo55429h("PageLayoutMutatorDeepParagraphs", C37194a.f98582cm.mo40779c());
        gzVar2.mo55429h("TranslateEngine", C37194a.f98545cB.mo40779c());
        gzVar2.mo55429h("ServerTranslateEngine", C37194a.f98567cX.mo40779c());
        gzVar2.mo55429h("InpaintingEngine", C37194a.f98601db.mo40779c());
        f68301c = gzVar2.mo55427f(false);
        C58490gz gzVar3 = new C58490gz(4);
        gzVar3.mo55429h("OcrDetectionEngine", C37194a.f98467ad.mo40779c());
        gzVar3.mo55429h("OcrRecognitionEngine", C37194a.f98471ah.mo40779c());
        gzVar3.mo55429h("OcrEngine", C37194a.f98475al.mo40779c());
        gzVar3.mo55429h("RegionDetectionEngine", C37194a.f98493bC.mo40779c());
        gzVar3.mo55429h("ScriptLanguageStatsPrimitive", C37194a.f98531bo.mo40779c());
        gzVar3.mo55429h("PhotoOcrParagraphing", C37194a.f98546cC.mo40779c());
        gzVar3.mo55429h("LineBoxFilteringPrimitive", C37194a.f98548cE.mo40779c());
        gzVar3.mo55429h("PhotoOcrParagraphToTranslateRequestConverter", C37194a.f98550cG.mo40779c());
        gzVar3.mo55429h("PageLayoutMutatorLineDetection", C37194a.f98510bT.mo40779c());
        gzVar3.mo55429h("PageLayoutMutatorScriptDetection", C37194a.f98514bX.mo40779c());
        gzVar3.mo55429h("PageLayoutMutatorLineRecognition", C37194a.f98571cb.mo40779c());
        gzVar3.mo55429h("PageLayoutMutatorLayoutAnalysis", C37194a.f98575cf.mo40779c());
        gzVar3.mo55429h("PageLayoutMutatorDeepParagraphs", C37194a.f98579cj.mo40779c());
        gzVar3.mo55429h("TranslateEngine", C37194a.f98594cy.mo40779c());
        gzVar3.mo55429h("ServerTranslateEngine", C37194a.f98564cU.mo40779c());
        gzVar3.mo55429h("InpaintingEngine", C37194a.f98568cY.mo40779c());
        f68302d = gzVar3.mo55427f(false);
        C58490gz gzVar4 = new C58490gz(4);
        gzVar4.mo55429h("OcrDetectionEngine", C37194a.f98468ae.mo40779c());
        gzVar4.mo55429h("OcrRecognitionEngine", C37194a.f98472ai.mo40779c());
        gzVar4.mo55429h("OcrEngine", C37194a.f98476am.mo40779c());
        gzVar4.mo55429h("ScriptLanguageStatsPrimitive", C37194a.f98532bp.mo40779c());
        gzVar4.mo55429h("PhotoOcrParagraphing", C37194a.f98547cD.mo40779c());
        gzVar4.mo55429h("LineBoxFilteringPrimitive", C37194a.f98549cF.mo40779c());
        gzVar4.mo55429h("PhotoOcrParagraphToTranslateRequestConverter", C37194a.f98551cH.mo40779c());
        gzVar4.mo55429h("RegionDetectionEngine", C37194a.f98494bD.mo40779c());
        gzVar4.mo55429h("PageLayoutMutatorLineDetection", C37194a.f98511bU.mo40779c());
        gzVar4.mo55429h("PageLayoutMutatorScriptDetection", C37194a.f98515bY.mo40779c());
        gzVar4.mo55429h("PageLayoutMutatorLineRecognition", C37194a.f98572cc.mo40779c());
        gzVar4.mo55429h("PageLayoutMutatorLayoutAnalysis", C37194a.f98576cg.mo40779c());
        gzVar4.mo55429h("PageLayoutMutatorDeepParagraphs", C37194a.f98580ck.mo40779c());
        gzVar4.mo55429h("TranslateEngine", C37194a.f98595cz.mo40779c());
        gzVar4.mo55429h("ServerTranslateEngine", C37194a.f98565cV.mo40779c());
        gzVar4.mo55429h("InpaintingEngine", C37194a.f98569cZ.mo40779c());
        f68303e = gzVar4.mo55427f(false);
    }

    public C25059bd(C37215b bVar) {
        this.f68304f = bVar;
    }

    /* renamed from: b */
    private static C37252a m46362b(C37252a aVar, C62722b bVar) {
        if (aVar == null) {
            return null;
        }
        aVar.mo40781e(bVar);
        return aVar;
    }

    /* renamed from: a */
    public final void mo29942a(C24774ag agVar) {
        C37252a aVar;
        C24805p pVar = C24805p.UNKNOWN_EVENT;
        C24805p a = C24805p.m45929a(agVar.f67696b);
        if (a == null) {
            a = C24805p.UNKNOWN_EVENT;
        }
        switch (a.ordinal()) {
            case 1:
                C58495hd hdVar = f68300b;
                C24808s sVar = agVar.f67698d;
                if (sVar == null) {
                    sVar = C24808s.f67804l;
                }
                aVar = (C37252a) hdVar.get(sVar.f67807b);
                break;
            case 2:
                C58495hd hdVar2 = f68301c;
                C24808s sVar2 = agVar.f67698d;
                if (sVar2 == null) {
                    sVar2 = C24808s.f67804l;
                }
                aVar = m46362b((C37252a) hdVar2.get(sVar2.f67807b), C62722b.OK);
                break;
            case 3:
                C58495hd hdVar3 = f68301c;
                C24808s sVar3 = agVar.f67698d;
                if (sVar3 == null) {
                    sVar3 = C24808s.f67804l;
                }
                aVar = m46362b((C37252a) hdVar3.get(sVar3.f67807b), C62722b.UNKNOWN);
                break;
            case 4:
                C58495hd hdVar4 = f68302d;
                C24808s sVar4 = agVar.f67698d;
                if (sVar4 == null) {
                    sVar4 = C24808s.f67804l;
                }
                aVar = (C37252a) hdVar4.get(sVar4.f67807b);
                break;
            case 5:
                C58495hd hdVar5 = f68303e;
                C24808s sVar5 = agVar.f67698d;
                if (sVar5 == null) {
                    sVar5 = C24808s.f67804l;
                }
                aVar = m46362b((C37252a) hdVar5.get(sVar5.f67807b), C62722b.OK);
                break;
            case 6:
                C58495hd hdVar6 = f68303e;
                C24808s sVar6 = agVar.f67698d;
                if (sVar6 == null) {
                    sVar6 = C24808s.f67804l;
                }
                aVar = m46362b((C37252a) hdVar6.get(sVar6.f67807b), C62722b.UNKNOWN);
                break;
            case 7:
                aVar = C37194a.f98434X.mo40779c();
                break;
            case 8:
                aVar = C37194a.f98435Y.mo40815i(C62722b.OK);
                break;
            case 9:
                aVar = C37194a.f98435Y.mo40815i(C62722b.UNKNOWN);
                break;
            case 10:
                aVar = C37194a.f98427Q.mo40779c();
                break;
            case 11:
                aVar = C37194a.f98428R.mo40815i(C62722b.OK);
                break;
            case 12:
                aVar = C37194a.f98428R.mo40815i(C62722b.UNKNOWN);
                break;
            case 13:
                aVar = C37194a.f98429S.mo40779c();
                break;
            case 14:
                aVar = C37194a.f98430T.mo40815i(C62722b.OK);
                break;
            case 15:
                aVar = C37194a.f98430T.mo40815i(C62722b.UNKNOWN);
                break;
            case 16:
                aVar = C37194a.f98431U.mo40779c();
                break;
            case 17:
                aVar = C37194a.f98432V.mo40815i(C62722b.OK);
                break;
            case 18:
                aVar = C37194a.f98491bA.mo40779c();
                break;
            case 19:
                aVar = C37194a.f98492bB.mo40779c();
                break;
            case 20:
                aVar = C37194a.f98592cw.mo40815i(C62722b.OK);
                break;
            case 21:
                aVar = C37194a.f98593cx.mo40815i(C62722b.OK);
                break;
            case 22:
                aVar = C37194a.f98593cx.mo40815i(C62722b.UNKNOWN);
                break;
            case 23:
                aVar = C37194a.f98552cI.mo40779c();
                break;
            case 24:
                aVar = C37194a.f98553cJ.mo40815i(C62722b.OK);
                break;
            case 25:
                aVar = C37194a.f98553cJ.mo40815i(C62722b.UNKNOWN);
                break;
            default:
                aVar = null;
                break;
        }
        if (aVar != null) {
            C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
            C24808s sVar7 = agVar.f67698d;
            if (sVar7 == null) {
                sVar7 = C24808s.f67804l;
            }
            int i = 1;
            if ((sVar7.f67806a & 8) != 0) {
                C24808s sVar8 = agVar.f67698d;
                if (sVar8 == null) {
                    sVar8 = C24808s.f67804l;
                }
                C24787at atVar = sVar8.f67810e;
                if (atVar == null) {
                    atVar = C24787at.f67723g;
                }
                C59940cv cvVar = (C59940cv) C59943cy.f162002g.createBuilder();
                int i2 = atVar.f67727c;
                cvVar.copyOnWrite();
                C59943cy cyVar = (C59943cy) cvVar.instance;
                cyVar.f162004a |= 2;
                cyVar.f162006c = i2;
                int i3 = atVar.f67726b;
                cvVar.copyOnWrite();
                C59943cy cyVar2 = (C59943cy) cvVar.instance;
                cyVar2.f162004a |= 1;
                cyVar2.f162005b = i3;
                int i4 = atVar.f67728d;
                cvVar.copyOnWrite();
                C59943cy cyVar3 = (C59943cy) cvVar.instance;
                cyVar3.f162004a |= 4;
                cyVar3.f162007d = i4;
                for (String str : Collections.unmodifiableMap(atVar.f67729e).keySet()) {
                    str.getClass();
                    C62995dn dnVar = atVar.f67729e;
                    int intValue = dnVar.containsKey(str) ? ((Integer) dnVar.get(str)).intValue() : 0;
                    str.getClass();
                    cvVar.copyOnWrite();
                    C59943cy cyVar4 = (C59943cy) cvVar.instance;
                    C62995dn dnVar2 = cyVar4.f162008e;
                    if (!dnVar2.f170058b) {
                        cyVar4.f162008e = dnVar2.mo58980a();
                    }
                    cyVar4.f162008e.put(str, Integer.valueOf(intValue));
                }
                for (String str2 : Collections.unmodifiableMap(atVar.f67730f).keySet()) {
                    str2.getClass();
                    C62995dn dnVar3 = atVar.f67730f;
                    double doubleValue = dnVar3.containsKey(str2) ? ((Double) dnVar3.get(str2)).doubleValue() : C59203do.f157270a;
                    str2.getClass();
                    cvVar.copyOnWrite();
                    C59943cy cyVar5 = (C59943cy) cvVar.instance;
                    C62995dn dnVar4 = cyVar5.f162009f;
                    if (!dnVar4.f170058b) {
                        cyVar5.f162009f = dnVar4.mo58980a();
                    }
                    cyVar5.f162009f.put(str2, Double.valueOf(doubleValue));
                }
                C59943cy cyVar6 = (C59943cy) cvVar.build();
                afVar.copyOnWrite();
                C59898bg bgVar = (C59898bg) afVar.instance;
                cyVar6.getClass();
                bgVar.f161881m = cyVar6;
                bgVar.f161869a |= 2048;
            }
            C24808s sVar9 = agVar.f67698d;
            if (((sVar9 == null ? C24808s.f67804l : sVar9).f67806a & 64) != 0) {
                if (sVar9 == null) {
                    sVar9 = C24808s.f67804l;
                }
                C63233f fVar = sVar9.f67813h;
                if (fVar == null) {
                    fVar = C63233f.f170841d;
                }
                afVar.copyOnWrite();
                C59898bg bgVar2 = (C59898bg) afVar.instance;
                fVar.getClass();
                bgVar2.f161882n = fVar;
                bgVar2.f161869a |= 4096;
            }
            C24808s sVar10 = agVar.f67698d;
            if (sVar10 == null) {
                sVar10 = C24808s.f67804l;
            }
            if ((sVar10.f67806a & 256) != 0) {
                C59886av avVar = (C59886av) C59887aw.f161829g.createBuilder();
                C24808s sVar11 = agVar.f67698d;
                if (sVar11 == null) {
                    sVar11 = C24808s.f67804l;
                }
                long millis = Duration.ofNanos(sVar11.f67815j).toMillis();
                avVar.copyOnWrite();
                C59887aw awVar = (C59887aw) avVar.instance;
                awVar.f161831a |= 16;
                awVar.f161835e = millis;
                C59887aw awVar2 = (C59887aw) avVar.build();
                afVar.copyOnWrite();
                C59898bg bgVar3 = (C59898bg) afVar.instance;
                awVar2.getClass();
                bgVar3.f161883o = awVar2;
                bgVar3.f161869a |= 8192;
            }
            C24808s sVar12 = agVar.f67698d;
            if (sVar12 == null) {
                sVar12 = C24808s.f67804l;
            }
            if ((sVar12.f67806a & 16) != 0) {
                C59886av avVar2 = (C59886av) C59887aw.f161829g.createBuilder();
                C24805p a2 = C24805p.m45929a(agVar.f67696b);
                if (a2 == null) {
                    a2 = C24805p.UNKNOWN_EVENT;
                }
                if (a2 == C24805p.CASCADE_RUN_SUCCESS) {
                    C24808s sVar13 = agVar.f67698d;
                    if (sVar13 == null) {
                        sVar13 = C24808s.f67804l;
                    }
                    C63240m mVar = sVar13.f67816k;
                    if (mVar == null) {
                        mVar = C63240m.f170859b;
                    }
                    avVar2.copyOnWrite();
                    C59887aw awVar3 = (C59887aw) avVar2.instance;
                    mVar.getClass();
                    awVar3.f161836f = mVar;
                    awVar3.f161831a |= 32;
                }
                C24808s sVar14 = agVar.f67698d;
                if (sVar14 == null) {
                    sVar14 = C24808s.f67804l;
                }
                C62331d a3 = C62331d.m94767a(sVar14.f67811f);
                if (a3 == null) {
                    a3 = C62331d.UNKNOWN;
                }
                avVar2.copyOnWrite();
                C59887aw awVar4 = (C59887aw) avVar2.instance;
                awVar4.f161832b = a3.f168273v;
                awVar4.f161831a |= 2;
                C24808s sVar15 = agVar.f67698d;
                if (sVar15 == null) {
                    sVar15 = C24808s.f67804l;
                }
                int a4 = C62277b.m94763a(sVar15.f67812g);
                if (a4 != 0) {
                    i = a4;
                }
                avVar2.copyOnWrite();
                C59887aw awVar5 = (C59887aw) avVar2.instance;
                awVar5.f161833c = i - 1;
                awVar5.f161831a |= 4;
                C59887aw awVar6 = (C59887aw) avVar2.build();
                afVar.copyOnWrite();
                C59898bg bgVar4 = (C59898bg) afVar.instance;
                awVar6.getClass();
                bgVar4.f161883o = awVar6;
                bgVar4.f161869a |= 8192;
            }
            C24808s sVar16 = agVar.f67698d;
            if (sVar16 == null) {
                sVar16 = C24808s.f67804l;
            }
            if ((sVar16.f67806a & 128) != 0) {
                C59886av avVar3 = (C59886av) C59887aw.f161829g.createBuilder();
                C24808s sVar17 = agVar.f67698d;
                if (sVar17 == null) {
                    sVar17 = C24808s.f67804l;
                }
                long j = sVar17.f67814i;
                avVar3.copyOnWrite();
                C59887aw awVar7 = (C59887aw) avVar3.instance;
                awVar7.f161831a |= 8;
                awVar7.f161834d = j;
                C59887aw awVar8 = (C59887aw) avVar3.build();
                afVar.copyOnWrite();
                C59898bg bgVar5 = (C59898bg) afVar.instance;
                awVar8.getClass();
                bgVar5.f161883o = awVar8;
                bgVar5.f161869a |= 8192;
            }
            C37215b bVar = this.f68304f;
            aVar.mo40791o(agVar.f67697c);
            aVar.mo40792p(C59898bg.f161867w, (C59898bg) afVar.build());
            bVar.mo19974a(aVar);
            return;
        }
        C58970a aVar2 = (C58970a) ((C58970a) f68299a.mo56226d()).mo56372aa(49662);
        C24805p a5 = C24805p.m45929a(agVar.f67696b);
        if (a5 == null) {
            a5 = C24805p.UNKNOWN_EVENT;
        }
        aVar2.mo56387q("No flow event found for engine event %d", a5.f67802A);
    }
}
