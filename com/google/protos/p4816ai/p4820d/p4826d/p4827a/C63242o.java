package com.google.protos.p4816ai.p4820d.p4826d.p4827a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ai.d.d.a.o */
/* compiled from: PG */
public enum C63242o implements C62957cd {
    PRIMITIVE_TYPE_UNKNOWN(0),
    COMBINED_OCR(1),
    OCR_DETECTION(2),
    OCR_TRANSCRIPTION(3),
    REGION_DETECTION(4),
    PLM_LINE_DETECTION(5),
    PLM_SCRIPT_DETECTION(6),
    PLM_LINE_RECOGNITION(7),
    PLM_LAYOUT_ANALYSIS(8),
    PLM_DEEP_PARAGRAPHS(9),
    SCRIPT_LANGUAGE_DETECTION(10),
    LINEBOX_FILTERING(11),
    OCR_PARAGRAPHING(12),
    PARAGRAPH_TO_TRANSLATE_REQUEST_CONVERSION(13),
    TRANSLATION(14),
    INPAINTING(15),
    SERVER_TRANSLATION(16);
    

    /* renamed from: r */
    public final int f170881r;

    private C63242o(int i) {
        this.f170881r = i;
    }

    /* renamed from: a */
    public static C63242o m96212a(int i) {
        switch (i) {
            case 0:
                return PRIMITIVE_TYPE_UNKNOWN;
            case 1:
                return COMBINED_OCR;
            case 2:
                return OCR_DETECTION;
            case 3:
                return OCR_TRANSCRIPTION;
            case 4:
                return REGION_DETECTION;
            case 5:
                return PLM_LINE_DETECTION;
            case 6:
                return PLM_SCRIPT_DETECTION;
            case 7:
                return PLM_LINE_RECOGNITION;
            case 8:
                return PLM_LAYOUT_ANALYSIS;
            case 9:
                return PLM_DEEP_PARAGRAPHS;
            case 10:
                return SCRIPT_LANGUAGE_DETECTION;
            case 11:
                return LINEBOX_FILTERING;
            case 12:
                return OCR_PARAGRAPHING;
            case 13:
                return PARAGRAPH_TO_TRANSLATE_REQUEST_CONVERSION;
            case 14:
                return TRANSLATION;
            case 15:
                return INPAINTING;
            case 16:
                return SERVER_TRANSLATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96213b() {
        return C63241n.f170862a;
    }

    public final int getNumber() {
        return this.f170881r;
    }

    public final String toString() {
        return Integer.toString(this.f170881r);
    }
}
