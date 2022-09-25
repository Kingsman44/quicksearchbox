package com.google.android.libraries.lens.sdk.avs.p2039a;

import com.google.android.libraries.lens.ondevice.p2037n.C24774ag;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.lens.ondevice.p2037n.C24812w;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59886av;
import com.google.common.p4552o.p4563i.C59887aw;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59915bx;
import com.google.lens.p4701g.C62277b;
import com.google.lens.p4701g.C62331d;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63233f;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.sdk.avs.a.a */
/* compiled from: PG */
public class C24843a implements C24848e {

    /* renamed from: a */
    protected C58974d f67885a;

    /* renamed from: b */
    public C37215b f67886b;

    /* renamed from: c */
    protected final C58495hd f67887c;

    /* renamed from: d */
    protected final C58495hd f67888d;

    /* renamed from: e */
    protected final Map f67889e = new EnumMap(C62331d.class);

    /* renamed from: f */
    protected final C59870af f67890f = ((C59870af) C59898bg.f161866v.createBuilder());

    public C24843a() {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C24874i.LENS_PRIME_ENGINE_READY, C37194a.f98453aP.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PRIME_SESSION_REQUEST_TO_CONNECT, C37194a.f98530bn.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PRIME_QUERY_REQUEST, C37194a.f98455aR.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PRIME_QUERY_RESPONSE, C37194a.f98456aS.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_TEXT_PIPELINE_DENYLIST_TERMINATION, C37194a.f98588cs.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_TEXT_PIPELINE_WITH_SHOPPING_DOMAIN_PASSED, C37194a.f98587cr.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTION_PASSED, C37194a.f98604de.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTOR_ENGINE_PRIMITIVE_START, C37194a.f98621dv.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTOR_ENGINE_PRIMITIVE_END, C37194a.f98622dw.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PASSED, C37194a.f98508bR.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PRIMITIVE_START, C37194a.f98605df.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PRIMITIVE_END, C37194a.f98606dg.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PASSED, C37194a.f98507bQ.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PRIMITIVE_START, C37194a.f98607dh.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_RAID_DETECTIONS_FOUND, C37194a.f98506bP.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_POST_SALIENCY_DETECTIONS_FOUND, C37194a.f98505bO.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PRIMITIVE_END, C37194a.f98608di.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SALIENT_REGION_DETECTION_PRIMITIVE_START, C37194a.f98609dj.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SALIENT_REGION_DETECTION_PRIMITIVE_END, C37194a.f98610dk.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PRIME_TRANSLATE_RESPONSE, C37194a.f98541by.mo40779c());
        gzVar.mo55429h(C24874i.LENS_PRIME_ERROR, C37194a.f98454aQ.mo40779c());
        this.f67887c = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C24874i.LENS_PRIME_SESSION_STOPPED, C37194a.f98457aT);
        this.f67888d = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public void mo29942a(C24774ag agVar) {
        ((C58970a) ((C58970a) this.f67885a.mo56224b()).mo56372aa(48924)).mo56389s("OnDeviceVisualSearchEvent LODE Event %s", agVar);
        C37252a b = mo30045b(agVar);
        if (b != null && this.f67886b != null) {
            C24805p a = C24805p.m45929a(agVar.f67696b);
            if (a == null) {
                a = C24805p.UNKNOWN_EVENT;
            }
            if (a == C24805p.DOWNLOAD_MODEL_AVAILABLE || a == C24805p.DOWNLOAD_REQUESTED) {
                mo30047d(agVar, b);
            } else {
                C37215b bVar = this.f67886b;
                ((C37253b) b).mo40791o(agVar.f67697c);
                bVar.mo19974a(b);
            }
            mo30046c(agVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C37252a mo30045b(C24774ag agVar) {
        C24805p pVar = C24805p.UNKNOWN_EVENT;
        C24805p a = C24805p.m45929a(agVar.f67696b);
        if (a == null) {
            a = C24805p.UNKNOWN_EVENT;
        }
        switch (a.ordinal()) {
            case 4:
                C24808s sVar = agVar.f67698d;
                if (sVar == null) {
                    sVar = C24808s.f67804l;
                }
                if (sVar.f67807b.equals("ShoppingClassificationEngine")) {
                    return C37194a.f98605df.mo40779c();
                }
                C24808s sVar2 = agVar.f67698d;
                if (sVar2 == null) {
                    sVar2 = C24808s.f67804l;
                }
                if (sVar2.f67807b.equals("SensitivityClassificationEngine")) {
                    return C37194a.f98607dh.mo40779c();
                }
                C24808s sVar3 = agVar.f67698d;
                if (sVar3 == null) {
                    sVar3 = C24808s.f67804l;
                }
                if (sVar3.f67807b.equals("SalientRegionDetectionEngine")) {
                    return C37194a.f98609dj.mo40779c();
                }
                C24808s sVar4 = agVar.f67698d;
                if (sVar4 == null) {
                    sVar4 = C24808s.f67804l;
                }
                if (sVar4.f67807b.equals("ParticleExtractorEngine")) {
                    return C37194a.f98621dv.mo40779c();
                }
                return null;
            case 5:
                C24808s sVar5 = agVar.f67698d;
                if (sVar5 == null) {
                    sVar5 = C24808s.f67804l;
                }
                if (sVar5.f67807b.equals("ShoppingClassificationEngine")) {
                    return C37194a.f98606dg.mo40815i(C62722b.OK);
                }
                C24808s sVar6 = agVar.f67698d;
                if (sVar6 == null) {
                    sVar6 = C24808s.f67804l;
                }
                if (sVar6.f67807b.equals("SensitivityClassificationEngine")) {
                    return C37194a.f98608di.mo40815i(C62722b.OK);
                }
                C24808s sVar7 = agVar.f67698d;
                if (sVar7 == null) {
                    sVar7 = C24808s.f67804l;
                }
                if (sVar7.f67807b.equals("SalientRegionDetectionEngine")) {
                    return C37194a.f98610dk.mo40815i(C62722b.OK);
                }
                C24808s sVar8 = agVar.f67698d;
                if (sVar8 == null) {
                    sVar8 = C24808s.f67804l;
                }
                if (sVar8.f67807b.equals("ParticleExtractorEngine")) {
                    return C37194a.f98622dw.mo40815i(C62722b.OK);
                }
                return null;
            case 6:
                C24808s sVar9 = agVar.f67698d;
                if (sVar9 == null) {
                    sVar9 = C24808s.f67804l;
                }
                if (sVar9.f67807b.equals("ShoppingClassificationEngine")) {
                    return C37194a.f98606dg.mo40815i(C62722b.UNKNOWN);
                }
                C24808s sVar10 = agVar.f67698d;
                if (sVar10 == null) {
                    sVar10 = C24808s.f67804l;
                }
                if (sVar10.f67807b.equals("SensitivityClassificationEngine")) {
                    return C37194a.f98608di.mo40815i(C62722b.UNKNOWN);
                }
                C24808s sVar11 = agVar.f67698d;
                if (sVar11 == null) {
                    sVar11 = C24808s.f67804l;
                }
                if (sVar11.f67807b.equals("SalientRegionDetectionEngine")) {
                    return C37194a.f98610dk.mo40815i(C62722b.UNKNOWN);
                }
                C24808s sVar12 = agVar.f67698d;
                if (sVar12 == null) {
                    sVar12 = C24808s.f67804l;
                }
                if (sVar12.f67807b.equals("ParticleExtractorEngine")) {
                    return C37194a.f98622dw.mo40815i(C62722b.UNKNOWN);
                }
                return null;
            case 7:
                return C37194a.f98434X.mo40779c();
            case 8:
                return C37194a.f98435Y.mo40815i(C62722b.OK);
            case 9:
                return C37194a.f98435Y.mo40815i(C62722b.UNKNOWN);
            case 10:
                return C37194a.f98427Q.mo40779c();
            case 11:
                return C37194a.f98428R.mo40815i(C62722b.OK);
            case 12:
                return C37194a.f98428R.mo40815i(C62722b.UNKNOWN);
            case 16:
                return C37194a.f98431U.mo40779c();
            case 17:
                return C37194a.f98432V.mo40815i(C62722b.OK);
            case 18:
                return C37194a.f98491bA.mo40779c();
            case 19:
                return C37194a.f98492bB.mo40779c();
            case 20:
                return C37194a.f98592cw.mo40815i(C62722b.OK);
            case 21:
                return C37194a.f98593cx.mo40815i(C62722b.OK);
            case 22:
                return C37194a.f98593cx.mo40815i(C62722b.UNKNOWN);
            default:
                ((C58970a) ((C58970a) this.f67885a.mo56226d()).mo56372aa(48922)).mo56386p("No matching Generic AppFlow event");
                return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30046c(C24774ag agVar) {
        C24808s sVar = agVar.f67698d;
        if (sVar == null) {
            sVar = C24808s.f67804l;
        }
        if ((sVar.f67806a & 64) != 0) {
            C59870af afVar = this.f67890f;
            C24808s sVar2 = agVar.f67698d;
            if (sVar2 == null) {
                sVar2 = C24808s.f67804l;
            }
            C63233f fVar = sVar2.f67813h;
            if (fVar == null) {
                fVar = C63233f.f170841d;
            }
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            C59898bg bgVar2 = C59898bg.f161866v;
            fVar.getClass();
            bgVar.f161882n = fVar;
            bgVar.f161869a |= 4096;
        }
        C24808s sVar3 = agVar.f67698d;
        if (sVar3 == null) {
            sVar3 = C24808s.f67804l;
        }
        if ((sVar3.f67806a & 16) != 0) {
            C59870af afVar2 = this.f67890f;
            C59886av avVar = (C59886av) C59887aw.f161829g.createBuilder();
            C24808s sVar4 = agVar.f67698d;
            if (sVar4 == null) {
                sVar4 = C24808s.f67804l;
            }
            C62331d a = C62331d.m94767a(sVar4.f67811f);
            if (a == null) {
                a = C62331d.UNKNOWN;
            }
            avVar.copyOnWrite();
            C59887aw awVar = (C59887aw) avVar.instance;
            awVar.f161832b = a.f168273v;
            awVar.f161831a |= 2;
            C24808s sVar5 = agVar.f67698d;
            if (sVar5 == null) {
                sVar5 = C24808s.f67804l;
            }
            int a2 = C62277b.m94763a(sVar5.f67812g);
            if (a2 == 0) {
                a2 = 1;
            }
            avVar.copyOnWrite();
            C59887aw awVar2 = (C59887aw) avVar.instance;
            awVar2.f161833c = a2 - 1;
            awVar2.f161831a |= 4;
            C59887aw awVar3 = (C59887aw) avVar.build();
            afVar2.copyOnWrite();
            C59898bg bgVar3 = (C59898bg) afVar2.instance;
            C59898bg bgVar4 = C59898bg.f161866v;
            awVar3.getClass();
            bgVar3.f161883o = awVar3;
            bgVar3.f161869a |= 8192;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo30047d(C24774ag agVar, C37252a aVar) {
        C24808s sVar = agVar.f67698d;
        if (sVar == null) {
            sVar = C24808s.f67804l;
        }
        C62331d a = C62331d.m94767a(sVar.f67811f);
        if (a == null) {
            a = C62331d.UNKNOWN;
        }
        if (a != C62331d.UNKNOWN && !this.f67889e.containsKey(a)) {
            C24808s sVar2 = agVar.f67698d;
            if (((sVar2 == null ? C24808s.f67804l : sVar2).f67806a & 4) != 0) {
                Map map = this.f67889e;
                if (sVar2 == null) {
                    sVar2 = C24808s.f67804l;
                }
                C24812w wVar = sVar2.f67809d;
                if (wVar == null) {
                    wVar = C24812w.f67822c;
                }
                map.put(a, wVar.f67825b);
                C37215b bVar = this.f67886b;
                ((C37253b) aVar).mo40791o(agVar.f67697c);
                bVar.mo19974a(aVar);
            }
        }
    }

    /* renamed from: e */
    public void mo30048e(C24874i iVar, C59915bx bxVar, long j) {
        if (this.f67886b != null && this.f67888d.containsKey(iVar)) {
            C37215b bVar = this.f67886b;
            C37252a b = ((C37257f) this.f67888d.get(iVar)).mo40804b();
            C37253b bVar2 = (C37253b) b;
            bVar2.mo40791o(j);
            C62940bt btVar = C59898bg.f161867w;
            C59870af afVar = this.f67890f;
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            bxVar.getClass();
            bgVar.f161879k = bxVar;
            bgVar.f161869a |= 512;
            bVar2.mo40792p(btVar, (C59898bg) afVar.build());
            bVar.mo19974a(b);
            ((C58970a) ((C58970a) this.f67885a.mo56224b()).mo56372aa(48923)).mo56389s("OnDeviceVisualSearchEvent APPFLOW METADATA: %s", bxVar);
        }
    }

    /* renamed from: f */
    public void mo30049f(C24874i iVar, long j) {
        if (this.f67886b != null && this.f67887c.containsKey(iVar)) {
            C37215b bVar = this.f67886b;
            C37252a aVar = (C37252a) this.f67887c.get(iVar);
            aVar.mo40791o(j);
            bVar.mo19974a(aVar);
        }
    }
}
