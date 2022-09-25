package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.ondevice.C24495g;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68221g;

/* renamed from: com.google.android.libraries.lens.ondevice.k.eh */
/* compiled from: PG */
public final class C24651eh {

    /* renamed from: a */
    private final C24654ek f67394a;

    public C24651eh(C24655el elVar) {
        C24655el elVar2 = elVar;
        C24746p pVar = (C24746p) elVar2.f67416a.mo17428b();
        C24746p pVar2 = pVar;
        pVar.getClass();
        C24752v vVar = (C24752v) elVar2.f67417b.mo17428b();
        C24752v vVar2 = vVar;
        vVar.getClass();
        C24539ad adVar = (C24539ad) elVar2.f67418c.mo17428b();
        C24539ad adVar2 = adVar;
        adVar.getClass();
        C24559ax axVar = (C24559ax) elVar2.f67419d.mo17428b();
        C24559ax axVar2 = axVar;
        axVar.getClass();
        C24565bc bcVar = (C24565bc) elVar2.f67420e.mo17428b();
        C24565bc bcVar2 = bcVar;
        bcVar.getClass();
        C24578bp bpVar = (C24578bp) elVar2.f67421f.mo17428b();
        C24578bp bpVar2 = bpVar;
        bpVar.getClass();
        C24592cc ccVar = (C24592cc) elVar2.f67422g.mo17428b();
        C24592cc ccVar2 = ccVar;
        ccVar.getClass();
        C24597ch chVar = (C24597ch) elVar2.f67423h.mo17428b();
        C24597ch chVar2 = chVar;
        chVar.getClass();
        C24602cm cmVar = (C24602cm) elVar2.f67424i.mo17428b();
        C24602cm cmVar2 = cmVar;
        cmVar.getClass();
        C24607cr crVar = (C24607cr) elVar2.f67425j.mo17428b();
        C24607cr crVar2 = crVar;
        crVar.getClass();
        C24620dd ddVar = (C24620dd) elVar2.f67426k.mo17428b();
        C24620dd ddVar2 = ddVar;
        ddVar.getClass();
        C24659ep epVar = (C24659ep) elVar2.f67427l.mo17428b();
        C24659ep epVar2 = epVar;
        epVar.getClass();
        C24666ew ewVar = (C24666ew) elVar2.f67428m.mo17428b();
        C24666ew ewVar2 = ewVar;
        ewVar.getClass();
        C24680fj fjVar = (C24680fj) elVar2.f67429n.mo17428b();
        C24654ek ekVar = r1;
        C24680fj fjVar2 = fjVar;
        fjVar.getClass();
        C24689fs fsVar = (C24689fs) elVar2.f67430o.mo17428b();
        C24689fs fsVar2 = fsVar;
        fsVar.getClass();
        C24693fw fwVar = (C24693fw) elVar2.f67431p.mo17428b();
        C24693fw fwVar2 = fwVar;
        fwVar.getClass();
        C24699gb gbVar = (C24699gb) elVar2.f67432q.mo17428b();
        C24699gb gbVar2 = gbVar;
        gbVar.getClass();
        C24713gp gpVar = (C24713gp) elVar2.f67433r.mo17428b();
        C24713gp gpVar2 = gpVar;
        gpVar.getClass();
        C24719gv gvVar = (C24719gv) elVar2.f67434s.mo17428b();
        gvVar.getClass();
        C24726hb hbVar = (C24726hb) elVar2.f67435t.mo17428b();
        hbVar.getClass();
        C24654ek ekVar2 = new C24654ek(pVar2, vVar2, adVar2, axVar2, bcVar2, bpVar2, ccVar2, chVar2, cmVar2, crVar2, ddVar2, epVar2, ewVar2, fjVar2, fsVar2, fwVar2, gbVar2, gpVar2, gvVar, hbVar);
        this.f67394a = ekVar;
    }

