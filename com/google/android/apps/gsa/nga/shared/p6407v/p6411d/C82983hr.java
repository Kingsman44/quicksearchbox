package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hr */
/* compiled from: PG */
public enum C82983hr implements C62957cd {
    NGA_EXPLICIT_TRIGGER_SQUEEZE(1),
    NGA_EXPLICIT_TRIGGER_MIC_TAP(2),
    NGA_EXPLICIT_TRIGGER_HOTWORD(3),
    NGA_SPEECH_HANDLER_MIC_OPENED(4),
    SYSUI_INVOCATION(5),
    NGA_UNKNOWN_RECOGNITION_START(6),
    NGA_RECOGNITION_CANDIDATE_START(7),
    NGA_RECOGNITION_END(8),
    NGA_FULFILLMENT_SUCCESS(9),
    NGA_CONTEXTUAL_INITIALIZATION_START(10),
    NGA_CONTEXTUAL_INITIALIZATION_SUCCESS(11),
    NGA_CONTEXTUAL_INITIALIZATION_FAILURE(12),
    NGA_CONTEXTUAL_PROCESSING_START(13),
    NGA_CONTEXTUAL_PROCESSING_SUCCESS(14),
    NGA_CONTEXTUAL_PROCESSING_FAILURE(15),
    NGA_CONTEXTUAL_CHIPS_MENDEL_DISABLED(16),
    NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_START(17),
    NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_FAILURE(18),
    NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_SUCCESS(19),
    NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_START(20),
    NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_FAILURE(21),
    NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_SUCCESS(22),
    NGA_CONTEXTUAL_ACTION_SUGGESTION_START(23),
    NGA_CONTEXTUAL_ACTION_SUGGESTION_SUCCESS(24),
    NGA_CONTEXTUAL_ACTION_SUGGESTION_FAILURE(25),
    NGA_CONTEXTUAL_INTENT_CLASSIFICATION_START(26),
    NGA_CONTEXTUAL_INTENT_CLASSIFICATION_SUCCESS(27),
    NGA_CONTEXTUAL_INTENT_CLASSIFICATION_FAILURE(28),
    NGA_CONTEXTUAL_FALLBACK_INITIATED(29),
    NGA_CONTEXTUAL_CHIP_PRODUCED(30),
    NGA_CONTEXTUAL_CHIP_NOT_PRODUCED(31),
    NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START(32),
    NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_SUCCESS(33),
    NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_FAILURE(34),
    NGA_SCREEN_ANNOTATION_FRAMEWORK_MENDEL_DISABLED(35),
    NGA_SCREEN_ANNOTATION_FRAMEWORK_CROSSWALK_DISABLED(36),
    NGA_SCREEN_PARSING_START(37),
    NGA_SCREEN_PARSING_SUCCESS(38),
    NGA_SCREEN_PARSING_FAILURE(39),
    NGA_SCREEN_OCR_START(40),
    NGA_SCREEN_OCR_FAILURE(41),
    NGA_SCREEN_OCR_SUCCESS(42),
    NGA_SCREEN_PRE_ANNOTATION_START(43),
    NGA_SCREEN_PRE_ANNOTATION_END(44),
    NGA_SCREEN_ANNOTATION_START(45),
    NGA_SCREEN_ANNOTATION_SUCCESS(46),
    NGA_SCREEN_ANNOTATION_FAILURE(47);
    

    /* renamed from: V */
    public final int f226438V;

    private C82983hr(int i) {
        this.f226438V = i;
    }

    /* renamed from: a */
    public static C82983hr m132443a(int i) {
        switch (i) {
            case 1:
                return NGA_EXPLICIT_TRIGGER_SQUEEZE;
            case 2:
                return NGA_EXPLICIT_TRIGGER_MIC_TAP;
            case 3:
                return NGA_EXPLICIT_TRIGGER_HOTWORD;
            case 4:
                return NGA_SPEECH_HANDLER_MIC_OPENED;
            case 5:
                return SYSUI_INVOCATION;
            case 6:
                return NGA_UNKNOWN_RECOGNITION_START;
            case 7:
                return NGA_RECOGNITION_CANDIDATE_START;
            case 8:
                return NGA_RECOGNITION_END;
            case 9:
                return NGA_FULFILLMENT_SUCCESS;
            case 10:
                return NGA_CONTEXTUAL_INITIALIZATION_START;
            case 11:
                return NGA_CONTEXTUAL_INITIALIZATION_SUCCESS;
            case 12:
                return NGA_CONTEXTUAL_INITIALIZATION_FAILURE;
            case 13:
                return NGA_CONTEXTUAL_PROCESSING_START;
            case 14:
                return NGA_CONTEXTUAL_PROCESSING_SUCCESS;
            case 15:
                return NGA_CONTEXTUAL_PROCESSING_FAILURE;
            case 16:
                return NGA_CONTEXTUAL_CHIPS_MENDEL_DISABLED;
            case 17:
                return NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_START;
            case 18:
                return NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_FAILURE;
            case 19:
                return NGA_CONTEXTUAL_SCREEN_CONTEXT_REQUEST_SUCCESS;
            case 20:
                return NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_START;
            case 21:
                return NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_FAILURE;
            case 22:
                return NGA_CONTEXTUAL_SCREEN_ANNOTATIONS_REQUEST_SUCCESS;
            case 23:
                return NGA_CONTEXTUAL_ACTION_SUGGESTION_START;
            case 24:
                return NGA_CONTEXTUAL_ACTION_SUGGESTION_SUCCESS;
            case 25:
                return NGA_CONTEXTUAL_ACTION_SUGGESTION_FAILURE;
            case 26:
                return NGA_CONTEXTUAL_INTENT_CLASSIFICATION_START;
            case 27:
                return NGA_CONTEXTUAL_INTENT_CLASSIFICATION_SUCCESS;
            case 28:
                return NGA_CONTEXTUAL_INTENT_CLASSIFICATION_FAILURE;
            case 29:
                return NGA_CONTEXTUAL_FALLBACK_INITIATED;
            case 30:
                return NGA_CONTEXTUAL_CHIP_PRODUCED;
            case 31:
                return NGA_CONTEXTUAL_CHIP_NOT_PRODUCED;
            case 32:
                return NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_START;
            case 33:
                return NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_SUCCESS;
            case 34:
                return NGA_SCREEN_ANNOTATION_ENGINE_PROCESSING_FAILURE;
            case 35:
                return NGA_SCREEN_ANNOTATION_FRAMEWORK_MENDEL_DISABLED;
            case 36:
                return NGA_SCREEN_ANNOTATION_FRAMEWORK_CROSSWALK_DISABLED;
            case 37:
                return NGA_SCREEN_PARSING_START;
            case 38:
                return NGA_SCREEN_PARSING_SUCCESS;
            case 39:
                return NGA_SCREEN_PARSING_FAILURE;
            case 40:
                return NGA_SCREEN_OCR_START;
            case 41:
                return NGA_SCREEN_OCR_FAILURE;
            case 42:
                return NGA_SCREEN_OCR_SUCCESS;
            case 43:
                return NGA_SCREEN_PRE_ANNOTATION_START;
            case 44:
                return NGA_SCREEN_PRE_ANNOTATION_END;
            case 45:
                return NGA_SCREEN_ANNOTATION_START;
            case 46:
                return NGA_SCREEN_ANNOTATION_SUCCESS;
            case 47:
                return NGA_SCREEN_ANNOTATION_FAILURE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m132444b() {
        return C82982hq.f226389a;
    }

    public final int getNumber() {
        return this.f226438V;
    }

    public final String toString() {
        return Integer.toString(this.f226438V);
    }
}
