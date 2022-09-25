package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.ondevice.p2025e.C24434a;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59897bf;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4438c.p4439a.C57913b;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.lens.view.af.p */
/* compiled from: PG */
public final class C25086p implements C37215b {

    /* renamed from: a */
    public static final C58974d f68343a = C58974d.m91135i("LatencyAppFlowLogger");

    /* renamed from: b */
    public static final C58495hd f68344b;

    /* renamed from: c */
    public static final C58495hd f68345c;

    /* renamed from: d */
    public static final C58528ij f68346d = C58528ij.m90015O("LENS_ON_DEVICE_PLM_LINE_DETECTION_END", "LENS_ON_DEVICE_PLM_SCRIPT_DETECTION_END", "LENS_ON_DEVICE_PLM_LINE_RECOGNITION_END", "LENS_ON_DEVICE_PLM_LAYOUT_ANALYSIS_END", "LENS_ON_DEVICE_PLM_DEEP_PARAGRAPHS_END", "LENS_ON_DEVICE_PLM_READING_ORDER_END", new String[0]);

    /* renamed from: e */
    public final C21370a f68347e;

    /* renamed from: f */
    public C58528ij f68348f = null;

    /* renamed from: g */
    public final Set f68349g = new HashSet();

    /* renamed from: h */
    public final Map f68350h = new ConcurrentHashMap();

    /* renamed from: i */
    public final C25758g f68351i = new C25758g(C58836b.f156633a);

    /* renamed from: j */
    public final Map f68352j = new ConcurrentHashMap();

    /* renamed from: k */
    public final ArrayList f68353k;

    /* renamed from: l */
    private final C68214a f68354l;

