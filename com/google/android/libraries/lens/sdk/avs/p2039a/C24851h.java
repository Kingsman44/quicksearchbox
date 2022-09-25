package com.google.android.libraries.lens.sdk.avs.p2039a;

import com.google.android.libraries.lens.ondevice.p2037n.C24774ag;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59909br;
import com.google.common.p4552o.p4563i.C59911bt;
import com.google.common.p4552o.p4563i.C59912bu;
import com.google.common.p4552o.p4563i.C59914bw;
import com.google.common.p4552o.p4563i.C59915bx;
import com.google.speech.p5208h.C66554ak;
import java.util.Locale;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.lens.sdk.avs.a.h */
/* compiled from: PG */
public final class C24851h implements C24848e {

    /* renamed from: a */
    private static final C58495hd f67900a;

    /* renamed from: b */
    private static final C58495hd f67901b;

    /* renamed from: c */
    private final C58974d f67902c = C58974d.m91135i(getClass().getName());

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C24874i.LENS_PRIME_ENGINE_READY, "Logged when Lens Prime engine is ready.");
        gzVar.mo55429h(C24874i.LENS_PRIME_SESSION_REQUEST_TO_CONNECT, "The client requested to connect to Lens Prime session.");
        gzVar.mo55429h(C24874i.LENS_PRIME_QUERY_REQUEST, "Logged when Lens Prime makes a query request.");
        gzVar.mo55429h(C24874i.LENS_PRIME_QUERY_RESPONSE, "Logged when Lens Prime receives a query response.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_TEXT_PIPELINE_DENYLIST_TERMINATION, "Logged when the image's url is in the domain denylist.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_TEXT_PIPELINE_WITH_SHOPPING_DOMAIN_PASSED, "Logged when the image's context is from a shopping domain ie allowlist.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTION_PASSED, "Logged when the most relevant sub images of an image are successfully extracted the Proactive session.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTOR_ENGINE_PRIMITIVE_START, "Logged when the Particle Extractor Engine starts running.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTOR_ENGINE_PRIMITIVE_END, "Logged when the Particle Extractor Engine finishes successfully or with errors.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PRIMITIVE_START, "Logged when the Shopping Classifier starts running.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PRIMITIVE_END, "Logged when the Shopping Classifier finishes successfully or with errors.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PASSED, "Logged when the image is shoppable in the Proactive session.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PRIMITIVE_START, "Logged when the Sensitivity Classifier starts running.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PRIMITIVE_END, "Logged when the Sensitivity Classifier finishes successfully or with errors.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PASSED, "Logged when the image is not sensitive in the Proactive session.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SALIENT_REGION_DETECTION_PRIMITIVE_START, "Logged when the Salient Region Detection Engine starts running.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_SALIENT_REGION_DETECTION_PRIMITIVE_END, "Logged when the Salient Region Detection Engine finishes successfully or with errors.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_POST_SALIENCY_DETECTIONS_FOUND, "Logged when there are still detections after saliency filtering in the Proactive session.");
        gzVar.mo55429h(C24874i.LENS_PROACTIVE_RAID_DETECTIONS_FOUND, "Logged when the RAID classifier has produced detections in the Proactive session.");
        gzVar.mo55429h(C24874i.LENS_PRIME_TRANSLATE_RESPONSE, "Lens Prime engine returned a translate response.");
        gzVar.mo55429h(C24874i.LENS_PRIME_ERROR, "Lens Prime engine received an error.");
        gzVar.mo55429h(C24874i.LENS_PRIME_SESSION_STOPPED, "Logged when Lens Prime engine is stopped.");
        f67900a = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C24805p.CASCADE_RUN_START, "Measures the time between the start and end of Lens On Device Engine inference.");
        gzVar2.mo55429h(C24805p.CASCADE_RUN_SUCCESS, "Logged when the Lens On Device Engine successfully completes inference on an image or an error has occurred.");
        gzVar2.mo55429h(C24805p.CASCADE_RUN_ERROR, "Logged when the Lens On Device Engine successfully completes inference on an image or an error has occurred.");
        gzVar2.mo55429h(C24805p.ENGINE_INIT_START, "Logged when the Lens On Device Engine begins initialization.");
        gzVar2.mo55429h(C24805p.ENGINE_INIT_SUCCESS, "Logged when the Lens On Device Engine initialization ends with status OK");
        gzVar2.mo55429h(C24805p.ENGINE_INIT_ERROR, "Logged when the Lens On Device Engine initialization ends with status UNKNOWN ERROR.");
        gzVar2.mo55429h(C24805p.DOWNLOAD_REQUESTED, "Logged when the Lens On Device Engine begins downloading models.");
        gzVar2.mo55429h(C24805p.DOWNLOAD_MODEL_AVAILABLE, "Logged when model download is available.");
        gzVar2.mo55429h(C24805p.FEATURE_SPLIT_INSTALL_REQUESTED, "Logged when the feature split install is requested");
        gzVar2.mo55429h(C24805p.FEATURE_SPLIT_MODULE_AVAILABLE, "Logged when the feature split module is available.");
        gzVar2.mo55429h(C24805p.CASCADE_DEPENDENCIES_CHECK_START, "Logged when the Lens On Device cascade dependencies check starts.");
        gzVar2.mo55429h(C24805p.CASCADE_DEPENDENCIES_CHECK_SUCCESS, "Logged when the Lens On Device cascade dependencies check ends.");
        gzVar2.mo55429h(C24805p.CASCADE_DEPENDENCIES_CHECK_ERROR, "Logged when the Lens On Device cascade dependencies check ends.");
        f67901b = gzVar2.mo55427f(true);
    }

    /* renamed from: a */
    public final void mo29942a(C24774ag agVar) {
        if ((agVar.f67695a & 1) != 0) {
            C58970a aVar = (C58970a) ((C58970a) this.f67902c.mo56224b()).mo56372aa(48931);
            C58495hd hdVar = f67901b;
            C24805p a = C24805p.m45929a(agVar.f67696b);
            if (a == null) {
                a = C24805p.UNKNOWN_EVENT;
            }
            aVar.mo56389s("OnDeviceVisualSearchEvent DEBUG MODE : LODE Event: %s", hdVar.get(a));
        }
    }

    /* renamed from: e */
    public final void mo30048e(C24874i iVar, C59915bx bxVar, long j) {
        C58495hd hdVar = f67900a;
        if (hdVar.containsKey(iVar)) {
            ((C58970a) ((C58970a) this.f67902c.mo56224b()).mo56372aa(48928)).mo56354G("OnDeviceVisualSearchEvent DEBUG MODE Time :%s Event: %s", Instant.ofEpochSecond(0, j), hdVar.get(iVar));
            C58970a aVar = (C58970a) ((C58970a) this.f67902c.mo56224b()).mo56372aa(48929);
            String lineSeparator = System.lineSeparator();
            StringBuilder sb = new StringBuilder();
            if ((bxVar.f161937a & 2) != 0) {
                sb.append("Device Info :");
                sb.append(System.lineSeparator());
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                C59912bu buVar = bxVar.f161938b;
                if (buVar == null) {
                    buVar = C59912bu.f161925d;
                }
                C59911bt btVar = buVar.f161928b;
                if (btVar == null) {
                    btVar = C59911bt.f161919e;
                }
                objArr[0] = Long.valueOf(btVar.f161922b);
                sb.append(String.format(locale, "Total Memory in Kilo Bytes : %d", objArr));
                sb.append(System.lineSeparator());
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                C59912bu buVar2 = bxVar.f161938b;
                if (buVar2 == null) {
                    buVar2 = C59912bu.f161925d;
                }
                C59911bt btVar2 = buVar2.f161928b;
                if (btVar2 == null) {
                    btVar2 = C59911bt.f161919e;
                }
                objArr2[0] = Boolean.valueOf(btVar2.f161924d);
                sb.append(String.format(locale2, "Is memory low : %b", objArr2));
                sb.append(System.lineSeparator());
                Locale locale3 = Locale.US;
                Object[] objArr3 = new Object[1];
                C59912bu buVar3 = bxVar.f161938b;
                if (buVar3 == null) {
                    buVar3 = C59912bu.f161925d;
                }
                C59909br brVar = buVar3.f161929c;
                if (brVar == null) {
                    brVar = C59909br.f161915c;
                }
                objArr3[0] = Integer.valueOf(brVar.f161918b);
                sb.append(String.format(locale3, "Total Available processors : %d", objArr3));
                sb.append(System.lineSeparator());
            }
            if ((bxVar.f161937a & 64) != 0) {
                Locale locale4 = Locale.US;
                Object[] objArr4 = new Object[2];
                C59914bw bwVar = bxVar.f161941e;
                if (bwVar == null) {
                    bwVar = C59914bw.f161930d;
                }
                objArr4[0] = Integer.valueOf(bwVar.f161933b);
                C59914bw bwVar2 = bxVar.f161941e;
                if (bwVar2 == null) {
                    bwVar2 = C59914bw.f161930d;
                }
                objArr4[1] = Integer.valueOf(bwVar2.f161934c);
                sb.append(String.format(locale4, "ImageSize :  width : %d, height : %d ", objArr4));
                sb.append(System.lineSeparator());
            }
            if ((bxVar.f161937a & 32) != 0) {
                sb.append(String.format(Locale.US, "NetworkType : %s", new Object[]{C66554ak.m97248a(bxVar.f161940d).name()}));
                sb.append(System.lineSeparator());
            }
            if ((bxVar.f161937a & 256) != 0) {
                sb.append(String.format(Locale.US, "Mobile Raid Detections Count : %d", new Object[]{Long.valueOf(bxVar.f161943g)}));
                sb.append(System.lineSeparator());
            }
            if ((bxVar.f161937a & 512) != 0) {
                sb.append(String.format(Locale.US, "Visual Saliency Detections Count : %d", new Object[]{Long.valueOf(bxVar.f161944h)}));
                sb.append(System.lineSeparator());
            }
            if (!bxVar.f161939c.isEmpty()) {
                for (Integer intValue : bxVar.f161939c) {
                    switch (intValue.intValue()) {
                        case 1:
                            sb.append("INTERNAL_ERROR");
                            sb.append(System.lineSeparator());
                            break;
                        case 2:
                            sb.append("SESSION_ALREADY_STARTED");
                            sb.append(System.lineSeparator());
                            break;
                        case 3:
                            sb.append("SESSION_NOT_STARTED");
                            sb.append(System.lineSeparator());
                            break;
                        case 4:
                            sb.append("QUERY_MISSING_PAYLOAD");
                            sb.append(System.lineSeparator());
                            break;
                        case 5:
                            sb.append("QUERY_PAYLOAD_MISSING_IMAGE");
                            sb.append(System.lineSeparator());
                            break;
                        case 6:
                            sb.append("QUERY_IMAGE_FAILED_TO_RESOLVE");
                            sb.append(System.lineSeparator());
                            break;
                        case 7:
                            sb.append("CLASSIFICATION_ERROR");
                            sb.append(System.lineSeparator());
                            break;
                        case 8:
                            sb.append("MISSING_WEB_CONTEXT_ERROR");
                            sb.append(System.lineSeparator());
                            break;
                        case 9:
                            sb.append("MISSING_CLIENT_CAPABILITY_ERROR");
                            sb.append(System.lineSeparator());
                            break;
                        case 10:
                            sb.append("SENSITIVE_HTML");
                            sb.append(System.lineSeparator());
                            break;
                        case 11:
                            sb.append("SENSITIVE_URL");
                            sb.append(System.lineSeparator());
                            break;
                        case 12:
                            sb.append("QUERY_TIMEOUT");
                            sb.append(System.lineSeparator());
                            break;
                        case 13:
                            sb.append("INTERNAL_ENGINE_ERROR");
                            sb.append(System.lineSeparator());
                            break;
                    }
                }
                sb.append(System.lineSeparator());
            }
            aVar.mo56354G("OnDeviceVisualSearchEvent DEBUG MODE METADATA: %s %s", lineSeparator, sb.toString());
        }
    }

    /* renamed from: f */
    public final void mo30049f(C24874i iVar, long j) {
        C58495hd hdVar = f67900a;
        if (hdVar.containsKey(iVar)) {
            ((C58970a) ((C58970a) this.f67902c.mo56224b()).mo56372aa(48933)).mo56354G("OnDeviceVisualSearchEvent DEBUG MODE Time :%s Event: %s", Instant.ofEpochSecond(0, j), hdVar.get(iVar));
        }
    }
}