    /* renamed from: a */
    public final C24650eg mo29977a(String str) {
        C24650eg haVar;
        try {
            C24654ek ekVar = this.f67394a;
            if ("BarcodeEngine".equals(str)) {
                return new C24739i();
            }
            if ("DetectionReconciliationEngine".equals(str)) {
                C24748r rVar = (C24748r) ekVar.f67396a.f67626a.mo17428b();
                rVar.getClass();
                haVar = new C24745o(rVar);
            } else if ("EmbeddingEngine".equals(str)) {
                C24752v vVar = ekVar.f67397b;
                C24754x xVar = (C24754x) vVar.f67638a.mo17428b();
                xVar.getClass();
                C26244b bVar = (C26244b) ((C68221g) vVar.f67639b).f184583a;
                bVar.getClass();
                haVar = new C24751u(xVar, bVar);
            } else if ("InpaintingEngine".equals(str)) {
                C24539ad adVar = ekVar.f67398c;
                C24551ap apVar = (C24551ap) adVar.f67210a.mo17428b();
                apVar.getClass();
                haVar = new C24538ac(apVar, ((C24495g) adVar.f67211b).mo17428b());
            } else if ("LineBoxFilteringPrimitive".equals(str)) {
                return new C24546ak();
            } else {
                if ("OcrDetectionEngine".equals(str)) {
                    C24553ar arVar = (C24553ar) ekVar.f67399d.f67242a.mo17428b();
                    arVar.getClass();
                    haVar = new C24558aw(arVar);
                } else if ("OcrEngine".equals(str)) {
                    C24553ar arVar2 = (C24553ar) ekVar.f67400e.f67251a.mo17428b();
                    arVar2.getClass();
                    haVar = new C24564bb(arVar2);
                } else if ("OcrParagraphingPrimitive".equals(str)) {
                    return new C24571bi();
                } else {
                    if ("OcrRecognitionEngine".equals(str)) {
                        C24553ar arVar3 = (C24553ar) ekVar.f67401f.f67267a.mo17428b();
                        arVar3.getClass();
                        haVar = new C24577bo(arVar3);
                    } else if ("PageLayoutMutatorDeepParagraphs".equals(str)) {
                        C24592cc ccVar = ekVar.f67402g;
                        C24623dg dgVar = (C24623dg) ccVar.f67288a.mo17428b();
                        dgVar.getClass();
                        haVar = new C24591cb(dgVar, ((C24495g) ccVar.f67289b).mo17428b());
                    } else if ("PageLayoutMutatorLayoutAnalysis".equals(str)) {
                        C24597ch chVar = ekVar.f67403h;
                        C24623dg dgVar2 = (C24623dg) chVar.f67301a.mo17428b();
                        dgVar2.getClass();
                        haVar = new C24596cg(dgVar2, ((C24495g) chVar.f67302b).mo17428b());
                    } else if ("PageLayoutMutatorLineDetection".equals(str)) {
                        C24602cm cmVar = ekVar.f67404i;
                        C24623dg dgVar3 = (C24623dg) cmVar.f67314a.mo17428b();
                        dgVar3.getClass();
                        haVar = new C24601cl(dgVar3, ((C24495g) cmVar.f67315b).mo17428b());
                    } else if ("PageLayoutMutatorLineRecognition".equals(str)) {
                        C24607cr crVar = ekVar.f67405j;
                        C24623dg dgVar4 = (C24623dg) crVar.f67326a.mo17428b();
                        dgVar4.getClass();
                        haVar = new C24606cq(dgVar4, ((C24495g) crVar.f67327b).mo17428b());
                    } else if ("PageLayoutMutatorScriptDetection".equals(str)) {
                        C24620dd ddVar = ekVar.f67406k;
                        C24623dg dgVar5 = (C24623dg) ddVar.f67353a.mo17428b();
                        dgVar5.getClass();
                        haVar = new C24619dc(dgVar5, ((C24495g) ddVar.f67354b).mo17428b());
                    } else if ("PageLayoutToTranslateRequestConverter".equals(str)) {
                        return new C24638dv();
                    } else {
                        if ("ParticleExtractorEngine".equals(str)) {
                            return new C24645eb();
                        }
                        if ("RegionDetectionEngine".equals(str)) {
                            C24661er erVar = (C24661er) ekVar.f67407l.f67465a.mo17428b();
                            erVar.getClass();
                            haVar = new C24658eo(erVar);
                        } else if ("SalientRegionDetectionEngine".equals(str)) {
                            C24666ew ewVar = ekVar.f67408m;
                            C24668ey eyVar = (C24668ey) ewVar.f67478a.mo17428b();
                            eyVar.getClass();
                            haVar = new C24665ev(eyVar, ((C24495g) ewVar.f67479b).mo17428b());
                        } else if ("ScriptLanguageStatsPrimitive".equals(str)) {
                            return new C24674fd();
                        } else {
                            if ("SensitivityClassificationEngine".equals(str)) {
                                C24680fj fjVar = ekVar.f67409n;
                                C24682fl flVar = (C24682fl) fjVar.f67506a.mo17428b();
                                flVar.getClass();
                                haVar = new C24679fi(flVar, ((C24495g) fjVar.f67507b).mo17428b());
                            } else if ("ServerQueryPrimitive".equals(str)) {
                                C24689fs fsVar = ekVar.f67410o;
                                C58833ax axVar = (C58833ax) ((C68221g) fsVar.f67526a).f184583a;
                                axVar.getClass();
                                C58833ax axVar2 = (C58833ax) ((C68221g) fsVar.f67527b).f184583a;
                                axVar2.getClass();
                                haVar = new C24688fr(axVar, axVar2);
                            } else if ("ServerTranslateEngine".equals(str)) {
                                C24735hk hkVar = (C24735hk) ekVar.f67411p.f67532a.mo17428b();
                                hkVar.getClass();
                                haVar = new C24692fv(hkVar);
                            } else if ("ShoppingClassificationEngine".equals(str)) {
                                C24699gb gbVar = ekVar.f67412q;
                                C24701gd gdVar = (C24701gd) gbVar.f67545a.mo17428b();
                                gdVar.getClass();
                                haVar = new C24698ga(gdVar, ((C24495g) gbVar.f67546b).mo17428b());
                            } else if ("ShoppingIntentDetectionConverter".equals(str)) {
                                return new C24705gh();
                            } else {
                                if ("TextPipelineEngine".equals(str)) {
                                    ((C24715gr) ekVar.f67413r.f67565a.mo17428b()).getClass();
                                    haVar = new C24712go();
                                } else if ("TextShoppingFilterEngine".equals(str)) {
                                    C24721gx gxVar = (C24721gx) ekVar.f67414s.f67574a.mo17428b();
                                    gxVar.getClass();
                                    haVar = new C24718gu(gxVar);
                                } else if ("TranslateEngine".equals(str)) {
                                    C24726hb hbVar = ekVar.f67415t;
                                    C24555at atVar = (C24555at) hbVar.f67590a.mo17428b();
                                    atVar.getClass();
                                    C24735hk hkVar2 = (C24735hk) hbVar.f67591b.mo17428b();
                                    hkVar2.getClass();
                                    haVar = new C24725ha(atVar, hkVar2);
                                } else {
                                    throw new IllegalArgumentException("Unknown name = ".concat(String.valueOf(str)));
                                }
                            }
                        }
                    }
                }
            }
            return haVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