    /* renamed from: m */
    private final C37215b f68355m;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("LENS_ON_DEVICE_INIT_END", new C25085o("LENS_ON_DEVICE_INIT_START", "LodeInitializationLatency"));
        gzVar.mo55429h("LENS_PREFETCH_REQUEST_END", new C25085o("LENS_PREFETCH_REQUEST_START", "LensPrefetchEventLatency"));
        gzVar.mo55429h("LENS_QUERY_EXECUTION_END", new C25085o("LENS_QUERY_EXECUTION_START", "LensQueryExecutionLatency"));
        gzVar.mo55429h("LENS_ON_DEVICE_RESPONSE_RECEIVED", new C25085o("LENS_ON_DEVICE_REQUEST_SENT", "LodeResponseLatency"));
        gzVar.mo55429h("LENS_ON_DEVICE_INFERENCE_END", new C25085o("LENS_ON_DEVICE_INFERENCE_START", "LodeInferenceLatency"));
        gzVar.mo55429h("LENS_HYBRID_TRANSLATION_RECEIVED", new C25085o("LENS_HYBRID_TRANSLATION_SENT", "HybridTranslateLatency"));
        gzVar.mo55429h("LENS_ON_DEVICE_TRANSLATION_DEEP_GLEAMS_CREATED", new C25085o("LENS_HYBRID_TRANSLATION_RECEIVED", "HybridTranslateDeepGleamsLatency"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_DETECTION_LOAD_END", new C25085o("LENS_ON_DEVICE_OCR_DETECTION_LOAD_START", "PhotoOcrDetection_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_DETECTION_END", new C25085o("LENS_ON_DEVICE_OCR_DETECTION_START", "PhotoOcrDetection_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_TRANSCRIPTION_LOAD_END", new C25085o("LENS_ON_DEVICE_OCR_TRANSCRIPTION_LOAD_START", "PhotoOcrRecognition_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_TRANSCRIPTION_END", new C25085o("LENS_ON_DEVICE_OCR_TRANSCRIPTION_START", "PhotoOcrRecognition_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_SCRIPT_LANGUAGE_STATS_LOAD_END", new C25085o("LENS_ON_DEVICE_SCRIPT_LANGUAGE_STATS_LOAD_START", "PhotoOcrScriptStats_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_SCRIPT_LANGUAGE_STATS_END", new C25085o("LENS_ON_DEVICE_SCRIPT_LANGUAGE_STATS_START", "PhotoOcrScriptStats_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_PARAGRAPHING_LOAD_END", new C25085o("LENS_ON_DEVICE_OCR_PARAGRAPHING_LOAD_START", "PhotoOcrParagraphing_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_PARAGRAPHING_END", new C25085o("LENS_ON_DEVICE_OCR_PARAGRAPHING_START", "PhotoOcrParagraphing_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_LINEBOX_FILTERING_LOAD_END", new C25085o("LENS_ON_DEVICE_OCR_LINEBOX_FILTERING_LOAD_START", "PhotoOcrLineboxFiltering_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_LINEBOX_FILTERING_END", new C25085o("LENS_ON_DEVICE_OCR_LINEBOX_FILTERING_START", "PhotoOcrLineboxFiltering_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_OCR_PARAGRAPH_TO_TRANSLATE_REQUEST_CONVERTER_END", new C25085o("LENS_ON_DEVICE_OCR_PARAGRAPH_TO_TRANSLATE_REQUEST_CONVERTER_START", "PhotoOcrToTranslateConverter_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_LINE_DETECTION_LOAD_END", new C25085o("LENS_ON_DEVICE_PLM_LINE_DETECTION_LOAD_START", "PLMLineDetection_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_LINE_DETECTION_END", new C25085o("LENS_ON_DEVICE_PLM_LINE_DETECTION_START", "PLMLineDetection_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_SCRIPT_DETECTION_LOAD_END", new C25085o("LENS_ON_DEVICE_PLM_SCRIPT_DETECTION_LOAD_START", "PLMScriptDetection_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_SCRIPT_DETECTION_END", new C25085o("LENS_ON_DEVICE_PLM_SCRIPT_DETECTION_START", "PLMScriptDetection_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_LINE_RECOGNITION_LOAD_END", new C25085o("LENS_ON_DEVICE_PLM_LINE_RECOGNITION_LOAD_START", "PLMLineRecognition_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_LINE_RECOGNITION_END", new C25085o("LENS_ON_DEVICE_PLM_LINE_RECOGNITION_START", "PLMLineRecognition_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_LAYOUT_ANALYSIS_LOAD_END", new C25085o("LENS_ON_DEVICE_PLM_LAYOUT_ANALYSIS_LOAD_START", "PLMLayoutAnalysis_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_LAYOUT_ANALYSIS_END", new C25085o("LENS_ON_DEVICE_PLM_LAYOUT_ANALYSIS_START", "PLMLayoutAnalysis_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_DEEP_PARAGRAPHS_LOAD_END", new C25085o("LENS_ON_DEVICE_PLM_DEEP_PARAGRAPHS_LOAD_START", "PLMDeepParagraphs_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_DEEP_PARAGRAPHS_END", new C25085o("LENS_ON_DEVICE_PLM_DEEP_PARAGRAPHS_START", "PLMDeepParagraphs_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_READING_ORDER_LOAD_END", new C25085o("LENS_ON_DEVICE_PLM_READING_ORDER_LOAD_START", "PLMCombinerAndReadingOrder_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_PLM_READING_ORDER_END", new C25085o("LENS_ON_DEVICE_PLM_READING_ORDER_START", "PLMCombinerAndReadingOrder_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_TRANSLATION_LOAD_END", new C25085o("LENS_ON_DEVICE_TRANSLATION_LOAD_START", "PLMTranslate_LOAD"));
        gzVar.mo55429h("LENS_ON_DEVICE_TRANSLATION_END", new C25085o("LENS_ON_DEVICE_TRANSLATION_START", "PLMTranslate_RUN"));
        gzVar.mo55429h("LENS_SERVER_TRANSLATION_END", new C25085o("LENS_SERVER_TRANSLATION_START", "ServerTranslateEngine_RUN"));
        gzVar.mo55429h("LENS_ON_DEVICE_INPAINTING_END", new C25085o("LENS_ON_DEVICE_INPAINTING_START", "InpaintingEngine_RUN"));
        f68344b = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("LENS_QUERY_EXECUTION_START", new C58759qy("LENS_QUERY_EXECUTION_END"));
        gzVar2.mo55429h("LENS_ON_DEVICE_REQUEST_SENT", new C58759qy("LENS_ON_DEVICE_RESPONSE_RECEIVED"));
        f68345c = gzVar2.mo55427f(false);
    }

    public C25086p(C68214a aVar, C37215b bVar, C21370a aVar2, C58833ax axVar) {
        ArrayList arrayList = new ArrayList();
        this.f68353k = arrayList;
        this.f68354l = aVar;
        this.f68355m = bVar;
        this.f68347e = aVar2;
        if (axVar.mo56113h()) {
            arrayList.add(new C25055b((C24434a) axVar.mo56107c()));
        }
    }

    /* renamed from: b */
    public static String m46381b(String str, C37256e eVar) {
        Object obj;
        if (!str.equals("LENS_QUERY_EXECUTION_START") && !str.equals("LENS_QUERY_EXECUTION_END")) {
            return str;
        }
        C57915d dVar = ((C57913b) eVar.mo40797b().instance).f154903d;
        if (dVar == null) {
            dVar = C57915d.f154905a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C59898bg.f161867w);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C59897bf bfVar = ((C59898bg) obj).f161885q;
        if (bfVar == null) {
            bfVar = C59897bf.f161859f;
        }
        return str.concat(String.valueOf(String.valueOf(bfVar.f161862b)));
    }

    /* renamed from: a */
    public final C60870cx mo19974a(C37254c cVar) {
        this.f68355m.mo19974a(cVar);
        return ((C60887da) this.f68354l.mo27525b()).mo19400c(C47810es.m84977q(new C25081k(this, cVar)), (Object) null);
    }
}
